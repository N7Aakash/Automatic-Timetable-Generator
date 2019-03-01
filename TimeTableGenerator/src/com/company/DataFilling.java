import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
 

public class DataFilling{

	// private ArrayList<Division> classes;
	// private ArrayList<Teacher> teachers;

	public DataFilling(ArrayList<Division> classes , ArrayList<Teacher> teachers){
		subjectTeacherForClass(classes,teachers);
	}

	private void subjectTeacherForClass(ArrayList<Division> classes , ArrayList<Teacher> teachers){

        for(int m = 0 ; m < classes.size(); m++){

            Division classA = classes.get(m);

            HashMap<Teacher,Integer> teacherAvailable = new HashMap<>();
            for(int i=0; i <teachers.size();i++){
                teacherAvailable.put(teachers.get(i),0);
            }
            for(int i=0;i<classA.getSubjectList().size();i++){
                    Subject s = classA.getSubjectList().get(i);
                    Random rand = new Random();
                    // System.out.println("Current working subject: " + s.getName());
                    ArrayList<Teacher> elegibleTeachers = new ArrayList<>();
                    ArrayList<Subject> subjectsByTeacher;
                    for(int j=0;j<teachers.size();j++){
                        subjectsByTeacher = teachers.get(j).getListSub();
                        // System.out.print(teachers.get(j).getName() + " : ");
                        // for(Subject t : subjectsByTeacher)
                        //     System.out.print(t.getName() + " ");
                        // System.out.println();
                        boolean teaches = false;
                        for(Subject t : subjectsByTeacher){
                            teaches  = compareSubjects(s,t);
                            // System.out.println(t.getName() + " : " + teaches );
                            if(teaches == true)
                                break;
                        }

                        if(teaches){
                            if(teacherAvailable.get(teachers.get(j)) != 2){
                            elegibleTeachers.add(teachers.get(j));
                            }
                            // break;
                        }
                    }
                    
                    int randomValue;
                    if(elegibleTeachers.size() == 1){
                        randomValue = 0;
                    }else{
                    randomValue = rand.nextInt(elegibleTeachers.size());
                    }
                    
                            classA.getSubjectTeacher().put(s,elegibleTeachers.get(randomValue));
                            int count = teacherAvailable.get(elegibleTeachers.get(randomValue));
                            count++;
                            teacherAvailable.put(elegibleTeachers.get(randomValue),count);

            }
        }
    }

    private boolean compareSubjects(Subject s1 , Subject s2){
        if(s1.getName().equals(s2.getName()))
            return true;
        else
            return false;
    }

}