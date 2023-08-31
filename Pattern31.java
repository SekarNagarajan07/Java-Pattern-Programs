//pattern31:
//
//        E D C B A
//        D C B A
//        C B A
//        B A
//        A
//        B A
//        C B A
//        D C B A
//        E D C B A
public class Pattern31 {
    public static void main(String[] args) {
        int alpha = 65;
        int n = 5;
        for (int i = n;i>=1;i--){
            for (int j = i;j>=1;j--){
                System.out.print((char) (alpha + j -1) + " ");
            }
            System.out.println("");
        }
        for (int i = 2;i<=n;i++){
            for (int j = i;j>=1;j--){
                System.out.print((char) (alpha + j -1) + " ");
            }
            System.out.println("");
        }
    }
}
