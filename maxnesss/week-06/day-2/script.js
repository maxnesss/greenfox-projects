const container = document.getElementById("container");
const btn = document.getElementById("show-more");

btn.onclick = function() {
    if (container.className == "open") {
        container.className = "";

    } else {
        container.setAttribute("class", "open");
        btn.innerText = "show less";
    }
}