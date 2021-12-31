package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localIndia = new Locale("hi", "IN");
        Locale localJapao = new Locale("ja", "JP");
        Locale localHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localHolanda);

        System.out.println("Italia " + df1.format(calendar.getTime()));
        System.out.println("Suiça " + df2.format(calendar.getTime()));
        System.out.println("India " + df3.format(calendar.getTime()));
        System.out.println("Japão " + df4.format(calendar.getTime()));
        System.out.println("Holanda " + df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localJapao));
        System.out.println(localeCH.getDisplayCountry(localHolanda));
        System.out.println(localeItaly.getDisplayLanguage(localJapao));
    }
}
