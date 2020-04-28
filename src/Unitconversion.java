public class Unitconversion {
    static double inchConverter(int inch) {
        return inch * 0.0245;
    }

    public static void main (String[] args) {
        System.out.println(100 + " inches is equal to " + inchConverter(100) + " meters ");
    }
}
