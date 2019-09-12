import java.util.Scanner;
class Fact
{
   int num;
   static int fact;
   Fact()
   { 
       System.out.println("Enter Number to find Factorial:--->\n");
	   Scanner sc = new Scanner(System.in);
	   num=sc.nextInt();
	   fact = 1;
	   System.out.print("The Factorial of  "+ num +"  is :--->  ");
   }
   void factorial()
   {
	   fact=fact*num;
	   num--;
	   if(num>0)
	   {
		   factorial();
	   }
   }
   public static void main(String[] ram)
   {
	   Fact f1 = new Fact();
	   f1.factorial();
	   System.out.println(fact);
   }
}