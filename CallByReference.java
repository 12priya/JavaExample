
public class CallByReference{
    public static void main(String[] args) {
        int primitivevalue=100;
        int intArray[]=new int[10];
        callbyValue(primitivevalue);
        System.out.println("the value of primitive after execution "+primitivevalue);
    callByReference(intArray);
    System.out.println("the value of array after execution "+intArray[0]);
    }

    public static void callbyValue(int value){
        ++value;

    }

    public static void callByReference(int[] array){

        array[0]=15;
    }
}