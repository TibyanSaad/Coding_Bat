public class front22 {
    public String front22(String str) {
        if (str.length()>2){
            return str.substring(0,2)+str+str.substring(0,2);
        }
        return str+str+str;
    }
    public static void main(String[] args){
        front22 front = new front22();
        System.out.println(front.front22("kitten"));
    }
}
