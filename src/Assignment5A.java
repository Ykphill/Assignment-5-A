import java.util.Scanner;
import java.util.Random;

public class Assignment5A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int rand_int1;
        int r, c;
        int count = 1;
        System.out.print("What’s the highest number you want to generate?: ");
        r = scan.nextInt();
        System.out.print("How long of a number sequence do you want to generate?: ");
        c = scan.nextInt();

        System.out.println("Okay, we’ll generate "+c+" number(s) ranging from 1 to "+r+"!\n");


        int[] inputD = new int[c];

        int[] counter = new int[c+1];

        for(int x = 0; x < c+1 ; x++){
            counter[x] = 0;

        }



            for (int x = 0; x < c ; x++) {
                rand_int1 = rand.nextInt(r);


                inputD[x] = rand_int1;

                System.out.print(rand_int1+",");

                counter[rand_int1]=counter[rand_int1]+1;

            }
        System.out.println("");
            count=1;
        for (int x = 1; x < c+1 ; x++) {


            System.out.println(count+" occurs "+(((double)counter[x]/(double)c)*100)+"% of the time");

count++;
        }









    }

}
