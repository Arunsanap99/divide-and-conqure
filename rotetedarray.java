public class roateted array{
public static int search(int arr[], int tar,int si, int ei ){
    //base case
    if(si >ei){
        return -1;
    }
    int mid = si + (ei - si)/2;
    //found
    if(arr[mid] == tar){
        return mid;
    }
    //line on 1
    if(arr[si]<= arr[mid]){
        //case a
        if(arr[si]<=tar && tar<=arr[mid]){
            return search(arr,tar,si,mid-1);
        }
        else {
            //case b
            return search(arr,tar,mid+1,ei);
        }

        }else {
        if(arr[mid]<=tar && tar<=arr[ei]){
            return search(arr,tar, mid+1,ei);
        }else {
            return search(arr, tar, si, mid-1);
        }

    }
}
    public static void main(String[] args) {
       int arr[] = {4,5,6,7,0,1,2};
       int tar = 0;
       int indx=search(arr,tar,0,arr.length-1);
        System.out.println(indx);
    }
}
