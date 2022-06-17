window.addEventListener('load', solve);

function solve() {
    //TO DO
    const addButtonElement = document.getElementById('add');
    const modelInputElement = document.getElementById('model')
    const yearInputElement = document.getElementById('year')
    const descriptionInputElement = document.getElementById('description')
    const priceInputElement = document.getElementById('price') 
    const furnitureListElement = document.getElementById('furniture-list') 

    addButtonElement.addEventListener('click', addClickHandler);
    function addClickHandler(e) {
        e.preventDefault(); //prevent reloading of the webpage
        let model = modelInputElement.value;
        let description = descriptionInputElement.value;
        let year = Number(yearInputElement.value);
        let price = Number(priceInputElement.value);

        modelInputElement.value = ''; //clear the input fields
        descriptionInputElement.value = ''; //clear the input fields
        yearInputElement.value = ''; //clear the input fields
        priceInputElement.value = ''; //clear the input fields

        
        if(!model || !description) { //if has empty value
            return;
        }
        
        if(year <= 0 || price <= 0 ) { //not negative
            return;
        }
        
        let rowElement = document.createElement('tr')
        let modelCellElement = document.createElement('td')
        let priceCellElement = document.createElement('td')
        let actionsCellElement = document.createElement('td')
        let infoButtonElement = document.createElement('button')
        let buyButtonElement = document.createElement('button')
        let contentRowElement = document.createElement('tr')
        let yearContentElement = document.createElement('td')
        let descriptionContentElement = document.createElement('td')
        let totalPriceElement = document.querySelector('.total-price')
        
        modelCellElement.textContent = model;
        priceCellElement.textContent = price.toFixed(2);

        infoButtonElement.textContent = 'More Info'
        infoButtonElement.classList.add('moreBtn')
        infoButtonElement.addEventListener('click', (e) => {

            if(e.currentTarget.textContent == 'More Info') {
                contentRowElement.style.display = 'contents'
                e.currentTarget.textContent = 'Less Info';
            } else {
                e.currentTarget.textContent = 'More Info';
                contentRowElement.style.display = 'none'
            }
        });

        buyButtonElement.textContent = 'Buy it'
        buyButtonElement.classList.add('buyBtn')
        buyButtonElement.addEventListener('click', (e) => {
            let currentTotalPrice = Number(totalPriceElement.textContent);
            let totalPrice = currentTotalPrice + price;
            totalPriceElement.textContent = totalPrice.toFixed(2)
            rowElement.remove();
            contentRowElement.remove();
        })

        actionsCellElement.appendChild(infoButtonElement)
        actionsCellElement.appendChild(buyButtonElement)

        rowElement.classList.add('info')

        rowElement.appendChild(modelCellElement);
        rowElement.appendChild(priceCellElement);
        rowElement.appendChild(actionsCellElement);

        yearContentElement.textContent= `Year: ${year}`
        descriptionContentElement.setAttribute('colspan', 3);
        descriptionContentElement.textContent = `Description: ${description}`

        contentRowElement.classList.add('hide')
        contentRowElement.style.display = 'none'

        contentRowElement.appendChild(yearContentElement);
        contentRowElement.appendChild(descriptionContentElement);

        furnitureListElement.appendChild(rowElement)
        furnitureListElement.appendChild(contentRowElement);
    }
}
