public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int no_of_islands=0; //variable to store the number of islands
        //within two loops start iterating through each elements, when encouter a water, mark it as 
        //visited and perform dfs from that node, and increment the number of islands 
        // do that for all the elements of the matrix and return the final val for no of islands
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1') {
                    dfs(i, j, grid);
                    no_of_islands+=1;
                }
            }
        }
        return no_of_islands;
    }
    public void dfs(int x,int y,char[][] mat){
        //if r/c goes out of bounds or if the matrix[x][y] is land or visited ie) =0 return null
        if(x<0||x>=mat.length||y<0||y>=mat[0].length||mat[x][y]=='0') 
        return; 
        mat[x][y]='0'; //if the mat[x][y]=1 mark it as visited

        //do 4 dir call  after visiting a water node 
        dfs(x+1,y,mat);
        dfs(x-1,y,mat);
        dfs(x,y+1,mat);
        dfs(x,y-1,mat);
    }
    public static void main(String[] args) {
        NumberOfIslands noi = new NumberOfIslands();
        char[][] grid = new char[][]{
        {'1','1','1','1','0'},
        {'1','1','0','1','0'},
        {'1','1','0','0','0'},
        {'0','0','0','0','0'}};
        int ans = noi.numIslands(grid);
        System.out.println(ans);
            
    }
}
//----------complexity analysis
// Tc:O(r*c) [because we need to visit each cell in the grid once to check if it is a land ('1') and if it has not been visited before.]
// Sc:O(1) if we use the same matrix to track visited by changing 1 to any variable, if we used seprate matrix to track visited then SC:O(r*c)