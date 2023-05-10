/* A
   BC
   DEF
   GHIJ */

/* Answer */

package PBL.basic.patterns;
import java.util.*;

public class pattern_alphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a = 'A';
        System.out.println("Enter the no. of rows");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a +" ");
                a++;
            }
            System.out.println();
        }
    }
}
