import java.util.Scanner;
public class ArmstrongNo {
    public static void main(String[] args) {
        //print all 3 digit armstrong no.
        // 153 , 1^3 +5^3 + 3^3 = 1+125+27=153
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArm(n));

        for (int i=100;i<1000;i++){
            if (isArm(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isArm(int n){
        int original = n;
        int sum =0;

        while (n>0){
            int rem = n%10;
            n=n/10;
            sum=sum+(rem*rem*rem);

        }

        return sum == original;
    }

}
