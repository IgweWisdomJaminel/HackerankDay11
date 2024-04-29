import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Day11 {
    public static void starter(){
        int row=3;
        int col=3;
        int count=0;
        int[][]twoD=new int[row][col];
        for(int i=0; i< row; i++){
            for(int j=0; j<col; j++){
                count++;
                twoD[i][j]=count;
                System.out.print(twoD[i][j]);
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][]arr= new int[6][6];
        for(int i=0; i<6; i++){

            for(int j=0; j<6; j++){
                int num =sc.nextInt();
                arr[i][j]=num;

            }

        }
        int ar[]= new int[16];
        int count=0;
        for(int x=0; x<4; x++){
            for(int y=0; y<4; y++){
                ar[count++]=arr[x][y]+arr[x][y+1]+arr[x][y+2]
                        +arr[y+1][x+1]
                        +arr[x+2][y]+arr[x+2][y+1]+arr[x+2][y+2];
            }
        }
        int l=ar[0];
        for(int m:ar){
            if(m>l){
                l=m;
            }

        }
        System.out.println(l);

    }
}
