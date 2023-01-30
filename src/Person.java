import java.lang.reflect.Method;
import java.util.jar.Attributes.Name;

public class Person {

    String name;
    int age;
    double slary;

    // Constructeur Sans paramettre
    public Person() {
        
    }

    // Constructeur avec les 3 paramettres

    public Person(String name, int age, double slary) {
        this.name = name;
        this.age = age;
        this.slary = slary;
    }

    // Constructeur avec les 2 paramettres
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.slary  = -1;
    }

    /**
     * fonction permetant retourner les informations de person.
     */
    public void displayInfo() {

        if (this.slary != -1) {
            System.out.println("Le nom de l'employer est " + this.name + " son age : " + this.age
                    + " ans et percoit comme salaire " + this.slary);
        } else {
            System.out.println("Le nom de l'employer est " + this.name + " son age : " + this.age
                    + " ans " + "salaire non fournit");
        }
    }

    public static void main(String[] args) {
        Person Person1 = new Person();
        Person Person2 = new Person("Frank", 30, 20000000);

        Person1.displayInfo();
        Person2.displayInfo();

        Person Person3 = new Person("Abou", 25);
        Person3.displayInfo();
    }

}