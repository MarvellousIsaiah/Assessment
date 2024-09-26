package chapter5;

    import java.util.Scanner;

    public class StudentGrades {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter student " + i + " name: ");
                String name = scanner.nextLine();
                System.out.print("Enter student " + i + " grade: ");
                char grade = scanner.nextLine().charAt(0);

                switch (grade) {
                    case 'A':
                        gradeA++;
                        break;
                    case 'B':
                        gradeB++;
                        break;
                    case 'C':
                        gradeC++;
                        break;
                    case 'D':
                        gradeD++;
                        break;
                    default:
                        System.out.println("Invalid grade entered for " + name);
                        break;
                }
            }

            System.out.println("Number of students with grade A: " + gradeA);
            System.out.println("Number of students with grade B: " + gradeB);
            System.out.println("Number of students with grade C: " + gradeC);
            System.out.println("Number of students with grade D: " + gradeD);


        }
    }


