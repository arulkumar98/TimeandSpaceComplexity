public class FiboFormula {
    public static void main(String[] args) {
        int n = 50;
        long ans = fibo(n);
        System.out.println(ans);
    }
    public static long fibo(int n){
     return (long)  (Math.pow(((1+Math.sqrt(5)) /2),n)/  Math.sqrt(5));
    }
}
