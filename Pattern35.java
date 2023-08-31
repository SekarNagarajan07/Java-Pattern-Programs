//pattern35:
//
//        1 0 0 0 0
//        0 2 0 0 0
//        0 0 3 0 0
//        0 0 0 4 0
//        0 0 0 0 5
public class Pattern35 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<i;j++){
                System.out.print("0 ");
            }
            System.out.print(i + " ");
           for (int k = i;k<n;k++){
               System.out.print("0 ");
           }
            System.out.println();
        }

    }
}
