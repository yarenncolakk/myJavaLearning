import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
      //selectDemo();
      //insertData();
      //updateData();
      //deleteData();
    }

    public static void selectDemo() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null; //SQL cümleciğimizle ilgili işlemleri yapacak.
        ResultSet resultSet; //Sorgunun sonucunda gelen data --> tablodaki değerler.
        try{
            connection = helper.getConnection();
            //System.out.println("Bağlantı oluştu.");
            statement = connection.createStatement(); //bu bağlantı için createStatement.
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country"); //sql cümleciğini çalıştır. execute et.
            ArrayList<Country> countries = new ArrayList<Country>(); //yeni bir ülke ekelemek için:
            while (resultSet.next()){ //tek tek gez diyoruz.
                countries.add(new Country(
                        resultSet.getNString("Code"),
                        resultSet.getNString("Name"),
                        resultSet.getNString("Continent"),
                        resultSet.getNString("Region")));
            }
            System.out.println(countries.size());
        }
        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }
    }

    public static void insertData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null; //Bu tür insert ifadeler preparedStatement denilen bir class ile yapılıyor.
        ResultSet resultSet; //Sorgunun sonucunda gelen data --> tablodaki değerler.
        try {
            connection = helper.getConnection();
            String sql = "insert into city (Name,CountryCode,District,Population) values(?,?,?,?)"; //values kullanıcıdan alınsın o yüzden-->?
            statement = connection.prepareStatement(sql); //preparedStatement --> cümle hazırla, sql hazırla anlamında.
            statement.setString(1, "Düzce 2");
            statement.setString(2, "TUR");
            statement.setString(3, "Turkey");
            statement.setInt(4, 70000);
            int result = statement.executeUpdate(); // kodu çalıştır. etkilenen kayıt sayısı gelir.
            System.out.println("Kayıt eklendi.");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void updateData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null; //Bu tür insert ifadeler preparedStatement denilen bir class ile yapılıyor.
        ResultSet resultSet; //Sorgunun sonucunda gelen data --> tablodaki değerler.
        try{
            connection = helper.getConnection();
            String sql = "update city set population=100000,district='Turkey' where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4083); //1. soru işaretinin değeri 4083tür.
            int result = statement.executeUpdate(); // kodu çalıştır. etkilenen kayıt sayısı gelir.
            System.out.println("Kayıt güncellendi.");
        }
        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }
    }

    public static void deleteData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null; //Bu tür insert ifadeler preparedStatement denilen bir class ile yapılıyor.
        ResultSet resultSet; //Sorgunun sonucunda gelen data --> tablodaki değerler.
        try{
            connection = helper.getConnection();
            String sql = "delete from city where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4082); //1. soru işaretinin değeri 4083tür.
            int result = statement.executeUpdate(); // kodu çalıştır. etkilenen kayıt sayısı gelir.
            System.out.println("Kayıt silindi.");
        }
        catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }
    }

}