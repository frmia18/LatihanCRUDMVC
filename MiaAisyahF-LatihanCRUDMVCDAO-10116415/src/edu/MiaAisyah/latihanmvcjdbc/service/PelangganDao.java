/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.MiaAisyah.latihanmvcjdbc.service;

import edu.MiaAisyah.latihanmvcjdbc.entity.Pelanggan;
import edu.MiaAisyah.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author 
 * Nama : Mia Aisyah
 * Nim  : 10116415
 * Kelas: IF-2
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectAllpelanggan() throws PelangganException;
    
    
}
