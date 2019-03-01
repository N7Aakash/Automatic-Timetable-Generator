 

import java.util.ArrayList;

public class Teacher {
    private ArrayList<Subject> listSub;
    private int teacherId;
    private String name;
    private TimeTable timeTable;
    private String reportTime;

    public Teacher(ArrayList<Subject> listSub, int teacherId, String name,String reportTime) {
        this.listSub = listSub;
        this.teacherId = teacherId;
        this.name = name;
        this.timeTable = null;
        this.reportTime = reportTime;
    }

    public Teacher(ArrayList<Subject> listSub, int teacherId, String name, String reportTime,TimeTable timeTable) {
        this.listSub = listSub;
        this.teacherId = teacherId;
        this.name = name;
        this.reportTime = reportTime;
        this.timeTable = timeTable;
    }

    public ArrayList<Subject> getListSub() {
        return this.listSub;
    }

    public void setListSub(ArrayList<Subject> listSub) {
        this.listSub = listSub;
    }


    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TimeTable getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(TimeTable timeTable) {
        this.timeTable = timeTable;
    }
}
