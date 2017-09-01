﻿using Calculator_CSharp.Models;
using System.Web.Mvc;
using System;

namespace Calculator_CSharp.Controllers
{
    public class HomeController : Controller
    {
        [HttpGet]
        public ActionResult Index(Calculator calculator)
        {
            return View();
        }

        [HttpPost]
        public ActionResult Calculate(Calculator calculator)
        {
            calculator.Result = CalculateResult(calculator);
            return RedirectToAction("Index", calculator);
        }

        private decimal CalculateResult(Calculator calculator)
        {
            decimal result = 0m;
            switch (calculator.Operator)
            {
                case "+": result = calculator.LeftOperand + calculator.RightOperand; break;
                case "-": result = calculator.LeftOperand - calculator.RightOperand; break;
                case "*": result = calculator.LeftOperand * calculator.RightOperand; break;
                case "/": result = calculator.LeftOperand / calculator.RightOperand; break;
            }
            return result;
        }
    }
}