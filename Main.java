/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        // BookShelf bookShelf1 = new BookShelf();
        // bookShelf1.numOfShelves = 4;
        // bookShelf1.wallMounted = false;
        // bookShelf1.width = (float) 125.8;
        // bookShelf1.numOfBooks = 34;
        // bookShelf1.height = 140;

        // BookShelf bookShelf2 = new BookShelf();
        // bookShelf2.numOfShelves = 5;
        // bookShelf2.wallMounted = true;
        // bookShelf2.width = 100;
        // bookShelf2.numOfBooks = 21;
        // bookShelf2.height = (float) 85.8;

        // System.out.println("\nFirst bookshelf has "+bookShelf1.numOfShelves+" shelves.");
        // System.out.println("First bookshelf has "+bookShelf1.numOfBooks+" books.");
        // System.out.println("First bookshelf is "+bookShelf1.height+"cm tall.");
        // System.out.println("First bookshelf is "+bookShelf1.width+"cm wide.\n");

        // bookShelf1.printHeight();
        // bookShelf2.printHeight();

        // bookShelf1.height = 189;
        // bookShelf2.height = (float) 94.67;

        // bookShelf1.printHeight();
        // bookShelf2.printHeight();

        // bookShelf1.reduceNumOfBooks();

        // System.out.println(bookShelf1.numOfBooks);

        // System.out.println("There were "+bookShelf1.numOfBooks+" books. There are now "+(bookShelf1.increaseNumOfBooksBy(7))+".");

        Puppy puppyObject1 = new Puppy();

        System.out.println("Name of first puppy: "+puppyObject1.name);

        Puppy puppyObject2 = new Puppy("Dougal");

        System.out.println("Name of second puppy: "+puppyObject2.name);

        Puppy puppyObject3 = new Puppy("Oadie", 4, "Jack Russell");

        System.out.println("\nName of third puppy: "+puppyObject3.name+"\nAge of third puppy: "+puppyObject3.age+"\nBreed of third puppy: "+puppyObject3.breed+"\n");
    }
}