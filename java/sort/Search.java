package data_structures_and_algorithms.java.sort;

public class Search {
    public static void main(String[] args) {
        int nums[] = {2,3,5,6,7,8,99};
        int target = 8;
        int result = linearSearch(nums, target);
        int result1 = binarySearch(nums, target);
        if (result == result1)
            System.out.println(result);
        else
            System.out.println("There is some discrepancy!");
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){
                left = mid + 1;
            }
            else
                right = mid -1;
        }
        return -1;
    }

    public static int linearSearch(int[] nums, int target) {
        for (int index=0; index<nums.length; index++){
            if (nums[index] == target)
                return index;
        }
        return -1;
    }
}
