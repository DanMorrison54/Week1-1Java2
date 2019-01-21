package JavaWeek1_2;

public class Lecture1_2_Time {
    public int hours;
    public int minutes;
    public int seconds;

    public Lecture1_2_Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public Lecture1_2_Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int totalSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    @Override
    public String toString() {
        return ("hours:" + hours + " minutes: " + minutes + " seconds:" + seconds);
    }
}
