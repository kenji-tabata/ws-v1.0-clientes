
package br.net.dom.sisv5.ws.v1_0.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="pesquisado" type="{http://www.dom.net.br/sisv5/ws/v1.0/WSDL/}SDDPerfResponsepesquisado"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "SDDPerfResponse")
public class SDDPerfResponse {

    @XmlElement(required = true)
    protected SDDPerfResponsepesquisado pesquisado;

    /**
     * Obtém o valor da propriedade pesquisado.
     * 
     * @return
     *     possible object is
     *     {@link SDDPerfResponsepesquisado }
     *     
     */
    public SDDPerfResponsepesquisado getPesquisado() {
        return pesquisado;
    }

    /**
     * Define o valor da propriedade pesquisado.
     * 
     * @param value
     *     allowed object is
     *     {@link SDDPerfResponsepesquisado }
     *     
     */
    public void setPesquisado(SDDPerfResponsepesquisado value) {
        this.pesquisado = value;
    }

}
