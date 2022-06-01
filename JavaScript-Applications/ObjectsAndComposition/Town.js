function population(townsAsStrings) {
    //iterate over input
    //parse entries
    //store data
    //print result
    const towns = {};
    for(let data of townsAsStrings) {
        const tokens = data.split(' <-> ');
        const name = tokens[0];
        let pop = Number(tokens[1]);

        // if (towns[name] == undefined) {
        // towns[name] = pop; //with key [name] -> value 'pop' in Number
        // } else {
        //     towns[name] += pop;
        // }

        if (towns[name]) {
            pop += towns[name];
        }
        towns[name] = pop;
    }
    for (const name in towns) {
        console.log(`${name} : ${towns[name]}`);
    }
}
population(['Sofia <-> 1200000',
'Montana <-> 20000',
'New York <-> 10000000',
'Washington <-> 2345000',
'Las Vegas <-> 1000000'])
console.log('------------')
population(['Istanbul <-> 100000',
'Honk Kong <-> 2100004',
'Jerusalem <-> 2352344',
'Mexico City <-> 23401925',
'Istanbul <-> 1000'])