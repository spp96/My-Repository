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

    let response = await fetch(`https://masai-api-mocker.herokuapp.com/auth/register`, {
      method: `POST`,
      body: JSON.stringify(signup_data),
      headers: {
        "Content-Type": "application/json",
      },
    });

    let data = await response.json();
    console.log("data", data);

      document.getElementById("name").value = null
       document.getElementById("email").value = null
      document.getElementById("password").value = null
       document.getElementById("username").value = null
      document.getElementById("mobile").value = null
       document.getElementById("description").value = null
  };