function getAge(inputString){
// return the girl's correct age as an integer. Happy coding :)
    return parseInt(inputString.split(' ')[0]);
}
function strCount(str, letter){
    let letterCount = 0;
    str.split('').forEach(element => {
        if(element === letter){
            letterCount++;
        }
    });
    return letterCount;
}

var humanYearsCatYearsDogYears = function(humanYears) {
    let catYears = 0;
    let dogYears = 0;
    if(humanYears === 1){
        catYears = 15;
        dogYears = 15;
    }
    else if(humanYears === 2){
        catYears = 24;
        dogYears = 24;
    }
    else{
        catYears = 24 + (humanYears - 2) * 4;
        dogYears = 24 + (humanYears - 2) * 5;
    }
    return [humanYears,catYears,dogYears];
}
function smash (words) {
    return words.join(' ');
}
const stringToNumber = function(str){

    return parseInt(str);

}
function spinWords(string){
    let words = string.split(' ');
    words.forEach((word,index) => {
        if(word.length >= 5){
            words[index] = word.split('').reverse().join('');
        }
    });
    return words.join(' ');
}
function getSleepHours(day){
    switch(day){
        case 'monday':
            return 8;
        case 'tuesday':
            return 8;
        case 'wednesday':
            return 8;
        case 'thursday':
            return 8;
        case 'friday':
            return 8;
        case 'saturday':
            return 8;
        case 'sunday':
            return 8;
    }
}
// Write your code below
bobsFollowers = ['a','b','c','d']
tinasFollowers = ['a','b', 'e']
mutualFollowers = []

for (let i; i<bobsFollowers.length;i++){
    for (let j; j<tinasFollowers.length;j++){
        if(bobsFollowers[i]===tinasFollowers[j]){
            mutualFollowers.push(bobsFollowers[i]);
        }
    }
}
