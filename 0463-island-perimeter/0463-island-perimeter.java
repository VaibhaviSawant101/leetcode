class Solution {
    public int perimeterUtil(int surCell)
    {
        int per = 0;
        switch(surCell)
        {
            case 0:
                per += 4;
                break;
            case 1:
                per += 3;
                break;
            case 2:
                per += 2;
                break;
            case 3:
                per += 1 ;
                break;
            case 4:
                 per += 0;
                 break;
        }
        
       return per; 
    }
    
    public int islandPerimeter(int[][] grid) {
        int ilen = grid.length;
         int jlen = grid[0].length;
        int totalPeri = 0;
        for(int i = 0; i < ilen; i++)
        { 
            for(int j = 0; j < jlen; j++)
            {
                if(grid[i][j] == 1)
                {
                    int pos1 = j+1 < jlen ? 1 : 0;
                    if(pos1 == 1 && grid[i][j+1] == 0)
                    {
                        pos1 = 0;
                    }
                    
                    int pos2 = j-1 >= 0 ? 1 : 0;
                    if(pos2 == 1 && grid[i][j-1] == 0)
                    {
                        pos2 = 0;
                    }
                    
                    int pos3 = i+1 < ilen ? 1: 0;
                    if(pos3 == 1 && grid[i+1][j] == 0)
                    {
                        pos3 = 0;
                    }
                    
                    int pos4 = i-1 >= 0 ? 1: 0;
                    if(pos4 == 1 && grid[i-1][j] == 0)
                    {
                        pos4 = 0;
                    }
                    totalPeri += perimeterUtil(pos1+pos2+pos3+pos4); 
                } 
            }
        }
        return totalPeri;
    }
}