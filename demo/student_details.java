class student{
    int s_id;
    String s_name;
    double mark1,mark2,mark3;
    // Default constructor
    student(){
        s_id=123;
        s_name="Jose";
        mark1=34;
        mark2=89;
        mark3=90;
    }

    // Parameterized constructor
    student(int id, String name, double m1, double m2, double m3){
        s_id=id;
        s_name=name;
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }

    // parameterized constructor with diff datatypes
    student(int id, String name, int m1, int m2){
        s_id=id;
        s_name=name;
        mark1=m1;
        mark2=m2;
        mark3=99;
    }
    
    void details(){
        System.out.println("student id is "+s_id);
        System.out.println("student name is "+s_name);
        System.out.println("mark 1 "+ mark1);
        System.out.println("mark 2 "+mark2);
        System.out.println("mark 3 "+mark3);
    }
}

public class student_details{
    public static void main(String[] args) {
        System.out.println("parameterized constructor");
        student p1=new student(123,"Janvy",90,80,70);
        p1.details();

        System.out.println("Default constructor");
        student p2=new student();
        p2.details();
       
        System.out.println("parameterized constructor with different datatype");
        student p3=new student(125,"Renju",34,67);
        p3.details();

    }
}