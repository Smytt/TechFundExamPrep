function solve(args) {
    let obj = [];
    let requestIndex = args[args.length-1];
    args = args.map(x => x.split(' '));
    for (let i = 0; i < args.length - 1; i++) {
        obj[args[i][0]] = args[i][1];
    }
    if(requestIndex in obj)
        console.log(obj[requestIndex])
    else console.log("None")
}

solve([
    'key value',
    'key eulav',
    'test tset',
    'key'


])