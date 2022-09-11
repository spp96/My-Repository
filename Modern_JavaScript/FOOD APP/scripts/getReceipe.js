import navbar from "../components/navbar.js"

document.getElementById("navbar").innerHTML = navbar();

import { getdata,append } from "./fetch.js";


const url = `https://www.themealdb.com/api/json/v1/1/random.php`;

getdata(url).then((res)=>{
   // console.log(res);
   append(res,container-1);
})

getdata();
