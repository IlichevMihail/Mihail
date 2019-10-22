
import java.util.Scanner;

public class  Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        double y = scan.nextDouble();
        if ((x<2)&&(y<x)&&((x*x+y*y)>4)&&(y>0))
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}

