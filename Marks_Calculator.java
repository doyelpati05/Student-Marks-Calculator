import java.util.Scanner;

// Student Grade Calculation Program
// This program calculates the total and average marks of a student based on their subject scores
// and assigns a grade based on the average marks.
public class Marks_Calculator{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of your subjects:");
        int n = sc.nextInt();
        int[] subs=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter your number of Subject "+(i+1)+"(out of 100): ");
            subs[i]= sc.nextInt();
            System.out.println("You have entered: " + subs[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=subs[i];
        }
    double average = (double) sum / n;
    System.out.println("Your total marks are: " + sum);
    System.out.println("Your average marks are: " + average);
    if(average>=90)
    {
        System.out.println("You have performed excellently!YOUR GRADE IS O(Outstanding)");
    }
    else if ((average<90)&&(average>=80))
    {
        System.out.println("You have performed well!YOUR GRADE IS E(Excellent)");
    }
    else if ((average<80)&&(average>=70))
    {
        System.out.println("You have performed good!YOUR GRADE IS A(Average)");
    }
    else if ((average<70)&&(average>=60))
    {
        System.out.println("You have performed fair!YOUR GRADE IS B(Below Average)");
    }
    else if ((average<60)&&(average>=50))
    {
        System.out.println("You have performed poor!YOUR GRADE IS C(Poor)");
    }
    else if ((average<50)&&(average>=40))
    {
        System.out.println("You have performed very poor!YOUR GRADE IS D(Very Poor)");
    }
    else
    {
        System.out.println("You have failed!YOUR GRADE IS F(Fail)");
    }
        System.out.println("Thank you for using the Student Grade Calculation program!");
    sc.close();
    }
}

