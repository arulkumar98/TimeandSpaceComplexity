public class Main {
    public static void main(String[] args) {
        int n = 20;
        int k = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <k ; j++) {
                System.out.println(j);
            }
            i = i+k; // 1+5= 6 SO  i!<n so the loop will break
            System.out.println("value of I = "+ i);
        }
    }
}