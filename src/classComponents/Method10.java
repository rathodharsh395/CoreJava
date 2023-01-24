package classComponents;

public class Method10 {
        public static void table(int x,int y){
            if(y != 1){
                table(x,y-1);
            }
            System.out.println(x*y);

        }
        public static void main(String []args)
        {
            table(15,10);
        }
}


