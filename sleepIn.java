public class sleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        sleepIn sleep = new sleepIn();
        System.out.println(sleep.sleepIn(false, false));
    }
}
