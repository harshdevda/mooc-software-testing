package tudelft.discount;

import tudelft.discount.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private static Connection c;

    public ProductDao() {
        try {
            if(c!=null) return;

            c = DriverManager.getConnection("jdbc:hsqldb:file:mymemdb.db", "SA", "");
            c.prepareStatement("create table invoice (name varchar(100), value double)").execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Product> all(){

        List<Product> allProducts = new ArrayList<>();

        try {
            PreparedStatement ps = c.prepareStatement("select * from product");

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                String category=rs.getString("category");
                allProducts.add(new Product(name,price,category));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            return allProducts;
        }

    }
}
