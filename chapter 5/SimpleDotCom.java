public class SimpleDotCom{
	private int[] locationCells;
	private int numOfHits = 0;

	public void setLocationCells(int[] locationCells){
		this.locationCells = locationCells;
	}

	public String checkYourself(String userGuessStr){
		int userGuessInt = Integer.parseInt(userGuessStr);
		String result = "miss";

		for(int cell : locationCells){
			if(cell == userGuessInt){
				result = "Hit";
				numOfHits++;
				break;
			}
		}

		if(numOfHits == locationCells.length){
			result = "Kill";
		}

		System.out.println(result);
		return result;
	}
}