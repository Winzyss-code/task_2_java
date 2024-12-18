public class Main {
    public static void main(String[] args) {
        int num = 55;
        int result = addDigits(num);
        System.out.println(result); // Output: 2
    }

    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}