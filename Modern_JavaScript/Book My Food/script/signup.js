import { navbar } from "../Componant/navbar.js";

document.getElementById("navbar").innerHTML = navbar();

let submit_btn = document.getElementById("sub_signup");
submit_btn.onclick = (event) =>{
    Register(event);
}


let Register = async (e) => {
    e.preventDefault();
    let signup_data = {
      name: document.getElementById("name").value,
      email: document.getElementById("email").value,
      password: document.getElementById("password").value,
      username: document.getElementById("username").value,
      mobile: document.getElementById("mobile").value,
      description: document.getElementById("description").value,
    };
    signup_data = JSON.stringify(signup_data);

    let signup_api_link = `https://masai-api-mocker.herokuapp.com/auth/register`;

    let response = await fetch(signup_api_link, {
      method: `POST`,
      body: signup_data,
      headers: {
        "Content-Type": "application/json",
      },
    });

    let data = await response.json();
    console.log("data", data);

    if (data.error === false){
      alert("Signup Successful");
      window.location.href = "login.html"
    } else {
      alert("User already exist")
    }

      document.getElementById("name").value = null
       document.getElementById("email").value = null
      document.getElementById("password").value = null
       document.getElementById("username").value = null
      document.getElementById("mobile").value = null
       document.getElementById("description").value = null
  };