import navbar from "../components/navbar.js"

// console.log(navbar())

document.getElementById("navbar").innerHTML = navbar();


let query = document.getElementById("query");
query.style.display = "none";


let loginarr = JSON.parse(localStorage.getItem("login")) || [];

let UserDetails = document.getElementById("UserDetails");

if (!loginarr) {
    UserDetails.innerHTML = null;
} else {
    loginarr.forEach((el) => {
    UserDetails.innerHTML = null;
    let img = document.createElement("img");
    img.src =
      "https://radiometropolitanaporto.pt/images/pngtree-user-vector-avatar-png-image_1541962.jpg";
    img.style.borderRadius = "100%";
    let name = document.createElement("h1");
    name.innerText = `Name: ${el.name}`;
    let email = document.createElement("h3");
    email.innerText = `Email ID: ${el.email}`;

    UserDetails.append(img, name, email);
  });
}