//pattern20:
//
//        E
//        E D
//        E D C
//        E D C B
//        E D C B A
class Program20 {
    public static void main(String[] args) {
        int alpha = 65;
        for (int i= 5;i>=1;i--){
            for (int j = 5;j>=i;j--){
                System.out.print((char)(alpha+j-1) + " ");
            }
            System.out.println();
        }
    }
}
