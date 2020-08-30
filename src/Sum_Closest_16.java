import java.util.Arrays;

public class Sum_Closest_16 {
    public int threeSumClosest(int[] nums, int target){
        if(nums.length < 3) return 0;
        Arrays.sort(nums);
//        here is something wrong, you can't initialize result as MAX_INT
//        int result = (int)(Math.pow(2, 31) - 1);
        int result = 100000;
        int j, k;
        for(int i = 0; i < nums.length - 2; i++){
            j = i + 1;
            k = nums.length - 1;
            while(j < k){
                if(nums[i] + nums[j] + nums[k] > target){
                    result = Math.abs(target - nums[i] - nums[j] - nums[k])
                < Math.abs(target - result) ? nums[i] + nums[j] + nums[k] : result;
                    k--;
                    while(j < k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
                else if(nums[i] + nums[j] + nums[k] < target){
                    result = (Math.abs(target - nums[i] - nums[j] - nums[k])
                            < Math.abs(target - result)) ? nums[i] + nums[j] + nums[k] : result;
                    j++;
                    while(j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                }
                else return target;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ln = {-3, -2, -5, 3, -4};
        Sum_Closest_16 sc = new Sum_Closest_16();
        System.out.println(sc.threeSumClosest(ln, -1));
    }
}
