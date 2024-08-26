
//base class
import java.util.*;
import encapsulation.*;

//single level inheritance
class Shape {
   public void area(){
       System.out.println("displays area");
   }

   public void moreArea(){
       System.out.println("hello");
   }
}

//child class
class Triangle extends Shape{
  public void area(int l, int h){
      System.out.println(1/2*l*h);
  }
}

// multilevel inheritance
class EquilateralTraingle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

// hierarchical inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14 * r *r);
    }
}

// hybrid inheritance
// using interface we implement hybrid inheritance


// if one class of properties and methods is taken to the other class, this process is known as inheritance
// Why And When To Use "Inheritance"?
//- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
// subclass (child) - the class that inherits from another class
//superclass (parent) - the class being inherited from

 // for example - there is website and there are buttons in the website and shape in different ways such as rectangle, circle
// data hiding can be done in encapsulation by using access modifiers such as public, protected, and private
public class Inheritence{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(3, 6);
        encapsulation.Bank account1 = new encapsulation.Bank();
//        account1.setPassWord("123");
//        System.out.println(account1.getPassword());

    }
}
