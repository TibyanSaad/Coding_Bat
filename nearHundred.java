public class nearHundred {
    public boolean nearHundred(int n) {
        int diff100 = 100-n;
        int diff200 = 200-n;
        if ((Math.abs(diff100)<=10)||(Math.abs(diff200)<=10)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        nearHundred Hundred = new nearHundred();
        System.out.println(Hundred.nearHundred(100));
    }
}
