import java.util.Scanner;

class personData{
    String firstName;
    String lastName;
    String gender;
    String ethnicity;
    String religion;

    int age;
    int weight;
    int height;
}
public class personInfo {
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {

        personData person1 = new personData();

        System.out.println("What is your person's first name?");
        person1.firstName = userinput.nextLine();

        System.out.println("What is your person's last name?");
        person1.lastName = userinput.nextLine();

        System.out.println("What is your person's gender?");
        person1.gender = userinput.nextLine();

        System.out.println("What is your person's ethnicity?");
        person1.ethnicity = userinput.nextLine();

        System.out.println("What is your person's religion?");
        person1.religion = userinput.nextLine();

        System.out.println("What is your person's age?");
        person1.age = userinput.nextInt();

        System.out.println("What is your person's weight?");
        person1.weight = userinput.nextInt();

        System.out.println("What is your person's height?");
        person1.height = userinput.nextInt();
        
        System.out.println("First Name : " + person1.firstName + " Last Name : " + person1.lastName);
        System.out.println("Gender : " + person1.gender + " Ethnicity : " + person1.ethnicity);
        System.out.println("Religion : " + person1.religion + "Age : " + person1.age);
        System.out.println("Weight : " + person1.weight + " Height : " + person1.height);
    }
}
