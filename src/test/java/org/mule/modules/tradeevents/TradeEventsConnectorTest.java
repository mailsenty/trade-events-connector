package org.mule.modules.tradeevents;

import static org.junit.Assert.*;

import org.junit.Test;

public class TradeEventsConnectorTest {
	
	TradeEventsConnector  tradeEventsConnector = new TradeEventsConnector();

	@Test
	public void testQuery() {
		System.out.println(tradeEventsConnector.query("electrical"));
	}

	@Test
	public void testIndustries() {
		System.out.println(tradeEventsConnector.industries("Educational Services"));
	}

	@Test
	public void testCountries() {
		System.out.println(tradeEventsConnector.countries("CN"));
	}

	@Test
	public void testSources() {
	
		System.out.println(tradeEventsConnector.sources("CANADA"));
	}

	
	
}
