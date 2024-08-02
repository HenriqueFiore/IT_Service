package model.services;

import java.util.ArrayList;

public class Tax implements TaxService{

	public double tax(double amount, int size) {
		if(size > 1) {
			return amount * 0.1;
		}else {
			return 0;
		}
	}
}
