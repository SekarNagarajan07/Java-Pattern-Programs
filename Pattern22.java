//pattern22:
//
//        1
//       1 1
//      1 2 1
//     1 3 3 1
//    1 4 6 4 1
public class Pattern22 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1;i<=n;i++){
            for (int j = n;j>i;j--){
                System.out.print(" ");
            }
            int temp =1;
            for (int k = 1;k<=i;k++){
                System.out.print(temp + " ");
                temp = temp * (i - k) / k;
            }
            System.out.println("");
        }
    }
}
