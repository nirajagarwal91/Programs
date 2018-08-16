class Solution {
    public boolean judgeCircle(String moves) {
        int track = 0;
        for(char cmoves: moves.toCharArray()){
            if(cmoves == 'U'){
                track++;
            }
            if(cmoves == 'D'){
                track--;
            }
            if(cmoves == 'R'){
                track++;
            }
            if(cmoves == 'L'){
                track--;
            }
        }
        if(track == 0){
            return true;
        }
        else
            return false;     
    }
}