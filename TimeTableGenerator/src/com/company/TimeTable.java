import java.util.ArrayList;
 
public class TimeTable {
    private ArrayList<Day> dayList;

    public TimeTable(ArrayList<Day> dayList) {
        this.dayList = dayList;
    }

    public ArrayList<Day> getDayList() {
        return dayList;
    }

    public void setDayList(ArrayList<Day> dayList) {
        this.dayList = dayList;
    }
}
