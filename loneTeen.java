public class loneTeen {
    public boolean loneTeen(int a, int b) {
        if ((a>=13 && a<=19) && (b>=13 && b<=19)){
            return false;
        }
        if ((a>=13 && a<=19) || (b>=13 && b<=19)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        loneTeen teen = new loneTeen();
        System.out.println(teen.loneTeen(15,72));
    }
}
