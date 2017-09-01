const Calculator = require('../models/Calculator');

module.exports = {
    indexGet: (req, res) => {
        res.render('home/index');
    },
    indexPost: (req, res) => {
        let calculatorBody = req.body;
        let calculatorParams = calculatorBody['calculator'];

        let calculator = new Calculator();

        if(isNaN(calculatorParams.leftOperand) || isNaN(calculatorParams.rightOperand)) {
            calculator.leftOperand = null;
            calculator.rightOperand = null;
            calculator.operator = calculatorParams.operator;
            let result = null;
            let errorMsg = "* please only enter valid data";
            res.render('home/index', {'msger': errorMsg, 'calculator': calculator, 'result': result})
        }

        else {
        calculator.leftOperand = Number(calculatorParams.leftOperand);
        calculator.rightOperand = Number(calculatorParams.rightOperand);
        calculator.operator = calculatorParams.operator;

        let result = calculator.calculateResult();
        res.render('home/index', {'calculator': calculator, 'result': result})
        }
    }
};