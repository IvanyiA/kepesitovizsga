package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT breed FROM dinosaur WHERE actual > expected ORDER BY breed ")) {

            return returnByStatement(statement);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot connect or error by sql", sqle);
        }
    }

    private List<String> returnByStatement(PreparedStatement statement) throws SQLException {
        List<String> result = new ArrayList<>();
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                String breed = resultSet.getString(1);
                result.add(breed);
            }
            return result;
        }
    }

}
