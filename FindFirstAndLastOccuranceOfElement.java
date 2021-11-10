import javax.lang.model.util.ElementScanner14;

public class FindFirstAndLastOccuranceOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 8, 15, 23};
        int element = 3;
        int first=First(arr, element);
        int last=Last(arr, element);
        System.out.println(first);
        System.out.println(last);
    }
    static int First(int arr[],int element)
    {
        int start=0;
        while(start<arr.length)
        {   if(arr[start]>element)
            return -1;
            if(arr[start]==element)
            return start;
            else
                start=start+1;
        }
        return -1;
    }
    static int Last(int arr[],int element){
        int start=0;
        int position=-1;
        while(start<arr.length)
        {
            if(arr[start]==element)
            {
                position=start;
                start=start+1; 
            }
                else
                    start++;
        }
        return position;
    }       
        
}
