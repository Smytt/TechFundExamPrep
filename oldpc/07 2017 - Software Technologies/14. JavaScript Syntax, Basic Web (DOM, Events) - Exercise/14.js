function solve(args) {
    for (let command of args) {
        let obj = JSON.parse(command);
        for (let prop in obj)
            console.log(prop.toString().charAt(0).toUpperCase() + prop.toString().slice(1) + ": " + obj[prop]);
    }
}

solve([
    '{"name":"Gosho","age":10,"date":"19/06/2005"}',
    '{"name":"Tosho","age":11,"date":"04/04/2005"}'
])