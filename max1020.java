public class max1020 {
    public int max1020(int a, int b) {
        if ( (a<10 && a>20) && (b<10 && b>20) ){
            return 0;
        }
        if (a<b && (b>=10 && b<=20)){
            return b;
        }
        return a;
    }
    public static void main(String[] args){
        max1020 m1020 = new max1020();
        System.out.println(m1020.max1020(50,36));
    }
}
