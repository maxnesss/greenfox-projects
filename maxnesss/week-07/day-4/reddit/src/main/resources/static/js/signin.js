document.forms[0].addEventListener("submit",function (e){
    e.preventDefault();
    let username = document.querySelector("#username").value;

    let sub = document.querySelector("button");

    location.href="index.html?username="+username;

})
