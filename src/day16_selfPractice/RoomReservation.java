package day16_selfPractice;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer = "";

        do {
            System.out.println("\tKing Bed ==> 120$\n\tQueen Bed ==>100$\n\tSingle Bed==> 85$");
            System.out.println("Which bedroom do you want to reserve?\nYou are allow ");

            String bedroom = input.next().toLowerCase();

            while (!(bedroom.equals("king") || bedroom.equals("queen") || bedroom.equals("single"))) {
                System.err.println("Invalid entry! Please re-enter which room you want to reserve(King/Queen/Single)");
                bedroom = input.next().toLowerCase();
            }
            System.out.println("How many night are staying? \nYou can only stay maximum 10 nights");
            int night = input.nextInt();
            while (!(night > 0 && night <= 10)) {
                System.err.println("Invalid Entry! Please re-enter how many nights you are staying. (1 ~ 10)");
                night = input.nextInt();
            }
            int bedroomPrice = (bedroom.equals("king")) ? 120 : (bedroom.equals("queen")) ? 100 : 80;
            int price = night * bedroomPrice;
            System.out.println("You have reserved " + bedroom + " bedroom.");
            System.out.println("You are going to stay " + night + " nights.");
            System.out.println("Your total is $ " + price);
            System.out.println();
            System.out.println("Would you like to reserve another room? (Yes/No)");

            answer = input.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry! Please re-enter (yes/no)");
                answer = input.next().toLowerCase();
            }

        } while (answer.equals("yes"));
    }

        }

