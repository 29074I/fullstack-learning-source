import React from 'react'
import Ex01SubItem from './components/Ex01SubItem'
import Ex01SubItem2 from './components/Ex01SubItem2'
import { useState } from 'react'

const Ex01 = () => {


    const [inputTxt, setInputTxt] = useState("")

    const changeData = (e)=>{
        setInputTxt(e.target.value);
    }

    return (
        <div>
            <h1>컴포넌트끼리 값전달을 해보자!</h1>
            <h3>1. 상위 컴포넌트에서 하위 컴포넌트로</h3>
            {/* 상위 -> 하위로 데이터를 전송할 때
            props를 통해 간단하게 전송할 수 있다!
            */}
            <p>
                <input type='text' onChange={(e)=>{setInputTxt(e.target.value)}}/>
            </p>
            <Ex01SubItem text={inputTxt}/>

            <h3>2. 하위 컴포넌트에서 상위 컴포넌트로</h3>
            <p>넘어온 값 : {inputTxt}</p>
            <Ex01SubItem2 changeData={changeData}/>
        </div>

    )
}

export default Ex01