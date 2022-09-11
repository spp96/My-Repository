import { navbar } from "../Componant/navbar.js";

document.getElementById("navbar").innerHTML = navbar();


let getarr = JSON.parse(localStorage.getItem("addfood"));


let getfood = (getarr) =>{
    let container = document.getElementById("food_box");
    container.innerHTML = null;
getarr.forEach((el,index) => {
    let food_image = document.createElement("img");
        food_image.src = el.strCategoryThumb;
    
        let food_category = document.createElement("h3");
        food_category.innerText = el.strCategory;

        let remove_food = document.createElement("button");
        remove_food.innerText = "REMOVE"
        remove_food.setAttribute("class","addtocart")
        remove_food.addEventListener("click",function(){
            remove_foodLS(getarr,index);

        })
    
        let food_items = document.createElement("div");
            food_items.append(food_image,food_category,remove_food);
    
            container.append(food_items);
});
}
getfood(getarr);


let remove_foodLS = (getarr,index) =>{
    getarr.splice(index,1);

    localStorage.setItem("addfood",JSON.stringify(getarr));

    getfood(getarr);
}
