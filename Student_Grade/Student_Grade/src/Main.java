import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_marks=0;
        int marks;
        int max_marks=100;
        System.out.println("Enter the total number of subjects");
        int tot_sub=sc.nextInt();
        if(tot_sub<=0)
        {
            System.out.println("Enter a valid number of subjects");
        }
        for(int i=1; i<= tot_sub; i++)
        {
            System.out.println("Enter the marks for subject "+i+" (out of 100) : ");
            marks=sc.nextInt();
            if(marks<0||marks>max_marks)
            {
                System.out.println("Enter the valid marks between 0 to 100");
                i--;
            }
            total_marks= total_marks+ marks;
        }
        float average_percentage=(float)total_marks/(tot_sub*max_marks)*100;
        System.out.println("The total marks out of "+tot_sub*max_marks+" is:"+total_marks);
        System.out.println("The average percentage: "+ average_percentage+"%");

        String grade;

        if(average_percentage>=90)
        {
            grade="A+";
        }

        else if(average_percentage>=80)
        {
            grade="A";
        }

        else if(average_percentage>=70)
        {
            grade="B";
        }

        else if(average_percentage>=60)
        {
            grade="C";
        }

        else if(average_percentage>=50)
        {
            grade="D";
        }

        else
        {
            grade="F";
        }

        System.out.println("Grade: "+ grade);

    }
}