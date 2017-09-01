function solve(args) {
    let n = Number(args[0]);
    for (let i = n; i > 0; i--) {
        console.log(i);
    }
}

solve(['Line 1',
    'Line 2',
    'Line 3',
    'Stop'
])