class Solution {
    public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for(int i=0;i<n-1;i++) {
        for(int j=0;j<n-i-1;j++) {
            if(arr[j]>arr[j+1]) {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}

public static int heightChecker(int[] heights) {
    int[] expected=new int[heights.length];
for(int i=0;i<heights.length;i++) expected[i]=heights[i];
    bubbleSort(expected);
    int count=0;
    for(int i=0;i<heights.length;i++) {
        if(heights[i]!=expected[i]) count++;
    }
    return count;
}
}
