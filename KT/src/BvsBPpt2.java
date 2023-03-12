
public class BvsBPpt2 {
    static Integer i;
    public static void main(String[] args) {
        
        Integer first = new Integer(42);
        Integer second =  new Integer(42);
        System.out.println(first < second ? -1 : (first == second ? 0 : 1));
        int f = first;   // Auto-unboxing
        int s = second;  // Auto-unboxing
        System.out.println(f < s ? -1 : (f == s ? 0 : 1)); // No unboxing
        if (i == 42) System.out.println("Unbelievable");
    } 
}
