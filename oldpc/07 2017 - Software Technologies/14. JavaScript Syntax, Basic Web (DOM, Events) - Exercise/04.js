function solve(args) {
    args = args.map(Number);
    let counter = 0;
    if(!(args.indexOf(0) === -1)) console.log("Positive");

    else {
        for( let num of args ) {
            if (num < 0) counter ++;
        }
        if(counter %2 != 0) console.log("Negative");
        else console.log("Positive");
    }
}

solve(['13', '0', '-9'])