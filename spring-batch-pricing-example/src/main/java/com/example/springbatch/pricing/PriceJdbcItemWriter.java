package com.example.springbatch.pricing;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class PriceJdbcItemWriter implements ItemWriter<PriceInfo> {

	private JdbcTemplate jdbcTemplate;

	private static final String INSERT_PRICE = "insert into daily (ticker,companyname,industry,price) values(?,?,?,?)";

	private static final String UPDATE_PRICE = "update daily set companyname=?, industry=?, price=? where ticker = ?";

	public PriceJdbcItemWriter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write(List<? extends PriceInfo> priceInfoResults)
			throws Exception {

		for (PriceInfo priceInfo : priceInfoResults) {
			
			System.out.println("Price Info:::: PriceJdbcItemWriter.... " +priceInfo.toString());
			
			int updated = jdbcTemplate.update(UPDATE_PRICE,
					priceInfo.getCompanyName(), priceInfo.getIndustry(),
					priceInfo.getPrice(), priceInfo.getTicker());

			if (updated == 0) {
				jdbcTemplate.update(INSERT_PRICE, priceInfo.getTicker(), priceInfo.getCompanyName(), priceInfo.getIndustry(),
						priceInfo.getPrice());
			}
		}

	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}
