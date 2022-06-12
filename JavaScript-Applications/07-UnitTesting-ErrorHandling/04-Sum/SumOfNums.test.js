
const { expect } = require('chai');
const { sum } = require('./SumOfNumbers')

describe('Test Suit', () => {
    it('works with integers', () => {
        expect(sum([2, 4, 5])).to.equal(11, 'did not work with integers');
    });
    it('works with floating point numbers', () => {
        expect(sum([2.12, 4.28, 5])).to.equal(11.40, 'did not work with floating point numbers');
    });
    it('did not work with NaN', () => {
        expect(sum([2.12, 4.28, NaN])).to.be.NaN;
    });
});