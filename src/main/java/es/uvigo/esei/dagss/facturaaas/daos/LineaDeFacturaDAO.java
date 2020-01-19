/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.dagss.facturaaas.daos;

import es.uvigo.esei.dagss.facturaaas.entidades.Factura;
import es.uvigo.esei.dagss.facturaaas.entidades.LineaDeFactura;
import es.uvigo.esei.dagss.facturaaas.entidades.Usuario;
import java.util.List;

/**
 *
 * @author danid
 */
public interface LineaDeFacturaDAO extends GenericoDAO<LineaDeFactura, Long>{
    public List<LineaDeFactura> buscarConFactura(Factura factura);
    
}
