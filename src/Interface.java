
interface Animalss{

    int eyes  = 2;
      void walk();
}

interface Herbivore{

}


class Horses implements Animalss, Herbivore{
   public void walk(){
       System.out.println("walks on 4 legs");
   }
}







public class Interface {
    public static void main(String[] args) {
        Horses horse = new Horses();
        horse.walk();
    }

}
