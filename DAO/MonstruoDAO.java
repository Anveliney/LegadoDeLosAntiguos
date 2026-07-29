package org.example.DAO;

import org.example.conexion.ConexionBD;
import org.example.personajes.Monstruo;

import java.sql.*;
import java.util.ArrayList;


public class MonstruoDAO {


    public ArrayList<Monstruo> obtenerTodos(){

        ArrayList<Monstruo> monstruos = new ArrayList<>();

        String sql = "SELECT * FROM monstruo";


        try(Connection conexion = ConexionBD.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){


            while(rs.next()){


                Monstruo monstruo = new Monstruo();

                monstruo.setNombre(rs.getString("nombre_monstruo"));
                monstruo.setVidaMaxima(rs.getDouble("vida_maxima"));
                monstruo.setGolpeBasico(rs.getDouble("golpe_basico"));
                monstruo.setArmadura(rs.getDouble("armadura"));
                monstruo.setNivel(rs.getDouble("nivel"));


                monstruos.add(monstruo);

            }


        }catch(SQLException e){

            e.printStackTrace();

        }

        return monstruos;

    }

    public Monstruo buscarPorId(int id){

        Monstruo monstruo = null;

        String sql = "SELECT * FROM monstruo WHERE id_monstruo = ?";


        try(Connection conexion = ConexionBD.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql)){


            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();


            if(rs.next()){

                monstruo = new Monstruo(rs.getString("nombre_monstruo"),
                        rs.getDouble("vida_maxima"),rs.getDouble("golpe_basico"),
                        rs.getDouble("armadura"),rs.getDouble("resistencia_magica"),
                        rs.getDouble("oro_otorgado"),rs.getDouble("experiencia_otorgada"),
                        rs.getDouble("recurso_max"));

            }


        }catch(SQLException e){

            e.printStackTrace();

        }


        return monstruo;
    }

}