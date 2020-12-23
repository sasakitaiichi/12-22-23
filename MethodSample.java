public class MethodSample {
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }


    public static void main(String[] args) {
        int i = 5;
        int j = 6;
        int x = max(i, j);
        System.out.println("The result is" + x);
    }
}