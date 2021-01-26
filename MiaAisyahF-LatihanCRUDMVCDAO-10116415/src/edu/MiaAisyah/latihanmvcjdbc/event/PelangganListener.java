/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.MiaAisyah.latihanmvcjdbc.event;

import edu.MiaAisyah.latihanmvcjdbc.entity.Pelanggan;
import edu.MiaAisyah.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author 
 * Nama : Mia Aisyah
 * Nim  : 10116415
 * Kelas: IF-2
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
}
