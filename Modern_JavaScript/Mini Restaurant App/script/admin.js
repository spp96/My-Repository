import { navbar } from "../Componant/navbar.js";

document.getElementById("navbar").innerHTML = navbar();


document.getElementById("submit_menu").onclick = () =>{
    submitmenu();
}


let admin = {name:"Shubham",
email:"shubham@gmail.com"
}
let submitmenu = async () =>{

    let user_details = JSON.parse(localStorage.getItem("user_details"));
    if (!user_details){
        alert("Log In again");
        window.location.href = "login.html"
    }

    let user = await getprofile(user_details.username,user_details.token);

    if(user.email !== admin.email){
        alert("Not Authorised");
        return;
    }
    // console.log(user);
    let item = {
        id:Date.now(),
        title:document.getElementById("title").value,
        image:document.getElementById("image").value,
        price:+document.getElementById("price").value,
        ratings:+document.getElementById("rating").value,
        description:document.getElementById("description").value,
    };

    let res = await fetch(`https://thawing-taiga-91949.herokuapp.com/api/menu`,{
        method:"POST",
        body:JSON.stringify(item),
        headers: {
            "Content-Type": "application/json",
        }
    })

    res = await res.json();
    // console.log(res);
};


let getprofile = async (username,token) =>{
let res = await fetch(`https://masai-api-mocker.herokuapp.com/user/${username}`,{
  headers: {
    Authorization: `Bearer ${token}`
  }
}
);

res= await res.json();

return res;
// console.log(res);
}