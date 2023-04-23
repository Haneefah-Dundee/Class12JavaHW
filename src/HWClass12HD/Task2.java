package HWClass12HD;

public class Task2 {
    public static void main(String[] args) {
        //Create a String and print it in reverse order (Sunday → yadnuS).

        String str = "Alligator";


        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {
            char change = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = change;
        }


        String reversedStr = new String(charArray);

        System.out.println(reversedStr);

    }
}
