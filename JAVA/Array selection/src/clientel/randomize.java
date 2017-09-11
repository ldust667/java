package clientel;

import java.util.Random;

public class randomize {
	
	 
	static Random myRandom = new Random();
	static Random myRandom1=new Random();
	static Random myRandom2=new Random();
	static Random myRandom3=new Random();
	static Random myRandom4=new Random();
	static Random myRandom5=new Random();
	static Random myRandom6=new Random();
	static Random myRandom7=new Random();
	static Random myRandom8=new Random();
	
	static int[] randoms={myRandom.nextInt(3)
			,myRandom1.nextInt(3),myRandom2.nextInt(3)};
	static  int[] randoms1={myRandom3.nextInt(3)
			,myRandom4.nextInt(3),myRandom5.nextInt(3)};
	 static int[] randoms2={myRandom6.nextInt(3)
			,myRandom7.nextInt(3),myRandom8.nextInt(3)};
	
	public static void random(){
		while(randomize.randoms[0]==randomize.randoms1[0]||randomize.randoms2[0]==randomize.randoms[0]||randomize.randoms1[0]==randomize.randoms2[0])
				
				
				{randoms[0]=myRandom.nextInt(3);
				randoms[1]=myRandom1.nextInt(3);
				randoms[2]=myRandom2.nextInt(3);}
				
		while(randomize.randoms[1]==randomize.randoms1[1]||randomize.randoms2[1]==randomize.randoms1[1]||randomize.randoms2[1]==randomize.randoms[1])
		{randoms1[1]=myRandom3.nextInt(3);
				randoms1[0]=myRandom4.nextInt(3);
				randoms1[2]=myRandom5.nextInt(3);}
				
		while(randomize.randoms[2]==randomize.randoms1[2]||randomize.randoms2[2]==randomize.randoms1[2]||randomize.randoms2[2]==randomize.randoms[2])
			{randoms2[0]=myRandom6.nextInt(3);
				randoms2[1]=myRandom7.nextInt(3);
				randoms2[2]=myRandom8.nextInt(3);}
		/*for(int i=0;i==3;i++){
		randoms[i]=myRandom.nextInt(3);
		randoms1[i]=myRandom1.nextInt(3);
		randoms[i]=myRandom2.nextInt(3);
		
	}*/
	
	
	
	}}



