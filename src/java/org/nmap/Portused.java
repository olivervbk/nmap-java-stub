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
@XmlRootElement( name = "portused" )
public class Portused
{

	/**
	 * Gets the value of the portid property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getPortid( )
	{
		return this.portid;
	}

	/**
	 * Gets the value of the proto property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getProto( )
	{
		return this.proto;
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
	 * Sets the value of the portid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setPortid( final String value )
	{
		this.portid = value;
	}

	/**
	 * Sets the value of the proto property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setProto( final String value )
	{
		this.proto = value;
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

	@XmlAttribute( name = "portid", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String portid;

	@XmlAttribute( name = "proto", required = true )
	@XmlJavaTypeAdapter( CollapsedStringAdapter.class )
	private String proto;

	@XmlAttribute( name = "state", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String state;

}
