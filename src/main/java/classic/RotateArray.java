package classic;

/**
 * Created by parkey19 on 2019. 2. 24..
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(nums);
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums,3);
//        rotateArray.rotate2(nums,2);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println(nums);
    }

    public void rotate(int[] nums, int k) {

        int numsSize = nums.length;
        int lastIndex = nums.length - 1;

        for (int i = 0; i < k; i++) {
            int last = nums[lastIndex];
            int temp;
            for (int j = 0; j < numsSize; j++) {
                temp = nums[j];
                nums[j] = last;
                last = temp;
            }

        }
    }

    public void rotate2(int[] nums, int k) {



    }
}
