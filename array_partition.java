class Solution {
    public static void bubbleSort(int[] nums) {
    int n=nums.length;
    for (int i=0;i<n-1;i++) {
        for (int j=0;j<n-i-1;j++) {
            if (nums[j]>nums[j+1]) {
                int temp=nums[j];
                nums[j]=nums[j + 1];
                nums[j + 1]=temp;
            }
        }
    }
}
public static int arrayPairSum(int[] nums) {
    bubbleSort(nums); 
    int sum=0;
    for (int i=0;i<nums.length;i+=2) {
        sum+=nums[i];
    }

    return sum;
}
}
