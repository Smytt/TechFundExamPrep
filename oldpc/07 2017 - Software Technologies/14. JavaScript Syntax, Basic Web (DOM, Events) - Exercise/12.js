function solve(args) {
    let obj = [];
    let requestIndex = args[args.length - 1];
    args = args.map(x => x.split(' '));
    for (let i = 0; i < args.length - 1; i++) {
        if (!(args[i][0] in obj))
            obj[args[i][0]] = [];
        obj[args[i][0]].push(args[i][1])
    }
    if (requestIndex in obj) {
        for (let element of obj[requestIndex])
            console.log(element);
    }

    else console.log("None")
}

solve([
    'key value',
    'key eulav',
    'test tset',
    'key'


])