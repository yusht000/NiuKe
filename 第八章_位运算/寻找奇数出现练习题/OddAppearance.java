import java.util.*;

//异或运算 因为a^a=0 a^0=a 所以出现偶数次的数最终都异或成0了 只剩下奇数次的数和0异或 那自然就是那个数本身 并且异或满足结合和交换律
public class OddAppearance {
    public int findOdd(int[] A, int n) {
        int t=0;
        for(int i=0;i<n;i++){
        	t=t^A[i];
        }
        return t;
    }
}