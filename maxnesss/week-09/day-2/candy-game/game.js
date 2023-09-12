// - Gather 10.000 candies!
// - Clicking the ‘Create candies’ button gives you 1 candy.
// - You can buy a lollipop for 100 candies by clicking the ‘Buy lollipop’ button.
// - 10 lollipops generate 1 candy per second.
//   - Use the 🍭 emoji to display the lollipops you have
// - Display the candy production rate in the `Candies / Second` row
// - If you press the "make candy rain" button, the candy generation should speed up 10x

const candyBtn = document.querySelector(".create-candies");
const loliBtn= document.querySelector(".buy-lollypops");
const stats = document.querySelector(".stats");
const rainBtn = document.querySelector(".candy-machine")

const candiesNo= document.querySelector(".candies");
const lolipops = document.querySelector(".lollypops");
const speed = document.querySelector(".speed")

candyBtn.addEventListener("click", ()=>{
    let noCandies= parseInt(candiesNo.textContent);
    candiesNo.textContent = noCandies +1;
})
loliBtn.addEventListener("click",() =>{
    if (parseInt(candiesNo.textContent)>=100){
        lolipops.textContent += "🍭";
        let noCandies= parseInt(candiesNo.textContent);
        candiesNo.textContent = noCandies -100;
    }
})
let multiplier = 1;
rainBtn.addEventListener("click",()=>{
    if(multiplier === 1) {
        multiplier = 10;
    } else {
        multiplier =1;
    }

})
setInterval(()=>{
    let nololies = lolipops.textContent.split("").length;
    console.log(nololies);
    let noCandies= parseInt(candiesNo.textContent);
    let newNo = noCandies+(nololies*5*multiplier);
    console.log(newNo);
    candiesNo.textContent = newNo;
    speed.textContent = nololies *5;

},1000)


