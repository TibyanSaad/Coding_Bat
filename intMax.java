public class intMax {
    public int intMax(int a, int b, int c) {
        if (a>b && a>c){
            return a;
        }
        if (a<b && b>c){
            return b;
        }return c;
    }
    public static void main(String[] args){
        intMax imax = new intMax();
        System.out.println(imax.intMax(5,6,7));
    }
}
