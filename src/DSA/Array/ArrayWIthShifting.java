package DSA.Array;

public class ArrayWIthShifting {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        for(int i=0; i<4; i++) {
            System.out.println("i beftore element at index " + i + " is " + arr[i]);
        }

        ArrayWIthShifting insert = new ArrayWIthShifting();
        insert.insertWithShift(arr, 25, 1);

        for(int i=0; i<4; i++) {
            System.out.println("after inserting element at index " + i + " is " + arr[i]);
        }

        insert.deleteWithShift(arr, 1);
        for(int i=0; i<4; i++) {
            System.out.println("d after deletion element at index " + i + " is " + arr[i]);
        }
    }

    public void insertWithShift(int arr[], int element,  int index){
        int n = arr.length;
        if(index<0 || index>= n){
            System.out.println("Index Out of Bound Exception");
        }
        for(int i=n-2; i>=index; i--){
            arr[i+1] = arr[i];
        }

        arr[index] = element;
    }

    public void deleteWithShift(int arr[], int index){
        int n = arr.length;
        for(int i=index+1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = 0; //delete to avoid duplicate
    }
}
