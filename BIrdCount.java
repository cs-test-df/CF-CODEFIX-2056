import java.io.IOException;
import java.util.Scanner;

public class BIrdCount {

    static int migratoryBirds(int n, int[] ar) {
        int[] ar1 = {0,0,0,0,0};
       for(int c =0 ;c<n;c++){
           switch(ar[c]){
               case 1: ar1[0]+=1;
                   break;
                   case 2: ar1[1]+=1;
                   break;
                   case 3: ar1[2]+=1;
                   break;
                   case 4: ar1[3]+=1;
                   break;
                   case 5: ar1[4]+=1;
                   break;
           }
       }
        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);
        System.out.println(ar[3]);
        System.out.println(ar[4]);
        int max = ar1[0];
        int type = 1;
        for(int j =1 ;j<5;j++){
            if(ar[j]>max) {
                max=ar[j];
                   type = j+1;}
            
        }
        return type;

    }


    public static void main(String[] args) throws IOException {

    		Scanner s = new Scanner(System.in);
    		int arCount = s.nextInt();
    		int[] ar = new int[arCount];

        for (int arItr = 0; arItr < arCount; arItr++) {
                        ar[arItr] = s.nextInt();
        }
        int result = migratoryBirds(arCount, ar);

       
        s.close();
    }
}
