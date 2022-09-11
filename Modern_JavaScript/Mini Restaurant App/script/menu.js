import { navbar } from "../Componant/navbar.js";

document.getElementById("navbar").innerHTML = navbar();



let getdata = async()=>{
    let url = `https://thawing-taiga-91949.herokuapp.com/api/menu`
    let res = await fetch(url);
   res = await res.json();

//    console.log(res);
    getfood(res);

    showPage();

}

getdata();


let getfood = (data) =>{
    let container = document.getElementById("food_box");
    container.innerHTML = null;
data.forEach(({image,title,price,description,ratings,id}) => {


    let imgdiv = document.createElement("div");
    let titlediv = document.createElement("div");
    let food_image = document.createElement("img");
        food_image.src = image;
    
        let food_category = document.createElement("h3");
        food_category.innerText = title;

        let food_price = document.createElement("p");
        food_price.innerText = `Cost ₹:-${price}`;

        let food_desc = document.createElement("p");
        food_desc.innerText = description;

        let food_rating = document.createElement("p");
        food_rating.innerText = ratings;

        let remove_food = document.createElement("button");
        remove_food.innerText = "REMOVE"
        remove_food.setAttribute("class","remove")
        remove_food.onclick = () =>{
            remove_menu(id);
        }

        imgdiv.append(food_image)
        titlediv.append(food_category,food_desc,food_price,remove_food)
        let food_items = document.createElement("div");
        food_items.setAttribute("class","items")
            food_items.append(imgdiv,titlediv,ratings);

            
    
            container.append(food_items);
});
}


let remove_menu = async(id) =>{

    let res = await fetch(`https://thawing-taiga-91949.herokuapp.com/api/menu/${id}`,{

    method:"DELETE",
    headers: {
        "Content-Type": "application/json",
    }
    });

    res = await res.json();
    // console.log(res);

    getdata();
}

document.getElementById("sortinglh").onclick = () =>{
    sortLH();
}
document.getElementById("sortinghl").onclick = () =>{
    sortHL();
}
document.getElementById("filter_rating").onchange = () =>{
    filter();
}


let sortLH = async() =>{
    let res = await fetch(`https://thawing-taiga-91949.herokuapp.com/api/menu?_sort=price&_order=asc`);
  
    res = await res.json();
  
    getfood(res);
  }
  let sortHL = async() =>{
    let res = await fetch(`https://thawing-taiga-91949.herokuapp.com/api/menu?_sort=price&_order=desc`);
  
    res = await res.json();
    // console.log(res);
  
    getfood(res);
  }
  let filter =  async() =>{
  
    let value = document.getElementById("filter_rating").value;
  
    let res = await fetch(`https://thawing-taiga-91949.herokuapp.com/api/menu?ratings=${value}`);
  
    res = await res.json();
    getfood(res)
  }

  let showPage = () =>{
    let nbrs = document.getElementById("btns");
    nbrs.innerHTML = "";
  
    for (let i=0;i<=5;i++){
      let newBtn = document.createElement("button");
      newBtn.innerText = i+1;
      newBtn.setAttribute("id",`${i}`);
      newBtn.onclick = shownewpage;
  
      nbrs.append(newBtn);
    }
  }
  
   async function shownewpage(){
  let id = Number (this.id)+1;
  
  let res = await fetch(`https://thawing-taiga-91949.herokuapp.com/api/menu?_page=${id}&_limit=5`);
  res = await res.json();
  
  getfood(res)
  }
  
  getdata();