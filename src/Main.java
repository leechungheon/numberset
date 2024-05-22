import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a,b;
        a=scan.next();
        b=scan.next();
        Solution sol=new Solution();
        System.out.println(sol.solution(a,b));
    }

}