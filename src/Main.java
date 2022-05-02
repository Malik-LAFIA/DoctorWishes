import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob", 25);

        System.out.println("Name : " + person.getName());
        System.out.println("Age : " + person.getAge());

        Scanner scanner = new Scanner(System.in);
        int menuChoice;

        do {
            menu();
            menuChoice = scanner.nextInt();
            int switchChoice;

            switch(menuChoice) {
                case 1 :
                    Eye leftEye = new Eye("Left Eye", "Short sighted", "blue");
                    leftEye.printOrgan();
                    System.out.println("1. Close the eye");
                     switchChoice = scanner.nextInt();
                    if(switchChoice != 1)
                        break;
                    else
                        leftEye.closeEye();
                    break;
                case 2 :
                    Eye rightEye = new Eye("Right Eye", "Normal", "Marron");
                    rightEye.printOrgan();
                    System.out.println("1. Open the eye");
                    switchChoice = scanner.nextInt();
                    if(switchChoice != 1)
                        break;
                    else
                        rightEye.openEye();
                    break;
                case 3 :
                    Heart heart = new Heart("Heart", "Normal", 65);
                    heart.printOrgan();
                    System.out.println("1. Change the heart rate");
                    switchChoice = scanner.nextInt();
                    if(switchChoice != 1)
                        break;
                    else {
                        System.out.println("Enter the new heart rate :");
                        int heartRate = scanner.nextInt();
                        heart.setHeartRate(heartRate);
                        System.out.println("Heart rate changed to " + heart.getHeartRate());
                    }

                    break;
                case 4 :
                    Organ stomach = new Organ("Stomach", "PUD");
                    stomach.printOrgan();
                    System.out.println("Need to be fed");
                    System.out.println("1. Digest");
                    switchChoice = scanner.nextInt();
                    if(switchChoice != 1)
                        break;
                    else
                        System.out.println("Digesting begin...");
                    break;
                case 5 :
                    Organ skin = new Organ("Skin", "Burned");
                    skin.printOrgan();
                    break;
                case 6 :
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid number !");
                    break;
            }

        }while(menuChoice != 6);

    }

    public static void menu() {
        System.out.println("Chose an Organ : ");
        System.out.println("\t 1. Left Eye");
        System.out.println("\t 2. Right Eye");
        System.out.println("\t 3. Heart ");
        System.out.println("\t 4. Stomach");
        System.out.println("\t 5. Skin");
        System.out.println("\t 6.Quit");
    }
}
