import { createContext, useState } from "react";
import { Header } from "../components/Header.tsx";
import { Outlet } from 'react-router';

export const LastMinuteContext = createContext();

export const Frame = () => {

    const [ last, setlast ] = useState('');

    return (
        <>
            <LastMinuteContext.Provider value={[last, setlast]}>

                <header/>
                <Outlet/>
            </LastMinuteContext.Provider>

        </>
    )
}