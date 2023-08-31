//pattern37:
//
//
//        A A A A A
//        A A A B B
//        A A C C C
//        A D D D D
//        E E E E E
public class Pattern37 {
    public static void main(String[] args) {
        int alpha = 65;
        int n = 5;
        for (int i = 1;i<=n;i++){
            for (int j = n;j>i;j--){
                System.out.print((char) (alpha)+ " ");
            }
            for (int k = 1;k<= i;k++){
                System.out.print((char) (alpha + i -1)+ " ");
            }
            System.out.println();
        }
    }
}
