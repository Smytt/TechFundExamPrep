function solve(args) {
    let obj = {};
    for (let command of args) {
        let commandSplit = command.split(' -> ');
        obj[commandSplit[0]] = commandSplit[1];
    }

    obj.age = Number(obj.age);
    obj.grade = Number(obj.grade);

    let json = JSON.stringify(obj);
    console.log(json);
}

solve([
    'name -> Angel',
    'surname -> Georgiev',
    'age -> 20',
    'grade -> 6.00',
    'date -> 23/05/1995',
    'town -> Sofia'
]);