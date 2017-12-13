package tranning.sort;

public class Fibonacci {

    public int fionacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fionacci(n - 1) + fionacci(n - 2);
        }
    }

    static long f4(int k,int fibonah1,int fibonah2){
        long res=0;
        if(k>2) {
            res=f4(k-1,fibonah2,fibonah2+fibonah1);
        }
        else return fibonah2;
        return res;
    }

    public long fib(int n) {
        return f4(n, 1, 1);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(3));
    }
}
