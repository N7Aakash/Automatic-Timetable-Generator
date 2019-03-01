import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
  
public class Constraints{
    private ArrayList<Division> classes;
    public Constraints(ArrayList<Division> classes){

        // this.constraintName= constraintName;
        // initComponents();

        for(int i = 0 ; i<12;i++){
            addLecToDayForClass(classes);
        }

    }
    

    // public String getConstraintName() {
    //     return constraintName;
    // }

    // public void setConstraintName(String constraintName) {
    //     this.constraintName = constraintName;
    // }
    

    
     
    public void addLecToDayForClass(ArrayList<Division> classes){
        // System.out.println(classes.get(0).getClassName());
        for(int i = 0 ; i < classes.size();i++){
            int flag = 0;
            Division class1;
            class1  = classes.get(i);
            TimeTable classtt = class1.getTimeTableRef();
            ArrayList<Day> classDays = classtt.getDayList();
            ArrayList<Lecture> dayLecs = new ArrayList<>();
            Lecture lecture;
            int dayNo = 0;
            for(int j = 0; j< classDays.size(); j++){
                dayLecs = classDays.get(j).getLectureList();
                if(dayLecs.size() < 6){
                    dayNo = j;
                    break;
                }
            }
            int daySize = dayLecs.size();
            int whileCount = 1;
            // System.out.println("no. of lecs in the day are : " + daySize + " for the class " + class1)
            do{
                // System.out.println("the while count is : " + whileCount) ;
                Random rand = new Random();
                int randomValue = rand.nextInt(class1.getSubjects().size());
                // System.out.println("randomVaule no. is : " + randomValue);
                Subject subject = class1.getSubjects().get(randomValue);
                Teacher teacher = class1.getSubjectTeacher().get(subject);
                for(int j = 0 ; j < classes.size(); j++){
                    Division check = classes.get(j);
                    // System.out.println("the for loop iteration no. is : " + j + " and the daySixe is " + daySize);
                    if(i==j){
                        // System.out.println("same name");
                        // continue;
                    }else{
                        // System.out.println("not same name the class is: " + class1.getClassName() + " and the check is: " + check.getClassName());
 
                        // System.out.println(check.getTimeTableRef().getDayList().get(dayNo).getDay());

                        if((check.getTimeTableRef().getDayList().get(dayNo).getLectureList().size()!=0) && ((daySize + 1) == check.getTimeTableRef().getDayList().get(dayNo).getLectureList().size())){    
                            if(check.getTimeTableRef().getDayList().get(dayNo).getLectureList().get(daySize) != null){
                                Teacher teacherCheck = check.getTimeTableRef().getDayList().get(dayNo).getLectureList().get(daySize).getTeacher();
                                // System.out.println("the teacher for this lec is" + teacherCheck.getName() + " and the random generation teacher is : "+teacher.getName());
                                    if(teacherCheck.getName().equals(teacher.getName())){

                                    }else{
                                        flag = 1;
                                        // System.out.println("inserting lecture");
                                    }
                            }
                        }else{
                                flag = 1; 
                                // System.out.println("I am in else");
                            }

                    }
                }
                lecture = new Lecture(subject,teacher);
                whileCount++;
            }while(flag != 1);
            // System.out.println("inserting lec for class: " + class1.getClassName() + " with teacher as : " + lecture.getTeacher().getName());
            class1.getTimeTableRef().getDayList().get(dayNo).getLectureList().add(lecture);

        }
    }

}