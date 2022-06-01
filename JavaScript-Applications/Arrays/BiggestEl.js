function solve(nums) {
    const arr = [];
    for(let row of nums) {
           for(let col of row) {
arr.push(nums[row][col]);
           }
        }
        arr.sort((a, b) => a - b)
        console.log(arr.pop());
}

solve([[20, 50, 10],
    [8, 33, 145]])
solve([[3, 5, 7, 12],
    [-1, 4, 33, 2],
    [8, 3, 0, 4]])