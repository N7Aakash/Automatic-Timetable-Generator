 

import java.util.ArrayList;

public class Day{
	private String day;
	private ArrayList<Lecture> lectureList;

	public Day(String day, ArrayList<Lecture>lectureList){
		this.day = day;
		this.lectureList = lectureList;
	}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return this.day;
	}

	public ArrayList<Lecture> getLectureList(){
		return this.lectureList;
	}
	public void setLectureList(ArrayList<Lecture>lectureList){
		this.lectureList = lectureList;
	}
}