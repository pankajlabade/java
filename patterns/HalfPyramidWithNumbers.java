public class HalfPyramidWithNumbers {
    public static void main (String args[]) {
        int n=5;
        for(int i=1; i<=n; i++) { // outer loop for rows
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");    
        }
    }
}    