package ru.job4j.calculate;

/**
 *Class Calculate решение задачи части 001 урок1.
 *@author Kudabaev
 *@since 17.05.2019
 */

public class Calculate {
/**
* Метод для тестирования.
* @param value строка для вывода в консоль
* @return String Value.
*/
	public String echo(String value){
	return String.format("%s %s %s", value, value, value);
	}

public static void main(String[] arg) {
	Calculate calc = new Calculate();
	System.out.println(calc.echo("aah"));


}
}