import java.util.*;
class Amount{
public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
float principal  = sc.nextFloat();
float rate = sc.nextFloat();
float time = sc.nextFloat();
float simpleinterest = (principal * rate * time) / 100;
float totalamount = principal + simpleinterest;
System.out.println("Simple Interest:"+simpleinterest);
System.out.println("Total Amount:"+totalamount);
}
}

