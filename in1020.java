public class in1020 {
    public boolean in1020(int a, int b) {
        if ((a>=10 && a<=20) || (b>=10 && b<=20) ){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        in1020 in = new in1020();
        System.out.println(in.in1020(15,72));
    }
}
