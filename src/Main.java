//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte a = 5;
        short b = -333;
        int c = 5667777;
        long d = 2345678910111213L;
        System.out.println("Значение переменной 'a' с типом byte = " + a + " Значение переменной 'b' с типом short = " + b + " Значение переменной 'c' с типом int = " + c + " Значение переменной 'd' с типом long = " + d);

        float box = 27.12F;
        long pen = 987678965549L;
        double vox = 2.786;
        short fox = 569;
        short gox = -159;
        int dog = 27897;
        byte y = 67;
        System.out.println("box=" + box + " pen=" + pen + " vox" + vox + " fox=" + fox + " gox=" + gox + " dog=" + dog + " y=" + y);

        short sheetsOfPaper = 480;
        System.out.println(sheetsOfPaper + " листов бумаги закупили на три класса");
        byte LP = 23;
        System.out.println(LP + " учеников у Людмилы Павловны");
        byte AS = 27;
        System.out.println(AS + " учеников у Анны Сергеевны");
        byte EA = 30;
        System.out.println(EA + " учеников у Екатерины Андреевны");
        byte totalStudents;
        totalStudents = (byte) (LP + AS + EA);
        System.out.println(totalStudents + " Всего учеников");
        short sheet = (short) (sheetsOfPaper / totalStudents);
        System.out.println(sheet + " листов достанется каждому ученику");
        short sheetLP = (short) (LP * sheet);
        System.out.println(sheetLP + " листов бумаги заберёт Людмила Павловна для своих учеников");
        short sheetAS = (short) (sheet * AS);
        System.out.println(sheetAS + " листов бумаги заберёт Анна Сергеевна для своих учеников");
        short sheetEA = (short) (sheet * EA);
        System.out.println(sheetEA + " листов бумаги заберет Екатерина Андреевна для своих учеников");

        int machinePerformance2 = 16;
        System.out.println(machinePerformance2 + " бутылок машина производит за 2 минуты");
        int machinePerformance = machinePerformance2/2;
        System.out.println(machinePerformance + " бутылок машина производит за 1 минуту");
        int time1 = 20;
        int machinePerformance20 = machinePerformance*time1;
        System.out.println("За 20 минут машина произвела " + machinePerformance20 + " штук бутылок");
        int time2 = 1440;
        System.out.println(time2 + " минут в сутках");
        int machinePerformance1440 = machinePerformance*time2;
        System.out.println("За сутки машина произвела " + machinePerformance1440 + " штук бутылок");
        int time3 = time2*3;
        System.out.println(time3 + " минут в 3х сутках");
        int machinePerformance3 = machinePerformance * time3;
        System.out.println("За 3 дня машина произвела " + machinePerformance3 + " штук бутылок");
        int time4 = time2*31;
        System.out.println(time4 + " минут в месяце");
        int machinePerformance1 = machinePerformance * time4;
        System.out.println("За 1 месяц машина произвела " + machinePerformance1 + " штук бутылок");

        byte cans = 120;
        System.out.println(cans + " банок краски куплено для школы");
        byte cansWhite1 = 2;
        byte cansBrown1 = 4;
        System.out.println(cansWhite1 + " банок белой краски и " + cansBrown1  + " банок коричневой краски уходит на один класс");
        byte cans1 = 6;
        System.out.println(cans1 + " банок краски уходит на один класс");
        byte classes = (byte) (cans/cans1);
        System.out.println(classes + " классов в школе");
        byte cansWhite = (byte) (cansWhite1*classes);
        byte cansBrown = (byte) (cansBrown1*classes);
        System.out.println("В школе, где " + classes + " классов, нужно " + cansWhite + " банок белой краски и " + cansBrown + " банок коричневой краски");

        int banana = 80;
        System.out.println(banana + "гр вес одгого банана");
        int banana5 = banana * 5;
        System.out.println(banana5 + "гр вес пяти бананов");
        int milk100 = 105;
        System.out.println(milk100 + "гр равно 100мл молока");
        int milk200 = milk100*2;
        System.out.println(milk200 + "гр вес 200мл молока");
        int iceCream = 100;
        System.out.println(iceCream + "гр весит один брикет мороженого-пломбир");
        int iceCream2 = iceCream*2;
        System.out.println(iceCream2 + "гр вес двух брикетов мороженого");
        int egg = 70;
        System.out.println(egg + "гр весит одно яйцо");
        int egg4 = egg*4;
        System.out.println(egg4 + "гр весят четыре яйца");
        float sportsBreakfast;
              sportsBreakfast = banana5+milk200+iceCream2+egg4;
        System.out.println(sportsBreakfast + " гр вес спортивног завтрака");
        int grPerKg = 1000;
        float sportsBreakfastkg = sportsBreakfast/(float)grPerKg;
        System.out.println(sportsBreakfastkg + "кг весит спортивный завтрак");

        short h = 7;
        short hg = (short) (h * 1000);
        System.out.println(hg + "гр нужно сбросить спортсмену");
        short m = 250;
        System.out.println(m + "гр минимум теряет в весе спортсмен за день");
        short s = 500;
        System.out.println(s + "гр максимум теряет спортсмен в день");
        short days1 = (short) (hg/m);
        System.out.println(days1 + " дней уйдет при минимуме потере в весе в день");
        short days2 = (short) (hg/s);
        System.out.println(days2 + " дней уйдет при максимальной потере в весе в день");
        short days3 = (short) ((days1+days2)/2);
        System.out.println(days3+ " дней в среднем уйдет при среднем значении потери в весе в день ");

        int salaryM = 67760;
        System.out.println(salaryM + " рублей в месяц получает Маша");
        int averageM = salaryM*12;
        System.out.println(averageM + " рублей, годовой доход Маши");
        int salaryM1 = (int) (salaryM+(salaryM*0.10));
        System.out.println(salaryM1 + " рублей, увеличенная на 10% зарплата Маши");
        int averageM1 = salaryM1*12;
        System.out.println(averageM1 + " рублей, годовой доход Маши, после увелечения зарплаты на 10%");
        int differenceM = averageM1-averageM;
        System.out.println(differenceM + " рублей, разница между годовым доходом Маши до и после повышения зарплаты");
        int salaryD = 83690;
        System.out.println(salaryD + " рублей в месяц получает Денис");
        int averageD = salaryD*12;
        System.out.println(averageD + " рублей, годовой доход Дениса");
        int salaryD1 = (int)(salaryD+(salaryD*0.10));
        System.out.println(salaryD1 + " рублей, увеличенная на 10% зарплата Дениса");
        int avarageD1 = salaryD1*12;
        System.out.println(avarageD1 + " рублей, годовой доход Дениса, после увеличения зарплаты на 10%");
        int differenceD = avarageD1-averageD;
        System.out.println(differenceD + " рублей разница между годовым доходом Дениса до и после повышения зарплаты");
        int salaryK = 76230;
        System.out.println(salaryK + " рублей в месяц получает Кристина");
        int averageK = salaryK*12;
        System.out.println(averageK + " рублей, годовой доход Кристины");
        int salaryK1 = (int) (salaryK+(salaryK*0.10));
        System.out.println(salaryK1 + " рублей, увеличенная на 10% зарплата Кристины");
        int averageK1 = salaryK1*12;
        System.out.println(averageK1 + " рублей, годовой доход Кристины, после повышения зарплаты на 10%");
        int differenceK = averageK1-averageK;
        System.out.println(differenceK + " рублей, разница между годовым доходом Кристины до и после повышения зарплаты");

    }
}
