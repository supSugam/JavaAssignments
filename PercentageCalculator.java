package JavaAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class PercentageCalculator
{
    public static void main(String[]args){
        int sumOfMarks=0;

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        for(int i=0; i<5; i++){
            System.out.println("Enter marks #"+(i+1));
            marks.add(scan.nextInt());
        }
        for(Integer m:marks){
            sumOfMarks += m;

        }System.out.println("Percentage: "+ ((sumOfMarks/500.0)*100));
    }
}