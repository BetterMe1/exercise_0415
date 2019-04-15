package exercise.exercise_0415;

/*
斐波那契数列
 */
/*
public class Solution {
    public int Fibonacci(int n) {
        */
/*
        if(n==0 || n==1){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
        *//*

        if(n==0 || n==1){
            return n;
        }
        int l = 0;
        int r = 1;
        for(int i=2; i<=n; i++){
            int temp = r;
            r = l+r;
            l = temp;
        }
        return r;
    }
}
*/

/*
跳台阶
一只青蛙一次可以跳上1级台阶，也可以跳上2级。
求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */

/*
public class Solution {
    public int JumpFloor(int target) {
        */
/*
        if(target == 0 || target == 1){
            return 1;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
        *//*

        if(target == 0 || target == 1){
            return 1;
        }
        int l = 1;
        int r = 1;
        for(int i=2; i<=target; i++){
            int temp = r;
            r += l;
            l = temp;
        }
        return r;
    }
}*/

/*
变态跳台阶
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
/*public class Solution {
    public int JumpFloorII(int target) {
        *//*
        if(target < 2){
            return 1;
        }
        return 2*JumpFloorII(target-1);
        *//*
        if(target < 2){
            return 1;
        }
        int[] t = new int[target+1];
        t[0] = 1;
        t[1] = 1;
        for(int i=2; i<=target; i++){
            t[i] = t[i-1]*2;
        }
        return t[target];
    }
}*/
/*
矩形覆盖
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Solution {
    public int RectCover(int target) {
        if(target <= 2){
            return target;
        }
        return RectCover(target-1)+RectCover(target-2);
    }
}