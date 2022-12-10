import java.util.ArrayList;
import java.util.Scanner;

 public class  Hotel_Management {

    static ArrayList<String>
            Reservation = new ArrayList<String>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println(" Welcome to Blue Stone Resort\n");
        while(true){
            System.out.println("1. Make a Reservation\n");
            System.out.println("2. Reservation availabilities and packages\n");
            System.out.println("3.Services\n");
            System.out.println("4. Cancel or reserve\n");
            System.out.println("5. Exit\n");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter your name: ");
                    String Name = scanner.next();
                    System.out.println("Enter your contact number: ");
                    int Number = scanner.nextInt();
                    System.out.println("Enter Reservation Date(dd-mm-yyyy: ");
                    String Date = scanner.next();
                    System.out.println("Enter Reservation Time: ");
                    String Time = scanner.next();
                    System.out.println("Thank You, "+Name+"Sir. Your Reservation has been booked for "+Date+" at"+Time);
                    break;
                case 2:
                    System.out.println("Enter the Room Number:");
                   int Hotel_Room = scanner.nextInt();
                    if (Hotel_Room <= 0 || Hotel_Room > 5) {
                        System.out.println("there is no room available");
                    } else if (Hotel_Room == 1) {
                        System.out.println("Room no 101 is available");
                    } else if (Hotel_Room == 2) {
                        System.out.println("Room no 102 is available");
                    } else if (Hotel_Room == 3) {
                        System.out.println("Room no 103 is available");
                    } else if (Hotel_Room == 4) {
                        System.out.println("Room no 104 is available");
                    }
                    System.out.println("Enter the packages: ");
                    int Packages = scanner.nextInt();
                    if ( Packages<=0 || Packages >4) {
                        System.out.println("there is no packages available");
                    } else if (Packages==1) {
                        System.out.println("Master room+Breakfast+lunch+dinner+Swimming 5000 for per nights\n");
                        } else if (Packages == 2) {
                        System.out.println("Master room+lunch+dinner+Swimming 4500 for per nights\n");
                        } else if (Hotel_Room == 3) {
                        System.out.println("Master room+dinner+Swimming 3000 per nights\n");
                        }

                    break;
                case 3:
                    int press=scanner.nextInt();
                    if(press==1){
                        System.out.println("We are for Room Service sir");
                        System.out.println("Enter service requirements ");
                        String roomservice=scanner.next();
                        System.out.println("Thank u sir,you're service is on the way");
                    }
                    if(press==2) {
                        System.out.println("Enter how was the service");
                        int s1 = scanner.nextInt();
                        if (s1 == 1) {
                            System.out.println("Service was Satisfactory");
                            System.out.println("Thank u sir for your review");
                        } else {
                            System.out.println("Service was Bad");
                            System.out.println("Sorry sir for the service");


                        }
                    }
                    break;


                case 4:
                    System.out.println("Enter Your confirmation: ");
                    int Confirmation=scanner.nextInt();
                    if(Confirmation==1){
                        System.out.println("Done Reservation\n");
                    }
                    else{
                        System.out.println("Cancel\n");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for Checking our website");
                    break;

            }
           }

        }

    }


