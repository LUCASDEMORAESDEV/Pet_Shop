import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/PetShop";
    private static final String user = "root";
    private static final String password = "";

    public static Connection createConnectionToMySQl() throws Exception{

// criando a conexaco com banco de dados
        Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

        return connection;
    }

    public static void main(String[] args) throws Exception {
        Connection con = createConnectionToMySQl();

        if(con != null){
            System.out.println("Conexão obtida com sucesso");
            con.close();
        }
    }
}
