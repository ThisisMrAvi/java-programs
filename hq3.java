
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(); 
        while(t>0){
            int r=1;
            int i=1;
            int n = s.nextInt(); 
            int k = s.nextInt();
            while(i<=10000) {
                while(r<n || r<k){
                    
                    // System.out.println(r);
                    r = 2*r;
                    if (r>n && r<k) {
                        r=1;
                    }
                    if (r>k) {
                        System.out.println(i);
                    }
                }
                i++;
            }
            t--;
        }
    }
}




int fun(long long int n,long long int k){
    long long int dif,x,i,j,day;
    if( k < n ){
        for(i=1;;i++){
            if( pow(2,i) >= k )
                return i+1;
        }

    }
    else{
    //first find terminating day
    for(day = 1; ; day++){
    if(pow(2,day) >= n)
    break;
    }

    //day as 8
    if(k==n)
    return day;
    dif = k - n;//2raisetox >= dif
    for(x=0;;x++){
    if(pow(2,x) >= dif)
    break;
    }
    return (day+x+1+1);
    }

}