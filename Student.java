import java.util.*;
import java.lang.String.*;
class Student
{
  String Name;
  int Registration_Number;
  float CGPA;
  String Course;
  Student(String o,int z,float w,String q)
{
  this.Name=o;
  this.Registration_Number=z;
  this.CGPA=w;
  this.Course=q;
}
public void display(float mincgpa,String courserequired)
 {
   if(courserequired.equals(Course))
    {
         if(CGPA>=mincgpa)
         {
         System.out.println("*******************************THE CANDIDATE ELIGIBLE FOR PLACEMENT*****************************************");
         System.out.println("**==**==**==**==**YOU CAN PROCEED FOR THE PLACEMENTS**==**==**==** ");
         System.out.println(" ");
         }
    
    else
     {
             System.out.println("SOORY YOU ARE NOT ELIGIBLE TRY TO IMPROVE YOUR GRADES");}
     }
     else 
    {
             System.out.println("SOORY YOU ARE NOT ELIGIBLE THE COURSE REQUIREMENT NOT MACHED");
    }
 }
public static void main(String args[])
{
  System.out.println("****&&&&****&&&&****&&&&****####****PLACEMENT OFFICE****&&&&****&&&&****&&&&****####****");
  System.out.println(" ");
  Scanner scan=new Scanner(System.in);
  System.out.println("PLEASE ENTER THE TOTAL NUMBER STUDENT WHO CAN SIT IN PLACEMENT:");
  int n=scan.nextInt();
  System.out.println(" ENTER THE COURSE REQUIRED:");
  String f=scan.next();
  System.out.println("ENTER THE MIN CGPA REQUIRED:");
  float h=scan.nextFloat();
  int i;
  System.out.println(" ");
  for(i=1;i<=n;i++)
  {
     System.out.println("ENTER THE NAME OF THE STUDENT:");
     String name=scan.next();
     System.out.println("ENTER THE COURSE OF THE STUDENT:");
     String d = scan.next();
     System.out.println("ENTER THE REGISTRATION NO:");
     int a=scan.nextInt();
     System.out.println("ENTER THE CGPA:");
     float b=scan.nextFloat();
     System.out.println(" ");
     Student obj=new Student(name,a,b,d);
     List<Student> studentlist=new ArrayList<>();
     studentlist.add(obj);
     obj.display(h,f);
     System.out.println(" ");
  }
  System.out.println(" ");
}
}