async function fillData() {
        let messages = document.querySelector(".messages");//
    messages.innerHTML = "";

    await fetch("/api/message").then(promise => promise.json()).then(data => data.forEach(el => {

        let message = document.createElement("div");
        let userDiv = document.createElement("div");
        let textDiv = document.createElement("div");
        let infoDiv = document.createElement("div");

        let userText = document.createElement("p");
        userText.classList.add("user-text");
        let messageText = document.createElement("p");
        messageText.classList.add("text-text");
        let infoText = document.createElement("p");
        infoText.classList.add("info-text");

        messages.classList.add("messages")
        message.classList.add("message");
        userDiv.classList.add("user");
        textDiv.classList.add("text");
        infoDiv.classList.add("info");

        userText.textContent = el.username;
        messageText.textContent = el.text;
        infoText.textContent = "Sent 10:42 by 192.164.1.211"
        userDiv.appendChild(userText);
        textDiv.appendChild(messageText);
        infoDiv.appendChild(infoText);
        message.appendChild(userDiv);
        message.appendChild(textDiv);
        message.appendChild(infoDiv);
        messages.prepend(message);
    }));
}

setInterval(fillData,3000);

// fillData();
let form = document.forms[0];
let input = document.querySelector("#message");
form.addEventListener("submit", ev => {
    ev.preventDefault();

    fetch("/api/message/receive", {
        method: "POST",
        headers: {
            'Content-type': 'application/json',
        },
        body: JSON.stringify(
            {
                "message": {
                    "username": "Max",
                    "text": input.value
                },
                "client": {
                    "id": "Max"
                }
            }
        )
    })
    location.href = "/";



})

