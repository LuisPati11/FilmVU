
package com.home;

import com.database.DB;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER-PC
 */
public class AdminBal {
    public List<AdminBean> loadData(String buscar){
        String busqueda = buscar;
        List <AdminBean> list = new ArrayList<AdminBean>();
        try{
            String query = "select * from peliculas where Title like '%"+busqueda+"%'";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int id=rs.getInt("Id");
                String title= rs.getString("Title");
                String director= rs.getString("Director");
                int year= rs.getInt("Year");
                String genre= rs.getString("Genre");
                String country= rs.getString("Country");
                int puntuaction= rs.getInt("Puntuaction");
                String platform= rs.getString("Platform");
                
                AdminBean bean=new AdminBean(id,title,director,year,genre,country,puntuaction,platform);
                list.add(bean);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e);
        }
        return list;
        
    }
    
    public void insert(AdminBean AdminBean){
        try{
            String query="insert into peliculas values(null, ?,?,?,?,?,?,?)";
            PreparedStatement ps=DB.con.prepareStatement(query);
            ps.setString(1,AdminBean.getTitle());
            ps.setString(2,AdminBean.getDirector());
            ps.setInt(3, AdminBean.getYear());
            ps.setString(4,AdminBean.getGenre());
            ps.setString(5,AdminBean.getCountry());
            ps.setInt(6,AdminBean.getPuntuaction());
            ps.setString(7,AdminBean.getPlatform());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"A record has been inserted... ");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e);
        }
    }
    
    public AdminBean returnAlldataToTextFields(int id){
        AdminBean bean = null;
        try{
            String query="select * from peliculas where Id= "+id;
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int ids =rs.getInt("Id");
                String title= rs.getString("Title");
                String director= rs.getString("Director");
                int year= rs.getInt("Year");
                String genre= rs.getString("Genre");
                String country= rs.getString("Country");
                int puntuaction= rs.getInt("Puntuaction");
                String platform= rs.getString("Platform");
                
                bean=new AdminBean(ids, title, director,year,genre,country,puntuaction,platform);
            }
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null,""+e);
        }
        return bean;
    }
    public void updateData(AdminBean bean){
        try{
            String query = "update peliculas set Title = ?, Director = ?, Year = ?, Genre = ?, Country = ?, Puntuaction = ?, Platform = ? where Id = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1,bean.getTitle());
            ps.setString(2,bean.getDirector());
            ps.setInt(3, bean.getYear());
            ps.setString(4,bean.getGenre());
            ps.setString(5,bean.getCountry());
            ps.setInt(6,bean.getPuntuaction());
            ps.setString(7,bean.getPlatform());
            ps.setString(8,String.valueOf(bean.getId()));
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"A record has been update");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e);
        }
    }
    public void deleteRecord(int id){
        try{
            String query= "delete from peliculas where Id= ?";
             PreparedStatement ps = DB.con.prepareStatement(query);
             ps.setInt(1,id);
             ps.executeUpdate();
             JOptionPane.showMessageDialog(null, "A record has been deleted...");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e);
        }
    }
}
