package org.example.DAO;

import org.example.conexion.ConexionBD;
import org.example.habilidades.Habilidad;

import java.sql.*;
import java.util.ArrayList;


public class HabilidadDAO {


    public ArrayList<Habilidad> obtenerTodas(){

        ArrayList<Habilidad> habilidades = new ArrayList<>();

        String sql = "SELECT * FROM habilidades";


        try(Connection conexion = ConexionBD.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){


            while(rs.next()){


                Habilidad habilidad = new Habilidad();

                habilidad.setNombre(
                        rs.getString("nombre_habilidad")
                );

                habilidad.setCosto(
                        rs.getDouble("costo")
                );

                habilidad.setTiempoEnfriamiento(
                        rs.getDouble("tiempo_enfriamiento")
                );

                habilidad.setDano(
                        rs.getDouble("dano")
                );


                habilidades.add(habilidad);

            }


        }catch(SQLException e){

            e.printStackTrace();

        }


        return habilidades;

    }

}