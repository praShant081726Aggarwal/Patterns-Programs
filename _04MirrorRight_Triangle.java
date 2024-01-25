public class _04MirrorRight_Triangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){ // loop for number of rows
            for(int j=1; j<=n-i; j++){  // lopp for printing spaces in collumn
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){ // loop for printing *
                System.out.print("*");
            }
            System.out.println();  // next line
        }
    }
}
