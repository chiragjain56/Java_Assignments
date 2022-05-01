package Unit5.LLD.StrategyUsingLambdaandBMS;

public class FastStrategy implements Strategy{
	@Override
	  public void performTask() {
	    System.out.println("Perform task now!");
	  }
}
