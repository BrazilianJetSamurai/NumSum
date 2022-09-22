import java.util.*;
public class NumSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((a/100) + (a%10) + ((a%100)/10));
    }

}