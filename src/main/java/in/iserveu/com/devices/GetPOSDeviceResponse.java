//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.19 at 07:28:15 PM IST 
//


package in.iserveu.com.devices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POS-device-detail" type="{http://com.iserveu.in/devices}POS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "posDeviceDetail"
})
@XmlRootElement(name = "getPOSDeviceResponse")
public class GetPOSDeviceResponse {

    @XmlElement(name = "POS-device-detail", required = true)
    protected POS posDeviceDetail;

    /**
     * Gets the value of the posDeviceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link POS }
     *     
     */
    public POS getPOSDeviceDetail() {
        return posDeviceDetail;
    }

    /**
     * Sets the value of the posDeviceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link POS }
     *     
     */
    public void setPOSDeviceDetail(POS value) {
        this.posDeviceDetail = value;
    }

}
