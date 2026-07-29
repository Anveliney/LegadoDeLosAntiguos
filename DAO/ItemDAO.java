package org.example.DAO;

import org.example.conexion.ConexionBD;
import org.example.items.Item;

import java.sql.*;
import java.util.ArrayList;

public class ItemDAO {


    public ArrayList<Item> obtenerTodos(){

        ArrayList<Item> items = new ArrayList<>();

        String sql = "SELECT * FROM item";


        try(Connection conexion = ConexionBD.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){


            while(rs.next()){


                Item item = new Item();


                item.setNombreItem(
                        rs.getString("nombre_item")
                );


                item.setDanoItem(
                        rs.getDouble("dano_item")
                );


                item.setVidaItem(
                        rs.getDouble("vida_item")
                );


                item.setManaItem(
                        rs.getDouble("mana_item")
                );


                item.setCriticoItem(
                        rs.getDouble("critico_item")
                );


                item.setArmaduraItem(
                        rs.getDouble("armadura_item")
                );


                item.setResistenciaMagicaItem(
                        rs.getDouble("resistencia_magica_item")
                );


                items.add(item);

            }


        }catch(SQLException e){

            e.printStackTrace();

        }


        return items;
    }

}