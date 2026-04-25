public class WrapperVPrimitive {
    void main() {
        int iterations = 10_000_000;

        // PRIMITIVE
        long start1 = System.currentTimeMillis();
        int primitiveSum = 0;
        for (int i = 0; i < iterations; i++) {
            primitiveSum += i;
        }
        long primitiveTime = System.currentTimeMillis() - start1;

        // WRAPPER
        long start2 = System.currentTimeMillis();
        Integer wrapperSum = 0;
        for (Integer i = 0; i < iterations; i++) {
            wrapperSum += i;
        }
        long wrapperTime = System.currentTimeMillis() - start2;

        System.out.printf("Primitive: %d ms\n", primitiveTime);
        System.out.printf("Wrapper:   %d ms", wrapperTime);
    }
}