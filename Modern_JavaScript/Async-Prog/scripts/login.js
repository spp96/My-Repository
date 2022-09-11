

let form = document.querySelector("#submit");
let userdata = JSON.parse(localStorage.getItem("userdata"))
form.addEventListener("click", function(event){
    event.preventDefault();

    let data = {
        email:document.getElementById("email").value,
        pass:document.getElementById("pass").value
    }

    if (checksignin(data.email,data.pass)===true){
        localStorage.setItem("signin",JSON.stringify(data));
        alert("Sign in Successful");
        window.location.href = "index.html";
    } else{
        alert("invalid Credintial");
        window.location.href = "signup.html";
    }
});





function checksignin(email,pass){
    let filter = userdata.filter(function(el){
        return el.email === email && el.pass === pass;
    })
    if (filter.length>0){
        return true;
    } else {
        return false;
    }
}








