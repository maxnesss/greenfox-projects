'use strict';

const mapWith = (array, callback) => {
    let output = [];
    for (let number of array) {
        if (callback(number)){
            output.push(callback(number));
        }
    }


    return output;
}

const addOne = (number) => {
    return number + 1;
}

// Exercise 1:

console.log(mapWith([1, 2, 3], addOne));
//expected result: [2, 3, 4]

// Exercise 2:

// Create a callback function which removes every second character from a string

const words = ['map', 'reduce', 'filter'];

const removeSecondLetter = (word) => {
    return word.split('').filter((c, i) => (i + 1) % 2 !== 0).join('');
}

console.log(mapWith(words, removeSecondLetter));

// expected result: ['mp','rdc', 'fle']