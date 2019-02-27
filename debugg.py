class CeldaOcupada (Exception):
  def __init__(self):
    Exception.__init__(self, "la celda esta ocupada")


class Tablero_Lleno (Exception):
  def __init__(self):
    Exception.__init__(self, "Ficha fuera de rango")


class Jugador_Descalificado (Exception):
  def __init__(self):
    Exception.__init__(self, "Un jugador ha sido descalificado. Partida terminada")



class Jugador:
  def __init__(self,nombre, tipoficha):
    self.__nombre = nombre
    self.__tipo_ficha = tipoficha
    self.__puntuacion = 0
  
  def __str__(self):
    return ("Jugador "self.__nombre + ", ficha" + self.__tipo_ficha + ". Victorias: " + str(self.__puntuacion))
  
  def get_nombre(self) :
    return self.__nombre

  def get_tipo_ficha(self):
    return self.__tipo_ficha

  def get_puntuacion(self):
    return self.__puntuacion

  def actualiza_puntuacion(self):
    self.__puntuacion = self.__puntuacion + 1


class Celda:
  def __init__(self, i, j):
    self.__columna = j
    self.__fila = i
    self.__esta_vacia = True
    self.__ficha = str(" ")


  def __str__(self):
    if (self.__esta_vacia):
      return (" ")
    else:
      return (self.__ficha)

  def asignar_ficha(self, ficha):
    if (self.__esta_vacia):
      self.__ficha = ficha
      self.__esta_vacia = False
    else:
      raise CeldaOcupada
  
  def get_tipo_ficha(self):
    return self.__ficha
  
  def reiniciar_celda(self):
    self.__esta_vacia = True
    self.__ficha = None    

class Tablero:
  def __init__(self):
    self.__ancho = 3
    self.__alto = 3
    self.__matriz_celdas = []   
    self.__numero_fichas = 0

    for i in range(self.__alto):
      linea = []
      for j in range(self.__ancho):
        linea.append(Celda(i,j))
      self.__matriz_celdas.append(linea)
    

  def __str__(self):
    salida = ""
    for linea in self.__matriz_celdas:
      for celda in linea:
        salida = salida + celda.get_tipo_ficha() + " "
        salida = salida + "\n"    
    return salida

            

  def poner_ficha(self,i,j,ficha):
    
    if (self.__numero_fichas < self.__ancho*self.__alto):
      try:
        self.__matriz_celdas[i][j].asignar_ficha(ficha)
        self.__numero_fichas = self.__numero_fichas + 1
      except IndexError:
        raise CeldaOcupada()


  def reiniciar_tablero(self):
    self.__numero_fichas = 0
    self.__ganador = None
    for i in range(self.__alto):
      for j in range(self.__ancho):
        self.__matriz_celdas[i][j].reiniciar_ficha() 
         
  def hay_tres_en_raya(self):
    ## combinaciones posibles 
    posibles = ["00:01:02","00:11:22","10:11:12","20:21:22","00:10:20","01:11:21","02:12:22","02:11:20"]

    for posible in posibles:
      coordenadas = posible.split(":")
      fichas = [] # metemos las fichas de las coordenadas, 3 en total
      
      for coordenada in coordenadas:
        fichas.append(self.__matriz_celdas[int(coordenada[0])][int(coordenada[1])].get_tipo_ficha())    
      ## comprobamos que las fichas sean iguales:
      if (fichas[0] == fichas[1] and fichas[1] == fichas[2] and fichas[0] != " "): # hay 3 en hay_tres_en_raya
        self.__ganador = fichas[0]
        return True # devolvemos la ficha ganadora
    return False

  def get_numero_de_fichas (self):
    return self.__numero_fichas

  def esta_lleno(self):
    return (self.__numero_fichas == 9)

class Partida:
  def __init__(self):
     self.__partida_terminada = False
     self.__ganador = None
     self.__tablero = Tablero()

    # Crear jugadores
     nombre1 = input("dame el nombre del Jugador 1 (ficha X): ")
     nombre2 = input("dame el nombre del Jugador 2 (ficha O): ")

     self.__jugador1 = Jugador(nombre1,"X")
     self.__jugador2 = Jugador(nombre2, "0")

  def reiniciar_partida(self):
    self.__tablero = Tablero()
    self.__partida_terminada = False

  def mover_ficha(self, jugador):
    numer_max_intentos = 3
 
    
    intentos = 0
    termina = False
    while (not termina and intentos < numer_max_intentos):
      l=(CeldaOcupada)

      if (isinstance(jugador,Jugador)):
        print ("jugador " + jugador.get_nombre() + " elige celda")
        right = False
        while right == False:
          try:
            i = int(input("fila"))
            right = True
          except ValueError:
            print("Vuelve a meter un valor dentro de las coordenadas")

        right = False
        while right == False:
          try:
            j = int(input("columna"))
            right = True
          except ValueError:
            print("Vuelve a meter un valor dentro de las coordenadas")  

      try:
        self.__tablero.poner_ficha(i,j,jugador.get_tipo_ficha())
        termina = True
      except IndexError:
        raise Tablero_Lleno()
        
      except l:
        print ("Ficha fuera del tablero o encima de otra. Elige otra posicion.")
      finally:
        intentos = intentos + 1
    
    if (intentos == 3): 
      # descalificar jugador por demasiados intentos
      raise  Jugador_Descalificado()

      
        

  def set_ganador(self, ganador):
    self.__ganador = ganador
    
  def termina_partida(self):
    self.__partida_terminada = True


  def imprime_ganador(self):
    print ("GANADOR", self.__ganador)


  def jugar_partida(self):
    
    while (not(self.__partida_terminada) and not(self.__tablero.hay_tres_en_raya()) and not (self.__tablero.esta_lleno())):
      

      self.mover_ficha(self.__jugador1)
      print(self.__tablero)

    

      if (self.__tablero.hay_tres_en_raya()):
          self.set_ganador(self.__jugador1)
          self.termina_partida()
          self.imprime_ganador()
      else: # si no hay 3 en raya, que mueva el siguiente jugador
        self.mover_ficha(self.__jugador2)
        print(self.__tablero)
        if (self.__tablero.hay_tres_en_raya()):
          self.set_ganador(self.__jugador2)
          self.termina_partida()
          self.imprime_ganador()


def main():
  partida = Partida()
  partida.jugar_partida()

if __name__ == "__main__":
    main()
