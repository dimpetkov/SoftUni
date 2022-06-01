function edit(element, match, replacer) {
    // TODO
    const text = element.textContent;
    const result = text.split(match).join(replacer);
    element.textContent = result;

}