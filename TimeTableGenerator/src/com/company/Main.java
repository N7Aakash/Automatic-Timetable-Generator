import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
    


public class Main{

    public static void main(String[] args) {

        

    	Subject c = new Subject("C Programming Language",125,5);
        Subject java = new Subject("Java Programming language",150,6);
        Subject das = new Subject("Data Structures",150,6);
        Subject dis = new Subject("Discrete Mathematics",125,6);
        Subject cn = new Subject("Computer Networks",100,4);
        Subject python = new Subject("Python Programming Language",125,6);
        Subject sel = new Subject("Skill Enhancement Lecture");


        ArrayList<Subject> subject = new ArrayList<>();

        subject.add(c);
        subject.add(java);
        subject.add(das);
        subject.add(dis);
        Teacher lifna = new Teacher(subject,1,"Lifna","8:10");

        subject = new ArrayList<>();
        subject.add(cn);
        Teacher kanade = new Teacher(subject,2,"Kanade","8:10");

        subject = new ArrayList<>();
        subject.add(java);
        subject.add(python);
        subject.add(das);
        Teacher abha = new Teacher(subject,3,"Abha","10:10");

        subject = new ArrayList<>();
        subject.add(java);
        subject.add(python);
        Teacher pooja = new Teacher(subject,4,"Pooja","10:10");

        subject = new ArrayList<>();
        subject.add(java);
        Teacher nupur = new Teacher(subject,5,"Nupur","11:25");

        subject = new ArrayList<>();
        subject.add(dis);
        subject.add(cn);
        subject.add(c);
        Teacher richard = new Teacher(subject,6,"Richard","10:10");

        

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(lifna);
        teachers.add(kanade);
        teachers.add(abha);
        teachers.add(pooja);
        teachers.add(nupur);
        teachers.add(richard);

        

        HashMap<Subject,Teacher> subjectTeacher = new HashMap<>();
        subjectTeacher.put(c,null);
        subjectTeacher.put(java,null);
        subjectTeacher.put(das,null);
        subjectTeacher.put(dis,null);
        subjectTeacher.put(cn,null);
        subjectTeacher.put(python,null);

        //day allocation to the timetable
        ArrayList<Lecture> lecs = new ArrayList<>();
        Day classAMon = new Day("Monday",lecs);
        Day classATues = new Day("Tuesday",new ArrayList<Lecture>());
        ArrayList<Day> weekA = new ArrayList<>();
        weekA.add(classAMon);
        weekA.add(classATues);
        TimeTable classAtt = new TimeTable(weekA);
        // HashMap<Teacher,Integer> teacherAvailability;
        //
        Division classA = new Division(classAtt,subjectTeacher,"classA");

       

        // subjectTeacherForClass(classA,teachers);

        subjectTeacher = new HashMap<>();
        subjectTeacher.put(c,null);
        subjectTeacher.put(java,null);
        subjectTeacher.put(das,null);
        subjectTeacher.put(dis,null);
        subjectTeacher.put(cn,null);
        subjectTeacher.put(python,null);

        // ArrayList<Lecture> lecs = new ArrayList<>();
        Day classBMon = new Day("Monday",new ArrayList<Lecture>());
        Day classBTues = new Day("Tuesday",new ArrayList<Lecture>());
        ArrayList<Day> weekB = new ArrayList<>();
        weekB.add(classBMon);
        weekB.add(classBTues);
        TimeTable classBtt = new TimeTable(weekB);

        Division classB = new Division(classBtt,subjectTeacher,"classB");

        // subjectTeacherForClass(classB,teachers);

        //method to be inserted here
        



       
        //day allocation function call
        ArrayList<Division> classes = new ArrayList<>();
        classes.add(classA);
        classes.add(classB);

        DataFilling data = new DataFilling(classes,teachers);

        System.out.println("teachers for class: " + classA.getClassName());
        for(int i=0;i<classA.getSubjectList().size();i++){
            
            if(classA.getSubjectTeacher().get(classA.getSubjectList().get(i)) != null){
                System.out.println(classA.getSubjectList().get(i).getName());
                System.out.println(classA.getSubjectTeacher().get(classA.getSubjectList().get(i)).getName());
            }
            
        }
        System.out.println("teachers for class: " + classB.getClassName());
        for(int i=0;i<classB.getSubjectList().size();i++){
            
            if(classB.getSubjectTeacher().get(classB.getSubjectList().get(i)) != null){
                System.out.println(classB.getSubjectList().get(i).getName());
                System.out.println(classB.getSubjectTeacher().get(classB.getSubjectList().get(i)).getName());
            }
            
        }


        // addLecToDayForClass(classes);
        // addLecToDayForClass(classes);
        // addLecToDayForClass(classes);
        // addLecToDayForClass(classes);
        // addLecToDayForClass(classes);
        // addLecToDayForClass(classes);

        Constraints c1 = new Constraints(classes);

 
        System.out.println("Lectures for classA : ");
        for(int i =0 ; i < classes.get(0).getTimeTableRef().getDayList().get(0).getLectureList().size(); i++){
            Lecture tp = classes.get(0).getTimeTableRef().getDayList().get(0).getLectureList().get(i);
            System.out.println(i + ". teacher is "+  tp.getTeacher().getName() + " subject is " + tp.getSub().getName() + " for the day: " + classes.get(0).getTimeTableRef().getDayList().get(0).getDay());
        }
        for(int i =0 ; i < classes.get(0).getTimeTableRef().getDayList().get(1).getLectureList().size(); i++){
            Lecture tp = classes.get(0).getTimeTableRef().getDayList().get(1).getLectureList().get(i);
            System.out.println(i + ". teacher is "+  tp.getTeacher().getName() + " subject is " + tp.getSub().getName() + " for the day: " + classes.get(0).getTimeTableRef().getDayList().get(1).getDay());
        }

        System.out.println("Lectures for classB : ");
        for(int i =0 ; i < classes.get(1).getTimeTableRef().getDayList().get(0).getLectureList().size(); i++){
            Lecture tp = classes.get(1).getTimeTableRef().getDayList().get(0).getLectureList().get(i);
            System.out.println( i + ". teacher is " + tp.getTeacher().getName() + " subject is " + tp.getSub().getName() + " for the day: " + classes.get(0).getTimeTableRef().getDayList().get(0).getDay());
        }
        for(int i =0 ; i < classes.get(1).getTimeTableRef().getDayList().get(1).getLectureList().size(); i++){
            Lecture tp = classes.get(1).getTimeTableRef().getDayList().get(1).getLectureList().get(i);
            System.out.println( i + ". teacher is " + tp.getTeacher().getName() + " subject is " + tp.getSub().getName() + " for the day: " + classes.get(0).getTimeTableRef().getDayList().get(1).getDay());
        }

    } 

    public static boolean compareSubjects(Subject s1 , Subject s2){
        if(s1.getName().equals(s2.getName()))
            return true;
        else
            return false;
    }

}


/*
****************************************************
Constraints satisfied till now are as follows:

Teacher gets allowed to the class .
Same teacher is not allotted to the class for more than 2 subjects
On calling the lecadd function the lecture gets added once in the day going on
No 2 lecture have same teacher allotted at the same time

****************************************************
*/

