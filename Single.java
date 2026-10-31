Aim:
To implement single inheritance in Java.

Algorithm:
1. Create an Animal class with an eat() method.
2. Create a Dog class that extends Animal.
3. Define a bark() method in the Dog class.
4. Create a Dog object and call both methods.

Program:
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

public class Single {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}

Output:
Animal eats
Dog barks

Result:
Thus, single inheritance was implemented successfully in Java.
