class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>row= new HashSet<>();
        HashSet<Character>col= new HashSet<>();
        HashSet<Character>subBox= new HashSet<>();
         
         // for rowwise and columnwise condition check
         boolean flag=true;
        for(int i=0;i<9;i++){
            row.clear();
            col.clear();
            for(int j=0;j<9;j++){

                  if (board[i][j] == '.') {}
              else{
                if(row.contains(board[i][j]))
                  { flag=false;
                    return false;
                  }else{
                    row.add(board[i][j]);
                  }
              }

              if (board[j][i] == '.') {}
              else{
                if(col.contains(board[j][i]))
                  { flag=false;
                    return false;
                  }else{
                    col.add(board[j][i]);
                  }
              }
             



            }
        }

        if(flag==false)
         { return flag;}


         for(int rowbox=0;rowbox<3;rowbox++){
            for(int colbox=0;colbox<3;colbox++){
                subBox.clear();
              for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){

                    char cell= board[rowbox*3+i][colbox*3+j];

                    if(cell == '.')
                    {

                    }else {
                            if (subBox.contains(cell)) {
                                flag = false;         
                                return false;
                            } else {
                                subBox.add(cell);
                            }
                        }

                 
            }
          }
            
         }

         }

         

         return flag;
    }
}
