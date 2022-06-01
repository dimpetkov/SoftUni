function sumTable() {
    //select all data rows (exclude first and last)
    const rows = Array.from(document.querySelectorAll('tr')).slice(1, -1);
    let sum = 0;
    //for each row
    for (let row of rows) {
        const value = Number(row.lastElementChild.textContent);
        sum += value;
    }
    //--select last column
    //--add to sum
    //display sum in total row
    document.getElementById('sum').textContent = sum;

}