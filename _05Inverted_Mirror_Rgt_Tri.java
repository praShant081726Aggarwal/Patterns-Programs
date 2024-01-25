public class _05Inverted_Mirror_Rgt_Tri {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int a =1; a<i; a++){
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
