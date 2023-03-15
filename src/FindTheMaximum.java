public class StringMaxValue {
    public static String maxOfString(String s1, String s2, String s3) {
        // Method used to compare three String value and get maximum value
        String max = s1;
        if (s2.compareTo(max) > 0)
            max = s2;
        if (s3.compareTo(max) > 0)
            max = s3;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the find maximum value of three Integer using without Generics\n");
        System.out.println("The maximum value between the three integer is : " + maxOfString ("abc", "pqr", "xyz"));
    }

}