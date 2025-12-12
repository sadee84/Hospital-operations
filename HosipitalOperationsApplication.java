/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hosipitaloperationsapplication;

import java.util.Scanner;

/**
 *
 * @author SadeM

 */
public class HosipitalOperationsApplication {

    public static void main(String[] args) {
        // Initialize the data arrays for the hospital operations
        int[][] operationsData = {
            {320, 175, 380}, // Year 1 - Q1, Q2, Q3
            {210, 125, 360} // Year 2 - Q1, Q2, Q3
        };

        // Create an instance of the Operations class
        Operations ops = new Operations();

        // Display menu and get user input
        Scanner input = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            displayMenu();
            System.out.print("Enter your choice (1-4): ");
            int userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    // Calculate and display total operations
                    int totalOps = ops.TotalOperations(flattenArray(operationsData));
                    System.out.println("\n================================");
                    System.out.println("HOSPITAL OPERATIONS APPLICATION");
                    System.out.println("================================");
                    System.out.println("Total Operations: " + totalOps);
                    System.out.println("================================\n");
                    break;

                case 2:
                    // Calculate and display average operations
                    double avgOps = ops.AverageOperations(flattenArray(operationsData));
                    System.out.println("\n================================");
                    System.out.println("HOSPITAL OPERATIONS APPLICATION");
                    System.out.println("================================");
                    System.out.printf("Average Operations: %.2f%n", avgOps);
                    System.out.println("================================\n");
                    break;

                case 3:
                    // Calculate and display maximum operations
                    int maxOps = ops.MaxOperations(flattenArray(operationsData));
                    System.out.println("\n================================");
                    System.out.println("HOSPITAL OPERATIONS APPLICATION");
                    System.out.println("================================");
                    System.out.println("Max Operations: " + maxOps);
                    System.out.println("================================\n");
                    break;

                case 4:
                    // Calculate and display minimum operations
                    int minOps = ops.MinOperations(flattenArray(operationsData));
                    System.out.println("\n================================");
                    System.out.println("HOSPITAL OPERATIONS APPLICATION");
                    System.out.println("================================");
                    System.out.println("Min Operations: " + minOps);
                    System.out.println("================================\n");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.\n");
                    continue;
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String response = input.next();
            if (response.equalsIgnoreCase("no")) {
                continueProgram = false;
            }
        }

        System.out.println("\nThank you for using the Hospital Operations Application!");
        input.close();
    }

    // Method to display the menu
    public static void displayMenu() {
        System.out.println("\nPlease enter the operation results to display:");
        System.out.println("1) Total Operations:");
        System.out.println("2) Average Operations:");
        System.out.println("3) Max Operations:");
        System.out.println("4) Min Operations:");
    }

    // Helper method to flatten the 2D array into a 1D array
    public static int[] flattenArray(int[][] data) {
        int[] flattened = new int[data.length * data[0].length];
        int index = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                flattened[index] = data[i][j];
                index++;
            }
        }

        return flattened;
    }
}

