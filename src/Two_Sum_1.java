public class Two_Sum_1 {
    public int[] twoSum(int[] nums, int target){
        if (nums.length < 2) return new int[]{};
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Two_Sum_1 ts = new Two_Sum_1();
        int[] r = ts.twoSum(new int[]{1, 2, 3, 4}, 3);
        for (int i=0; i < r.length; i++){
            System.out.println(r[i]);
        }

    }
}
