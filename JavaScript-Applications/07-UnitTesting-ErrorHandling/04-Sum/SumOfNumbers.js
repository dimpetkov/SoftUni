function sum(arr) {
    let sum = 0;
    for (let num of arr) {
        sum += Number(num);
    }
    console.log(sum)
    return sum;
}
sum([1, 2, NaN])
module.exports = {sum};



// function test(name, actual, expected) {
//     if (Number.isNaN(expected) && Number.isNaN(actual)) {
//         console.log(name, 'Pass');
//     } else if (actual.tiFFixed(2) == expected.toFixed(2)) {
// console.log(name, 'Pass');
//     } else {
//         console.log(name, 'Failed')
//     }
// }