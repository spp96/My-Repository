// GET
// base url `http://localhost:3000/api/todo`
// end point :- /todo (room)

window.addEventListener("load", () => {
    getdata();
})
let getdata = async () =>{

    let res = await fetch(`https://thawing-taiga-91949.herokuapp.com/api/todo`);
    let data = await res.json();

    rendemDom(data);

    console.log(data);

}

let rendemDom = (data) =>{

    let container = document.getElementById("container");
    container.innerHTML = null;

    data.forEach(({title,id,status}) => {

        let t = document.createElement("h3");
        t.innerText = title;

        let t_id = document.createElement("h4");
        t_id.innerText = id;

        let t_status = document.createElement("h4");
        t_status.innerText = status;

        let t_button = document.createElement("input");
        t_button.setAttribute("type","checkbox")
        t_button.onclick = () =>{
            toggleTodo(id);
        }

        let remove_button = document.createElement("button");
        remove_button.innerText = "Remove"
        remove_button.setAttribute("class","remove")

        remove_button.onclick = () =>{
            deleteTodo(id);
        }

        let div1 = document.createElement("div");
        div1.append(t_button,t,)

        let div = document.createElement("div");
        div.append(div1,remove_button);

        container.append(div);       
    });
}


let addTodo = async() =>{
    let todo = document.getElementById("todo").value;

    let tdata = {
        title:todo,
        status:false,
        id: Date.now(),
    }

    let res = await fetch(`https://thawing-taiga-91949.herokuapp.com/api/todo`,{
        method: "POST",
        body:JSON.stringify(tdata),
        headers: {
            "Content-Type": "application/json",
        },

    });

    document.getElementById("todo").value = null
    getdata();

    res = await res.json();

    console.log(res);
}

let toggleTodo = async (id) =>{

    let todo = await fetch(`https://thawing-taiga-91949.herokuapp.com/api/todo/${id}`);
    todo = await todo.json();

    let pdata = {status: !todo.status};

    let res = await fetch(`https://thawing-taiga-91949.herokuapp.com/api/todo/${id}`,{
        method:"PATCH",
        body:JSON.stringify(pdata),
        headers: {
            "Content-Type": "application/json",
        }

    })

    getdata();

    res = await res.json();

    getFromLS(res);
    doneTaskList();

    console.log(res);
}

let getFromLS = (data) =>{
    let LSarr = JSON.parse(localStorage.getItem("completedtask")) || [];

    LSarr.push(data);

    localStorage.setItem("completedtask",JSON.stringify(LSarr));

    return
}


let deleteTodo = async(id) =>{
    let res = await fetch(`https://thawing-taiga-91949.herokuapp.com/api/todo/${id}`,{
        method:"DELETE",
        headers: {
            "Content-Type": "application/json",
        }
    })
    getdata();

    res = await res.json();

    doneTaskList();

    console.log(res);
}

let doneTaskList = () =>{
    let completed_Task = document.getElementById("Completed");
    completed_Task.innerHTML = null;

    let LSarr = JSON.parse(localStorage.getItem("completedtask")) || [];

    LSarr.forEach(({title}) => {
        let t_button = document.createElement("input");
        t_button.setAttribute("type","checkbox")

        let t = document.createElement("h3");
        t.innerText = title;

        let remove_button = document.createElement("button");
        remove_button.innerText = "Remove"
        remove_button.setAttribute("class","remove")


        let div1 = document.createElement("div");
        div1.append(t_button,t,)

        let div = document.createElement("div");
        div.append(div1,remove_button);

        completed_Task.append(div);   
    })
}

doneTaskList();

