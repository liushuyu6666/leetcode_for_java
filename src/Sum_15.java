import java.lang.reflect.Array;
import java.util.*;

public class Sum_15 {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> resultList = new ArrayList<>();
        if(nums.length < 3) return resultList;
        Arrays.sort(nums);

        int i = 0, j = 1, t = nums.length - 1;
        for(i = 0; i < nums.length - 2; i++){
            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            j = i + 1;
            t = nums.length - 1;
            while(j < t){
                if(nums[i] + nums[j] + nums[t] > 0){
                    t--;
                    while( j < t && nums[t] == nums[t + 1]){
                        t--;
                    }
                }
                else if(nums[i] + nums[j] + nums[t] < 0){
                    j++;
                    while( j < t && nums[j] == nums[j - 1]){
                        j++;
                    }
                }
                else{
                    List<Integer> l = new ArrayList<Integer>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[t]);
                    resultList.add(l);
                    t--;
                    while(nums[t] == nums[t + 1] && j < t){
                        t--;
                    }
                    j++;
                    while(nums[j] == nums[j - 1] && j < t){
                        j++;
                    }
                }
            }
        }
        // delete duplicated value
//        Set<List<Integer>> set = new LinkedHashSet<>();
//        set.addAll(resultList);
//        resultList.clear();
//        resultList.addAll(set);
        return resultList;
    }

    public static void main(String[] args) {
        Sum_15 s = new Sum_15();
        int[] ln = {0, -4, -1, -4, -2, -3, 2};
        System.out.println(s.threeSum(ln));
    }
}
