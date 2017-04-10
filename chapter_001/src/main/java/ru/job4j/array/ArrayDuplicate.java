package ru.job4j.array;
import java.util.Arrays;
/**
* RotateArray.
*
* @author Sergey Indyukov (onl.ont@mail.ru)
* @version $Id$
* @since 0.1
*/
public class ArrayDuplicate {
/**
* Method remove.
* @param array первый аргумент
* @return array
*/
	public int[] remove(String[] array) {
		int c = 0; //переменная счетчик количество повторяемых слов
		 	for (int i = 0; i < array.length - 1; i++) { //проходим все элементы кроме последнего
				for (int j = i + 1; i < array.length; j++) { // сравнивается отдельно элемент, со всеми после него 
					if (array[i] == array[j]) { // сравниваем значение элемента внешнего цикла и внутреннего
						for (int k = j; k < array.length - 1; k++) { // если они равны, то запускаем цикл сдвига вправо, тем самым перезаписываем элемент 
																	 //копию следующим значением
							array[k] = array[k + 1]; // запись
						}
						c++;
						j--; //снова проверяем этот же элемент массива, потому как при сдвиге, мы упустим значение, этого элемента до сдвига
					}
				}
			}
		return Arrays.copyOf(array, array.length - c); // возвращаем массив обрезанный копиями, которые остались справа
	} //{"Привет", "Мир", "Привет", "Супер", "Мир"};
}