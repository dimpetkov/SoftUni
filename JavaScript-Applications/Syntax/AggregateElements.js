function data(input) {
let arr = input.map(Number);
let sum = 0;
let sumAggr = 0;

for (let i = 0; i < arr.length; i++) {
    let num = arr[i];
    sum += num;
    sumAggr += 1 / num;
}
console.log(sum);
console.log(sumAggr);
console.log(arr.join(''));
}
data([1, 2, 3]);