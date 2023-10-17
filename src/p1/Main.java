package p1;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        sum(a, b);
        sum(30, 15);// ьожно посто  в виде чисел или параметрами (int)
        welcome("Alex", 22);
        welcome("Ivan", 33);//таким способом можем вызывать в различных местах программы
        sumInt("Test");
        int x = sumThree(2, 3, 4);
        int y = sumThree(a, b, x);
        System.out.println(y);// return

        System.out.println(dayTime(12));
        dTime(10);
    }

    static void sum(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }

    static void welcome(String name, int age) {
        System.out.println("Welcome, " + name + ". Your are " + age);//
    }


    static void sumInt(String message, int... nums) {//параметры всегда последние
        System.out.println(message);
        int res = 0;
        for (int x : nums) {
            res += x;
        }
        System.out.println(res);
//return - возвращение из метода и можно использовать из выхода
    }

    static int sumThree(int a, int b, int c) {
        return a + b + c;
    }

    static String dayTime(int hour) {
        if ((hour > 7) && (hour < 12))
            return ("Morning");
        else if (hour > 12)
            return "Day";
        else
            return "Evening";

    }
    static void dTime(int hour){
        if((hour>7)&&(hour<12))
        return;
        else if (hour>12)
            System.out.println("Day");
        else
            System.out.println("Evening");
    }
}



