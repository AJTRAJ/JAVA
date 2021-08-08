
// Online IDE - Code Editor, Compiler, Interpreter

public class Main
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        int arr[] = {1,4,3,-1,0,5};
        System.out.println("Find Missing First Positive Number from Given Array= "+findPositve(arr));
        
    }
    
    public static int findPositve(int nums[]){
        int len = nums.length;
        if (nums == null || len ==0)
            return 0;
            for (int i=0;i<len;i++){
                int x = nums[i];
                nums[i] = 0;
                while(true){
                    if (x <1 || x > len+1 || x == nums[x-1]) break;
                    int y = nums[x-1];
                    nums[x-1] =x;
                    x =y;
                }
            }
            for (int i=0;i<len;i++){
                if (nums[i]==0)
                    return i+1;
            }
            return len+1;
    }
}
