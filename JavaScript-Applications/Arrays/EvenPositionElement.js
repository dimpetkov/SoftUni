// function evenPosition(input) {
//     let result = '';

//     for(let i = 0; i < input.length; i++) {
//         if (i % 2 == 0){
//         result += input[i];
//         result += ' ';
//         }
//     }
//     console.log(result);
// }
function evenPosition(input) {
    let result = [];

    for(let i = 0; i < input.length; i+=2) {
        result[result.length] = input[i];
    }
    console.log(result.join(' '));
}
evenPosition(['20', '30', '40', '50', '60'])
evenPosition(['5', '10'])