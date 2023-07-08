package controlStatements.loops;

public class Assignment13 {
    public static void main(String[] args) {
        for(int i=0; i<=10000;i++)
        {
            int length =0,t1=i;
            while(t1>0)
            {
                length += 1;
                t1 =t1/10;
            }
            int t2=i,armstrong =0;
            int rem ;
            while(t2!=0)
            {
                rem = t2%10;
                int multi =(int) Math.pow(rem,length);
                armstrong += multi;
                t2 = t2/10;
            }
            if(i== armstrong){
                System.out.println(i);
            }


        }
    }
}

