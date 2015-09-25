
package br.net.dom.sisv5.ws.v1_0.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSDDPerfResponsepesquisadoperfil complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSDDPerfResponsepesquisadoperfil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="competencia" type="{http://www.dom.net.br/sisv5/ws/v1.0/WSDL/}ArrayOfSDDPerfResponsepesquisadoperfilcompetencia" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSDDPerfResponsepesquisadoperfil", propOrder = {
    "competencia"
})
public class ArrayOfSDDPerfResponsepesquisadoperfil {

    protected List<ArrayOfSDDPerfResponsepesquisadoperfilcompetencia> competencia;

    /**
     * Gets the value of the competencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSDDPerfResponsepesquisadoperfilcompetencia }
     * 
     * 
     */
    public List<ArrayOfSDDPerfResponsepesquisadoperfilcompetencia> getCompetencia() {
        if (competencia == null) {
            competencia = new ArrayList<ArrayOfSDDPerfResponsepesquisadoperfilcompetencia>();
        }
        return this.competencia;
    }

}
