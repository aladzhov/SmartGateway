package ua.in.smartjava.domain.logrecord;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ua.in.smartjava.mongo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper=true)
public class LogRecord extends BaseEntity {
    private String record;
    //TODO create convertor to-from LocalDateTime
    private LocalDateTime localDateTime;

    @Builder
    private LogRecord(String record, LocalDateTime localDateTime, String id){
        super(id);
        this.record = record;
        this.localDateTime = localDateTime;
    }
}