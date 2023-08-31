//pattern23:
//
//        A
//       A A
//      A B A
//     A C C A
//    A D F D A
public class Pattern23 {
    public static void main(String[] args) {
        int alpha  = 65;
        int n = 5;
        for (int i = 1;i<=n;i++){
            for (int j = n;j>i;j--){
                System.out.print(" ");
            }
            int temp = 1;
            for (int k = 1;k<=i;k++){
                System.out.print((char) (alpha-1+temp)+ " ");
                temp = temp * (i-k)/k;
            }
            System.out.println("");
        }
    }
}
