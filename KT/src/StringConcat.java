
public class StringConcat {
    public static void main(String[] args) {
        
        long startBP = System.nanoTime();
        
        String result = "";
        for(int i=0; i<10; i++) result += "item ";
        System.out.println(result);
        System.out.println("Thoi gian: " + (System.nanoTime() - startBP) / 1000000.0 + "ms");
        
        long startP = System.nanoTime();
        StringBuilder b = new StringBuilder();
        for(int i=0; i<10; i++) b.append("item ");
        b.toString();
        System.out.println(b);
        System.out.println("Thoi gian: " + (System.nanoTime() - startP) / 1000000.0 + "ms");
    } 
}
