package Mockito_Project;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.mockito.Mockito;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class SampleTest {
	@Test
    public void sampleGreets() {
       Sample s1 = mock(Sample.class);
        when(s1.greet()).thenReturn("HELLO_WORLD");
        System.out.println("Sample greets: " + s1.greet());
        assertEquals(s1.greet(), "HELLO_WORLD");
    }
	
	@Test
	public void whenNotUseMockAnnotation_thenCorrect() {
	    List mockList = Mockito.mock(ArrayList.class);
	     
	    mockList.add("one");
	    //mockList.add("Two");
	    Mockito.verify(mockList).add("one");
	    assertEquals(0, mockList.size());
	 
	    Mockito.when(mockList.size()).thenReturn(100);
	    assertEquals(100, mockList.size());
	}
}
