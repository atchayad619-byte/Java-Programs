import java.util.*;
class Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        boolean equal = (a == b) && (b == c);

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        System.out.println("All equal: " + equal);
    }
}
