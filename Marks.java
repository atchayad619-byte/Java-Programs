import java.util.*;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Subject 5: ");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;
        double percentage = (total / 500.0) * 100;

        System.out.println("Total Marks = " + total);
        System.out.println("Average     = " + average);
        System.out.println("Percentage  = " + percentage + "%");
    }
}
