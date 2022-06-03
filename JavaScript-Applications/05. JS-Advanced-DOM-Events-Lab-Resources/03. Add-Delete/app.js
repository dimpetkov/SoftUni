function addItem() {

    const input = document.getElementById('newItemText');

    const liElement = document.createElement('li');
    liElement.textContent = input.value;
    //create/delete anchor
    const deleteButton = document.createElement('a');
    deleteButton.textContent = '[Delete]';
    deleteButton.href = '#';
    liElement.appendChild(deleteButton);

    deleteButton.addEventListener('click', onDelete);

    document.getElementById('items').appendChild(liElement);
    input.value = '';

    function onDelete(event) {
        event.target.parentElement.remove();
}
}


