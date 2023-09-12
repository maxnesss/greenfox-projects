const height = 5;

for (let row = 1; row <= height; row++) {


    let rowStr = "";
    for (let element = 1; element <= row; element++) {
        rowStr += "*";
    }
    console.log(rowStr);
}