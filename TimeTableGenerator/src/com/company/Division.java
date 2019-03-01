import java.util.ArrayList;
import java.util.HashMap;
 
public class Division{
	private ArrayList<Subject> subjectList;
	TimeTable timeTableref;
	private String className;
	private HashMap<Subject, Teacher> subjectTeacher;
	public Division(TimeTable timeTableref,HashMap<Subject,Teacher> subjectTeacher,String className){
		ArrayList<Subject> subjects = new ArrayList<>();
		subjects.add(new Subject("C Programming Language",125,5));
        subjects.add(new Subject("Java Programming language",150,6));
        subjects.add(new Subject("Data Structures",150,6));
        subjects.add(new Subject("Discrete Mathematics",125,6));
        subjects.add(new Subject("Computer Networks",100,4));
        subjects.add(new Subject("Python Programming Language",125,61));
        // subjects.add(new Subject("Skill Enhancement Lecture"));
        this.timeTableref = timeTableref;
		this.subjectTeacher = subjectTeacher;
        this.className = className;
        this.subjectList = subjects;
	}
	public Division( HashMap<Subject,Teacher> subjectTeacher,String className){
		ArrayList<Subject> subjects = new ArrayList<>();
		subjects.add(new Subject("C Programming Language",125,5));
		subjects.add(new Subject("Java Programming language",150,6));
		subjects.add(new Subject("Data Structures",150,6));
		subjects.add(new Subject("Discrete Mathematics",125,6));
		subjects.add(new Subject("Computer Networks",100,4));
		subjects.add(new Subject("Python Programming Language",125,61));
		// subjects.add(new Subject("Skill Enhancement Lecture"));
		this.className = className;
		this.subjectList = subjects;
		this.subjectTeacher = subjectTeacher;
	}

	public void setsubjectList(ArrayList<Subject> subjectList){
		this.subjectList = subjectList;
	}
	public ArrayList<Subject> getSubjectList(){
		return this.subjectList;
	}

	public void setTimeTableRef(TimeTable timeTableref){
		this.timeTableref = timeTableref;	
	}

	public TimeTable getTimeTableRef(){
		return this.timeTableref;
	}

	public void setClassName(String className){
		this.className = className;
	}
	public ArrayList<Subject> getSubjects(){
		return this.subjectList;
	}

	public HashMap<Subject,Teacher> getSubjectTeacher(){
		return this.subjectTeacher;
	}

	public String getClassName(){
		return this.className;
	}
}