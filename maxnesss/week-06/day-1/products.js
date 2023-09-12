let products = {
"Eggs":200,
"Milk":200,
"Fish":400,
"Apples":150,
"Bread"	:50,
"Chicken":550
}
// How much is the fish?
console.log(products.Fish);
// What is the most expensive product?
let expensiveProductPrice = 0;
let expensiveProductName = "";
for (const key in products) {
    if (products[key]>expensiveProductPrice){
        expensiveProductPrice = products[key];
        expensiveProductName = key;
    }
}
console.log(expensiveProductName);

// What is the average price?
let sum = 0;
let index = 0;
for (const key in products) {
    sum += products[key];
    index++;
}
console.log(sum/index);
// How many products' price is below 300?
let numberOfProductsBellow300 = 0;
for (const key in products) {
    if (products[key]<300){
        numberOfProductsBellow300++;
    }
}
console.log(numberOfProductsBellow300);
// Is there anything we can buy for exactly 125?
let productFor125 = "no";
for (const key in products) {
    if(products[key] === 125) {
        productFor125 = "yes";
    }
}
console.log(productFor125);
// What is the cheapest product?
let cheapestProductPrice = products.Apples;
let cheapestProductName = "";
for (const key in products) {
    if (products[key]<cheapestProductPrice){
        cheapestProductPrice = products[key];
        cheapestProductName = key;
    }
}
console.log(cheapestProductName);
