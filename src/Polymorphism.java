



class Student_Polymorphism{

    // two types of polymorphism
    // compiler polymorphism
    // run-time polymorphism - Worked on inheritance
    String name;
    int age;


    //there will be same functions with different parameters is called polymorphism --> method overloading
    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }


}

/**
 * default (with no arguments), parameterized (with specific values), copy constructors (for deep copying), or move constructors (for resource transfer)
 *
 * there is not destructor in java, but it is called as garbage collector
 *
 *     // two types of polymorphism
 *     // compiler polymorphism
 *     // run-time polymorphism - Worked on inheritance
 *
 *
 *     Compile-time polymorphism is obtained through method overloading.
 *     The term method overloading allows us to have more than one method with the same name.
 *     Since this process is executed during compile time, that's why it is known as Compile-Time Polymorphism
 *
 *     //run-time polymorphism
 *     In runtime polymorphism, the compiler resolves the object at run time and then it decides which function call should be associated with that object.
 *     It is also known as dynamic or late binding polymorphism.
 *     This type of polymorphism is executed through virtual functions and function overriding
 * **/



public class Polymorphism {
    public static void main(String[] args) {
        Student_Polymorphism student = new Student_Polymorphism();
        student.name = "abid";
        student.age = 29;

        //function overloading - compiler polymorphism
        student.printInfo(student.name, student.age);
    }
}




