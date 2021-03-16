public class Exercise01 {

    public static void main(String[] args) {


        int i = 1, j = 2, k = 3, m = 2;

        System.out.println(i == 1); // This statement displays true
        System.out.println(j == 3); // false cuz J is 2
        System.out.println((i >= 1) && (j < 4)); //true cuz both are true
        System.out.println((j >= i) || (k == m)); //true cuz the first one is true
        System.out.println((k + m < j) || (3 - j >= k)); // false cuz both are false
        System.out.println((k > j) && (j >= i) && (m > 0)); // true cuz all the statements are true
        System.out.println((k < j) || (j == i) || (m > 1)); // true cuz the last one is true
        System.out.println(!(k > m)); // false cuz its a NOT statement

    }
}
