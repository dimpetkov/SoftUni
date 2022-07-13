function solve() {

    const label = document.querySelector('#info span')
    const departBtn = document.getElementById('depart')
    const arriveBtn = document.getElementById('arrive')

    let stop = {
        next: 'depot'
    };

    async function depart() {
        //get info for next stop
        //display next stop
        const url = `http://localhost:3030/jsonstore/bus/schedule/${stop.next}`
        const response = await fetch(url);

        if(response.status !== 200) {
            label.textContent = 'Error'
            departBtn.disabled = true;
            arriveBtn.disabled = true;
            alert('Wrong data')
        }
        
        stop = await response.json()
        
        label.textContent = `Next stop ${stop.name}`
        departBtn.disabled = true;
        arriveBtn.disabled = false;
    }
    
    function arrive() {
        label.textContent = `Arriving at ${stop.name}`
        departBtn.disabled = false;
        arriveBtn.disabled = true;
    }

    return {
        depart,
        arrive
    };
}

let result = solve();