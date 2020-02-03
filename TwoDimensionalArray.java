public class TwoDimensionalArray{
    
    static int value=10;
    public static void main(String[] args) {
         int rowCount=4;
         int colcount=4;
        int twoDimensionalArray[][]=new int[rowCount][colcount];
       populateArray(twoDimensionalArray);
       displayArray(twoDimensionalArray);
       
    }

    private static void populateArray(int[][] twoDimensionalArray){
        for (int row = 0; row < twoDimensionalArray.length; row++) {
            for (int col = 0; col < twoDimensionalArray[0].length; col++) {
                twoDimensionalArray[row][col]=value++;
            }
        }
    }

    private static void displayArray(int [][] twoDimensionalArray){
        for (int row = 0; row < twoDimensionalArray.length; row++) {
            for (int col = 0; col < twoDimensionalArray[0].length; col++) {
                System.out.print(twoDimensionalArray[row][col]+"\t");
            }
            System.out.println();
        }
    }
}