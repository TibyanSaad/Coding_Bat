public class or35 {
    public boolean or35(int n) {
        if(n%3==0 || n%5==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        or35 or = new or35();
        System.out.println(or.or35(15));
    }
}
