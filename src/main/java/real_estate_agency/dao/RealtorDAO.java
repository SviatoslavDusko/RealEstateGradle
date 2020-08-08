package real_estate_agency.dao;

import real_estate_agency.model.RealtorEntity;

import java.sql.SQLException;

public interface RealtorDAO extends GeneralDAO<RealtorEntity, Integer> {
    RealtorEntity findRandomOne() throws SQLException;
}
