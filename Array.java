class Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int nums[] = new int[5]; // Array of Size 5, default values will be 0
        System.out.println("Array elements:");
        nums[0] = 10;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}