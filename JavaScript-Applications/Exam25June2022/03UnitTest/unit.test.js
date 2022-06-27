const { expect} = require('chai');
const { carService } = require('./unit.js')

describe("Car Service tests", function() {
    describe("Test isExpensive method", function() {
        it("Expensive path: return message", () => {
            // TODO: …
            expect(carService.isItExpensive('Engine')).to.equal('The issue with the car is more severe and it will cost more money')
            expect(carService.isItExpensive('Transmission')).to.equal('The issue with the car is more severe and it will cost more money')
        });
        it("Cheeper path: return message", () => {
            // TODO: …
            expect(carService.isItExpensive('Motor')).to.equal('The overall price will be a bit cheaper')
            expect(carService.isItExpensive('Gear box')).to.equal('The overall price will be a bit cheaper')
        });
     });
     describe("Test discount method", function() {
        it("More than 2 parts: discount message", () => {
            // TODO: …
            expect(carService.discount(5, 100)).to.equal('Discount applied! You saved 15$')
            expect(carService.discount(8, 100)).to.equal('Discount applied! You saved 30$')
        });
        it("Less than 2 parts: discount message", () => {
            // TODO: …
            expect(carService.discount(2, 100)).to.equal('You cannot apply a discount')
        });
        it("Invalid input: warning message", () => {
            // TODO: …
            expect(() => carService.discount(NaN, 100).to.throw('Invalid input'))
            expect(() => carService.discount(100, NaN).to.throw('Invalid input'))
            expect(() => carService.discount('string', 100).to.throw('Invalid input'))
            expect(() => carService.discount(5, 'string').to.throw('Invalid input'))
        });
     });
     describe("Test partsToBuy  method", function() {
        it("Valid input: return total price message", () => {
            // TODO: …
            expect(carService.partsToBuy([{ part: "blowoff valve", price: 145 }, { part: "coil springs", price: 230 }], ["blowoff valve", "injectors"])).to.equal(145)
            expect(carService.partsToBuy([{ part: "blowoff valve", price: 145 }, { part: "coil springs", price: 230 }], ["blowoff valve", "injectors", "coil springs"])).to.equal(375)
            expect(carService.partsToBuy([{ part: "blowoff valve", price: 145 }, { part: "coil springs", price: 230 }], ["bumper", "injectors"])).to.equal(0)
        });
        it("Invalid input: throw error message", () => {
            // TODO: …
            expect(() => carService.partsToBuy("blowwoff valve", ["blowoff valve", "injectors"])).to.throw('Invalid input')
            expect(() => carService.partsToBuy([{ part: "blowoff valve", price: 145 }, { part: "coil springs", price: 230 }], "blowoff valve", "injectors", "coil springs")).to.throw('Invalid input')
            expect(() => carService.partsToBuy([{ part: "blowoff valve", price: 145 }, { part: "coil springs", price: 230 }], 25)).to.throw('Invalid input')
        });
     });
});
