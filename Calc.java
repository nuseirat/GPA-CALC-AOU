import java.util.Scanner;




public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalGradePoints = 0;
        double totalHours = 0;
        System.out.println("@MohaNuseirat");
        System.out.println("نظام الجامعة العربية المفتوحة كالتالي:");
        System.out.println("A=4,   B+=3.5,   B=3,   C+=2.5,   C=2,   D=1.5,   F=0");
        System.out.println("--------------");

        while (true) {
            // Get grade input
            System.out.print("Enter the subject grade (or -1 to exit): ");
            String gradeStr = scanner.next();
            if (gradeStr.equals("-1")) {
                break;
            }
            double grade = Double.parseDouble(gradeStr); 


            // Get hours input
            System.out.print("Enter the hours studied (or -1 to exit): ");
            String hoursStr = scanner.next();
            if (hoursStr.equals("-1")) {
                break;
            }
            double hours = Double.parseDouble(hoursStr);

            // Calculate the corresponding grade points based on the scale
            double gradePoints;
            if (grade == 4.0) {
                gradePoints = 4.0;
            } else if (grade >= 3.5) {
                gradePoints = 3.5;
            } else if (grade >= 3.0) {
                gradePoints = 3.0;
            } else if (grade >= 2.5) {
                gradePoints = 2.5;
            } else if (grade>= 2.0) {
                gradePoints = 2.0;
            } else if (grade >= 1.5) {
                gradePoints = 1.5;
            } else {
                gradePoints = 0;
            }

            // Add the grade points and hours to the total
            totalGradePoints += gradePoints * hours;
            totalHours += hours;
        }

        // Calculate the GPA
        double gpa = totalGradePoints / totalHours;

        // Print the result
        System.out.println("Total hours studied: " + totalHours);
        System.out.println("GPA: " + gpa);


    }
}
