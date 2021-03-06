package ru.job4j.AdditionalTask;

/**
 * Created by admin on 02.05.2017.
 */
public class StartBanking {
    /**
     * @param visitors
     */
    private Visitor[] visitors;
    /**
     * @param max
     */
    /**
     * method getMax.
     * @return max
     */
    public Max getMax() {
        return max;
    }

    /**
     * @param max
     */
    private Max max = new Max();
    /**
     * method show.
     */
    public void show() {
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%s %s %s %s %s", i + 1, " Вход: ", visitors[i].getIn(), "Выход: ", visitors[i].getOut()));
        }
    }
    /**
     * method initVisitors.
     */
    public void initVisitors() {
        visitors = new Visitor[10];
        visitors[0] = new Visitor(21, 364);
        visitors[1] = new Visitor(121, 344);
        visitors[2] = new Visitor(125, 369);
        visitors[3] = new Visitor(191, 377);
        visitors[4] = new Visitor(201, 564);
        visitors[5] = new Visitor(321, 664);
        visitors[6] = new Visitor(322, 364);
        visitors[7] = new Visitor(421, 477);
        visitors[8] = new Visitor(441, 564);
        visitors[9] = new Visitor(521, 563);
    }

    /**
     * method determination.
     */
    public void determination() {
        int tempMax = 0;
        for (int i = 1; i <= 720; i++) {
            for (int j = 0; j < 10; j++) {
                if (visitors[j].getIn() == i) {
                    max.setMax(max.getMax() + 1);
                }
                if (visitors[j].getOut() == i) {
                    max.setMax(max.getMax() - 1);
                }
            }
            if (tempMax < max.getMax()) {
                max.setHours((i + 480) / 60);
                max.setMinutes((i + 480) % 60);
                tempMax = max.getMax();
            }
        }
        max.setMax(tempMax);
        System.out.println(String.format("%s %s%s%s", max.getMax(), max.getHours(), ":", max.getMinutes()));
    }
}