class Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 1-D Array
        int nums[] = new int[5]; // Array of Size 5, default values will be 0
        System.out.println("Array elements:");
        nums[0] = 10;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // 2-D Array
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int nums_2d[][] = new int[5][5];
        System.out.println("2D Array elements:");
        for (int i = 0; i < nums_2d.length; i++) {
            for (int j = 0; j < nums_2d[i].length; j++) {
                nums_2d[i][j] = i + j;
                System.out.print(nums_2d[i][j] + " ");
            }
            System.out.println();
        }

        // jagged Array
        int jaggedArray[][] = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[4];
        System.out.println("Jagged Array elements:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = i + j;
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}