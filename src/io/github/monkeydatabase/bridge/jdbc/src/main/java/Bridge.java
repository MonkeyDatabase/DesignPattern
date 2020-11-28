import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ConnectionImpl;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.MySQLConnection;

public class Bridge {
    public static void main(String[] args) {
        //com.mysql.jdbc.Driver使用java.sql.DriverManager.registerDriver进行获取
        //1.先注册驱动
        //2.再通过DriverManager.registerDriver中的getConnection(200-270行)拿到一个连接java.sql.Connection接口的子类对象
        //本例中的Driver为Mysql的Driver，而Oracle的Driver同理，均继承自java.sql.Driver
        Driver;

        //com.mysql.jdbc.ConnectionImpl实现了MySQLConnection接口
        ConnectionImpl;

        //MySQLConnection接口继承了com.mysql.jdbc.Connection接口
        MySQLConnection;

        //com.mysql.jdbc.Connection接口继承自java.sql.Connection接口
        Connection;

        //java.sql.Connection接口
        java.sql.Connection;
    }
}
