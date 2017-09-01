function solve(args) {
    [num1, num2] = args.map(Number);
    if( num1 <= num2)
        console.log(num1*num2);
    else
        console.log(num1/num2);

}

solve(['13', '6'])