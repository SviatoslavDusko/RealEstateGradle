package real_estate_agency.dao;

import real_estate_agency.model.RealtorClientEntity;

import java.sql.SQLException;

public interface RealtorClientDAO extends GeneralDAO<RealtorClientEntity, Integer> {
    RealtorClientEntity findByClientId(Integer id) throws SQLException;
}
