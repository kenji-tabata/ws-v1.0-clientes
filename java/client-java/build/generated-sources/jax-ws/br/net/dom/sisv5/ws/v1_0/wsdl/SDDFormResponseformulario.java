
package br.net.dom.sisv5.ws.v1_0.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SDDFormResponseformulario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SDDFormResponseformulario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="instrucoes" type="{http://www.dom.net.br/sisv5/ws/v1.0/WSDL/}ArrayOfSDDFormResponseformularioinstrucoes"/>
 *         &lt;element name="alternativas" type="{http://www.dom.net.br/sisv5/ws/v1.0/WSDL/}ArrayOfSDDFormResponseformularioalternativas"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDDFormResponseformulario", propOrder = {

})
public class SDDFormResponseformulario {

    @XmlElement(required = true)
    protected ArrayOfSDDFormResponseformularioinstrucoes instrucoes;
    @XmlElement(required = true)
    protected ArrayOfSDDFormResponseformularioalternativas alternativas;
    @XmlElement(required = true)
    protected String status;

    /**
     * Obtém o valor da propriedade instrucoes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSDDFormResponseformularioinstrucoes }
     *     
     */
    public ArrayOfSDDFormResponseformularioinstrucoes getInstrucoes() {
        return instrucoes;
    }

    /**
     * Define o valor da propriedade instrucoes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSDDFormResponseformularioinstrucoes }
     *     
     */
    public void setInstrucoes(ArrayOfSDDFormResponseformularioinstrucoes value) {
        this.instrucoes = value;
    }

    /**
     * Obtém o valor da propriedade alternativas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSDDFormResponseformularioalternativas }
     *     
     */
    public ArrayOfSDDFormResponseformularioalternativas getAlternativas() {
        return alternativas;
    }

    /**
     * Define o valor da propriedade alternativas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSDDFormResponseformularioalternativas }
     *     
     */
    public void setAlternativas(ArrayOfSDDFormResponseformularioalternativas value) {
        this.alternativas = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
