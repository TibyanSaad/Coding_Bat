public class posNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if ( ((a>0 && b<0) || (a<0 && b>0)) ||((a<0 && b<0) && negative)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        posNeg pn = new posNeg();
        System.out.println(pn.posNeg(-12,-42, true));
    }
}
