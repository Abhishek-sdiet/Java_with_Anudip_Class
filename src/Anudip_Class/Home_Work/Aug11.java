package Anudip_Class.Home_Work;
import java.sql.SQLOutput;
import java.util.*;
public class Aug11 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 1. Wap to print all even numbers from the given range.
//        int evenUser ;
//        System.out.println("Please Enter the number till which you want Even number : ");
//        evenUser = sc.nextInt();
//        int init = 1;
//        while(init <= evenUser){
//            if(init%2==0){
//                System.out.print(init + " ");
//            }
//            init ++;
//        }

        // 2. Wap to print  even numbers(input number of elements from user).
//        int input ;
//        System.out.println("Enter the number of elements : ");
//        input = sc.nextInt();
//        int n = 1;
//        while(n<=input*2){
//            if(n%2==0){
//                System.out.print(n + " ");
//            }
//            n++;
//        }

        // Q3. Wap to print all ascii characters from 0 to 127.


       // Q4. Wap to calculate the number of digits in a number.
//        int input;
//        System.out.println("Enter the number and I'll give you digits in it : ");
//        input = sc.nextInt();
//        int count=0;
//        while(input>0){
//            input/=10;
//            count++;
//        }
//        System.out.println("Digit in your number is : " + count);

        //Q5. Wap to calculate the power of a variable if the number and exponent value is given by the user
          int num;
          int exp;
          int result=1;
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        System.out.println("Enter the power of number : ");
        exp = sc.nextInt();

        int n = 0;
        while(n<exp)
        {
            result*=num;
            n++;
        };
        System.out.println(result);

        //Q6  :  wap to reverse digits of a number
//        int input ;
//        System.out.println("Enter the number to get reverse of your number : ");
//        input = sc.nextInt();
//        for(int i=0;i<)

    }
}
