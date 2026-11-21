import java.util.*;

class Area{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter l: ");
        int l = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int area = l * b;
        int perimeter = 2 * (l + b);

        String result = (l == b) ? "Square" : "Not a Square";

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        System.out.println(result);
    }
}
