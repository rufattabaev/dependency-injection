package ru.itpark.implementation.util;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PreparedStatementSetter {
    PreparedStatement setValues(PreparedStatement preparedStatement) throws SQLException;
}
