import { navbar } from "../Componant/navbar.js";

document.getElementById("navbar").innerHTML = navbar();

let getarr = JSON.parse(localStorage.getItem("addfood")) || [];


let getdata = async()=>{
    let url = `https://www.themealdb.com/api/json/v1/1/categories.php`
    let res = await fetch(url);
    let data = await res.json();
    append(data.categories);
    console.log(data);

}

getdata();

let append = (data) =>{
    let container = document.getElementById("food_box");
    container.innerHTML = null;

    data.forEach((el) => {
        let food_image = document.createElement("img");
        food_image.src = el.strCategoryThumb;

        let food_category = document.createElement("h3");
        food_category.innerText = el.strCategory;

        let add_to_cart = document.createElement("button");
        add_to_cart.innerText = "Add To Cart"
        add_to_cart.setAttribute("class","addtocart")
        add_to_cart.onclick = () =>{
            add_food(el);
        }

        let food_items = document.createElement("div");
        food_items.append(food_image,food_category,add_to_cart);

        container.append(food_items);
    });

}


let add_food = (el) =>{
    getarr.push(el)
    localStorage.setItem("addfood",JSON.stringify(getarr));
    // window.location.href = "cart.html"
}

