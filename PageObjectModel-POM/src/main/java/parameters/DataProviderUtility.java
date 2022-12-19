package parameters;

import org.testng.annotations.DataProvider;

public class DataProviderUtility {
	
	@DataProvider(name="SearchProvider")
	public Object[][] getDataFromDataprovider(){
		return new Object[][]
		{
			{"Anju"},{"C S"},{"anjucs"},{"Trivandrum"},{"Kerala"},{"695008"}
			
		};
	}
	

}
