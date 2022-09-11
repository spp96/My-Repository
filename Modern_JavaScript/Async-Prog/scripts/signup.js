
// // function for home page redirection
function home() {
    window.location.href = 'index.html'
}




let form = document.querySelector("#signup-form-div");
document.querySelector('#submit').addEventListener("click", submit);
let userdata = JSON.parse(localStorage.getItem("userdata")) || [];


function submit(event) {
    event.preventDefault();

  
        let name = document.querySelector("#name").value;
        let contact = document.querySelector("#contact").value;
        let email =  document.querySelector("#email").value;
       let  pass =  document.querySelector("#pass").value;


       let objSingup = new data(name,contact,email,pass);

   

    if (checkemail(objSingup.email) === true) {
        userdata.push(objSingup);
        localStorage.setItem("userdata", JSON.stringify(userdata));
        alert("Succussefuly Signup You Can Login")
        window.location.href = "login.html"
    } else {
        alert("account already exixt");
    }
}

function data(n,c,e,p){
    this.name = n
    this.contact  = c
    this.email = e
    this.pass = p
}



function checkemail(email) {
    let filter = userdata.filter(function (ele) {
        return email == ele.email;

    })
    if (filter.length > 0) {
        return false;
    } else {
        return true;
    }
}