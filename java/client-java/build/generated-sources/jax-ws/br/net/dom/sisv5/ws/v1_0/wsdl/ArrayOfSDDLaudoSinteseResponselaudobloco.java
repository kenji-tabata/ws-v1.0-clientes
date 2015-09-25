
package br.net.dom.sisv5.ws.v1_0.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSDDLaudoSinteseResponselaudobloco complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSDDLaudoSinteseResponselaudobloco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="velocidade" type="{http://www.dom.net.br/sisv5/ws/v1.0/WSDL/}ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocovelocidade" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detalhe" type="{http://www.dom.net.br/sisv5/ws/v1.0/WSDL/}ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocodetalhe" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lideranca" type="{http://www.dom.net.br/sisv5/ws/v1.0/WSDL/}ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocolideranca" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="comunicacao" type="{http://www.dom.net.br/sisv5/ws/v1.0/WSDL/}ArrayOfArrayOfSDDLaudoSinteseResponselaudoblococomunicacao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSDDLaudoSinteseResponselaudobloco", propOrder = {
    "velocidade",
    "detalhe",
    "lideranca",
    "comunicacao"
})
public class ArrayOfSDDLaudoSinteseResponselaudobloco {

    protected List<ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocovelocidade> velocidade;
    protected List<ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocodetalhe> detalhe;
    protected List<ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocolideranca> lideranca;
    protected List<ArrayOfArrayOfSDDLaudoSinteseResponselaudoblococomunicacao> comunicacao;

    /**
     * Gets the value of the velocidade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the velocidade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVelocidade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocovelocidade }
     * 
     * 
     */
    public List<ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocovelocidade> getVelocidade() {
        if (velocidade == null) {
            velocidade = new ArrayList<ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocovelocidade>();
        }
        return this.velocidade;
    }

    /**
     * Gets the value of the detalhe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalhe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalhe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocodetalhe }
     * 
     * 
     */
    public List<ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocodetalhe> getDetalhe() {
        if (detalhe == null) {
            detalhe = new ArrayList<ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocodetalhe>();
        }
        return this.detalhe;
    }

    /**
     * Gets the value of the lideranca property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lideranca property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLideranca().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocolideranca }
     * 
     * 
     */
    public List<ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocolideranca> getLideranca() {
        if (lideranca == null) {
            lideranca = new ArrayList<ArrayOfArrayOfSDDLaudoSinteseResponselaudoblocolideranca>();
        }
        return this.lideranca;
    }

    /**
     * Gets the value of the comunicacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comunicacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComunicacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfArrayOfSDDLaudoSinteseResponselaudoblococomunicacao }
     * 
     * 
     */
    public List<ArrayOfArrayOfSDDLaudoSinteseResponselaudoblococomunicacao> getComunicacao() {
        if (comunicacao == null) {
            comunicacao = new ArrayList<ArrayOfArrayOfSDDLaudoSinteseResponselaudoblococomunicacao>();
        }
        return this.comunicacao;
    }

}
