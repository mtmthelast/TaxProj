import axios from 'axios';
import { useState } from 'react';
import { Client } from '../models/Client.ts';
import React from 'react';
import client from 'react-dom/client';

export const Clientss = () => {
    const [clients, setClients] = useState([]);

    const getAllClients = async () => {
        await axios.get('http://localhost:8080/employee')
                   .then(response => {
                        setClients(response.data.map((employee: any) => {
                            return {
                                client: new Client(clients.social_security_number, clients.first_name, clients.last_name, clients.employee_id1, clients.date_of_birth,clients.street_address, clients.city, clients.state, clients.adjusted_gross_income, clients.withheld_income_tax,clients.tax_return, clients.employment_sect, clients.filing_stat)
                        }}));
    })

}

return(
    <main>
        <h1>Bios</h1>

        <button onClick={ () => getAllClients() }>GET ALL</button>

        <table>
            <thead>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Filing Status</th>
                    <th>Assigned Associate</th>
                </tr>
            </thead>
            <tbody>
                {
                    employees.map((employee: any) => {
                        return (
                            <tr key={ clients.client.social_security_number }>
                                <td>{ clients.client.first_name}</td>
                                <td>{ clients.client.last_name }</td>
                                <td>{ clients.client.filing_stat}</td>
                                <td>{ clients.client.employee_id1}</td>
                            </tr>
                        )
                    })
                }
            </tbody>
        </table>
    </main>
)
}


