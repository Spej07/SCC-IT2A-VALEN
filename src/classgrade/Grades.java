package classgrade;

import java.util.Scanner;

public class Grades {

   public static void main(String[] args) {
        grade[] gradeRecords = new grade[100];
        int recordCount = 0;
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Select an option:");
            System.out.println("1. Add Grades");
            System.out.println("2. View Grades");
            System.out.println("3. Edit Grades");
            System.out.println("4. Delete Grades");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    boolean addMore = true;
                    while (addMore) {
                        grades newGrade = new grades();
                        newGrade.getGrade();
                        gradeRecords[recordCount++] = newGrade;
                        System.out.print("Do you want to add another record? (yes/no): ");
                        String continueAdding = input.nextLine();
                        addMore = continueAdding.equalsIgnoreCase("yes");
                    }
                    break;

                case 2:
                    System.out.print("Enter student ID to view: ");
                    String viewId = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < recordCount; i++) {
                        if (gradeRecords[i] != null && gradeRecords[i].getId().equals(viewId)) {
                            gradeRecords[i].printGradeDetails();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Record with ID " + viewId + " not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter student ID to edit: ");
                    String editId = sc.nextLine();
                    found = false;
                    for (int i = 0; i < recordCount; i++) {
                        if (gradeRecords[i] != null && gradeRecords[i].getId().equals(editId)) {
                            gradeRecords[i].editGrade();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Record with ID " + editId + " not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = sc.nextLine();
                    found = false;
                    for (int i = 0; i < recordCount; i++) {
                        if (gradeRecords[i] != null && gradeRecords[i].getId().equals(deleteId)) {
                            gradeRecords[i].deleteGrade();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Record with ID " + deleteId + " not found.");
                    }
                    break;

                case 5:
                    isRunning = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }

        sc.close();
    }
}