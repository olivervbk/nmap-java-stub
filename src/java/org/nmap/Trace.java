//
// This file was generated by the JavaTM Architecture for XML Binding( JAXB ) Reference
// Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.10 at 05:35:25 PM BRST
//

package org.nmap;

import java.util.ArrayList;
import java.util.List;

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
@XmlType( name = "", propOrder = {"hop"} )
@XmlRootElement( name = "trace" )
public class Trace
{

	/**
	 * <p>
	 * </p>
	 */
	public Trace()
	{
		super();
	}

	/**
	 * Gets the value of the hop property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any
	 * modification you make to the returned list will be present inside the JAXB object. This is
	 * why there is not a <CODE>set</CODE> method for the hop property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
     *    getHop( ).add( newItem );
     * </pre>
	 * <p>
	 * Objects of the following type( s ) are allowed in the list {@link Hop }
	 *
	 * @return
	 */
	public List<Hop> getHop()
	{
		if ( this.hop == null )
		{
			this.hop = new ArrayList<Hop>();
		}
		return this.hop;
	}

	/**
	 * Gets the value of the port property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getPort()
	{
		return this.port;
	}

	/**
	 * Gets the value of the proto property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getProto()
	{
		return this.proto;
	}

	/**
	 * Sets the value of the port property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setPort( final String value )
	{
		this.port = value;
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
	 * <p>
	 * Field <code>hop</code>
	 * </p>
	 */
	private List<Hop> hop;

	/**
	 * <p>
	 * Field <code>port</code>
	 * </p>
	 */
	@XmlAttribute( name = "port" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String port;

	/**
	 * <p>
	 * Field <code>proto</code>
	 * </p>
	 */
	@XmlAttribute( name = "proto" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String proto;

}
