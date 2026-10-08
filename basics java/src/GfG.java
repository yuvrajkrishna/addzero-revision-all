class GfG {
    static int findMax(int[] arr, int i) {

        // Last index returns the element
        if (i == arr.length - 1) {
            return arr[i];
        }

        // Find the maximum from the rest of the array
        int recMax = findMax(arr, i + 1);

        // Compare with i-th element and return
        return Math.max(recMax, arr[i]);
    }

    static int largest(int[] arr) {
        return findMax(arr, 0);
    }

    public static void main(String[] args) {
        int[] arr = {20, 10, 20, 4, 100};
        System.out.println(largest(arr));
    }
}