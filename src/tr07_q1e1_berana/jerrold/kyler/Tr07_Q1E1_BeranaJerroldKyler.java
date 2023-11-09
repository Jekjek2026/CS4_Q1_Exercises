package tr07_q1e1_berana.jerrold.kyler;

public class Tr07_Q1E1_BeranaJerroldKyler {
     
    public static void main(String[] args) {

        // TODO code application logic here

        String s1Name = "John";

        int s1Age = 16;

        double s1Grade = 90.1;

        int s1Siblings = 3;

        

        String s2Name = "Jill";

        int s2Age = 13;

        double s2Grade = 96.3;

        int s2Siblings = 5;

        

        String s3Name = "Jack";

        int s3Age = 18;

        double s3Grade = 97.8;

        int s3Siblings = 4;

        

        

        boolean sAgeComparison = s1Age > s3Age;

        int sTotalSibling = s1Siblings + s2Siblings + s3Siblings;

        boolean sGradeComparison = s2Grade < s3Grade;

        

        System.out.println("Name of Student 1: " + s1Name);

        System.out.println("Age: " + s1Age);

        System.out.println("Grade: " + s1Grade);

        System.out.println("Number of siblings: " + s1Siblings + "\n"); 

        System.out.println("Name of Student 2: " + s2Name);

        System.out.println("Age: " + s2Age);

        System.out.println("Grade: " + s2Grade);

        System.out.println("Number of siblings: " + s2Siblings  + "\n");

        System.out.println("Name of Student 3: " + s3Name);

        System.out.println("Age: " + s3Age);

        System.out.println("Grade: " + s3Grade);

        System.out.println("Number of siblings: " + s3Siblings  + "\n");

        System.out.println("Total Number of Siblings: " + sTotalSibling);

        System.out.println("Student 1 is older than Student 3: " + sAgeComparison);

        System.out.println("Student 2 has a higher grade than Student 3: " + sGradeComparison);

    }
}
