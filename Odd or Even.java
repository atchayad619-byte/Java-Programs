import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        String result = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);
    }
}
