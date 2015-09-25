
package br.net.dom.sisv5.ws.v1_0.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SDDLaudoSinteseResponselaudo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SDDLaudoSinteseResponselaudo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bloco" type="{http://www.dom.net.br/sisv5/ws/v1.0/WSDL/}ArrayOfSDDLaudoSinteseResponselaudobloco"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="empresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDDLaudoSinteseResponselaudo", propOrder = {

})
public class SDDLaudoSinteseResponselaudo {

    @XmlElement(required = true)
    protected ArrayOfSDDLaudoSinteseResponselaudobloco bloco;
    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String descricao;
    @XmlElement(required = true)
    protected String empresa;
    @XmlElement(required = true)
    protected String cargo;

    /**
     * Obtém o valor da propriedade bloco.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSDDLaudoSinteseResponselaudobloco }
     *     
     */
    public ArrayOfSDDLaudoSinteseResponselaudobloco getBloco() {
        return bloco;
    }

    /**
     * Define o valor da propriedade bloco.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSDDLaudoSinteseResponselaudobloco }
     *     
     */
    public void setBloco(ArrayOfSDDLaudoSinteseResponselaudobloco value) {
        this.bloco = value;
    }

    /**
     * Obtém o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
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

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade empresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Define o valor da propriedade empresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresa(String value) {
        this.empresa = value;
    }

    /**
     * Obtém o valor da propriedade cargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define o valor da propriedade cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

}
