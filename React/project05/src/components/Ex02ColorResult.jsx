import React from 'react'
import { useContext } from 'react'
import { ColorContext } from '../context/Ex02ColorContext'

const Ex02ColorResult = () => {
    const {choiceColor} = useContext(ColorContext)
    return (
        <div style={{
            width : '100px',
            height : '100px',
            backgroundColor : `${choiceColor}`}}></div>
    )
}

export default Ex02ColorResult