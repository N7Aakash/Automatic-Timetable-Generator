public class Lecture {
    //For future implementatiion if required labs can be added
    private int lectureType;
 
    private Subject sub;

    // private int roomNo;//future scope

    private Teacher teacher;
    public Lecture(Subject sub,Teacher teacher) {
        this.sub = sub;
        this.teacher = teacher;
    }

    public Subject getSub() {
        return sub;
    }

    public void setSub(Subject sub) {
        this.sub = sub;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
