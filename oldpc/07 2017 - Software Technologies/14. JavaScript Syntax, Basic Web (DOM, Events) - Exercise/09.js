function solve(args) {
    let arr = [];
    let length = Number(args[0]);
    let indexes = args.slice(1).map( x => x.split(' - ').map(Number));

    for (let i = 0; i < length; i++) {
        arr[i] = 0;
    }

    for(let index of indexes) {
        arr[index[0]] = index[1];
    }

    for(let index of arr) {
        console.log(index)
    }
}

solve(['3',
    '0 - 5',
    '1 - 6',
    '2 - 7'
])