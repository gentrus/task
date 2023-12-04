
public class lesson8_1{

// поля класса
    public String name;
    public int score;


//+- заданное число
    public int plus (int a) {

        score+=a;
        return score;
    }

    public int minus (int b) {

        score+=b;
        return score;
    }

//+- 1
    public int plus1 () {

        return ++score;
    }

    public int minus1 () {

        return --score;
    }


//конструкторы
    public lesson8_1(String name, int score) {

        this.name = name;
        this.score = score;
    }

    public lesson8_1(String name) {

       this(name,0);
    }
    }



