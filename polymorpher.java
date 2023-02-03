import java.util.Scanner;

public class polymorpher{

    public static void main(String[] args) {
        
        int a,b;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Type A = ");
        a = sc.nextInt();
        System.out.print("Type B = ");
        b = sc.nextInt();

        Triangle T = new Triangle();
        T.area(a,b);
        Rectangle R = new Rectangle();
        R.area(a,b);


    }
}

class shape{

    void area (int a, int b){
        System.out.print("Area of ");

    }
}
class Rectangle extends shape{

    void area (int a, int b){
        System.out.println("Rectangle = "+(a*b));

    }
}
class Triangle extends shape{
 
    void area (int a, int b){
        super.area(a, b);
        System.out.println("Triangle = "+(0.5*a*b));

    }
}