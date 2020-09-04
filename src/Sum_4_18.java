import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_4_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 4) return res;
        Arrays.sort(nums);
        int l, r;
        for(int i = 0; i < nums.length - 3; i++){
            while( i > 0 && i < nums.length - 3 && nums[i] == nums[i-1]){
                i++;
                continue;
            }
            for(int j = i + 1; j < nums.length - 2; j++){
                while( j > i + 1 && j < nums.length - 2 && nums[j] == nums[j-1]){
                    j++;
                    continue;
                }
                l = j + 1;
                r = nums.length - 1;
                while(l < r){
                    if(nums[i] + nums[j] + nums[l] + nums[r] > target){
                        r--;
                        while(l < r && r < nums.length - 1 && nums[r] == nums[r + 1]){
                            r--;
                        }
                    }
                    else if(nums[i] + nums[j] + nums[l] + nums[r] < target){
                        l++;
                        while(l < r && l > j + 1 && nums[l] == nums[l - 1]){
                            l++;
                        }
                    }
                    else{
                        res.add(new ArrayList<>(Arrays.asList(nums[i],
                                nums[j], nums[l], nums[r])));
                        r--;
                        l++;
                        while(l < r && l > j + 1 && nums[l] == nums[l - 1]){
                            l++;
                        }
                        while(l < r && r < nums.length - 1 && nums[r] == nums[r + 1]){
                            r--;
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Sum_4_18 s = new Sum_4_18();
        int[] n = {-1, -5, -5, -3, 2, 5, 0, 4};
        System.out.println(s.fourSum(n, -7));
    }
}
