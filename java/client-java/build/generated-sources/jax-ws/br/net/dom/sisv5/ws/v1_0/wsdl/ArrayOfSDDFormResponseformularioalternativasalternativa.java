
package br.net.dom.sisv5.ws.v1_0.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSDDFormResponseformularioalternativasalternativa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSDDFormResponseformularioalternativasalternativa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="frase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSDDFormResponseformularioalternativasalternativa", propOrder = {

})
public class ArrayOfSDDFormResponseformularioalternativasalternativa {

    @XmlElement(required = true)
    protected String frase;
    protected int id;

    /**
     * Obtém o valor da propriedade frase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrase() {
        return frase;
    }

    /**
     * Define o valor da propriedade frase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrase(String value) {
        this.frase = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
