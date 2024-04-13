// package Pattern;

// public class Patterns {
//     static void pattern1(int n){
//         int i=0, j=0;
//         for(i =0; i<n; i++){
//             for(j=0; j<n;j++){
//                 System.out.println("*");
//             }
//         }
//     }
//     public static void main(String[] args) {
//        int n = 4;
//     pattern1(n);
//     }
// }

public class Solution {

    /**
     * @param n
     */
    public static void nForest(int n) {

        // Write your code here

        int s = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= s; j++) {

                System.out.print("* ");

            }

            System.out.println();

            s++;

        }

    }

    public static void problem3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void problem4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void problem5(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void problem6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void problem7(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void problem8(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void problem10(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int starts = i;
            if (i > n)
                starts = 2 * n - i;
            for (int j = 1; j <= starts; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void problem11(int n) {
        int starts = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                starts = 1;
            } else
                starts = 0;
                for(int j =0; j<i;j++){
                 System.out.print("*");   
                }
                System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        nForest(n);
        problem3(n);
        problem4(n);
        problem5(n);
        problem6(n);
        problem7(n);
        problem8(n);
        problem10(n);
        problem11(n);
    }

}