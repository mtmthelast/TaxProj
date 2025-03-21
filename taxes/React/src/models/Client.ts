export class Client{
    social_security_number: number;
    first_name: String;
    last_name: string;
    employee_id1: number; 
    date_of_birth: Date;
    street_address: string;
    city: string; 
    state: String; 
    adjusted_gross_income: number; 
    withheld_income_tax: number;
    tax_return: number; 
    employment_sect: number; 
    filing_stat: number;

    constructor(social_security_number: number, first_name: String, last_name: string, employee_id1: number, date_of_birth: Date,
        street_address: string, city: string, state: String, adjusted_gross_income: number, withheld_income_tax: number,
        tax_return: number, employment_sect: number, filing_stat: number){

        this.social_security_number = social_security_number;
		this.first_name = first_name;
		this.last_name = last_name;
		this.employee_id1 = employee_id1;
		this.date_of_birth = date_of_birth;
		this.street_address = street_address;
		this.city = city;
		this.state = state;
		this.adjusted_gross_income = adjusted_gross_income;
		this.withheld_income_tax = withheld_income_tax;
		this.tax_return = tax_return;
		this.employment_sect = employment_sect;
		this.filing_stat = filing_stat;
        }
} 
//most of this was copy and paste from the SPring files.
//Since the client and employee records are the only ones that change, they are only model files we NEED