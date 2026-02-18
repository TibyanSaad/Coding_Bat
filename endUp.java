public class endUp {
    public String endUp(String str) {
        if (str.length()>3){
            String cap = str.substring(str.length()-3);
            String front = str.substring(0,str.length()-3);
            return front +cap.toUpperCase();
        }return str.toUpperCase();
    }
    public static void main(String[] args){
        endUp up = new endUp();
        System.out.println(up.endUp("Tibyan"));
    }
}
