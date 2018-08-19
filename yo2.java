import java.util.Scanner;
class yo2
{
 public static void main(String[] args)
 { 

   int a,b,temp;
   System.out.println("Enter a and b");
   Scanner in = new Scanner(System.in);
   a=in.nextInt();
   b=in.nextInt();

  temp=a;
   a=b;
  b=temp;
  System.out.println("After Swapping\n" +a+"\n" +b); 

 }
}
