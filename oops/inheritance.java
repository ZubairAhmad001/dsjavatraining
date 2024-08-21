package oops;

// Main class
public class inheritance {
    public static void main(String[] args) {
        // Creating an object of the Parents class
        Parents parents = new Parents();

        // Calling the method from the GrandParents class using Parents object
        parents.printGrandParents();

        // Calling the method from the Parents class
        parents.printParents();
    }
}

// Parents class inheriting from GrandParents
class Parents extends GrandParents {
    // Method specific to the Parents class
    void printParents() {
        System.out.println("in Parents");
    }
}

// GrandParents class
class GrandParents {
    // Method specific to the GrandParents class
    void printGrandParents() {
        System.out.println("in Grandparents");
    }
}
