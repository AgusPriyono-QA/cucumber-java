package com.tia.cucumber.driver.strategies;

import com.tia.cucumber.utils.Constants;

public class DriverImplementer {

	public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();

            case Constants.FIREFOX:
                return new Firefox();

            default:
                return null;
        }
    }
	
}
