public class binarySearch {
    public int binarysearch(int arr[],int target){
        // int index=-1;
        int mid=0;
        int l=0,r=arr.length-1;
        while(l<=r){
            mid=l+(r-l)/2;
            if(arr[mid]==target){
                 return mid+1;
            }
            else if(arr[mid]>target){
                r=mid-1;
            }
            else if(arr[mid]<target) l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        binarySearch bs = new binarySearch();
        int[] arr = new int[]{12,4,3,1,4,5,3,24,23,44};
        int ans = bs.binarysearch(arr, 44);
        System.out.println(ans);
    }
}
