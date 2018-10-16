import com.sun.org.apache.xpath.internal.functions.FuncSubstringAfter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swap {
    static void swap1(int n1,int n2){
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After Swapping it becomes a="+n1+" b="+n2);
    }
    static void swap2(int n1,int n2){
        n1=n1*n2;
        n2=n1/n2;
        n1=n1/n2;
        System.out.println("After Swapping it becomes a="+n1+" b="+n2);

    }
    static void swap3(int n1,int n2){
        n1=n1^n2;
        n2=n1^n2;
        n1=n1^n2;
        System.out.println("After Swapping it becomes a="+n1+" b="+n2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s=new StringBuffer();
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        System.out.println("AddnSubSwap");
        swap1(a,b);
        System.out.println("mulndivSwap");
        swap1(a,b);
        System.out.println("BitwiseAndSwap");
        swap1(a,b);
    }
}
