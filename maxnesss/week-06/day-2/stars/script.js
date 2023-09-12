



const world = document.querySelector(".world");

for (let index = 0; index < 10; index++) {
    let star = document.createElement("div");
    star.classList.add("star");
    star.style.left = Math.floor(Math.random() * 100)+"%";
    star.style.top = Math.floor(Math.random() * 100)+"%";

    world.appendChild(star);

}

world.addEventListener ("click",function(event){ 
    let star = document.createElement("div");
    star.classList.add("star");
    let cursorX = event.clientX;
    let cursorY = event.clientY;
    star.style.left = cursorX+"px";
    star.style.top = cursorY+"px";

    world.appendChild(star);
}
);

function removeStar() {
    let starList = document.querySelectorAll(".star");
    let randN = Math.floor(Math.random() * starList.length-1);


    starList[randN].classList.add("fallen");

}

function randNumber() {
    return Math.floor(Math.random() * 10000) +3000;
}


setTimeout = setInterval(removeStar, randNumber());    

let tree = document.querySelector(".tree");
tree.addEventListener("click",function(){
    tree.setAttribute("width","200px");

})




