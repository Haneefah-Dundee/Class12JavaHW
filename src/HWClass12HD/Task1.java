package HWClass12HD;

public class Task1 {
    public static void main(String[] args) {
        /*Create a String and if the String is not empty perform the following:
       if the String has an odd number of characters and has 3 or more characters, print the character
        in the middle of the String. For Example String str=hello =>l*/

        String str = "Focus";

        if (!str.isEmpty()) {
            int size = str.length();
            if (size % 2 != 0 && size >= 3) {
                int middleIndex = size / 2;
                char middleChar = str.charAt(middleIndex);
                System.out.println(middleChar);
            }
        }

    }
}
