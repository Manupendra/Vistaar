//Given an integer, find the sum of digit
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumofDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s=new StringBuffer();
        String ip=br.readLine();
        int sum=0;
        for (int i = 0; i < ip.length(); i++) {
            sum+=ip.charAt(i)-48;
        }
        System.out.println(sum);
    }
}
