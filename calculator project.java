import java.util.Scanner;
public class mathodclass01CTB {

   public static void main(String[] args) {
      System.out.println("Enter any value of x and y :");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      sc.close();
       int c =add(a,b);
      System.out.println("Output addition: " + c);
      int d =sub(a,b);
      System.out.println("Output Subtraction: " + d);
      int e =mlt(a,b);
      System.out.println("Output multiplication: " + e);
      int f =div(a,b);
      System.out.println("Output division: " + f);
      int g =mod(a,b);
      System.out.println("Output modulus: " + g);
   }
   static int add (int a,int b){    //static use holo karon main class ar satah link korbar jonnno.
      int result = a + b;
      return  result;
   }
   static int sub (int a,int b) {  //void use kora jabe nah.
      int result = a - b;
      return result;
   }
   static int mod (int a,int b) {
      int result = a % b;
      return result;
   }
   static int mlt (int a,int b) {
      int result = a * b;
      return result;
   }
   static int div (int a,int b) {
      int result = a / b;
      return result;
   }
}
