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
import javax.persistence.TypedQuery;

/**
 *
 * @author danid
 */
public class LineaDeFacturaDAOJPA extends GenericoDAOJPA<LineaDeFactura, Long> implements LineaDeFacturaDAO{
    
    @Override
    public LineaDeFactura buscarConPropietarioYFactura(Usuario propietario, Factura fact) {
       TypedQuery<LineaDeFactura> query = em.createQuery("SELECT lin FROM LineaDeFactura AS lin WHERE lin.cliente.id = :idPropietario AND lin.factura.id = :idFact ", LineaDeFactura.class);
        query.setParameter("idPropietario", propietario.getId());
        query.setParameter("idFact", fact.getId());
        List<LineaDeFactura> resultado = query.getResultList();
        if ((resultado != null) && !resultado.isEmpty()) {
            return resultado.get(0);
        } else {
            return null;
        }
    }
}