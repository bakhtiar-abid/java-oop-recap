class Students{
    String name;
    static String school;

    public static void changeSchool(){
        school = "newschool";
    }
}




public class Static {
    public static void main(String[] args) {
        Students.school = "XYZ University";

        Students student1 = new Students();
        student1.name = "Hello";
        System.out.println(student1.school);
        System.out.println(student1.name);

    }
}
