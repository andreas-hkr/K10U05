import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static int countLines(String filename) throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File(filename));
        int count = 0;

        while (fileIn.hasNextLine()) {
            count++;
            fileIn.nextLine();
        }

        return count;
    }

    static void printName(String filename, int count) throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File(filename));

        for (int i=0; i < count; i++) {
            fileIn.nextLine();
        }
        System.out.format("Namnet på rad %d är: %s%n", count, fileIn.nextLine());

    }

    public static void main(String[] args) throws FileNotFoundException {
        // Välj ut ett slumpvis namn från en fil och skriv ut det på skärmen
        //   - Klura ut hur många rader det finns i filen
        //   - Slumpa fram en rad
        //   - Visa namnet från just den raden

        int lines = countLines("names.txt");
        int rand = (int)(Math.random() * lines);
        printName("names.txt",rand);
    }
}