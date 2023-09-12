function createMatrix(size) {
  let matrix = [];
  for (let row = 0; row < size; row++) {
    matrix[row] = [];
    for (let element = 0; element < size; element++) {
      if (row === element) {
        matrix[row][element] = 1;
      } else {
        matrix[row][element] = 0;
      }
    }
  }
  return matrix;
}

function printMatrix(matrix) {
  for (let row = 0; row < matrix.length; row++) {
    let line = "";
    for (let element = 0; element < matrix.length; element++) {
      line += "" + matrix[row][element] + " ";
    }
    console.log(line);
  }
}

const matrix123 = createMatrix(20);

printMatrix(matrix123);
