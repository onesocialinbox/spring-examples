package com.example.springbatch.pricing;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class PricingFieldSetMapper implements FieldSetMapper<PriceInfo>{

	/*public PricingFieldSetMapper() {
		// TODO Auto-generated constructor stub
	}*/

	@Override
	public PriceInfo mapFieldSet(FieldSet fieldset) throws BindException {
		
		PriceInfo priceInfo = new PriceInfo();
		
		priceInfo.setTicker(fieldset.readString("TICKER"));
		priceInfo.setCompanyName(fieldset.readString("COMPANYNAME"));
		priceInfo.setIndustry(fieldset.readString("INDUSTRY"));
		priceInfo.setPrice(fieldset.readBigDecimal("PRICE"));
		
		System.out.println("Price Info:::: Decompress.... " +priceInfo.toString());
		
		return priceInfo;
	}

}
