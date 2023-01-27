public class NumToRow {
    public static void main(String[] args) {
        //step -1:count digit.
        int num = 12345;
        int count = 0;
        for(int i=num; i!=0;i=i/10){
            count++;
        }
        System.out.println(count);
       //step-2:find power.
        int pow = 1;
        for(int i=1;i<=count-1;i++){
            pow = pow*10;
        }
        System.out.println(pow);
        //step-3: logic for print digit.
        for(int i=num; i!=0; pow=pow/10){
            System.out.println(i/pow);
            i=i%pow;
        }
    }
}
