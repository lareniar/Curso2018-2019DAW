package starwarsbattleship;

public class Time {

    private int minutes;
    private int seconds;
   
    public Time(int minutes, int seconds) throws IllegalArgumentException {
        if(minutes < 0 || minutes > 4 || seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException();
        }
        this.minutes = minutes;
        this.seconds = seconds;
    }
   
    public Time() {
        this(04, 59);
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
