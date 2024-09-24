public class bit_manuplation_12 {
    public static void clearRangedNum(int number, int i, int j){
        for(int num = i; num <= j; num++){
            int Bitmask = ~(1 << num);

            int clearRangedNum = Bitmask & 0;
            System.out.println(clearRangedNum);
        } 
        
    }
    public static void main(String[] args) {
        clearRangedNum(12334, 2, 4);
    }
}
