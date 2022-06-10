function isOddOrEven(string) {
    if (typeof(string) !== 'string') {
        return undefined;
    }
    if (string.length % 2 === 0) {
        return "even";
    }

    return "odd";
}

const { expect } = require('chai');
describe ('is odd or even tests', () => {
    it('should be undefind if number', () => {
        expect(isOddOrEven(2)).to.be.undefined;
    })
    it('should be undefind if array', () => {
        expect(isOddOrEven([])).to.be.undefined;
    })
    it('should be undefind if object', () => {
        expect(isOddOrEven({})).to.be.undefined;
    })
    it('should be undefind if string is odd', () => {
        expect(isOddOrEven('hi!')).to.equal('odd');
    })
    it('should be undefind if string is even', () => {
        expect(isOddOrEven('hell')).to.equal('even');
    })
});