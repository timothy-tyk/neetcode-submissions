class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows = 9;
        int cols = 9;
        
        
        for(int i=0;i<rows;i++){
            Set<Character> checkingSet = new HashSet<>();
            for(int j=0;j<cols;j++){
                if(board[i][j]=='.') continue;
                else{
                    if(checkingSet.contains(board[i][j])) return false;
                    checkingSet.add(board[i][j]);
                }
            }
        }

        for(int i=0;i<cols;i++){
            Set<Character> checkingSet = new HashSet<>();
            for(int j=0;j<rows;j++){
                if(board[j][i]=='.') continue;
                else{
                    if(checkingSet.contains(board[j][i])) return false;
                    checkingSet.add(board[j][i]);
                }
            }
        }

        for(int i=0;i<rows;i+=3){
            for(int j=0;j<cols;j+=3){
                Set<Character> checkingSet = new HashSet<>();
                for(int a=i;a<i+3;a++){
                    for(int b=j;b<j+3;b++){
                        if(board[a][b]=='.') continue;
                        else{
                            if(checkingSet.contains(board[a][b])) return false;
                            checkingSet.add(board[a][b]);
                        }
                    }
                }
            }
        }
        return true;
    }
         
}


/**
 * 1. check for duplicates in the same row
 * 2. check for duplicates in the same column
 * 3. check for duplicates in the same 3x3 box
 * 
 * 
 */