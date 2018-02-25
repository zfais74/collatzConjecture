import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadin {


     int findMaxCycle(int num1, int num2) {

         int maxCycles = 0;
         for (int number = num1; number <=num2; ++number) {


             if(!isEven(number/2) || !isEven(number)) {
                 int cycle = findCycle(number);
                 if(cycle > maxCycles) {
                     maxCycles = cycle;
                 }
             }
         }
         return maxCycles;

    }

    boolean isEven(int num) {
        return num %2 == 0;
    }

    int findCycle(int num) {
         int cycles = 0;
         for(; num !=1; ){
             if(isEven(num)) {
                 num/=2;
                 cycles++;

             } else {
                 num*=3;
                 num++;
                 cycles++;
             }

         }
        cycles++;

         return cycles;
    }
}
