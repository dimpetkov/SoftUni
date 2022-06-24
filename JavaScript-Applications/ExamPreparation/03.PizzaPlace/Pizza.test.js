const { expect, assert } = require('chai');
const { it } = require('mocha');
const {pizzUni} = require('./Pizza.js');

describe("Pizza tests", () => {
    describe("makeAnOrder", () => {

        it("Invalid input: not an object, throw Error", () => {
            // TODO: …
            expect(() => pizzUni.makeAnOrder(12)).to.throw('You must order at least 1 Pizza to finish the order.')
        });
        it("Invalid input: empty data, throw Error", () => {
            // TODO: …
            expect(() => pizzUni.makeAnOrder('')).to.throw('You must order at least 1 Pizza to finish the order.')
        });
        it("Invalid input: only drink ordered, throw Error", () => {
            // TODO: …
            expect(() => pizzUni.makeAnOrder({orderedDrink: 'Water'})).to.throw('You must order at least 1 Pizza to finish the order.')
        });
        it("Valid input, only pizza ordered", () => {
            expect(pizzUni.makeAnOrder({orderedPizza: 'Margherita', orderedDrink: 'Water'})).to.equal('You just ordered Margherita and Water.')
        })
        it("Valid input, pizza and drink ordered", () => {
            expect(pizzUni.makeAnOrder({orderedPizza: 'Margherita'})).to.equal('You just ordered Margherita')
        })
     });
     describe("getRemainingWork", () => {

        it("Valid input, all pizza ready", () => {
            // TODO: …
            expect(pizzUni.getRemainingWork([{pizzaName: 'Margharita', status: 'ready'}, {pizzaName: 'MyPizza', status: 'ready'}])).to.equal('All orders are complete!')
        });
        it("Valid input, all pizza are preparing", () => {
            // TODO: …
            expect(pizzUni.getRemainingWork([{pizzaName: 'Margharita', status: 'preparing'}, {pizzaName: 'MyPizza', status: 'preparing'}])).to.equal('The following pizzas are still preparing: Margharita, MyPizza.')
        });
        it("Valid input, one pizza preparing, one pizza ready", () => {
            // TODO: …
            expect(pizzUni.getRemainingWork([{pizzaName: 'Margharita', status: 'ready'}, {pizzaName: 'MyPizza', status: 'preparing'}])).to.equal('The following pizzas are still preparing: MyPizza.')
        });
     });
     describe("orderType", () => {

        it("Order with delivery - no discount", () => {
            // TODO: …
            expect(pizzUni.orderType(100, 'Delivery')).to.equal(100)
        });
        it("Order CarryOut - 10% discount", () => {
            // TODO: …
            expect(pizzUni.orderType(100, 'Carry Out')).to.equal(90)
        });
     });

     // TODO: …
});
