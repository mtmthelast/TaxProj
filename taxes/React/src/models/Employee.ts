export class Employee{

    id: number;
    first_name:string;
    last_name:string;
    employee_id:string;
    Administrator:boolean;

    constructor(id: number, first_name:string, last_name:string, employee_id:string, Administrator:boolean){
        this.id = id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.employee_id = employee_id;
        Administrator=Administrator;

    }

}