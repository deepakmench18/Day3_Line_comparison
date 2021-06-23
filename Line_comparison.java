
import java.util.*;
public class Line_Comparison {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter x1");
	   int x1 = sc.nextInt();
	   System.out.println("Enter x2");
	   int x2= sc.nextInt();
	   System.out.println("Enter x3");
	   int y1 = sc.nextInt();
	   System.out.println("Enter x4");
	   int y2 = sc.nextInt();
	   System.out.println("Enter P1");
	   int p1 = sc.nextInt();
	   System.out.println("Enter p2");
	   int p2 = sc.nextInt();
	   System.out.println("Enter p3");
	   int q1 = sc.nextInt();
	   System.out.println("Enter p4");
	   int q2 = sc.nextInt();
	   int a = (x2-x1)*(x2-x1);
	   int b = (y2-y1)*(y2-y1);
	   int c = (p2-p1)*(p2-p1);
	   int d = (q2-q1)*(q2-q1);
       double length_line1 = Math.sqrt(a + b);
       double length_line2 = Math.sqrt(c + d);
       String x =Double.toString(length_line1);
       String y =Double. toString(length_line2);
       boolean result = x.equals(y);
       if (result == true)
       {
    	   System.out.println("Both LENGTH OF LINE IS EQUAL");
       }
       else
       {
    	   System.out.println("Both length of line is not equal");
       }
	}

}
