package org.apds.interop.apds2netex.netex;

import generated.eu.cen.netex.PublicationDeliveryStructure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "PublicationDelivery", namespace = "http://www.netex.org.uk/netex")
@XmlAccessorType( XmlAccessType.FIELD)
public class PublicationDelivery extends PublicationDeliveryStructure {
    public PublicationDelivery() {
        super();
    }
}
