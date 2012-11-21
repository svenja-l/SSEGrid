//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 05:26:33 PM CEST 
//


package com.terradue.ogf.schema.glue.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.terradue.ogf.schema.glue.impl.AdminDomainT.Associations;
import com.terradue.ogf.schema.glue.impl.AdminDomainT.Services;


/**
 * <p>Java class for AdminDomain_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdminDomain_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ogf.org/glue/2008/05/spec_2.0_d42_r01}Domain_t">
 *       &lt;sequence>
 *         &lt;element name="Distributed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://schemas.ogf.org/glue/2008/05/spec_2.0_d42_r01}Extensions_t" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://schemas.ogf.org/glue/2008/05/spec_2.0_d42_r01}Location_t" minOccurs="0"/>
 *         &lt;element name="Contact" type="{http://schemas.ogf.org/glue/2008/05/spec_2.0_d42_r01}Contact_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Services" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Service" type="{http://schemas.ogf.org/glue/2008/05/spec_2.0_d42_r01}Service_t" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ComputingService" type="{http://schemas.ogf.org/glue/2008/05/spec_2.0_d42_r01}ComputingService_t" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="StorageService" type="{http://schemas.ogf.org/glue/2008/05/spec_2.0_d42_r01}StorageService_t" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Associations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdminDomainID" type="{http://schemas.ogf.org/glue/2008/05/spec_2.0_d42_r01}ID_t" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdminDomain_t", propOrder = {
    "distributed",
    "owner",
    "extensions",
    "location",
    "contact",
    "services",
    "associations"
})
public class AdminDomainT
    extends DomainT
{

    @XmlElement(name = "Distributed")
    protected Boolean distributed;
    @XmlElement(name = "Owner", required = true)
    protected List<String> owner;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;
    @XmlElement(name = "Location")
    protected LocationT location;
    @XmlElement(name = "Contact", required = true)
    protected List<ContactT> contact;
    @XmlElement(name = "Services")
    protected Services services;
    @XmlElement(name = "Associations")
    protected Associations associations;

    /**
     * Gets the value of the distributed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistributed() {
        return distributed;
    }

    /**
     * Sets the value of the distributed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistributed(Boolean value) {
        this.distributed = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the owner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOwner() {
        if (owner == null) {
            owner = new ArrayList<String>();
        }
        return this.owner;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsT }
     *     
     */
    public ExtensionsT getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsT }
     *     
     */
    public void setExtensions(ExtensionsT value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationT }
     *     
     */
    public LocationT getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationT }
     *     
     */
    public void setLocation(LocationT value) {
        this.location = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactT }
     * 
     * 
     */
    public List<ContactT> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactT>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link Services }
     *     
     */
    public Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link Services }
     *     
     */
    public void setServices(Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link Associations }
     *     
     */
    public Associations getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Associations }
     *     
     */
    public void setAssociations(Associations value) {
        this.associations = value;
    }


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
     *         &lt;element name="AdminDomainID" type="{http://schemas.ogf.org/glue/2008/05/spec_2.0_d42_r01}ID_t" maxOccurs="unbounded" minOccurs="0"/>
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
        "adminDomainID"
    })
    public static class Associations {

        @XmlElement(name = "AdminDomainID", required = true)
        protected List<String> adminDomainID;

        /**
         * Gets the value of the adminDomainID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the adminDomainID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdminDomainID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAdminDomainID() {
            if (adminDomainID == null) {
                adminDomainID = new ArrayList<String>();
            }
            return this.adminDomainID;
        }

    }


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
     *         &lt;element name="Service" type="{http://schemas.ogf.org/glue/2008/05/spec_2.0_d42_r01}Service_t" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ComputingService" type="{http://schemas.ogf.org/glue/2008/05/spec_2.0_d42_r01}ComputingService_t" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="StorageService" type="{http://schemas.ogf.org/glue/2008/05/spec_2.0_d42_r01}StorageService_t" maxOccurs="unbounded" minOccurs="0"/>
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
        "service",
        "computingService",
        "storageService"
    })
    public static class Services {

        @XmlElement(name = "Service", required = true)
        protected List<ServiceT> service;
        @XmlElement(name = "ComputingService", required = true)
        protected List<ComputingServiceT> computingService;
        @XmlElement(name = "StorageService", required = true)
        protected List<StorageServiceT> storageService;

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceT }
         * 
         * 
         */
        public List<ServiceT> getService() {
            if (service == null) {
                service = new ArrayList<ServiceT>();
            }
            return this.service;
        }

        /**
         * Gets the value of the computingService property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the computingService property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComputingService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ComputingServiceT }
         * 
         * 
         */
        public List<ComputingServiceT> getComputingService() {
            if (computingService == null) {
                computingService = new ArrayList<ComputingServiceT>();
            }
            return this.computingService;
        }

        /**
         * Gets the value of the storageService property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the storageService property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStorageService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StorageServiceT }
         * 
         * 
         */
        public List<StorageServiceT> getStorageService() {
            if (storageService == null) {
                storageService = new ArrayList<StorageServiceT>();
            }
            return this.storageService;
        }

    }

}