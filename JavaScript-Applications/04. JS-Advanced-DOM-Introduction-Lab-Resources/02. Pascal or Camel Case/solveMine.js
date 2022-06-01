function solve(){
    let text = document.getElementById('text').value;
    let words = text.split(' ');
    let convention = document.getElementById('naming-convention').value;
    let result = '';
    if (convention != 'Camel Case' && convention != 'Pascal Case') {
        return document.getElementById('result').textContent = 'Error!'
    }
    for (let i = 0; i < words.length; i++) {
        if (convention == 'Pascal Case') {
            words[i] = words[i].toLowerCase();
            words[i] = words[i].charAt(0).toUpperCase() + words[i].substring(1);
        } else if (convention == 'Camel Case') {
            words[i] = words[i].toLowerCase();
            if (i > 0) {
            words[i] = words[i].charAt(0).toUpperCase() + words[i].substring(1);
            }
        }
    }
    document.getElementById('result').textContent = words.join('');
}