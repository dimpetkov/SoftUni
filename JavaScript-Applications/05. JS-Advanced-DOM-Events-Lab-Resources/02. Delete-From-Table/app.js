function deleteByEmail() {
const value = document.querySelector('input[name="email"]').value;
const rows = Array.from(document.querySelectorAll('tbody tr'));
let found = false;
    for (let row of rows) {
        // row.children[1].textContent
        if (row.children[1].textContent == value) {
        const parent = row.parentElement;
        row.remove();
        found = true;
        }
    }

    if (found) {
     document.getElementById('result').textContent = 'Deleted.'
    } else {
     document.getElementById('result').textContent = 'Not found.'
    }
}