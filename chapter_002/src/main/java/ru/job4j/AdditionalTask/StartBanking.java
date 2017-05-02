package ru.job4j.AdditionalTask;

/**
 * Created by admin on 02.05.2017.
 */
public class StartBanking {
    /**
     * @param visitors
     */
    private Visitor[] visitors = new Visitor[20];

    /**
     * method init.
     */
    public void init() {
        for (int i = 0; i < 20; i++) {
            visitors[i] = new Visitor();
            visitors[i].initTime();
            System.out.println(String.format("%s %s %s %s %s", i + 1, " Вход: ", visitors[i].getIn(), "Выход: ", visitors[i].getOut()));
        }
    }

    /**
     * method main.
     * @param args first
     */
    public static void main(String[] args) {
       StartBanking sB = new StartBanking();
       sB.init();
       int max = 0;
       int temp = 0; // переменная сравнения
       int hour = 8; // переменная в котором часу
       int temphour = 0;
       for (int i = 60, j = 0; i < 720; i += 60, hour++) {
          for (j = 0; j < 20; j++) {
              if (sB.visitors[j].getOut() < i && sB.visitors[j].getCalculated() != true) {
                  sB.visitors[j].setCalculated(true);
                  temp++;
              }
          }
          if (max < temp) {
            max = temp;
            temp = 0;
            temphour = hour;
          }
       }
           System.out.println(String.format("%s %s %s %s %s %s","C ",temphour, " до ", temphour + 1, " было больше всего посетителей! ", max));
       }
    }