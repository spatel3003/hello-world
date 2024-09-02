import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //Declaring variables
        ArrayList<AssemblyLine> assemblyLines = new ArrayList<AssemblyLine>();
        Scanner sc = new Scanner(System.in);
        double factoryEfficiency = 0;
        String assemblyName = "";
        String repeat = "";
        int widgetMade;
        int widgetRejected;
        
        //declaring constants
        int EXCELLENT_RATING = 95;
        int GOOD_RATING = 90;

        //Asking the user for input until it asks to stop
        do{
            //Getting user input
            System.out.print("Enter the name of the assembly line: ");
            assemblyName = sc.nextLine();

            System.out.print("Enter the total number of widgets manufactured:");
            widgetMade = sc.nextInt();

            //Input validation, widgets made can't be less than 1
            while (widgetMade < 1){
                System.out.print("\nIncorrect number, please try again! \n Enter the total number of widgets manufactured:");
                widgetMade = sc.nextInt();
            }

            System.out.print("Enter the number of rejected widgets manufactured: ");
            widgetRejected = sc.nextInt();
            
            //Input validation, widgets rejected can't be less than 1
            while (widgetRejected < 1){
                System.out.print("\nIncorrect number, please try again! \n Enter the number of rejected widgets manufactured:");
                widgetRejected = sc.nextInt();
            }

            //Adding a new assemblyline object to a list
            assemblyLines.add(new AssemblyLine(assemblyName, widgetMade, widgetRejected));

            //scanner reset
            sc.nextLine();

            //Asking the user if it wants to continue 
            System.out.print("\nDo you wish to enter information for another assembly line (Y/N)? ");
            repeat = sc.nextLine();

            //Input validation, the answer can't be anything else but y or n
            while (!repeat.equalsIgnoreCase("y") && !repeat.equalsIgnoreCase("n")){
                System.out.print("\nIncorrect anwer, please try again! \nDo you wish to enter information for another assembly line (Y/N)? ");
                repeat = sc.nextLine();
            }//End while 2

            //new line
            System.out.println();

        //While statement
        }while(repeat.equalsIgnoreCase("y"));
        
     //Printing the Quality Report
        System.out.println("Quality Report:");
        
     //Printing the report for each assembly line and summing assembly line qualities
        for (int i = 0; i < assemblyLines.size(); ++i){
            System.out.printf("\nAssembly Line: %s \nQuality (as a percentage): %.2f\n", assemblyLines.get(i).getAssemblyName(), assemblyLines.get(i).calcQualityOfLine()*100);
            factoryEfficiency += assemblyLines.get(i).calcQualityOfLine()*100;
        }
        
     //Calculating the value of factory efficiency
        factoryEfficiency = factoryEfficiency / assemblyLines.size();
        
     //Printing the Factory's efficiency
        System.out.printf("\nThe efficiency of the factory is: %s\n", ((factoryEfficiency > EXCELLENT_RATING) ? "Excellent" : (factoryEfficiency < GOOD_RATING) ? "Unacceptable" : "Good"));        
        
    }//End method
}//End class