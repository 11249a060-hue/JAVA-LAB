Aim:
To implement an interface in Java using the Drawable interface.

Algorithm:
1. Create a Drawable interface with a draw() method.
2. Create Rectangle and Circle classes implementing the interface.
3. Define the draw() method in both classes.
4. Create a Circle object using the interface reference.
5. Call the draw() method.

Program:    
interface Drawable{
    void draw();
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing circle");
    }
}
class TestInterface {
    public static void main(String args[]){
        Drawable d = new Circle();
        d.draw();
    }
}

Output:
Drawing circle

Result:
Thus, the interface was implemented successfully in Java.
