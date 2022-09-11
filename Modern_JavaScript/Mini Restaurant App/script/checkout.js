import { navbar } from "../Componant/navbar.js";

document.getElementById("navbar").innerHTML = navbar();

let loginsubmit_btn = document.getElementById("sub_checkout");
loginsubmit_btn.onclick = (event) =>{
  checkOut(event);
}



function checkOut(e) {
  e.preventDefault();
    let name  = document.getElementById("name").value;
    let mobile = document.getElementById("tel").value;
    let add = document.getElementById("address").value;  
   if(!name && !add){
       alert('For checkout Submit Your Details');
      return;
  }
      let login_arr = JSON.parse(localStorage.getItem('logindata'));
      if(!login_arr){
        alert('Please Log in To Continue')
        window.location.href= "./login.html"
      }
      login_arr.forEach(el =>{
      if(el.error === false){
        alert('Checkout Successful')
      }else{
        alert('Please Log in First')
        window.location.href= "./login.html"
      }
    })
     document.getElementById("name").value = null;
     document.getElementById("tel").value = null;
     document.getElementById("address").value = null;


  }


