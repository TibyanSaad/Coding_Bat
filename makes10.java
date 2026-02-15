public class makes10 {
    public boolean makes10(int a, int b) {
        int sum= a+b;
        if(a==10 || b==10 || sum==10 ){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        makes10 m10 = new makes10();
        System.out.println(m10.makes10(10, 21));
    }
}
