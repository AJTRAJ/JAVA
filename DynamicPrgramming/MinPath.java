
// Online IDE - Code Editor, Compiler, Interpreter

public class Main
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("We are calling functions to USE DP");
        System.out.println("Minimum Value of  given array = " +minPath(grid));
    }
    
    public static int minPath(int[][] grid){
        if (grid == null || grid.length == 0)
            return 0;
        int m = grid.length;
        int n = grid[0].length;
        
        int result[][] = new int[m][n];
        
        result[m-1][n-1] = grid[m-1][n-1];
        if (m >1) {
            for (int i = m-2; i>=0 ;i--){
                result[i][n-1] = grid[i][n-1] + result[i+1][n-1]; 
            }
        }
        if (n >1) {
            for (int j = n-2; j>=0 ;j--){
                result[m-1][j] = grid[m-1][j] + result[m-1][j+1]; 
            }
        }
        for (int i = m-2; i>=0 ;i--){
            for (int j = n-2; j>=0 ;j--){
                result[i][j] = grid[i][j] + Math.min(result[i+1][j],result[i][j+1]);
    }
        }
        return result[0][0];
}
}
