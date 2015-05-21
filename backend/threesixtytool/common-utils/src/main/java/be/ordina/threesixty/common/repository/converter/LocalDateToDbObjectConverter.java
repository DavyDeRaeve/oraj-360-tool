package be.ordina.threesixty.common.repository.converter;

import java.time.LocalDate;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

import com.mongodb.DBObject;

/**
 * Created by stevedezitter on 15/04/15.
 */
@WritingConverter
public class LocalDateToDbObjectConverter implements Converter<LocalDate, DBObject>{

    @Override
    public DBObject convert(LocalDate localDate) {
        return null;
    }
}
