

function populate() {
    let post = document.querySelector(".post");
    let posts = document.querySelector(".posts");
    fetch("/posts/").then(response => response.json()).then(data => data.posts.forEach(el => {
        let newPost = post.cloneNode(true);
        let title = newPost.querySelector(".title");
        let url = newPost.querySelector(".url");
        let removeBtn = newPost.querySelector("#remove");
        let id = el.id;
        let editbtn= newPost.querySelector("#edit");
        let upbtn=newPost.querySelector("#upvote");
        let downbtn=newPost.querySelector("#downvote");


        let score = newPost.querySelector("#score");
        removeBtn.addEventListener("click",function (e){
            fetch("/posts/"+id,{
                method:"DELETE",
                headers:{
                    'Content-type': 'application/json',
                    'username':1
                }
            })
        })
        upbtn.addEventListener("click", async () => {
            await fetch("/posts/" + id + "/upvote", {
                method: "PUT",
                headers: {
                    'Content-type': 'application/json',
                    'username': 1
                }
            })
        })
        downbtn.addEventListener("click", ()=>{
            fetch("/posts/"+id+"/downvote",{
                method:"PUT",
                headers:{
                    'Content-type': 'application/json',
                    'username':1
                }
            })
        })
        editbtn.setAttribute("href","edit.html?id="+id);

        score.textContent = el.score;
        title.textContent = el.title;
        url.textContent = el.url;

        newPost.setAttribute("id",id);
        posts.appendChild(newPost);
        newPost.classList.remove("hidden");
        console.log(el);
    }));
}
const addBtn = document.querySelector(".button");
const titleBtn = document.querySelector("h1 a")
let username = window.location.href.split("=")[1];
addBtn.addEventListener("click",()=>{
    location.href="new-post/index.html?username="+username;
})
titleBtn.addEventListener("click",()=>{
    location.href="index.html?username="+username;
})
const logLink = document.querySelector("#login-link");
logLink.textContent = "LOGIN";

if (window.location.href.includes("=")){
    let usName = window.location.href.split("=")[1];
    logLink.textContent= usName;
}


let id = parseInt(window.location.href.split("=")[1]);


populate();