class College{

    private String name;
    College(String name){
        this.name=name;
    }
    public String getCollegeName(){
        return this.name;
    }
}

class Student{

    private String name;
    Student(String name){
        this.name=name;
    }
    public String getStudentName(){
        return this.name;
    }
}


public class AssociationClass {

    public static void main (String[]args)
    {
        College college = new College("Alexandria");
        Student student = new Student("Aziza");
        System.out.println( student.getStudentName() + " is a student in College " + college.getCollegeName() );
    }


}



