package p2;

public class Main {

    public static void main(String[] args){
        System.out.println(sun(1,2));
        System.out.println(sun(1.5,2.2));
        System.out.println(sun(1,2,3));
        System.out.println(fact(5));

        System.out.println(fib(5));
    }

    static int sun(int x, int y){
        return x+y;
    }
    static double sun(double x, double y){
        return x+y;
    }
    static int sun(int x,int y, int z){
        return x+y+z;
    }
   // static double sun(int x, int y)
     //   return (double)x+y; нельзя, уже есть,важен параметор и их типы

    static int fact(int x){
        if (x==1){
            return  1;
        }
        System.out.println(x);
        return  x * fact (x-1);
    }
    static int fib(int n){
        if(n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }else {
            return fib (n-1)+fib(n-2);
        }


    }


}
