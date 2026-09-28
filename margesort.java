public class margesort {
   public static void margesort(int arr[], int si, int ei){
       //base case
       if(si >= ei){
           return;
       }
       // kaam
       int mid = si+(ei - si)/2;
       margesort(arr, si,mid); // sort left part
       margesort(arr, mid+1 , ei);
       marge(arr, si , mid , ei);
   }
   public static void marge(int arr[], int si, int mid, int  ei){
       int temp[] = new int[ei - si+1];
       int i = si; // for left part iterator
       int j = ei; // for right part
       int k = 0; // for temp

       while(i <= mid && j <= ei){
           if(arr[i] < arr[j]){
               temp[k] = arr[i];
               i++;
           }else{
               temp[k] = arr[j];
               j++;
           }
           k++;
       }
       while(i<=mid){
           temp[k++] = arr[i++];
       };
       while(j<=ei){
           temp[k++] = arr[j++];

       };
       //copy temp to orignal array
       for( k =0,i=si; k<temp.length; k++, i++){
           arr[i] = temp[k];
       }

   }
    public static void printarr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       int arr[] = {4,3,2,7,9};
       margesort(arr,0,arr.length-1);
       printarr(arr);


    }
}
