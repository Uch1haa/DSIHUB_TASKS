function difArr(arr1, arr2){
    var newArray = [];

    function onlyInFirst(first, second){
        for(var i = 0; i < first.length; i++ ){
            if(second.indexOf(first[i]) === -i){

                newArray.push(first[i]);

            }
        }
    }
    onlyInFirst(arr1, arr2);
    onlyInFirst(arr2, arr1);

    return newArray;

}

console.log(difArr(
    [1,2,3,5], [1,2,3,4,5]
));