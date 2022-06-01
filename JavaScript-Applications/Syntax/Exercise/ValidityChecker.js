function validity(x1, y1, x2, y2) {
    
    let firstToCenter = Math.sqrt((x1 - 0)**2 + (y1 - 0)**2); 
    let firstToSecond = Math.sqrt((x1 - x2)**2 + (y1 - y2)**2); 
    let secondToCenter = Math.sqrt((x2 - 0)**2 + (y2 - 0)**2); 

    function status(x) {
        if (Math.floor(x) == x) {
            string = 'is valid';
        } else {
            string = 'is invalid';
        }
        return string;
    }
    
    console.log(`{${x1}, ${y1}} to {0, 0} ${status(firstToCenter)}`);
    console.log(`{${x2}, ${y2}} to {0, 0} ${status(secondToCenter)}`);
    console.log(`{${x1}, ${y1}} to {${x2}, ${y2}} ${status(firstToSecond)}`);

}
validity(2, 1, 1, 1);