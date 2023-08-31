//pattern34:
//
//        A
//      A B A
//    A B C B A
//  A B C D C B A
public class Pattern34 {
    public static void main(String[] args) {
        int alpha = 65;
        int n = 4;
        for (int i = 1;i<=n;i++){
            for (int j = n;j>i;j--){
                System.out.print(" ");
            }
            for (int k = 1;k<=i;k++){
                System.out.print((char) (alpha+k-1)+ " ");
            }
            for (int l = i-1;l>=1;l--){
                System.out.print((char) (alpha+l-1)+ " ");
            }
            System.out.println();
        }
    }
}
