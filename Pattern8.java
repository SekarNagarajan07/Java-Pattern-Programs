//pattern8:
//
//        5
//       4 5
//      3 4 5
//     2 3 4 5
//    1 2 3 4 5
public class Pattern8 {
    public static void main(String[] args) {
        for (int i = 5;i>=1;i--){
            for (int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k = i;k<=5;k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
