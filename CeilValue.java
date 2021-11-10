public class CeilValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 8, 15, 23};
        int element = 9;
        System.out.println(ceil(arr, element));
    }
    static int ceil(int arr[], int Element) {
        int start = 0;
        while(start < arr.length) {
            if( arr[start] == Element) {
                return Element;
            }
            else if (arr[start]>Element)
            return arr[start];
            
            else
                start++;
        }
        return -1;

    }
}
