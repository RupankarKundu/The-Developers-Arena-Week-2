import java.util.Scanner;
public class grade_system
{
    float p;
    void calc_grade(int arr1[],int n)
    {
        int s=0,j,t=n*100;
        for(j=0;j<n;j++)
        {
            s=s+arr1[j];
        }
        float d=(float)s/t;
        p=d*100;
        System.out.println("You've secured "+p+" perecentage.");
    }
    void display()
    {
        if(p>=90)
        {
            System.out.println("Congratulations,Grade O!!.");
        }
        if(p<90 && p>=80)
        {
            System.out.println("Congratulations,Grade A!!.");
        }
        if(p<80 && p>=65)
        {
            System.out.println("Congratulations,Grade B!!.");
        }
        if(p<65 && p>=40)
        {
            System.out.println("Try harder next time,Grade C.");
        }
        if(p<40)
        {
            System.out.println("Better luck next time,Grade F.");
        }
    }
    public static void main(String Args[])
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects : ");
        n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        int arr1[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the marks of "+arr[i]+" out of '100' : ");
            if(arr1[i]<100)
            {
                arr1[i]=sc.nextInt();
            }
        }
        grade_system g=new grade_system();
        g.calc_grade(arr1,n);
        g.display();
    }
}
