function findDifference(a, b) {
    let sumA = a.reduce((a, b) => a * b, 0);
    let sumB = b.reduce((a, b) => a * b, 0);
    return Math.abs(sumA - sumB);

}
function