//
// This file was generated by the JavaTM Architecture for XML Binding( JAXB ) Reference
// Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.10 at 05:35:25 PM BRST
//

package org.nmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "" )
@XmlRootElement( name = "osfingerprint" )
public class Osfingerprint
{

	/**
	 * Gets the value of the fingerprint property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getFingerprint( )
	{
		return this.fingerprint;
	}

	/**
	 * Sets the value of the fingerprint property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setFingerprint( final String value )
	{
		this.fingerprint = value;
	}

	@XmlAttribute( name = "fingerprint", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String fingerprint;

}
