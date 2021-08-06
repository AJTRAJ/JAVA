// Online IDE - Code Editor, Compiler, Interpreter
public class Main
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        int[] cost = {50,100,150,200,130,170};
        int[] wt = {10,20,30,40,50,60};
        int capacity= 50;
        
        int memo[][] = new int[capacity+1][cost.length];
        System.out.println("We are calling functions to USE DP");
        System.out.println("\n Knappsack With Memoization Final Output = " +knapSackWithMemoization(cost,wt,capacity,0,memo));
        System.out.println("\n Knappsack With Recursion Final Output = " +knapSackWithRecursion(cost,wt,capacity,0));
    }
    
    public static int knapSackWithMemoization(int[] cost,int[] weight,int capacity,int a,int [][]memo){
        if (a == weight.length || capacity <= 0)
            return 0;
        if (memo[capacity][a] != 0) return memo[capacity][a];
        int op1 = cost[a] +knapSackWithMemoization(cost,weight,capacity-weight[a],a+1,memo);
        int op2 = knapSackWithMemoization(cost,weight,capacity,a+1,memo);
            
        if (capacity >= weight[a]){
            memo[capacity][a] = Math.max(op1,op2);
            return Math.max(op1,op2);
        }
            
        else{
        memo[capacity][a] = op2;
            return op2;
        }
        
      
   
    }
    
        
    public static int knapSackWithRecursion(int[] cost,int[] weight,int capacity,int a){
        if (a == weight.length || capacity <= 0)
            return 0;
        
        int op1 = cost[a] +knapSackWithRecursion(cost,weight,capacity-weight[a],a+1);
        int op2 = knapSackWithRecursion(cost,weight,capacity,a+1);
            
        if (capacity >= weight[a]){
            return Math.max(op1,op2);
        }
            
        else{
            return op2;
        }
        
      
   
    }
}
