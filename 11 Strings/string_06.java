// Question: Find the sortest path

public class string_06 {
    public static void sortestPath(String rk){
        int x1 = 0, y1 = 0; // staring point
        int x = 0;
        int y = 0;
        for(int i = 0; i  < rk.length(); i++){
            int direction = rk.charAt(i);
            if ( direction == 'N'){
                y = y + 1;
            } else if ( direction == 'S'){
                y = y - 1; 
            } else if ( direction == 'W'){
                x = x - 1; 
            } else if ( direction == 'E'){
                x = x + 1; 
            } else{
                System.out.println("Check the strings letters they are wrong");
            }
        }
        float sortestPath = (int) Math.sqrt( Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
        System.out.println(sortestPath);
    }
    public static void main(String[] args) {
        String rk = "WNEENESENNN";
        sortestPath(rk);
    }
}
