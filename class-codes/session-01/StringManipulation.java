public class StringManipulation {
    public static void main(String[] args) {
        // Both string literals refer to the same object in the string pool
        // because Java reuses identical string literals to save memory
        String first = "GOT";
        String second = "GOT";
        // true: both references point to the same object in the string pool
        System.out.println(first == second);

        // Using the 'new' keyword forces creation of new String objects on the heap
        String firstNew = new String("GOT");
        String secondNew = new String("GOT");
        // false: comparing references
        System.out.println(firstNew == secondNew);
        // true: comparing values
        System.out.println(firstNew.equals(secondNew));
        // true: intern() returns the canonical representation from the string pool
        // After interning, both returned references point to the same string pool
        // object
        System.out.println(firstNew.intern() == secondNew.intern());
    }
}