public class Day11 {
    public static void starter(){
        int row=3;
        int col=3;
        int count=0;
        int[][]twoD=new int[row][col];
        for(int i=0; i< row; i++){
            for(int j=0; j<col; i++){
                count++;
                twoD[i][j]=count;


            }

        }

    }
    public static void main(String[] args) {
        starter();

    }
}
