import java.util.Scanner;
public class lesson7_1 {

    public static void main(String[] args) {

        String aa = col("a","b","c","d","e");
        System.out.println(aa);
    }

    static String col (String ...i){
if (i.length==0) {
   return("");
}
var aa= "";
for (String e:i) {
    aa=aa+" " + e;
}
return aa;

    }}
