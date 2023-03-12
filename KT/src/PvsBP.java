
public class PvsBP {
    public static void main(String[] args) {
        long startBP = System.nanoTime();
        boxedPrimitive();
        System.out.println("Thoi gian: " + (System.nanoTime() - startBP) / 1000000000.0 + "s");
        long startP = System.nanoTime();
        primitive();   
        System.out.println("Thoi gian: " + (System.nanoTime() - startP) / 1000000000.0 + "s");
    }

    static void boxedPrimitive(){
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    static void primitive(){
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}