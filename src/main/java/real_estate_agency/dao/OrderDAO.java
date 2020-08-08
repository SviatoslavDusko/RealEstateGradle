package real_estate_agency.dao;

import real_estate_agency.model.OrderEntity;

import java.sql.SQLException;

public interface OrderDAO extends GeneralDAO<OrderEntity, Integer> {
    OrderEntity findByFlatId(Integer flatId) throws SQLException;
}
