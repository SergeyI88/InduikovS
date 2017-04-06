package ru.job4j.max;

/**
* Max.
*
* @author Sergey Indyukov (onl.ont@mail.ru)
* @version $Id$
* @since 0.1
*/

public class Point {
/**
* @param x
*/
   private int x;
/**
* @param y
*/
   private int y;
/**
* Конструктор.
* @param x первый аргумент
* @param y второй аргумент
*/
   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
/**
* Method getX.
* @return x
*/
  public int getX() {
      return this.x;
  }
/**
* Method getY.
* @return y
*/
  public int getY() {
     return this.y;
  }

/** Method is.
* @return y
* @param a первый аргумент
* @param b второй аргумент
*/
	public boolean is(int a, int b) {
		return y == a * x + b;
	}
}
