function wordUppercase(string) {
let patern = /\w+/g;
let output = string.match(patern);
let result = [];
for(let el of output) {
    result.push(el.toUpperCase());
}
    console.log(result.join(", "));
}
wordUppercase('Hi, how are you?');
wordUppercase('hello!');