package ru.job4j.calculator;
/**
 * Calculate.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
/**
* @param result
*/
    private double result;
/**
* Test add.
*@param first первый аргумент
*@param second второй аргумент
*/
public void add(double first, double second) {
        this.result = first + second;
    }
/**
* Test substruct.
*@param first первый аргумент
*@param second второй аргумент
*/
	 public void substruct(double first, double second) {
        this.result = first - second;
    }
/**
* Test div.
*@param first первый аргумент
*@param second второй аргумент
*/
	 public void div(double first, double second) {
        this.result = first / second;
    }
/**
* Test multiple.
*@param first первый аргумент
*@param second второй аргумент
*/
	 public void multiple(double first, double second) {
        this.result = first * second;
    }
/**
* Test result.
@return result
*/
 public double getResult() {
        return this.result;
		}
}