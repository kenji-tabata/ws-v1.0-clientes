
package br.net.dom.sisv5.ws.v1_0.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SDDPerfResponsepesquisado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SDDPerfResponsepesquisado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="perfil" type="{http://www.dom.net.br/sisv5/ws/v1.0/WSDL/}ArrayOfSDDPerfResponsepesquisadoperfil"/>
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
@XmlType(name = "SDDPerfResponsepesquisado", propOrder = {

})
public class SDDPerfResponsepesquisado {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected ArrayOfSDDPerfResponsepesquisadoperfil perfil;
    @XmlElement(required = true)
    protected String status;

    /**
     * Obtém o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade perfil.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSDDPerfResponsepesquisadoperfil }
     *     
     */
    public ArrayOfSDDPerfResponsepesquisadoperfil getPerfil() {
        return perfil;
    }

    /**
     * Define o valor da propriedade perfil.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSDDPerfResponsepesquisadoperfil }
     *     
     */
    public void setPerfil(ArrayOfSDDPerfResponsepesquisadoperfil value) {
        this.perfil = value;
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
