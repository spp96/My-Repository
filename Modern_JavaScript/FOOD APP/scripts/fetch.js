
// let container = document.getElementById("container-1");
let append = (data) =>{
    let container = document.getElementById("container-1");
    container.innerHTML = "";
    data.forEach(({strMealThumb,strMeal,strInstructions}) => {
        let img = document.createElement("img");
        img.src = strMealThumb;
    
        let t = document.createElement("h3");
        t.innerText = strMeal;
    
        let p = document.createElement("p");
        p.innerText = strInstructions;
    
        let div = document.createElement("div");
        div.setAttribute = ("id","menu")
        div.append(img, t, p);
        container.append(div);
    });
}

let getdata = async(url) =>{
    let res = await fetch(url);
    let data = await res.json();
    console.log(data.meals)

    // return data;
    append(data.meals)
};

export {append,getdata};