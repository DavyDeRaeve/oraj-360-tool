package be.ordina.threesixty.common.utils.dateutils;


/**
 * Created by stevedezitter on 15/04/15.
 */
public interface DateTimeFormatterUtil<T> {

    public String formatDate(T t);

    public T fromString(String date);
}
