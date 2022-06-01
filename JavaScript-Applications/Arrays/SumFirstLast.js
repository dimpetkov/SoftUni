function firsatSumLast(numsAsStrings) {
    // let first = numsAsStrings.shift(); //will empty the array if has only one element
    let first = [...numsAsStrings].shift(); //will copy the array, and will prevent for error if has one element
    let last = [...numsAsStrings].pop();

    const result = Number(first) + Number(last);

    console.log(result);
}
firsatSumLast(['20', '30', '40'])
firsatSumLast(['5', '10'])