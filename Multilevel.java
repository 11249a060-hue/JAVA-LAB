AIM:-
To write a Java program to demonstrate multilevel inheritance using three classes: Animal, Dog, and Puppy.

ALGORITHM:-
1. Start the program.
2. Create an Animal class with an eat() method.
3. Create a Dog class that extends Animal with a bark() method.
4. Create a Puppy class that extends Dog with a play() method.
5. Create an object of the Puppy class.
6. Call all three methods and display the output.
7. Stop the program.

PROGRAM:-
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
    }
}

OUTPUT:-
    Animal eats
Dog barks
Puppy plays

RESULT:-
    Thus, the Java program was executed successfully to demonstrate multilevel inheritance.
