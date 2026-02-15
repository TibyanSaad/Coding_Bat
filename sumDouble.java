public class sumDouble {
    public int sumDouble(int a, int b) {
        int sum= a+b;
        if (a==b){
            sum=sum*2;
        }
        return sum;
    }
    public static void main(String[] args){
        sumDouble Double = new sumDouble();
        System.out.println(Double.sumDouble(21, 13));
    }
}
