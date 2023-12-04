package extras;
    // output : tset12avaj90nrael234ak
    public class Test1 {
        public static void main(String []args) {
            int [] arr= {0,1,2,3,4,5,6,7,8,9,};
            String str = "test12java90learn234ka";
            char c[]=str.toCharArray();
            for(int i=0;i<c.length;i++) {
                int count=0;
                for(int j=0;j<arr.length;j++)
                {
                    if(c[i]==arr[j]) {
                        System.out.print(c[i]);
                        count=1;
                    }
                }
                if(count==0){
                    System.out.print(c[i]);
                }


            }
        }
    }

