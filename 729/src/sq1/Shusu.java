package sq1;
//error
public class Shusu {
	public static void main(String[] args) {
		int j;
		
         for(int i=1;i<100;i++){
        	 
        	 for(j=2;j<=i;j++){      		 
        		 if(j%i==0){break;}
        		 System.out.println(j);
        	 }
        	 if(j<i){
        		 System.out.println(i);
        	 }
         }
	}
}
