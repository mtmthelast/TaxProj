import {Link} from "react-router";
export const NavLink = ({linkObject}) => {
    const {linkDestination, linkName} = LinkObject;

    return (
        <Link to={ linkDestination}>{ linkName }</Link>
    );
}