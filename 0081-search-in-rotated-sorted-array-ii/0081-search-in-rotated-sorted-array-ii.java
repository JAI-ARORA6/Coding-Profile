class Solution {
    public boolean search(int[] nums, int target) {
        int pivot=FindPivot(nums);
        if(pivot==-1){
            return BinarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return true;
        }
        if(target>=nums[0]){
            return BinarySearch(nums,target,0,pivot-1);
        }
        return BinarySearch(nums,target,pivot+1,nums.length-1);
    }
    static boolean BinarySearch(int[] arr,int target, int start, int end){
        int n=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
        if(target<arr[mid]){
            end=mid-1;
        }
        else if(target > arr[mid]){
            start=mid+1;
        }
        else{
            return true;
        }
        }
        
         return false;
    }

    static int FindPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
            return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
    return mid-1;
}
        if(arr[start] == arr[mid] && arr[mid] == arr[end]){
            // check if start is pivot
            if(start < end && arr[start] > arr[start+1]){
                return start;
            }
            start++;

            // check if end is pivot
            if(end > start && arr[end-1] > arr[end]){
                return end-1;
            }
            end--;
        }
        // Left side is sorted, pivot in right
        else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
    }
   return -1;
}
}