class Sandip {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 56, 78};
        System.out.println(binaraySearch(arr, 56));
    }
    static int binaraySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}