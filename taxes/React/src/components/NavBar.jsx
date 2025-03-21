import { NavLink } from "./NavLink";

export const NavBar = () =>{
    const links =[

    {linkName: "Employee", linkDestination: "/employees"},
    {linkName: "Employment Sector", linkDestination: "/employment_sector"},
    {linkName: "Filing Status", linkDestination: "/filing_status"},
    {linkName: "Clients", linkDestination: "/clients"}

    ]

    return (
        <nav>

            
                { links.map(link => {

                        return(<NavLink linkObject={link} key={link.linkName}/>);
                })}
            

        </nav>
    )
}