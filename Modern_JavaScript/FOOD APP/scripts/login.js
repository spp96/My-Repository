import navbar from "../components/navbar.js";

document.getElementById("navbar").innerHTML = navbar();

let query = document.getElementById("query");
query.style.display = "none";

let loginarr = JSON.parse(localStorage.getItem("login")) || [];

let UserdatadataLs = JSON.parse(localStorage.getItem("users")) || [];

class user {
  constructor(email, password) {
    let flag = false;
    UserdatadataLs.forEach((el) => {
      if (el.email === email && el.password === password) {
        this.name = el.name;
        this.email = el.email;
        this.password = el.password;
        loginarr.push(this);
        localStorage.setItem("login", JSON.stringify(loginarr));
        alert("Login successful!");
        window.location.href = "index.html";
        flag = true;
      }
    });
    if (!flag){
        alert("Wrong credentials");
    }
  }
}


let form = document.querySelector("form");

let signform = (event) =>{
    event.preventDefault();
    let email=form.email.value;
  let password=form.password.value;

  let data = new user (email,password);

};


form.addEventListener("submit",signform);
