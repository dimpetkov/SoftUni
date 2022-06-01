function cooking(num, command1, command2, command3, command4, command5) {
num = Number(num);

let commandList = [command1, command2, command3, command4, command5];

//ToDo: use params (bellow...)
let chop = x => x / 2;
let dice = x => Math.sqrt(x);
let spice = x => ++x;
let bake = x => x * 3;
let fillet = x => x -x * 0.2;
for (let i = 0; i < commandList.length; i++) {
    switch(commandList[i]) {
        case "chop":
            num = chop(num);
            console.log(num)
        break;
        case "dice":
            num = dice(num);
            console.log(num)
        break;
        case "spice":
            num = spice(num);
            console.log(num)
        break;
        case "bake":
            num = bake(num);
            console.log(num)
        break;
        case "fillet":
            num = fillet(num);
            console.log(num)
        break;
        default:
            break;
    }
}
}
cooking('32', 'chop', 'chop', 'chop', 'chop', 'chop');
cooking('9', 'dice', 'spice', 'chop', 'bake', 'fillet');

//With params bellow:
function cookingByNums(number, ...params) {
number = Number(number);

let chop = x => x / 2;
let dice = x => Math.sqrt(x);
let spice = x => ++x;
let bake = x => x * 3;
let fillet = x => x -x * 0.2;
for (let i = 0; i < params.length; i++) {
    switch(params[i]) {
        case "chop":
            num = chop(num);
            console.log(num)
        break;
        case "dice":
            num = dice(num);
            console.log(num)
        break;
        case "spice":
            num = spice(num);
            console.log(num)
        break;
        case "bake":
            num = bake(num);
            console.log(num)
        break;
        case "fillet":
            num = fillet(num);
            console.log(num)
        break;
        default:
            break;
    }
}
}
