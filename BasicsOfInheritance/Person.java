package BasicsOfInheritance;

public class Person {
    protected String name = "Kamal";
    protected String address;
    protected int age;

    public void work(String worktype){
        System.out.println("I am working as "+ worktype);
    }
}

class Student extends Person{

    public void work(String worktype){
        System.out.println("I am working as "+ worktype);
    }
    public static void main(String[] args) {
        Student std = new Student();
        System.out.println(std.name);
        std.work("Studnet");
    }

}
