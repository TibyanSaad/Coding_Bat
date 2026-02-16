public class close10 {
    public int close10(int a, int b) {
        int diffa = Math.abs(10-a);
        int diffb = Math.abs(10-b);

        if (diffa < diffb){
            return a;
        }
        if (diffa == diffb){
            return 0;
        }
        return b;

    }
    public static void main(String[] args){
        close10 c10 = new close10();
        System.out.println(c10.close10(5,6));
    }
}
