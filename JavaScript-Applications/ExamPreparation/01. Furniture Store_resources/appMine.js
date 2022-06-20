window.addEventListener('load', solve);

function solve() {
    //TO DO
    //model, year, description, and price
    const input = {
        model: document.getElementById('model'),
        year: document.getElementById('year'),
        desciption: document.getElementById('description'),
        price: document.getElementById('price')
    };
    const list = {
        addedItems: document.getElementById('furniture-list')

    }
    document.getElementById('add').addEventListener('click', addFurniture);
    function addFurniture(event) {
        event.preventDefault();
        //read the data from input fields

        const model = input.model.value;
        const year = Number(input.year.value);
        const description = input.desciption.value;
        const price = Number(input.price.value).toFixed(2);

        //validate the input
        if (model == '' || description == '') {
            return;
        }
        if (year < 0 || price < 0) {
            return;
        }
        if (year == NaN || price == NaN) {
            return;
        }

        //create tr element
        
        const item = document.createElement('tr')
        item.className = 'info';
        item.innerHTML = `<td>${model}</td>
        <td>${price}</td>
        <td>
        <button class="moreBtn">More Info</button>
        <button class="buyBtn">Buy it</button>
        </td>`

        //add the descripotion and hide
        const ItemDescription = document.createElement('tr')
        ItemDescription.class = 'hide'
        ItemDescription.innerHTML = `<td>Year: ${year}</td>
        <td colspan="3">Description: ${description}</td>
        </tr>`
        
        list.addedItems.appendChild(item);
        list.addedItems.appendChild(ItemDescription);
        ItemDescription.style.display = 'none'

        input.year.value = '';
        input.model.value = '';
        input.desciption.value = '';
        input.price.value = '';

    const moreInfoButton = item.querySelector('.moreBtn')
    const buyButton = item.querySelector('.buyBtn')
    
    moreInfoButton.addEventListener('click', itemsDescription);
    buyButton.addEventListener('click', totalPrice);
    function itemsDescription() {
        if (moreInfoButton.textContent == 'More Info') {
            ItemDescription.style.display = 'contents'
            moreInfoButton.textContent = 'Less Info'
        } else {
            ItemDescription.style.display = 'none'
            moreInfoButton.textContent = 'More Info'
        }
    }

    let totalPriceElement = document.querySelector('.total-price')
    let totalElement = Number(totalPriceElement.textContent)
    
    function totalPrice() {
        const rowElement = document.querySelector('.info')
        let total = totalElement + Number(price);
        totalPriceElement.textContent = total.toFixed(2);
        rowElement.remove();
    }
    }
}