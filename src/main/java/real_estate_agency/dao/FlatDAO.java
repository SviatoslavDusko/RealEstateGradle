package real_estate_agency.dao;

import real_estate_agency.model.FlatEntity;

import java.sql.SQLException;
import java.util.List;

public interface FlatDAO extends GeneralDAO<FlatEntity, Integer> {
    List<FlatEntity> findByParameters(Integer minFloor, Integer maxFloor,
                                      Integer roomCount,
                                      Integer minSquare, Integer maxSquare,
                                      String orderType,
                                      Integer minPrice, Integer maxPrice,
                                      Integer realtorId) throws SQLException;
}
