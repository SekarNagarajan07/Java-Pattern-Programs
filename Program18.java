//pattern18:
//
//        A B C D E
//        A B C D
//        A B C
//        A B
//        A
class Program18 {
    public static void main(String[] args) {
        int alpha = 65;
        for (int i = 5;i>=1;i--){
            for (int j = 1;j<=i;j++){
                System.out.print((char) (alpha+j-1) + " ");
            }
            System.out.println();
        }
    }
}
