package starwarsbattleship;

public class Player {
    private String name,
                   nickname,
                   password;
   
    private Time time;
   
    public Player(String name, String nickname, String password, Time time) {
        this.name = name;
        this.nickname = nickname;
        this.password = password;
        this.time = time;
    }
   
    public Player(String name, String nickname, String password) {
        this(name, nickname, password, new Time());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }
   
     public Time getTime() {
        return time;
    }

    @Override
    public String toString() {
        String text = "";
       
        text += " "+name;
        text += " "+nickname;
        text += " "+password;
        text += " "+time.getMinutes();
        text += ":"+time.getSeconds();
       
        return text;
    }
}

