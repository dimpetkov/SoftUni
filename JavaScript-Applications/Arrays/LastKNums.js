function arr(n, k) {
    const myArr = [];
    myArr.push(1);
    for (let i = 1; i < n; i++) {
        let number = 0;
        let start = 0;
        if (myArr.length < k) {
            start = 0;
        } else {
            start = myArr.length - k;
        }
        for(let  j = start; j < myArr.length; j++) {
            number += myArr[j];
        }
        myArr.push(number);
    }
    return myArr;
}
arr(6, 3)
arr(8, 2)