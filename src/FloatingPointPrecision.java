public class FloatingPointPrecision {
    public static void main (String[] args){
        float minFloat = Float.MIN_VALUE;
        System.out.println(minFloat);

        double minDouble = Double.MIN_VALUE;
        System.out.println(minDouble);

        double myDouble = 5d/2f;
        System.out.println(myDouble);

        //POUND TO KILOGRAM CONVERTER
        float pounds = 8f;
        double kilograms = pounds*0.45359237;
        System.out.println(kilograms);
    }
}
