public class mixStart {
    public boolean mixStart(String str) {
        if (str.length()>2 && str.substring(1,3).equals("ix")){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        mixStart mix = new mixStart();
        System.out.println(mix.mixStart("pix"));
    }
}
