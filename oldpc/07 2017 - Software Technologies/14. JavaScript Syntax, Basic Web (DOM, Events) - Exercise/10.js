function solve(args) {
    let arr = [];
    args = args.map(x => x.split(' ')).map(x => [x[0], Number(x[1])]);

    for(let command of args) {
        if(command[0] == "add") arr.push(command[1]);
        else arr.splice(command[1], 1)
    }

    for(let index of arr) {
        console.log(index);
    }
}

solve([
    'add 3',
    'add 5',
    'remove 1',
    'add 2'

])