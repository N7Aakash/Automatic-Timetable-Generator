 
public class Subject {
    private String name;
    private int numberOfHours;
    private int numberOfLectures;

    public Subject(String name, int numberOfHours, int numberOfLectures) {
        this.name = name;
        this.numberOfHours = numberOfHours;
        this.numberOfLectures = numberOfLectures;
    }
    public Subject(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getNumberOfLectures() {
        return numberOfLectures;
    }

    public void setNumberOfLectures(int numberOfLectures) {
        this.numberOfLectures = numberOfLectures;
    }
}
