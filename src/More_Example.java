//single inheritence

class Animal{
    public void  activity(){
        System.out.println("Can eat");
    }
}



class Dog extends Animal{
    void barking(){
        System.out.println("Barking");
    }
}

class Cat extends Dog{
    void eatFish(){

        System.out.println("Eating Fish");
    }
}


public class More_Example {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eatFish();
        cat.activity();
        cat.barking();
    }
}
