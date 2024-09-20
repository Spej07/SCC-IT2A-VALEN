package classgrade;

import java.util.Scanner;

class Grades {
    private String id;
    private String name;
    private double grade;

    public void getGrade() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Grade: ");
        grade = sc.nextDouble();
        sc.nextLine();  // Consume the newline character
    }

    public String getId() {
        return id;
    }

    public void printGradeDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
    }

    public void editGrade() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new Grade: ");
        grade = sc.nextDouble();
        sc.nextLine();  // Consume the newline character
    }

    public void deleteGrade() {
        id = null;
        name = null;
        grade = 0;
    }
}

public class Grade {
    public static void main(String[] args) {
        Grades[] gradeRecords = new Grades[100];
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
                        Grades newGrade = new Grades();
                        newGrade.getGrade();
                        gradeRecords[recordCount++] = newGrade;
                        System.out.print("Do you want to add another record? (yes/no): ");
                        String continueAdding = sc.nextLine();
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
