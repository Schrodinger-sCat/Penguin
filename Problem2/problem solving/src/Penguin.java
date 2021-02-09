import java.util.Scanner;

public class Penguin {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Double[] weight=new Double[sc.nextInt()];
        for(int i=0; i<weight.length; i++){
            weight[i]=sc.nextDouble();
        }
        int count=0;
        for(int i=0; i<weight.length; i++){
            if(weight[i]>0.0){
                //System.out.println(i);
                count++;
                Double sum=weight[i];
                weight[i]=0.0;
                for(int j=i+1; j<weight.length; j++){
                    if(3.0>=(sum+weight[j])){
                        weight[j]=0.0;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
