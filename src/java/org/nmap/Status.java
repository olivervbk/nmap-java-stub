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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "" )
@XmlRootElement( name = "status" )
public class Status
{

	/**
	 * Gets the value of the reason property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getReason( )
	{
		return this.reason;
	}

	/**
	 * Gets the value of the reasonTtl property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getReasonTtl( )
	{
		return this.reasonTtl;
	}

	/**
	 * Gets the value of the state property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getState( )
	{
		return this.state;
	}

	/**
	 * Sets the value of the reason property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setReason( final String value )
	{
		this.reason = value;
	}

	/**
	 * Sets the value of the reasonTtl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setReasonTtl( final String value )
	{
		this.reasonTtl = value;
	}

	/**
	 * Sets the value of the state property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setState( final String value )
	{
		this.state = value;
	}

	@XmlAttribute( name = "reason", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String reason;

	@XmlAttribute( name = "reason_ttl", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String reasonTtl;

	@XmlAttribute( name = "state", required = true )
	@XmlJavaTypeAdapter( CollapsedStringAdapter.class )
	private String state;

}
