import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        File file = new File("C:\\Users\\Admin\\Desktop\\Szil\\AoC\\day4\\input.txt");
        try{
            Scanner scr = new Scanner(file);

            while(scr.hasNextLine()){
                String line = scr.nextLine();
                String[] parts = line.split("\\|", 0);
                String part1 = parts[0];
                String part2 = parts[1];
                int counter = -1;
                String[] numbers = part2.split(" ");
                for(int i = 0; i < numbers.length; i++){
                    if(isNumeric(numbers[i])){
                        if(part1.contains(" " + numbers[i] + " ")){
                            counter ++;
                        }
                    }
                }if(counter!=-1) {
                    sum = (int) (sum + Math.pow(2, counter));
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        System.out.print(sum);
    }
    public static boolean isNumeric(String strNum) {

        try {
            int num = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
