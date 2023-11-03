//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.19 at 07:28:15 PM IST 
//


package in.iserveu.com.devices;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="micro-ATM-device-detail-list" type="{http://com.iserveu.in/devices}micro-ATM" maxOccurs="unbounded"/>
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
    "microATMDeviceDetailList"
})
@XmlRootElement(name = "getATMDeviceListResponse")
public class GetATMDeviceListResponse {

    @XmlElement(name = "micro-ATM-device-detail-list", required = true)
    protected List<MicroATM> microATMDeviceDetailList;

    public void setMicroATMDeviceDetailList(List<MicroATM> microATMDeviceDetailList) {
        this.microATMDeviceDetailList = microATMDeviceDetailList;
    }

    /**
     * Gets the value of the microATMDeviceDetailList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microATMDeviceDetailList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicroATMDeviceDetailList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MicroATM }
     * 
     * 
     */
    public List<MicroATM> getMicroATMDeviceDetailList() {
        if (microATMDeviceDetailList == null) {
            microATMDeviceDetailList = new ArrayList<MicroATM>();
        }
        return this.microATMDeviceDetailList;
    }

}
