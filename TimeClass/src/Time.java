public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setHour(int hour) throws Exception{
        if (0 <= hour && hour < 24)
        this.hour = hour;
    }

    public void setMinute(int minute) throws Exception{
        if (0 <= minute && minute < 60)
        this.minute = minute;
    }

    public void setSecond(int second) throws Exception{
        if (0 <= second && second < 60)
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) throws Exception {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public String toString(){
        return hour + ":" + minute + ":" + this.second;
    }

    public Time nextSecond(){
        int hour = this.hour, minute = this.minute, second = this.second;
        second++;

        if (second >= 60){
            second = 0;
            minute++;

            if (minute >= 60){
                minute = 0;
                hour++;

                if (hour >= 24) hour = 0;
            }
        }
        return new Time(hour, minute, second);
    }

    public Time previousSecond(){
        int hour = this.hour, minute = this.minute, second = this.second;
        second--;

        if (second < 0){
            second = 59;
            minute--;

            if (minute < 0){
                minute = 59;
                hour--;
                if (hour < 0) hour = 23;
            }
        }
        return new Time(hour, minute, second);
    }
}