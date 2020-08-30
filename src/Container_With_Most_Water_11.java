public class Container_With_Most_Water_11 {
    public int maxArea(int[] height){
        int maxArea = 0;
        if(height.length < 2) return 0;
        for(int i = 0; i < height.length - 1; i++){
            for(int j = i + 1; j < height.length; j++){
                maxArea = Math.max(maxArea,
                        Math.min(height[i], height[j]) * (j - i));
            }
        }
        return maxArea;
    }

    public int OptmMaxArea(int[] height){
        int maxArea = 0;
        if(height.length < 2) return 0;
        int left = 0, right = height.length - 1;
        while(left < right){
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if(height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Container_With_Most_Water_11 cwmw = new Container_With_Most_Water_11();
        int[] a =  {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(cwmw.maxArea(a));
        System.out.println(cwmw.OptmMaxArea(a));
    }
}
