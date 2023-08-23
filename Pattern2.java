//pattern2:
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
public class Pattern2 {
    public static void main(String[] args) {
        int alpha = 65;
        int n = 5;
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print((char) (alpha + j-1) + " ");
            }
            System.out.println();
        }
    }
}
