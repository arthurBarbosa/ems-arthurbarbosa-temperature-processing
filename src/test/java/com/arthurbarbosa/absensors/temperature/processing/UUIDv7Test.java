package com.arthurbarbosa.absensors.temperature.processing;

import com.arthurbarbosa.absensors.temperature.processing.common.IdGenerator;

import com.arthurbarbosa.absensors.temperature.processing.common.UUIDv7Utils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class UUIDv7Test {


    @Test
    void shouldGeneratorUUIDv7() {
        UUID uuid = IdGenerator.generateTimeBaseUUID();

        OffsetDateTime uuidDateTime = UUIDv7Utils.extractOffsetDateTime(uuid).truncatedTo(ChronoUnit.MINUTES);
        OffsetDateTime currentDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES);

        Assertions.assertThat(uuidDateTime).isEqualTo(currentDateTime);

    }
}
