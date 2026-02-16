public class backAround {
    public String backAround(String str) {
        if (str.length()>=1){
            return str.charAt(str.length()-1)+str+str.charAt(str.length()-1);
        }
        return str;
    }
    public static void main(String[] args){
        backAround b = new backAround();
        System.out.println(b.backAround("never"));
    }
}
