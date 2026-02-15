public class notString {
    public String notString(String str) {
        if (str.startsWith("not")){
            return str;
        }
        return "not " + str;
    }
    public static void main(String[] args){
        notString newstr = new notString();
        System.out.println(newstr.notString("not"));
    }
}
