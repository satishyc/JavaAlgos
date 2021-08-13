public class GCD {

    public static void main(String[] args) {
        //m and n needs to be greater than or equal to 1
        gcd(105,15);
    }
    public static void gcd(int m,int n){
        if(m==0){
            System.out.println(n);
        }
        else{

            gcd(n%m,m);
        }
    }

}
