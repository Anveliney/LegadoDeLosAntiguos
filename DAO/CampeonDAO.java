package org.example.DAO;

import org.example.conexion.ConexionBD;
import org.example.personajes.Campeon;

import java.sql.*;
import java.util.ArrayList;

public class CampeonDAO {


    public ArrayList<Campeon> obtenerTodos(){

        ArrayList<Campeon> campeones = new ArrayList<>();

        String sql = "SELECT * FROM campeon";


        try(Connection conexion = ConexionBD.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){


            while(rs.next()){

                Campeon campeon = new Campeon();

                campeon.setNombre(rs.getString("nombre_campeon"));
                campeon.setVidaMaxima(rs.getDouble("vida_maxima"));
                campeon.setVida(rs.getDouble("vida_maxima"));
                campeon.setGolpeBasico(rs.getDouble("golpe_basico"));
                campeon.setArmadura(rs.getDouble("armadura"));
                campeon.setResistenciaMagica(rs.getDouble("resistencia_magica"));
                campeon.setNivel(rs.getDouble("nivel"));


                campeones.add(campeon);

            }


        }catch(SQLException e){

            e.printStackTrace();

        }


        return campeones;
    }

    public Campeon buscarPorId(int id){

        Campeon campeon = null;

        String sql = "SELECT * FROM campeon WHERE id_campeon = ?";


        try(Connection conexion = ConexionBD.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql)){


            ps.setInt(1,id);

            ResultSet rs = ps.executeQuery();


            if(rs.next()){

                campeon = new Campeon(rs.getString("nombre_campeon"),
                        rs.getDouble("vida_maxima"),rs.getDouble("golpe_basico"),
                        rs.getDouble("armadura"),rs.getDouble("resistencia_magica"),
                        rs.getDouble("oro_otorgado"),rs.getDouble("experiencia_otorgada"),
                        rs.getDouble("recurso_max"));

            }


        }catch(SQLException e){

            e.printStackTrace();

        }


        return campeon;
    }
}