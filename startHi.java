public class startHi {
    public boolean startHi(String str) {
        if (str.startsWith("hi")){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        startHi hi = new startHi();
        System.out.println(hi.startHi("kitten"));
    }
}
