// Question 4: trapping rain water
// left max
// right max
// compare -- give water level
// trapped water  = (waterlevel - height)*width 
public class arrays_10 {
    public static int trappingWater(int height[]) {
        int n = height.length;
        
        // left max:
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // right max
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        
        int width = 1;
        int trappedRainWater = 0;
        for (int i = 0; i < n; i++) {
            // compare -- to get waterlevel
            int waterLevel = Math.min(rightMax[i], leftMax[i]);

            // trapped water = (waterlevel - height)*width
            trappedRainWater += (waterLevel - height[i]) * width;
        }
        return trappedRainWater;
    }

    public static void main(String[] args) {
        int height[] = {  4, 2, 0, 6, 3, 2, 5  };
        System.out.println(trappingWater(height));
    }
}
