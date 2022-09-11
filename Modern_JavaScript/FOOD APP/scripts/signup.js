import navbar from "../components/navbar.js"

// console.log(navbar())

document.getElementById("navbar").innerHTML = navbar();

let query = document.getElementById("query");
query.style.display = "none";

let UserdatadataLs=JSON.parse(localStorage.getItem("users")) ||[];



class Userdata{
  constructor(name,email,password){
    this.name=name;
    this.email=email;
    this.password=password;
  }
}


let fill=(email)=>{
  let val=UserdatadataLs.filter((ele)=>{
    return ele.email==email;
  });

  if(val.length==0){
    return true;
  }else{
    return false;
  }
}




let form=document.querySelector("form");
let signUp=(event)=>{
  event.preventDefault();
  let name=form.name.value;
  let email=form.email.value;
  let password=form.password.value;
  if(fill(email)){
    let User=new Userdata(name,email,password);
    UserdatadataLs.push(User);
    localStorage.setItem("users",JSON.stringify(UserdatadataLs));
    alert("Signup Successfull")
    window.location.href = "login.html"
  }else{
    alert("User already exist")
  }
}

form.addEventListener("submit",signUp)