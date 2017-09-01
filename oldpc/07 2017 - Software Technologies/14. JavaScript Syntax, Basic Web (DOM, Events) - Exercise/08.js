function solve(args) {
    let reversed = [];
    for(let item of args) {
        reversed.unshift(item);
    }
    for(let item of reversed) {
        console.log(item);
    }
}