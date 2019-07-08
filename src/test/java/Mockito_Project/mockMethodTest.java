package Mockito_Project;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;
import org.junit.Test;

public class mockMethodTest {





	@Test
	public void testCalc() {
		System.out.println("**--- Test testCalc executed ---**");

		AddService addService;
		CalcService calcService;

		addService = Mockito.mock(AddService.class);
		calcService = new CalcService(addService);

		int num1 = 12;
		int num2 = 12;
		int expected = 23;

		when(addService.add(num1, num2)).thenReturn(expected);

		int actual = calcService.calc(num1, num2);
	
		assertEquals(expected, actual);

    }
	@Test
	public void spyTest() {
		AddService addService;
		CalcService calcService;

		addService = Mockito.spy(AddService.class);
		calcService = new CalcService(addService);
		int num1 = 12;
		int num2 = 12;
		int expected = 24;

		when(addService.add(num1, num2)).thenReturn(expected);
        System.out.println(expected);
		int actual = calcService.spyCalc(num1, num2);
        System.out.println(actual);
		assertEquals(expected, actual);
	}
	

}
