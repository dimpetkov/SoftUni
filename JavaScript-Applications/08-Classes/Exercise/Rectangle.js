class Rectangle {
    width;
    height;
    color;
    constructor(width, height, color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    calcArea() {
        const area = Number(this.width) * Number(this.height);
        return area;
    }
}

// class Rectangle {
//     constructor(width, height, color) {
//         this.width = width;
//         this.height = height;
//         this.color = color;
//     }

//     calcArea() {
//         return this.height * this.width;
//     }
// }

let rect = new Rectangle(4, 5, 'Red');
let r = new Rectangle(30, 35, 'yellow');

console.log(rect.width);

console.log(rect.height);

console.log(rect.color);

console.log(rect.calcArea());