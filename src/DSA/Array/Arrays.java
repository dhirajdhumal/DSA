package DSA.Array;

public class Arrays {
    public static void main(String[] args) {

        //declaration of an array
        int arr[] = new int[5];

        //default value is zero
        System.out.println("before insertion -> " + arr[0]);

        //insertion in array
        arr[0] = 40;
        System.out.println("after insert: value at 0th index -> " + arr[0]);

        //updation in array
        arr[0] = 50;
        System.out.println("after update: Value at 0th index -> " + arr[0]);

        //deletion in array
        //soft delete
        arr[0] = 0;
        System.out.println("after delete: Value at 0th index -> " + arr[0]);

        //traverse in array
        int length = arr.length;
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[4] = 4;
        System.out.println("length of array is -> " + length);
        for(int i=0; i<length; i++){
            System.out.println("Element at index " + i + " is " + arr[i]);
        }
    }
}
