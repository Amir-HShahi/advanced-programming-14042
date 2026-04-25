public class Compare {
    void main() {
        int firstPrimitive = 1;
        int secondPrimitive = 1;
        System.out.println(firstPrimitive == secondPrimitive);

        Integer firstNew = new Integer(1);
        Integer secondNew = new Integer(1);
        // false: references are being compared
        System.out.println(firstNew == secondNew);
        // true: values being compared
        System.out.println(firstNew.equals(secondNew));

        Integer firstWrapper = Integer.valueOf(1);
        Integer secondWrapper = Integer.valueOf(1);
        // true: cached in integer pool, result: same references
        System.out.println(firstWrapper == secondWrapper);

        firstWrapper = Integer.valueOf(1000);
        secondWrapper = Integer.valueOf(1000);
        // false: not between -128 and 127, so it has not cached in integer pool
        System.out.println(firstWrapper == secondWrapper);
    }
}
