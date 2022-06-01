function square(num) {
    let star = num;
    if (num == null) {
        star = 5;
    }
    const arr = [];
    for (let j = 1; j <= star; j++) {
        arr.push('*');
    }
    for (let i = 1; i <= star; i++) {
       console.log(arr.join(' '));
    }
}
square( );