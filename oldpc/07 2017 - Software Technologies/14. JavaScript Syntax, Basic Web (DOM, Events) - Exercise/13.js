function solve(args) {
    let allStudents = [];
    for (let student of args){
        let strings = student.split(' -> ');
        let oneStudent = {
            Name: strings[0],
            Age: strings[1],
            Grade: strings[2],
        }
        allStudents.push(oneStudent)
    }

    for (let student of allStudents) {
        for (let property in student) {
            console.log(property + ": " + student[property])
        }
    }
}

solve([
    'Pesho -> 13 -> 6.00',
    'Ivan -> 12 -> 5.57',
    'Toni -> 13 -> 4.90'
])