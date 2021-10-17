import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Assignment5B {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int rand_int1;
        int r, c;
        int count = 1;
        System.out.print("How many games do you want to play?: ");
        r = scan.nextInt();


        String[] inputD = {"rock", "scissor", "paper"};
        String[] inputx = {"tie", "losse", "winner"};
        ArrayList<String> roundsc = new ArrayList<String>(r);


        for (int x = 0; x < r; x++) {

            rand_int1 = rand.nextInt(3);

            System.out.print("Round " + count + ": What do you want to throw?: ");
            String userIm = scan.nextLine();


            if (userIm.equals("rock")) {
                if (inputD[rand_int1].equals("rock")) {
                    System.out.println("Computer threw ROCK");
                    roundsc.add("Tied on ");

                }
                if (inputD[rand_int1].equals("paper")) {
                    System.out.println("Computer threw PAPER");
                    roundsc.add("Computer won ");

                }
                if (inputD[rand_int1].equals("scissor")) {
                    System.out.println("Computer threw SCISSOR");
                    roundsc.add("Player won ");

                }


            }

            if (userIm.equals("paper")) {
                if (inputD[rand_int1].equals("rock")) {
                    System.out.println("Computer threw ROCK");
                    roundsc.add("Player won ");

                }
                if (inputD[rand_int1].equals("paper")) {
                    System.out.println("Computer threw PAPER");
                    roundsc.add("Tied on ");

                }
                if (inputD[rand_int1].equals("scissor")) {
                    System.out.println("Computer threw SCISSOR");
                    roundsc.add("Computer won ");

                }
                count++;
            }

            if (userIm.equals("scissor")) {
                if (inputD[rand_int1].equals("rock")) {
                    System.out.println("Computer threw ROCK");
                    roundsc.add("Computer won ");

                }
                if (inputD[rand_int1].equals("paper")) {
                    System.out.println("Computer threw PAPER");
                    roundsc.add("Player won ");

                }
                if (inputD[rand_int1].equals("scissor")) {
                    System.out.println("Computer threw SCISSOR");
                    roundsc.add("Tied on");

                }


            }
count++;

        }
        count=1;
        System.out.println("Game Over...\n");
        System.out.println("Here’s the recap:");
        for (int x = 0; x < r; x++) {

            System.out.println(roundsc.get(x)+"Round "+count);
            count++;
        }
    }
}