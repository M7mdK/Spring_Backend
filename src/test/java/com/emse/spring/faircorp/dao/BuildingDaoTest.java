package com.emse.spring.faircorp.dao;
import com.emse.spring.faircorp.model.Window;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.List;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class BuildingDaoTest {

    @Autowired
    private  BuildingDao buildingDao;

    @Test
    public void shouldFindRoomOpenWindows() {

        List<Window> result = buildingDao.findWindowsByBuilding(-2L);
        Assertions.assertThat(result).hasSize(2);

    }
}
