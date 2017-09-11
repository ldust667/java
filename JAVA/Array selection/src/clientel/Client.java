package clientel;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pirateNames={"One-eye", "Gimpy" , "Sparrow"};
		String[] weaponNames={"club","sword","dagger"};
		String[] Strength={"12","20","18"};
		/*System.out.print(randomize.randoms[0]);
		randomize.random();
		System.out.print(randomize.randoms[0]+randomize.randoms[1]);*/
		
		
				
		randomize.random();	
			
		
		System.out.println(pirateNames[randomize.randoms[0]]+" Wields a : "+weaponNames[randomize.randoms[1]]+" with a strength of : " +Strength[randomize.randoms[2]] );
		
		
		System.out.println(pirateNames[randomize.randoms1[0]]+" Wields a : "+weaponNames[randomize.randoms1[1]]+" with a strength of : " +Strength[randomize.randoms1[2]]);
		
		
		
		System.out.println(pirateNames[randomize.randoms2[0]]+" Wields a : "+weaponNames[randomize.randoms2[1]]+" with a strength of : " +Strength[randomize.randoms2[2]]);
	}

}
