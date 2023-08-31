//pattern36:
//
//        1 1 1 1 1
//        1 1 1 2 2
//        1 1 3 3 3
//        1 4 4 4 4
//        5 5 5 5 5
public class Pattern36 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1;i<=n;i++){
            for (int j = n;j>i;j--){
                System.out.print(1 + " ");
            }
            for (int k = 1;k<= i;k++){
                System.out.print(k+ " ");
            }
            System.out.println();
        }
    }
}
