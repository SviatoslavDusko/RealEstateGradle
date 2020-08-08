package real_estate_agency.dao;

import real_estate_agency.model.ClientEntity;

import java.sql.SQLException;

public interface ClientDAO extends GeneralDAO<ClientEntity, Integer> {
    ClientEntity findByEmail(String email) throws SQLException;

    ClientEntity findByEmailAndPassword(String email, String password) throws SQLException;
}
