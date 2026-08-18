package Anudip_Class.Home_Work;

import java.util.Scanner;

public class ATM_Login_and_Banking_System {


    static void main() {

        int account = 1234506789;
        int pin = 1234;
        int avlBalance = 10000;
        Scanner sc = new Scanner(System.in);
        int count=0;
        int input = 0   ;
        while(count <3){
            System.out.println("Welcome to XYZ Bank");
            System.out.println("Please Enter your Ten digit Account no : ");
            int userAcc = sc.nextInt();

            if(account == userAcc){
                System.out.println("Please Enter yor PIN : ");
                int userPin = sc.nextInt();
                if(pin == userPin){
                    System.out.println("What would you like to do : ");
                    System.out.println("Press 1 to check your Account Balance ");
                    System.out.println("---------------------------------------");
                    System.out.println("       Press 2 to Deposit money ");
                    System.out.println("---------------------------------------");
                    System.out.println("       Press 3 to Withdraw money");
                    System.out.println("---------------------------------------");
                    System.out.println("    Press 4 to Change your ATM Pin  ");
                    System.out.println("---------------------------------------");
                    System.out.println("            Press 5 to Exit");
                    System.out.println("---------------------------------------");
                    input = sc.nextInt();
                    switch (input) {
                        case 1: {
                            System.out.println("Your available Balance is :  " + avlBalance);
                        }
                        break;
                        case 2: {
                            System.out.println("Please enter the amount you want to deposit : ");
                            int deposit = sc.nextInt();
                            if (deposit <= 0) {
                                System.out.println("Please enter amount greater than 0");
                            } else {
                                avlBalance += deposit;
                                System.out.println("Deposit successful");
                                System.out.println("Your Account Balance is : " + avlBalance);
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("please enter the withdraw amount : ");
                            int withdraw = sc.nextInt();
                            if (withdraw <= 0) {
                                System.out.println("Please enter amount greater than 0");
                            } else {
                                if (withdraw > avlBalance) {
                                    System.out.println("Insufficient balance.");
                                } else {
                                    avlBalance -= withdraw;
                                    System.out.println("Please collect your Cash : " + withdraw);
                                    System.out.println("Your Account Balance is : " + avlBalance);
                                }

                            }
                            break;
                        }
                        case 4: {
                            System.out.println("Enter the current Pin : ");
                            int currentPin = sc.nextInt();
                            if (currentPin == pin) {
                                System.out.println("Please enter the new Pin : ");
                                int newPin = sc.nextInt();
                                if (newPin == pin) {
                                    System.out.println("please enter different pin from your current pin : ");
                                } else {
                                    System.out.println("Please re-enter your the new Pin : ");
                                    int reEnterPin = sc.nextInt();
                                    if (reEnterPin == newPin) {
                                        pin = newPin;
                                        System.out.println("Your Pin has been changed");
                                    } else {
                                        System.out.println("New PIN and confirmation PIN do not match");
                                    }

                                }
                            } else {
                                System.out.println("Please enter the correct Pin : ");
                            }
                            break;
                        }
                        case 5 : {
                            System.out.println("Thank you for using our ATM");
                            System.out.println("Please collect your card.");
                            System.out.println("Have a nice day!");
                            break;
                        }
                        default:
                            System.out.println("Invalid choice.");
                            System.out.println("Please select a valid option.");

                        }
                }else{
                    System.out.println("Please Enter the correct Pin : ");
                    count++;
                }
            }else{
                System.out.println("Please Enter the correct Ten digit Account no : ");
                count+=1;
            }
        }
        System.out.println("You ran out of attempts");
        System.out.println("Please contact your Bank");

    }
}
