package OOP.section1;

public class Time {
    
    private int hour, minute, second;
    
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour() { return hour; }
    
    public int getMinute() { return minute; }
    
    public int getSecond() { return second; }
    
    public void setHour(int hour) { this.hour = hour; }
    
    public void setMinute(int minute) { this.minute = minute; }
    
    public void setSecond(int second) { this.second = second; }
    
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    public Time nextSecond() {
        
        second++;
        if (getSecond() == 60) 
            setTime(getHour(), getMinute()+1, 0);
        
        if (getMinute() == 60) 
            setTime(getHour()+1, 0, 0);
        
        if (getHour() == 24)
            setTime(0, 0, 0);
        
        return this;
    }
    
    public Time previousSecond() {
        
        second--;
        if (getSecond() == -1)
            setTime(getHour(), getMinute()-1, 59);
        
        if (getMinute() == -1)
            setTime(getHour()-1, 59, 59);
        
        if (getHour() == -1)
            setTime(23, 59, 59);
        
        return this;
    }
}
