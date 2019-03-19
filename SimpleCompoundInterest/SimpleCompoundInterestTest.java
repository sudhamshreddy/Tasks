/**
 * 
 * @author sudhamsh
 *
 */
 
 public class SimpleCompoundInterestTest
 {
	 
	@Test
	public void TestSimpleInterest() {
		SimpleCompoundInterest simplecompoundinterest;
		 simpleInterest = new SimpleCompoundInterest(20202, 2.5f, 3);
		assertEquals(1515.1500244140625, simpleInterest.SimpleInterest());
		simpleInterest = new SimpleCompoundInterest(20202, 2.5f, 5);
		assertEquals(2525.25, simpleInterest.SimpleInterest());
	}
	@Test
	void TestCompoundIntrest() {
		SimpleCompoundInterest compoundInterest;
		compoundInterest = new SimpleCompoundInterest(20202, 2.5f, 3);
		assertEquals(21755.342888139312, compoundInterest.CompoundInterest());
		compoundInterest = new SimpleCompoundInterest(20202, 2.5f, 5);
		assertEquals(22856.7060585414, compoundInterest.CompoundInterest());
	}
 }