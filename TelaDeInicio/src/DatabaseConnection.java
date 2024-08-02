import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sosrss";
        String user = "root";
        String password = "root"; // Substitua pela sua senha

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            
            // Exemplo de consulta
            ResultSet resultSet = statement.executeQuery("SELECT * FROM doencas");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Nome: " + resultSet.getString("nome"));
                System.out.println("Descrição: " + resultSet.getString("descricao"));
                System.out.println("Sintomas: " + resultSet.getString("sintomas"));
                System.out.println("--------");
            }
            
            // Fechar a conexão
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
