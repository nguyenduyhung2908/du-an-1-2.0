/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nhomsau.service;

import com.nhomsau.domainmodel.Lop;
import com.nhomsau.viewmodel.QuanLyLop;
import java.util.List;

/**
 *
 * @author Nguyen Duy Hung
 */
public interface ILopService {
    Lop findById(String id);
    void insert(Lop lop);
    void update(Lop lop);
    List<QuanLyLop> findAll();
    void delete(String idLop);
}