public class Euclidean {

    

    // non-recursive implementation
    public static int gcd(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
    
    // main method
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
     
        int d = gcd(p, q); //while loop
        
        System.out.println("gcd(" + p + ", " + q + ") = " + d);
    }
}
