public class Prime1001st {

	public static void main(String[] args) {
		 long c1=0,i=2,n=0;
		 int c=0;
		 while(i>0)
		 {
			 for(long j=2;j<=Math.sqrt(i);j++)
			 {
				 if(i%j==0)
				 {
					 c++;
				 }
			 }
			 if(c==1)
			 {
				 c1++;
			 }
			 if(c1==10001)
			 {
				 n=i;
				 break;
			 }
			 i++;
			 c=0;
		 }
		 System.out.println("1oo1st prime is:"+n);
	}

}
