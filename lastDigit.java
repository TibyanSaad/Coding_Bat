public class lastDigit {
    public boolean lastDigit(int a, int b) {
        if ( a%10 == b%10){
            return true;
        }return false;
    }
    public static void main(String[] args){
        lastDigit digit = new lastDigit();
        System.out.println(digit.lastDigit(15,75));
    }
}
