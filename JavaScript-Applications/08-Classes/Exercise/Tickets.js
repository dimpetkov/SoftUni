function ticketsManagement(stringArray, sortingCriterion) {
    let ticketsArray = [];
    
    class Ticket {
        constructor(destination, price, status) {
            this.destination = destination;
            this.price = price;
            this.status = status;
        }
    }
    for (let element of stringArray) {
        // let[destination, price, status] = line.split('|');
        // price = Number(price);
        // ticketsArray.push(new Ticket(destination, price, status));
        let data = element.split('|');
        ticketsArray.push(new Ticket(data[0], Number(data[1]), data[2]));
    }

    switch(sortingCriterion) {
        case 'destination':
            ticketsArray.sort((a, b) => a.destination.localeCompare(b.destination));
        break;
        case 'price':
            ticketsArray.sort((a, b) => a.price - b.price);
        break;
        case 'status':
            ticketsArray.sort((a, b) => a.status.localeCompare(b.status));
        break;
    }
    return ticketsArray;
}

// function ticetsManager(array, sortBy){
//     let newArray = [];

//     class Ticket{
//         constructor(destination, price, status){
//             this.destination = destination;
//             this.price = price;
//             this.status = status;
//         }
//     }
//     array.forEach(element => {
//         let data = element.split('|');
//         newArray.push(new Ticket(data[0], Number(data[1]),  data[2]))
//     });

   
//     if (sortBy == 'destination') {
//         newArray.sort((a, b) => a.destination.localeCompare(b.destination));
//     }
//     else if (sortBy == 'price') {
//         newArray.sort((a, b) => a.price - b.price);
//     }
//     else if (sortBy == 'status') {
//         newArray.sort((a, b) => a.status.localeCompare(b.status));
//     }
//     return newArray
// }

console.log(ticketsManagement(['Philadelphia|94.20|available',
'New York City|95.99|available',
'New York City|95.99|sold',
'Boston|126.20|departed'],
'price'));