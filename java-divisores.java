import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisores {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[4];
        for (int i = 0; i < 4; i++){
          num[i] = Integer.parseInt(st.nextToken());
        }
        br.close();   
   
        int numMenor = -1;
        if (num[2] % num[0] == 0) {
            for(int i = 1; i <= num[2]/num[0]; i++){                
                int numAux = num[0] * i;
                if (numAux % num[1] != 0 && num[3] % numAux != 0 && num[2] % numAux ==0) {
                    numMenor = numAux;
                    break;
                }
            }
        }
        System.out.println(numMenor);        
    }    
}