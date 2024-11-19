public class d_constructor{
    public static void main(String[] args) {

        Student s1 =  new Student();
        Student s2 = new Student("Ansh");
        System.out.println(s2.name);
        
    }
}

class Student{
    String name;
    int marks;

    Student(String name){
        this.name = name;
    }

    Student(){
        System.out.println("Construcor is called.");
    }
}