package dataProvider;
import org.testng.annotations.DataProvider;
import com.clearcode.utils.ExcelUtils;


public class TestData {
	int a=2;
	@DataProvider
	public Object[][] AdminLogin(){
		return ExcelUtils.getData("Test Data.xls","admin");
	}
	
	@DataProvider
	public Object[][] ChangeUserRole(){
		return new Object[][] { 
			new Object[] {
			ExcelUtils.data("Test Data.xls", "user", "changeUserRole").toArray() }
			};
	}
	
	@DataProvider
	public Object[][] AddNewUser(){
		return new Object[][] { ExcelUtils.data("Test Data.xls", "newUser", "addNewUser").toArray() };
	}
}
