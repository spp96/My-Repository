// write code here, dont change anything in HTML and css files 
// refer to id's mentioned in html files carefully
// Follow the exact column order for tables,for eg: name should be filled under "name" column 
// we are using form here, make sure you are using "submit" eventListener , or else you will get 0 marks

document.querySelector("form").addEventListener("submit",myFunction);


function myFunction(event){
    let formTag=document.querySelector("form");
    event.preventDefault();
    let image = formTag.image="https://cdn.pixabay.com/photo/2015/03/04/22/35/head-659652__340.png";
    let name = formTag.name.value;
    let batch = formTag.batch.value;
    let dsa = formTag.dsa.value;
    let skillathon = formTag.cs.value;
    let coding = formTag.coding.value;
   
    let tr = document.createElement("tr");

    let td1 = document.createElement("td");
    let pic = document.createElement("img");
    pic.setAttribute("src",image)
    td1.append(pic);

    let td2 = document.createElement("td");
    td2.innerText=name;
    let td3 = document.createElement("td");
    td3.innerText=batch;
    let td4 = document.createElement("td");
    td4.innerText=dsa
    let td5 = document.createElement("td");
    td5.innerText=skillathon;
    let td6 = document.createElement("td");
    td6.innerText=coding;
    let td7 = document.createElement("td");
    let obtained_score =(+dsa)+(+skillathon)+(+coding);
    let percentage = ((obtained_score/30)*100);
    td7.innerText = percentage.toFixed(3);
    let td8 = document.createElement("td");
    if(percentage >50){
       td8.style.backgroundColor="green";
        td8.style.color="white";
        td8.innerText="Regular";
   }else{
        td8.style.backgroundColor="red";
        td8.style.color="white";
        td8.innerText="Async";
   }
    let td9 = document.createElement("td");
    td9.innerText="DELETE";
    td9.style="background-color:red;color:white;cursor:pointer;"
    td9.addEventListener("click",dltrow);
    
    tr.append(td1,td2,td3,td4,td5,td6,td7,td8,td9);
    document.querySelector("tbody").append(tr);
}

function dltrow(event){
    event.target.parentNode.remove();
}
    








    


    