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
            // System.out.println("no. of lecs in the day are : " + daySize + " for the class " + class1)
            do{
                Random rand = new Random();
                int randomValue = rand.nextInt(class1.getSubjects().size()-1);
                // System.out.println("randomVaule no. is : " + randomValue);
                Subject subject = class1.getSubjects().get(randomValue);
                Teacher teacher = class1.getSubjectTeacher().get(subject);
                for(int j = 0 ; j < classes.size(); j++){
                    Division check = classes.get(j);
                    if(i==j){
                        System.out.println("hi I am here finally!");
                        // continue;
                    }else{
                        System.out.println("now I am here and the class is: " + class1.getClassName() + " and the check is: " + check.getClassName());
                        if(check.getTimeTableRef().getDayList().get(dayNo).getLectureList().size()!=0){    
                            if(check.getTimeTableRef().getDayList().get(dayNo).getLectureList().get(daySize) != null){
                                Teacher teacherCheck = check.getTimeTableRef().getDayList().get(dayNo).getLectureList().get(daySize).getTeacher();
                                    if(teacherCheck.getName().equals(teacher.getName())){

                                    }else{
                                        flag = 1;
                                        System.out.println("hey");
                                    }
                            }
                        }else{
                                flag = 1; 
                                System.out.println("I am in else");
                            }

                    }
                }
                lecture = new Lecture(subject,teacher);
            }while(flag != 1);

            class1.getTimeTableRef().getDayList().get(dayNo).getLectureList().add(lecture);

        }