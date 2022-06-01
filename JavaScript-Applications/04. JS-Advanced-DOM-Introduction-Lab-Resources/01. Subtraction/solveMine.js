function solve(){
    let firstElement = document.getElementById('firstNumber').value;
    let secondElement = document.getElementById('secondNumber').value;
    let result = Number(firstElement) - Number(secondElement);
    let resultElement = document.getElementById('result')
    resultElement.textContent = result;
}