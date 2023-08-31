//pattern30:
//
//        A B C D E
//        A B C D
//        A B C
//        A B
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
public class Pattern30 {
    public static void main(String[] args) {
        int alpha = 65;
        int n = 5;
        for (int i = n;i>=1;i--){
            for (int j = 1;j<=i;j++){
                System.out.print((char) (alpha + j -1) + " ");
            }
            System.out.println("");
        }
        for (int i = 2;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print((char) (alpha + j-1) + " ");
            }
            System.out.println("");
        }
    }
}
