public class Pattern {
    public static void main(String[] args) {

        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(4);
        pattern6(4);
        pattern7(4);
        pattern8(4);
        pattern9(4);
    }

    //1
    static  void pattern1(int n){

        for(int row=1 ;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("@ ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //2
    static  void pattern2(int n){

        for(int row=1 ;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //3
    static  void pattern3(int n){

        for(int row=1 ;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("% ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //4
    static  void pattern4(int n){

        for(int row=1 ;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //5
    static  void pattern5(int n) {

        for (int row = 1; row <= 2 * n - 1; row++) {

            if (row <= n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("$ ");
                                                     }
                System.out.println();
                          }
            if(row>n){
                for (int col = 1; col <= 2 * n - row; col++) {
                    System.out.print("$ ");
                }
                System.out.println();
            }

        }
    }

    //6
    static void pattern6(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    //7
    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    //8
    static void pattern8(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row: row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

   //9
   static void pattern9(int n) {
       int originalN = n;
       n = 2 * n;
       for (int row = 0; row <= n; row++) {
           for (int col = 0; col <= n; col++) {
               int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
               System.out.print(atEveryIndex + " ");
           }
           System.out.println();
       }
   }



}
