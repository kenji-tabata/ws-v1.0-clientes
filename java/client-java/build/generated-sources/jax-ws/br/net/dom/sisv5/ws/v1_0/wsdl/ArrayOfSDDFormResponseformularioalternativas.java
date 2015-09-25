
package br.net.dom.sisv5.ws.v1_0.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSDDFormResponseformularioalternativas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSDDFormResponseformularioalternativas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alternativa" type="{http://www.dom.net.br/sisv5/ws/v1.0/WSDL/}ArrayOfSDDFormResponseformularioalternativasalternativa" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSDDFormResponseformularioalternativas", propOrder = {
    "alternativa"
})
public class ArrayOfSDDFormResponseformularioalternativas {

    protected List<ArrayOfSDDFormResponseformularioalternativasalternativa> alternativa;

    /**
     * Gets the value of the alternativa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSDDFormResponseformularioalternativasalternativa }
     * 
     * 
     */
    public List<ArrayOfSDDFormResponseformularioalternativasalternativa> getAlternativa() {
        if (alternativa == null) {
            alternativa = new ArrayList<ArrayOfSDDFormResponseformularioalternativasalternativa>();
        }
        return this.alternativa;
    }

}
