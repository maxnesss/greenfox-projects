const logLink = document.querySelector("#login-link");
const titleBtn = document.querySelector("h1 a")

titleBtn.addEventListener("click", () => {
    location.href = "../index.html?username=";
})


let usName = window.location.href.split("=")[1];
if (window.location.href.includes("=")) {
    logLink.textContent = usName;

}
if (usName === undefined) {
    logLink.textContent = "LOGIN";
}

let form = document.forms[0];
form.addEventListener("submit", function (e) {
        e.preventDefault();
        let title = document.querySelector("#title").value;
        let url = document.querySelector("#url").value;
        location.href = "../index.html?username=" + usName;

        fetch("../posts/", {
            method: "POST",
            body: JSON.stringify(
                {
                    title: title,
                    url: url
                }
            ),
            headers: {
                'Content-type': 'application/json',
                'username': 1
            }
        }).then(response => response.json())
            .then(data => console.log(data))
            .catch(error => console.error('Error:', error));
    }
)