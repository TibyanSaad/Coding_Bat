public class parrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if(talking && (hour<7 || hour>20)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        parrotTrouble trouble = new parrotTrouble();
        System.out.println(trouble.parrotTrouble(true, 21));
    }
}
