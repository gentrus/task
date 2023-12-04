public class lesson8_1_1 {
    public static void main(String[] args) {
        lesson8_1 even=new lesson8_1("Четные");
        lesson8_1 odd=new lesson8_1("Нечетные");


        for (int i=1;i<=100;i++) {
            if (i%2==0) {
            even.plus1();
            }
            else {
            odd.plus1();
            }
        }
        print(even);
        print(odd);

    }
    static void print (lesson8_1 score){
   System.out.printf("%s: %d \n", score.name,score.score);
    }
}
