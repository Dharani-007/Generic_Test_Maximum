public class FindTheMaximum<T extends Comparable <T>> {
    T a1, a2, a3, a4;

    public FindTheMaximum(T a1, T a2, T a3, T a4) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }
    public T maximux(){
        return FindTheMaximum.maxOfValues(a1, a2, a3, a4);
    }
    public static <T extends Comparable <T>> T maxOfValues(T a1, T a2, T a3, T a4) {
        T max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        if (a4.compareTo(max) > 0)
            max = a4;
        return max;
    }

    // Generic method to print the max value
    public static <T> void printMax(T a) {
        System.out.println("Maximum value is : "+ a);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the find maximum value of three Integer using Class\n");

        FindTheMaximum<Integer> maxInteger = new FindTheMaximum<Integer>(2, 25, 50, 60);
        System.out.println("The maximum value between the three Integer is : "+ maxInteger.maximux());
        FindTheMaximum<Float> maxFloat = new FindTheMaximum<Float>(2.7f, 25.5f, 50.9f, 44.9f);
        System.out.println("The maximum value between the three Float is : "+ maxFloat.maximux());
        FindTheMaximum<String> maxString = new FindTheMaximum<String>("abc", "pug", "zca", "zza");
        System.out.println("The maximum value between the three String is : "+ maxString.maximux());
    }
}