package com.company;

import java.sql.*;


public class Main {



    public static void main(String[] args)  {

        Connection connection= null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\user1\\Desktop\\film.db");
            if (connection != null) {
                System.out.println("Connection OK");
                Statement statement = connection.createStatement();
                //To Create a Table:
               // statement.execute("Create table movies (no number, name varchar2(20),type varchar2(20),rating double)");
                //To Drop Table:
                //statement.execute("Drop table movies");
                //To Insert Data:
/*
        statement.execute("insert into movies values(1,'SAW','horror',9.0 )");
        statement.execute("insert into movies values(2,'LOOK AWAY ','horror',6.0)");
        statement.execute("insert into movies values(3,'THE SNIPER','action',6.8)");
        statement.execute("insert into movies values(4,'OXYGEN','horror',7.5 )");
        statement.execute("insert into movies values(5,'11:11','action',8.0 )");
        statement.execute("insert into movies values(6,'TUNNEL','action',3.5 )");
        statement.execute("insert into movies values(7,'DEAD-SIGHT','horror',7.5 )");
        statement.execute("insert into movies values(8,'GOLD','comedy',5.5 )");
        statement.execute("insert into movies values(9,'CRAZE','comedy',4.5)");
        statement.execute("insert into movies values(10,'THE NIGHT OF','horror',9.5 )");

 */

                // To Delete Data:
                //statement.execute("delete from movies where no=5");
                //To Update Data:
                //statement.execute("update movies set name='THE WALKING DEAD' where no=5;");
                //Select Operations:
                //statement.execute("select count(*) from movies");

        //select * from movies where rating in (select max(rating) from movies)

       /* ResultSet results = statement.executeQuery("select * from movies order by rating DESC");
        while(results.next()) {
            System.out.println(
                    results.getInt("no")+results.getString(2)
            );
        }
*/

        /*
        results.close();
        statement.close();
        connection.close();

         */
            }
        } catch (Exception PSQLException) {
            System.out.println(PSQLException.getMessage());
        }
        }












}
