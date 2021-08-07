// Online IDE - Code Editor, Compiler, Interpreter
public class Main
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        
        String str1 ="HelloWorld";
        String str2 ="HiHello";
        
        int memo[][] =new int[str1.length()+1][str2.length()+1];
        System.out.println("We are calling functions to USE DP");
        System.out.println("\n longestSubString With Memoization Final Output = " +longestSubStringMemoization(str1,str2,memo));
        System.out.println("\n longestSubString With Recursion Final Output = " +longestSubStringRecursion(str1,str2));
        System.out.println("\n longestSubString With DP Final Output = " +longestSubStringDP(str1,str2));
    }
    
    public static int longestSubStringDP(String s,String t){
        int n = s.length();
        int m = t.length();
        
        int dp[][] = new int[n+1][m+1];
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                if (s.charAt(i-1) == t.charAt(j-1))
                    dp[i][j] = 1 +dp[i-1][j-1];
                else
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
      
        return dp[n][m];
    }
      public static int longestSubStringRecursion(String s,String t){
          if (s ==null || t==null ||s.length() ==0 || t.length() ==0)
            return 0;
            if (s.charAt(0) == t.charAt(0))
                    return 1+longestSubStringRecursion(s.substring(1),t.substring(1));
                else{
                    int op1 = longestSubStringRecursion(s,t.substring(1));
                    int op2 = longestSubStringRecursion(s.substring(1),t);
                    return Math.max(op1,op2);
                }

    }
   public static int longestSubStringMemoization(String s,String t,int memo[][]){
            if (s ==null || t==null ||s.length() ==0 || t.length() ==0)
             return 0;
            
            if (memo[s.length()][t.length()] > 0)
                return memo[s.length()][t.length()];
                
            if (s.charAt(0) == t.charAt(0)){
                    memo[s.length()][t.length()] = 1+longestSubStringMemoization(s.substring(1),t.substring(1),memo);
                    return memo[s.length()][t.length()];
            }
                else{
                    
                    int op1 = longestSubStringMemoization(s,t.substring(1),memo);
                    int op2 = longestSubStringMemoization(s.substring(1),t,memo);
                    memo[s.length()][t.length()] = Math.max(op1,op2);
                    return memo[s.length()][t.length()];
                }

    }
}
