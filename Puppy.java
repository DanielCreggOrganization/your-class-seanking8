/**
 * Puppy
 */
public class Puppy {
    //Instance variables
    String name;
    int age;
    String breed;

    //Default constructor:
    public Puppy(){
        name = "Dora";
    }

    //Paramaterised constructor:
    public Puppy(String newName){
        name = newName;
    }

    //Paramaterised constructor:
    public Puppy(String newName, int newAge, String newBreed){
        name = newName;
        age = newAge;
        breed = newBreed;
    }

}