function greatestDivisor(a, b) {
if (b) {
    return greatestDivisor(b, a % b);
} else {
    console.log(a);
}
}

greatestDivisor(15, 5);
greatestDivisor(2154, 458);