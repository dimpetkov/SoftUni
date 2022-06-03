function addItem() {
    const content = document.getElementById('newItemText').value;
    const liElement = document.createElement('li');
    liElement.textContent = content.value;
    document.getElementById('items').appendChild(liElement);
    content.value = '';
    console.log();
}