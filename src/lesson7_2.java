public class lesson7_2 {



    public static void main(String[] args) {
        sum(5,1,6);
        sum(5,1.5,6);
        sum("a","b","c","d");
    }
    static void sum (int ...a) {
        int b = 0;
        for (int i: a) {
            b += i;
        }
        System.out.println(b);
    }
    static void sum (double ...a) {
        double b = 0;
        for (double i: a) {
            b += i;
        }
        System.out.println(b);
    }
    static void sum (String ...a) {
        var b="";
        for (String i:a) {
            b+=i;
        }
        System.out.println(b);
    }

}
