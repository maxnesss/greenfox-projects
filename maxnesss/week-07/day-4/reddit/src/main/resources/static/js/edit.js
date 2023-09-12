let form = document.forms[0];
form.addEventListener("submit", function (e){
    e.preventDefault();
    let title = document.querySelector("#title").value;
    let url = document.querySelector("#url").value;
    let id = parseInt(window.location.href.split("=")[1]);


    fetch("../posts/"+id,{
        method: "PUT",
        body: JSON.stringify(
            {
                title:title,
                url:url
            }
        ),
        headers:{
            'Content-type': 'application/json',
            'username':1
        }
    }).then(response => response.json())
        .then(data=>console.log(data))
        .catch(error => console.error('Error:', error));
})