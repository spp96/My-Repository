import navbar from "../components/navbar.js";

document.getElementById("navbar").innerHTML = navbar();

import { append,getdata } from "./fetch.js";

let query = document.getElementById("query");

query.addEventListener("keypress", (e) => {
     if (e.keyCode === 13) {
       const url = `https://www.themealdb.com/api/json/v1/1/search.php?s=${query.value}`;
       document.getElementById("container-1").innerHTML = getdata(url);
       document.getElementById("container=1").innerHTML = append(data);
     }
   });