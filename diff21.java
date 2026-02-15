public class diff21 {
    public int diff21(int n) {
        if (n<=21){
            return 21-n;
        }
        return 2*(n-21);
    }
    public static void main(String[] args){
        diff21 Diff = new diff21();
        System.out.println(Diff.diff21(21));
    }
}
