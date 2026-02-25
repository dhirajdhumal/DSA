package DSA.Array;

public class My2dArray {
    public static void main(String[] args){
        int matrix[][] = new int[3][2];
        int rows= matrix.length;
        int cols = matrix[0].length;

        //fill matrix
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                matrix[r][c] = 10;
            }
        }

        //print matrix
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        //updation in matrix
        System.out.println("after update");
        matrix[1][1] = 58;
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        //deletion in matrix - soft delete
        System.out.println("after delete");
        matrix[1][1] = 0;
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        //printing subArray
        System.out.println("subArray");
        int subArray[] = matrix[1];
        int n = subArray.length;
        for(int i=0; i<n; i++){
            System.out.print(subArray[i] + " ");
        }
    }
}
