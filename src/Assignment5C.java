import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Assignment5C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int rand_int1;
        int r, c,choice;
        int count = 1;
        System.out.print("Enter a level map width: ");
        c = scan.nextInt();

        System.out.print("Enter a level map height: ");
        r = scan.nextInt();

        String[][] inputD = new String[r][c];
        String[] inputx = {"tie", "losse", "winner"};
        ArrayList<String> roundsc = new ArrayList<String>(r);

        for (int x = 0; x < r; x++) {
            for (int y = 0; y < c; y++) {
                inputD[x][y] = "*";
                System.out.print(inputD[x][y]);
            }
            System.out.println("");
        }
        System.out.println("");
   do {


       System.out.print("\nOptions\n" +
               "1. Clear Level\n" +
               "2. Add Platform\n" +
               "3. Add Items\n" +
               "4. Quit\n" +
               "Enter a choice: ");
        choice = scan.nextInt();
        if(choice==1){
            System.out.println("\n[Clear Level]");
            for (int x = 0; x < r; x++) {
                for (int y = 0; y < c; y++) {
                    inputD[x][y] = "*";
                    System.out.print(inputD[x][y]);
                }
                System.out.println("");
            }
        }

        if(choice==2){

            System.out.println("\n[Add Platform]");
            System.out.print("Enter X Coordinate: ");
            int xAxis = scan.nextInt();
            System.out.print("Enter Y Coordinate: ");
            int yAxis = scan.nextInt();
            System.out.print("Enter Length: ");
            int lengthpla = scan.nextInt();

            if(lengthpla+xAxis <= c) {
                for (int y = xAxis; y < (xAxis + lengthpla); y++) {
                    inputD[yAxis-1][y-1] = "=";
                }

            }
            else {
                System.out.print("This platform won’t fit in the level!");
            }

            for (int x = 0; x < r; x++) {
                for (int y = 0; y < c; y++) {

                    System.out.print(inputD[x][y]);
                }
                System.out.println("");
            }
            }

        if(choice==3){
            System.out.println("\n[Add Item]");

            System.out.print("Enter X Coordinate: ");
            int xAxis = scan.nextInt();
            System.out.print("Enter Y Coordinate: ");
            int yAxis = scan.nextInt();

            if((0<< xAxis < r)&& (0<< yAxis < r)) {
                inputD[yAxis - 1][xAxis - 1] = "O";

                for (int x = 0; x < r; x++) {
                    for (int y = 0; y < c; y++) {

                        System.out.print(inputD[x][y]);
                    }
                    System.out.println("");
                }

            }

            else{
                System.out.println("");
            }

        }
   }while(choice != 4);

    }
}
