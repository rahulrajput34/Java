// Question : Trapping rain water for interviews
public class arrays_05 {
    public static int trapingRainWater(int height[]) {
        // left max boundry
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // right max boundry
        int rightMax[] = new int[height.length];
        rightMax[rightMax.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedRainWater = 0;
        int width = 2;
        // loop
        for (int i = 0; i < height.length; i++) {
            // waterLevel = min(leftmax boundry, rightmax boundry)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = (waterlevel* - height[i])*width
            trappedRainWater += (waterLevel - height[i]) * width;
        }
        return trappedRainWater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int trappedWater = trapingRainWater(height);
        System.out.println(trappedWater);
    }
}
