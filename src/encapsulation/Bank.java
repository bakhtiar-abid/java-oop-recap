package encapsulation;


class Account{
 public String name;

 protected  String email; // protected can be accessed via the subclass from the another package and current package
 private String password; // can not be accessed from any packages only can be accessed within the class by using getter setter method

 //getters and setters
 public String getPassword( String randomPass){
     setPassWord(randomPass);
        return this.password;
    }

    private void setPassWord(String pass){
        this.password = pass;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.password = name;
    }

    //default, public, protected, private
    //Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.
    //Encapsulation in
    //We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.
    // we hide data and function in one unit, which is call as encapsulation, all the classes data and functions are in one unit
}

 public class Bank {
    public static void main(String[] args) {
     Account account1 = new Account();
     account1.name = "Test Account";
     account1.email = "Test Email";
     System.out.println(account1.getPassword("Abcd"));

    }


}






