
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
 *         &lt;element name="formulario" type="{http://www.dom.net.br/sisv5/ws/v1.0/WSDL/}SDDFormResponseformulario"/>
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
@XmlRootElement(name = "SDDFormResponse")
public class SDDFormResponse {

    @XmlElement(required = true)
    protected SDDFormResponseformulario formulario;

    /**
     * Obtém o valor da propriedade formulario.
     * 
     * @return
     *     possible object is
     *     {@link SDDFormResponseformulario }
     *     
     */
    public SDDFormResponseformulario getFormulario() {
        return formulario;
    }

    /**
     * Define o valor da propriedade formulario.
     * 
     * @param value
     *     allowed object is
     *     {@link SDDFormResponseformulario }
     *     
     */
    public void setFormulario(SDDFormResponseformulario value) {
        this.formulario = value;
    }

}
