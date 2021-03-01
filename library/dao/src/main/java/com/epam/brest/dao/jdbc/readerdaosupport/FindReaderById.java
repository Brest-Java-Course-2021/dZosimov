package com.epam.brest.dao.jdbc.readerdaosupport;

import com.epam.brest.model.IReader;
import com.epam.brest.model.Reader;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class FindReaderById extends MappingSqlQuery<IReader>{
    private static final String FIND_READER_BY_ID =
            "SELECT * FROM lib_reader WHERE reader_id=:readerId";

    public FindReaderById(DataSource ds) {
        super(ds, FIND_READER_BY_ID);
        super.declareParameter(new SqlParameter("readerId", Types.INTEGER));
    }

    @Override
    protected IReader mapRow(ResultSet resultSet, int i) throws SQLException {
        IReader reader = new Reader();
        reader.setReaderId(resultSet.getInt("reader_id"));
        reader.setFirstName(resultSet.getString("first_name"));
        reader.setLastName(resultSet.getString("last_name"));
        reader.setPatronymic(resultSet.getString("patronymic"));
        reader.setDateOfRegistry(resultSet.getDate("date_of_registry").toLocalDate());
        reader.setActive(resultSet.getBoolean("active"));
        return reader;
    }
}
