function solve(args) {
    let counter = 0;
    let command = args[counter];

    while (command != "Stop") {
        counter++;
        console.log(command);
        command = args[counter];
    }
}

solve(['Line 1',
    'Line 2',
    'Line 3',
    'Stop'
])