//pattern5:
//
//        A
//        B B
//        C C C
//        D D D D
//        E E E E E
public class Pattern5 {
    public static void main(String[] args) {
        int alpha = 65;
        int n = 5;

        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print((char) (alpha + i-1)+ " ");
            }
            System.out.println();
        }
    }
}
