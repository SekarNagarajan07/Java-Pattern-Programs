//pattern39:
//
//        A
//       A B
//      A B C
//     A B C D
//    A B C D E
//     A B C D
//      A B C
//       A B
//        A
public class Pattern39 {
    public static void main(String[] args) {
        int alpha = 65;
        int n = 5;
        for (int i = 1;i<=n;i++){
            for (int j = n;j>i;j--){
                System.out.print(" ");
            }
            for (int k = 1;k<=i;k++){
                System.out.print((char) (alpha+k-1)+ " ");
            }
            System.out.println();
        }
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k = 1;k<=n-i;k++){
                System.out.print((char) (alpha+k-1)+ " ");
            }
            System.out.println();
        }
    }
}
