import { navbar } from "../Componant/navbar.js";

document.getElementById("navbar").innerHTML = navbar();

let loginsubmit_btn = document.getElementById("sub_login");
loginsubmit_btn.onclick = (event) => {
  Login(event);
};

let Login = async (e) => {
  e.preventDefault();
  let login_data = {
    username: document.getElementById("l_username").value,
    password: document.getElementById("l_password").value,
  };

  login_data = JSON.stringify(login_data);

  let login_api_link = `https://masai-api-mocker.herokuapp.com/auth/login`;

  let response = await fetch(login_api_link, {
    method: `POST`,
    body: login_data,
    headers: {
      "Content-Type": "application/json",
    },
  });
  let data = await response.json();

  if (data.error === false) {
    alert("Login Successful");

    let login_arr = JSON.parse(localStorage.getItem("logindata")) || [];

    login_arr.push(data);

    localStorage.setItem("logindata", JSON.stringify(login_arr));

    console.log("data", data);
  } else {
    alert("Wrong Credential");
  }

  document.getElementById("l_username").value = null;
  document.getElementById("l_password").value = null;
};
