public class monkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if( aSmile && bSmile || !aSmile && !bSmile ){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        monkeyTrouble trouble = new monkeyTrouble();
        System.out.println(trouble.monkeyTrouble(false, false));
    }
}
