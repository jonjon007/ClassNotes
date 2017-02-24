
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle recl = new Rectangle(10, 20);
		System.out.println(recl.area());
		System.out.println(recl.perimeter());
		SwitchStatement();
		ExitWhileLoop();
		System.out.println(3 << 0); //Shifts the binary value over x places to the left.
		System.out.println(FlipCoin());
	}
	
	private static void SwitchStatement(){
		char ch = 'a';
		
		switch (ch){
		case 'a':
		case 'A':
			System.out.print(ch);
			break; //You can ommit the break statement to keep checking. Good for some cases in which
						//if statements can prove to be difficult.
		case 'b':
		case 'B':
			System.out.print("Second letter, " + ch);
		}		
	}
	
	private static void CharacterObject(){
		Character ch = 'a'; //This builds the Character helper class in to the instance.
		char c = 'x'; //This is simply a primitive.
	}
	
	private static void ExitWhileLoop(){
		int x = 10;
		System.out.println("Begin of DoWhileLoop");
		//This kind of while loop enters no matter what and only leaves on the end condition.
		//Exit-entry type loop.
		do{
			System.out.print("value of x : " + x + "\n");
			if(x == 17){
				System.out.print("Break @ 17!\n");
				break;
			}
			System.out.print("\n");
			x++;
		}while(x < 20);
		System.out.println("End of ForLoop");
		System.out.println("\n");
	}
	//For versus foreach
	private static void EnhancedForLoop(){
		int[] numbers = {10, 20, 30, 40, 50};
		System.out.println("Begin of EnhancedForLoop()");
		
		for(int x : numbers){
			System.out.print(x);
			System.out.print(",");
		}
		//for()
		System.out.print("\n");
	}
	
	private static String FlipCoin(){
		String b = "";
		int a = (int)(Math.random()*100);
		b = (a < 50) ? "Heads" : "Tails";
		return b;
	}
	
	private static void PassArray1(int[] myArray){
		for (int i = 0; i < myArray.length; i++){
			System.out.print(myArray[i] + " ");
		}
	}
	//PMT & PVP
		//Now look for a jar file!
		//Import stuff from online into your project.
		//Be careful of your source!
			//Shady people! Incorrect results? Version...
	//"Apatchy"
}