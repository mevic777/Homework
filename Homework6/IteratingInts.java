public class IteratingInts {
    public static void main(String[] args) {
        int num = 5;
        
        for (int i = 0; i < num; i++) {
            System.out.println(i + 1);
            for(int j = 5; j < num; j++) {
                System.out.print(j + 1);
            }
            // System.out.println();
        }
    }
}
