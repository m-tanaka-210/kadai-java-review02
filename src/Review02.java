
public class Review02 {

    public static void main(String[] args) {
        // iの値を１から100までの連続した整数、1ずつカウントアップして繰り返す
        for (int i = 1; i <= 100; i++) {
            // iの値が3で割り切れ、なおかつ5で割り切れるとき
            if (i % 3 == 0 && i % 5 ==0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                //　iの値が3で割り切れるときFizzと表示する
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                // iの値が5で割り切れるときBuzzと表示する
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
