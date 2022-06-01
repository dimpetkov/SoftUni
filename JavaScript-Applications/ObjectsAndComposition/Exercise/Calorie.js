function calorie(arr){
    let result = {};
        // for(let index = 0; index < arr.length; index+=2) {
        //     let product = arr[index];
        //     let calorie = arr[index + 1];
        //     result[product] = Number(calorie);
        // }
        while(arr.length !== 0) {
            let product = arr.shift();
            let calorie = arr.shift();
            result[product] = Number(calorie);
        }
    
    console.log(result);
} 
calorie(['Yoghurt', '48', 'Rise', '138', 'Apple', '52']);
