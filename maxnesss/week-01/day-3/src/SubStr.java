public class SubStr {
    public static void main(String[] args) {
        // Create a function that takes two strings as a parameter
        // Returns the starting index where
        // the second one is starting in the first one
        // Returns `-1` if the second string is not in the first one

        // Example:

        // should print: `17`
        System.out.println(subStr("this is what I'm searching insdfg", "searching"));

        // should print: `-1`
//        System.out.println(subStr("this is what I'm searching in", "not"));
    }

    public static int subStr(String input, String q) {
        boolean isFound = true;
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (q.charAt(0) == input.charAt(i)) {
                System.out.println(i);

                for (int y = 0; y < q.length(); y++) {
                    if (q.charAt(y) == input.charAt(i + y)) {
                        System.out.println("i: " + i);
                        result = i;
                    } else {
                        System.out.println("tetteette");
                        break;
                    }
                }
            }
        }

        if (result == 0) {
            return -1;
        } else {
            return result;
        }

    }
}
