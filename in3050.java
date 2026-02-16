public class in3050 {
    public boolean in3050(int a, int b) {
        if (((a>=30 && a <=40) && (b>=30 && b <=40)) ||
                ((a>=40 && a <=50) && (b>=40 && b <=50))){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        in3050 i3050 = new in3050();
        System.out.println(i3050.in3050(50,36));
    }
}
