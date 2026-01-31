public class Student 
{
    String name;
    int id;
    float cgpa;
public static void main(String[] args)
    {
    System.out.println("Student 1 details:");
    Student st1 = new Student();
    st1.name = "Rubayat";
    st1.id = 28;
    st1.cgpa = 3.56f;
    System.out.println("Student name : "+st1.name);
    System.out.println("Student ID : "+st1.id);
    System.out.println("Student CGPA : "+st1.cgpa);

    System.out.println("Student 2 details:");
    Student st2 = new Student();
    st2.name = "Ruhani";
    st2.id = 03;
    st2.cgpa = 3.66f;
    System.out.println("Student name : "+st2.name);
    System.out.println("Student ID : "+st2.id);
    System.out.println("Student CGPA : "+st2.cgpa);

    }
}
