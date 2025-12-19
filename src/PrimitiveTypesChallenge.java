public class PrimitiveTypesChallenge {
    public static void main(String[] args){
        byte myByte = 25;
        int myInt = -30;
        short myShort = 799;

        //type casting
        long myResult = (long)(myByte + myInt + myShort);
        System.out.println("the long value is "+myResult);
    }
}
