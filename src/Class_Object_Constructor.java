class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

}


class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //non parameterization construction


    // parameterization construction


    Student(){
        System.out.println("Hello");
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

}

/**
 * default (with no arguments), parameterized (with specific values), copy constructors (for deep copying), or move constructors (for resource transfer)
 *
 * there is not destructor in java, but it is called as garbage collector
 * **/



public class Class_Object_Constructor {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); // declare object
        pen1.color = "blue";
        pen1.type = "gel";



        Pen pen2  = new Pen();
        pen2.color = "black";
        pen2.type = "bluepoint";

        pen1.printColor();
        pen2.printColor();



        Student student = new Student();
        student.name = "abid";
        student.age = 29;

        //copy constructor
        Student student2 = new Student(student);

        student2.printInfo();
    }
}




