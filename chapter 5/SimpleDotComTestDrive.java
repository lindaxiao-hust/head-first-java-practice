public class SimpleDotComTestDrive{
	public static void main(String[] args){
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom dot = new SimpleDotCom();
		int starting = (int)(Math.random()*4);
		int[] locations = {starting, starting+1, starting+2};

		dot.setLocationCells(locations);

		boolean isAlive = true;

		while(isAlive){
			String guess = helper.getUserInput("enter a number");
			String result = dot.checkYourself(guess);
			numOfGuesses++;

			if(result == "Kill"){
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
}