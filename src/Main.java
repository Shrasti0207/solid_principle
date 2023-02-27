import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter The Length :");
        rectangle.setLength(userInput.nextInt());

        System.out.println("Enter the width :");
        rectangle.setWidth(userInput.nextInt());

        System.out.println("Area of the Rectangle :"+rectangle.getArea());

        Square square=new Square();
        System.out.println("Side of the square :");
        square.setSide(userInput.nextInt());
        System.out.println("Area of the Square : "+square.getArea());

    }
}

