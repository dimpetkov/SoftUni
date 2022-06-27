window.addEventListener("load", solve);

function solve() {
  //TODO ....
let makeInputElement = document.getElementById('make')
let modelInputElement = document.getElementById('model')
let yearInputElement = document.getElementById('year')
let fuelInputElement = document.getElementById('fuel')
let originalCostInputElement = document.getElementById('original-cost')  
let sellingPriceInputElement = document.getElementById('selling-price')

let profitMadeElement = document.getElementById('profit')

let buttonElementPublish = document.getElementById('publish')
buttonElementPublish.addEventListener('click', (e) => {
  e.preventDefault();

  
  if(!makeInputElement.value || !modelInputElement.value || !yearInputElement.value || !fuelInputElement.value || !originalCostInputElement.value || !sellingPriceInputElement.value) {
    return;
  } else if(originalCostInputElement.value > sellingPriceInputElement.value) {
    return;
  }

  let make = makeInputElement.value;
  let model = modelInputElement.value;
  let year = yearInputElement.value;
  let fuel = fuelInputElement.value;
  let ogirinalPrice = originalCostInputElement.value;
  let sellingPrice = sellingPriceInputElement.value;

  let profit = Number(profitMadeElement.textContent)


  let tbodyElement = document.getElementById('table-body')

  const tr = document.createElement('tr');
  tr.innerHTML = 
  ` <tr class="row">
      <td>${make}</td>
      <td>${model}</td>
      <td>${year}</td>
      <td>${fuel}</td>
      <td>${ogirinalPrice}</td>
      <td>${sellingPrice}</td>
      <td>
        <button class="action-btn edit">Edit</button>
        <button class="action-btn sell">Sell</button>
      </td>
    </tr>`
    const editBtn = tr.querySelector('.edit');
    const sellBtn = tr.querySelector('.sell');
    editBtn.addEventListener('click', editFunction)
    sellBtn.addEventListener('click', sellFunction)
  tbodyElement.appendChild(tr)
  resetFunction(e)

  function editFunction(e) {
    makeInputElement.value = make;
  modelInputElement.value = model;
  yearInputElement.value = year;
  fuelInputElement.value = fuel;
  originalCostInputElement.value = ogirinalPrice;
  sellingPriceInputElement.value = sellingPrice;

  deleteFunction(e);
  }

  function sellFunction(e) {
    deleteFunction(e)
    let ulElement = document.getElementById('cars-list')
    let currentProfit = sellingPrice - ogirinalPrice
    console.log(sellingPrice)
    console.log(ogirinalPrice)

    let liElement = document.createElement('li')
    liElement.className = 'each-list'
    liElement.innerHTML = 
    `<span>${make} ${model}</span>
    <span>${year}</span>
    <span>${currentProfit}</span>`
    ulElement.appendChild(liElement)

    let totalProfit = 0;
    totalProfit = profit + currentProfit
    
    profitMadeElement.textContent = totalProfit.toFixed(2)
    
    
  }
  function deleteFunction(e) {
    e.currentTarget.parentNode.parentNode.remove()
  }
  
  
  function resetFunction(e) {
  makeInputElement.value = '';
  modelInputElement.value = '';
  yearInputElement.value = '';
  fuelInputElement.value = '';
  originalCostInputElement.value = '';
  sellingPriceInputElement.value = '';
  }
})
}
