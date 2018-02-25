import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String argula []) throws FileNotFoundException {

        FileReadin fileReadin = new FileReadin();
        String inputFilename = "input.txt";
        String outputFilename = "output.txt";
        File file = new File(inputFilename);
        File output = new File(outputFilename);
        PrintStream out = new PrintStream(output);
        if (file.exists()){

            Scanner in = new Scanner(file);
            while(in.hasNextInt()) {
                int firstNum = in.nextInt();
                int secondNum = in.nextInt();
                int max = fileReadin.findMaxCycle(firstNum, secondNum);
                out.println(firstNum + " " + secondNum + " " + max);
            }
            out.close();
            in.close();
        }

    }
}
