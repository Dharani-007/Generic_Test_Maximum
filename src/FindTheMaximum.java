public class FindTheMaximum {
    // Method used to compare three Integer value and get maximum value
    public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3) {
        Integer max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the find maximum value of three Integer using without Generics\n");
        System.out.println("The maximum value between the three integer is : " + maxOfInteger (2, 25, 50));
    }

}