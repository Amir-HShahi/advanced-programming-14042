public class BoxingUnboxing {
    void main() {
        // boxing
        int primitive = 1;
        Integer valueOf = Integer.valueOf(primitive);

        // unboxing
        Integer wrapper = 2;
        int intValue = wrapper.intValue();

        // ERROR!
        // wrapper = null;
        // int nullException = wrapper.intValue();

        Integer autoBoxed = primitive; // auto boxing
        int autoUnboxed = wrapper; // auto unboxing
    }
}
