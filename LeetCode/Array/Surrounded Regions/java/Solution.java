
class Solution {
    public static void dfs(int i , int j , int vis[][] , char board[][]){
        vis[i][j]=1;
        int R[]={0,-1,0,1};
        int C[] = {-1,0,1,0};
        for(int k=0;k<4;k++){
            int Row = i+R[k];
            int Col = j + C[k];
            if(Row>=0 && Row<board.length && Col >=0 && Col<board[0].length && vis[Row][Col]==0 && board[Row][Col]=='O' ){
                vis[Row][Col]=1;
                dfs(Row , Col , vis , board);
            }
        }
    }
    public void solve(char[][] board) {
        int vis[][] = new int[board.length][board[0].length];
       for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            if(i==0 || j==0 || i==board.length-1 || j==board[0].length-1 && vis[i][j]==0){
                if(board[i][j]=='O') dfs(i , j, vis , board);
            }
        }
       }
        for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
           if(board[i][j]=='O' && vis[i][j]==0 ) board[i][j]='X';
        }}
    }
}