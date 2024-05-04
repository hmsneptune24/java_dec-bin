import java.util.Scanner;

public class main{
    public static void main(String[] args){
        System.out.print("[DEC] = ");
        Scanner myNum = new Scanner(System.in);
        int x = myNum.nextInt();
        int n = x;
        String binA = "";
        String[] binD = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
        if(x >= 0){
            for (int i = 0; i < binD.length; i++) {
                if(n%2 == 1){
                    binD[i] = "1";
           	    }
                else{
                    binD[i] = "0";
                }
                n = (n-(n%2))/2;
            }
            for (int j = 0; j < binD.length; j++) {
                if (j == 4 || j == 8 || j == 12 || j == 16 || j == 20 || j == 24 || j == 28){
                    binA = binA + " " + binD[binD.length - 1 - j];
                }
                else{
                    binA = binA + binD[binD.length - 1 - j];
                }
            }
        }
        if(x < 0){
            n = n * (-1);
            for (int m = 0; m < binD.length; m++) {
                if(n % 2 == 1){
                    binD[m] = "0";
                }
                else{
                    binD[m] = "1";
                }
                n = (n-(n%2))/2;
            }
            for (int l = 0; l <  binD.length; l++){
                if(binD[l] == "1"){
                    binD[l] = "0";
                }
                else{
                    binD[l] = "1";
                    break;
                }
            }
            for (int p = 0; p < binD.length; p++) {
                if (p == 4 || p == 8 || p == 12 || p == 16 || p == 20 || p == 24 || p == 28){
                    binA = binA + " " + binD[binD.length - 1 - p];
                }
                else{
                    binA = binA + binD[binD.length - 1 - p];
                }
            }
        }
        System.out.print("[BIN] = ");
        System.out.println(binA);
    }
}
