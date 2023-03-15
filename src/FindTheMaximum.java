public class FindTheMaximum {
    // Method used to compare three Float value and get maximum value
    public static Float maxOfFloat(Float f1, Float f2, Float f3) {
        Float max = f1;
        if (f2.compareTo(max) > 0)
            max = f2;
        if (f3.compareTo(max) > 0)
            max = f3;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the find maximum value of three Integer using without Generics\n");
        System.out.println("The maximum value between the three integer is : " + maxOfFloat (2.5f, 25.7f, 50.9f));
    }

}