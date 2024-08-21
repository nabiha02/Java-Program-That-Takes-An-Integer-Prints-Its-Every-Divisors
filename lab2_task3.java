import java.util.Scanner;
 public class lab2_task3 {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.print("Enter your num: ");
         int num = input.nextInt();

         System.out.print("The divisor of "+num +" is");
         for(int i=2; i<num; i++){

             if(num%i==0){
                 System.out.print(" "+i);
             }
         }
     }
}
