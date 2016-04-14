package innopolis.poporo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WallDecoratorInvariantTest {
	private WallDecorator w1, w2;
	private ContentItem c;
	private StandardPage sp;
	private EnchantedPage ep;
	
	@Before
	public void setUp() {
		c = new StandardContentItem();
		sp = new StandardPage(c);
		ep = new EnchantedPage(c);
		w1 = new WallDecorator(sp);
		w2 = new WallDecorator(ep);
	}
	
	@After
	public void tearDown() {
		//
	}
	
	@Test
	public void testInvariantSP() {
		ContentItem c1 = new StandardContentItem();
		ContentItem c2 = new StandardContentItem();
		//
		w1.upload(c1);
		w1.comment(c1, c2);
		assertTrue(w1.isDefinedAt(c1));
		assertTrue(w1.has(c1,c2));
		//
		w1.remove(c1);
		//
		assertFalse(w1.has(c1, c2));
		assertFalse(w1.isDefinedAt(c1));
	}
	
	@Test
	public void testInvariantEP() {
		ContentItem c1 = new StandardContentItem();
		ContentItem c2 = new StandardContentItem();
		//
		w2.upload(c1);
		w2.comment(c1, c2);
		assertTrue(w2.isDefinedAt(c1));
		assertTrue(w2.has(c1,c2));
		//
		w2.remove(c1);
		//
		assertFalse(w2.has(c1, c2));
		assertFalse(w2.isDefinedAt(c1));
	}

}
