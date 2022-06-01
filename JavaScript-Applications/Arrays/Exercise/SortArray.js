function solve(arr) {
    arr.sort(twoCriteriaSort);
    return arr.join('\n')

    function twoCriteriaSort(current, next) {
        if(current.length === next.length) {
            //implement second criteria
            return current.localeCompare(next);
        }
        return current.length - next.length;
    }
}
solve(['alpha', 
'beta', 
'gamma']
);
solve(['Isacc', 
'Theodor', 
'Jack', 
'Harrison', 
'George']
);