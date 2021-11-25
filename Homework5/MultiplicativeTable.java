public class MultiplicativeTable {
    public static void main(String[] args) {
        int n = 0;
        int x = 0;

        for (n = 0; n < 10; n++) {
            for (x = 0; x < 10; x++) {
                n *= x;
            }
        }
    }
}