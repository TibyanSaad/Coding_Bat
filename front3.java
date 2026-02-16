public class front3 {
    public String front3(String str) {
        if (str.length()<3){
            return str+str+str;
        }
        str= str.substring(0,3);
        return str+str+str;
    }
    public static void main(String[] args){
        front3 f = new front3();
        System.out.println(f.front3("never"));
    }

}
