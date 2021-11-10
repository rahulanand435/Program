public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 567};
        int result=test2(arr, 567);
        System.out.println(result);
    }
    static int Test(int arr[],int element){
        int start=0;
        while(start<arr.length)
        {
            if(arr[start]==element)
            return start;
            else
            start=start+1;
        }

            return -1;
    }
    static int test2(int arr[],int element)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
                return i;
        }
                return -1;
    }
}
