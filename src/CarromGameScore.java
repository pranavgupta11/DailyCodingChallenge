
public class CarromGameScore {
    public static void main(String[] args) {
	calculatePercentage(1518.0f, 3517.0f);
    }

    public static void calculatePercentage(float totalWins, float totalGames) {
	int count = 0;
	boolean flag = false;
	int previosWin = (int) Math.floor((float)(totalWins/totalGames)*100);
	int currentWin = (int) Math.floor((float)(totalWins/totalGames)*100);
	do {
	    totalWins++;
	    totalGames++;
	    count++;
	    currentWin = (int) Math.floor((float)(totalWins/totalGames)*100);
	    if(currentWin > previosWin) {
		flag = true;
	    } else {
		flag = false;
	    }

	} while(!flag);
	
	System.out.println("Current Win percentage "+previosWin+ "\nNumber of games require to reach next level "+count);
    }
}
