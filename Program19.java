//pattern19:
//
//        E D C B A
//        E D C B
//        E D C
//        E D
//        E
class Program19 {
    public static void main(String[] args) {
        int alpha = 65;
        for (int i = 1;i<=5;i++){
            for (int j = 5;j>=i;j--){
                System.out.print((char) (alpha+j-1) + " ");
            }
            System.out.println();
        }
    }
}
