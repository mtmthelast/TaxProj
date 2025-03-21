package com.skillstorm.taxes.dtos;

import java.util.Date;

public record ClientDTO(int social_security_number, String first_name, String last_name, int employee_id1, Date date_of_birth,
		String street_address, String city, String state, int adjusted_gross_income, int withheld_income_tax,
		int tax_return, int employment_sect, int filing_stat) {

}
