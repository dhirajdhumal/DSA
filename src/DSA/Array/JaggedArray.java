package DSA.Array;

public class JaggedArray {
    public static void main(String[] args) {
        //decalration of an jagged array
        int arr[][] = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];

        //initialize jagged array
        int rows = arr.length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = 10;
            }
        }

        //print jagged array
        for(int i=0; i<rows; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}
