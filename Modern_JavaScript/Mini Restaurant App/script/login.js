import { navbar } from "../Componant/navbar.js";

document.getElementById("navbar").innerHTML = navbar();

let loginsubmit_btn = document.getElementById("sub_login");
loginsubmit_btn.onclick = (event) =>{
    Login(event);
}

let Login = async (e) => {
    e.preventDefault();
    let login_data = {
      username: document.getElementById("l_username").value,
      password: document.getElementById("l_password").value,
    };

    let user = login_data.username;

    login_data = JSON.stringify(login_data);

    let response = await fetch(`https://masai-api-mocker.herokuapp.com/auth/login`, {
      method: `POST`,
      body: login_data,
      headers: {
        "Content-Type": "application/json",
      },
    });
    let data = await response.json();
    saveuser(user,data.token,80000);
   
    console.log(response);
    console.log("data", data);

    

    // let login_arr = JSON.parse(localStorage.getItem("logindata")) || [];

    // login_arr.push(data);

    // localStorage.setItem("logindata",JSON.stringify(login_arr))

     document.getElementById("l_username").value = null
     document.getElementById("l_password").value = null
  };


  

  let saveuser = (username,token,time) =>{

    let user = {
      username,
      token
    }
    localStorage.setItem("user_details",JSON.stringify(user));


    setTimeout(()=>{
        localStorage.setItem("user_details",JSON.stringify(null));
    },time)
}