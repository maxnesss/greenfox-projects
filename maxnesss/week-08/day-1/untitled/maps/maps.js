

const ip = "213.151.64.182";
const key = "6032ae8a22c1eacb8aa8d5d7cc780a18";
fetch("http://api.ipapi.com/api/"+ip+"?access_key="+key).then(response => response.json()).then(data=>console.log(data));
