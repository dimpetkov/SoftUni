function cooking(num, op1, op2, op3, op4, op5) {
    num = Number(num);
  
    const arr = [op1, op2, op3, op4, op5];
    let result = num;

    for(let i = 0; i < arr.length; i++) {
        switch (arr[i]) {
            case "chop":
                result = result / 2;
                break;
            case "dice":
                result = Math.sqrt(result);
                break;
            case "spice":
                result += 1;
                break;
            case "bake":
                result = result * 3;
                break;
            case "fillet":
                result *= 0.8;
                break;
        }
        console.log(Number(result.toFixed(1)));
    }
}
cooking('9', 'dice', 'spice', 'chop', 'bake', 'fillet');