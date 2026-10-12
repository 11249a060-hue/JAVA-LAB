AIM:-
To write a Java program using user-defined packages to perform arithmetic operations such as addition, subtraction, multiplication, and division.

ALGORITHM:-
1. Create four packages named add, sub, mul, and div.
2. Create classes Add, Sub, Mul, and Div in their respective packages.
3. Define methods to perform addition, subtraction, multiplication, and division.
4. Import all four packages into the ArithDemo class.
5. Create objects for all four classes.
6. Pass two numbers to the methods and perform the arithmetic operations.
7. Display the results.

PROGRAM:-
    
package add;

public class Add {
    private int res;

    public void addop(int a, int b) {
        res = a + b;
        System.out.println("Add :" + res);
    }
}
package sub;

public class Sub {
    private int res;

    public void subop(int a, int b) {
        res = a - b;
        System.out.println("Sub :" + res);
    }
}
package mul;

public class Mul {
    private int res;

    public void mulop(int a, int b) {
        res = a * b;
        System.out.println("Mul :" + res);
    }
}
package div;

public class Div {
    private int res;

    public void divop(int a, int b) {
        if (b != 0) {
            res = a / b;
            System.out.println("Div :" + res);
        } else {
            System.out.println("Div: Cannot divide by zero");
        }
    }
}


import add.*;
import sub.*;
import mul.*;
import div.*;

public class ArithDemo {
    public static void main(String[] args) {

        Add ad = new Add();
        Sub su = new Sub();
        Mul mu = new Mul();
        Div di = new Div();

        ad.addop(20, 10);
        su.subop(20, 10);
        mu.mulop(20, 10);
        di.divop(20, 10);
    }
}

OUTPUT:-
Add :30
Sub :10
Mul :200
Div :2

RESULT:- Thus, the Java program using user-defined packages was executed successfully,
    and the arithmetic operations of addition, subtraction, multiplication, and division were performed.
