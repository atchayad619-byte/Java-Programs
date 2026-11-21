import java.util.Scanner;

class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hraPercent = sc.nextDouble();
        double daPercent = sc.nextDouble();
        double taxPercent = sc.nextDouble();

        double hra = basic * hraPercent / 100;
        double da = basic * daPercent / 100;
        double gross = basic + hra + da;
        double tax = gross * taxPercent / 100;
        double net = gross - tax;

        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Gross Salary = " + gross);
        System.out.println("Tax = " + tax);
        System.out.println("Net Salary = " + net);
    }
}