import axios from 'axios';
import { useState } from 'react';
import { Employee } from '../models/Employee.ts';
import React from 'react';

export const Employees = () => {
    const [employees, setEmployees] = useState([]);

    const getFullStaff = async () => {
        await axios.get('http://localhost:8080/employee')
                   .then(response => {
                        setEmployees(response.data.map((employee: any) => {
                            return {
                                employee: new Employee(employee.id, employee.first_name, employee.last_name, employee.employee_id, employee.Administrator)
                        }}));
    })

}

return(
    <main>
        <h1>Bios</h1>

        <button onClick={ () => getFullStaff() }>GET ALL</button>

        <table>
            <thead>
                <tr>
                    <th>Employee ID</th>
                    <th>First Name</th>
                    <th>Lastname</th>
                    <th>Administration Status</th>
                </tr>
            </thead>
            <tbody>
                {
                    employees.map((employee: any) => {
                        return (
                            <tr key={ employee.employee.employee_id }>
                                <td>{ employee.employee.first_name}</td>
                                <td>{ employee.employee.last_name }</td>
                                <td>{ employee.employee.Administrator }</td>
                            </tr>
                        )
                    })
                }
            </tbody>
        </table>
    </main>
)
}


