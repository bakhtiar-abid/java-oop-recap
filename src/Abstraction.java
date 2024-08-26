

abstract class Animals{


    abstract void walk();
    Animals(){
        System.out.println("You are creating a new animals");
    }
    public void eat(){
        System.out.println("Animals eat");
    }
}

class Horse extends Animals{

  Horse(){
      System.out.println("You are creating a horse");
  }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

//constructor chaining

class Chicken extends Animals{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}






public class Abstraction {
    public static void main(String[] args) {
    Horse horse = new Horse();
//    horse.walk();
//    horse.eat();
    }
}
