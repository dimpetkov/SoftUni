function solve(matrix) {
    let isMagical = true;

    for(let index = 0; index < matrix.length - 1; index++) {
        let sumRowONe = matrix[index].reduce((a, b) => a + b, 0);
        let sumRowTwo = matrix[index + 1].reduce((a, b) => a + b, 0);
        let sumColOne = 0;
        let sumColTwo = 0;

        for(let j = 0; j < matrix.length; j++) {
            sumColOne += matrix[index][j];
            sumColTwo += matrix[index + 1][j];
        }

        if(sumRowONe !== sumRowTwo || sumColOne !== sumColTwo) {
            isMagical = false;
        }
    }
    return isMagical;
}
solve([[4, 5, 6],
    [6, 5, 4],
    [5, 5, 5]]
   );
   solve([[11, 32, 45],
    [21, 0, 1],
    [21, 1, 1]]
   );