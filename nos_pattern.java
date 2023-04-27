package PBL.basic.patterns;
import java.util.*;

public class nos_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. to print number pattern");
        int n = sc.nextInt();
        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
       }
}
