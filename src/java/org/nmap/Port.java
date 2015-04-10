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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "", propOrder = {	"state",
									"owner",
									"service",
									"script"} )
@XmlRootElement( name = "port" )
public class Port
{

	/**
	 * Gets the value of the owner property.
	 *
	 * @return possible object is {@link Owner }
	 */
	public Owner getOwner()
	{
		return this.owner;
	}

	/**
	 * Gets the value of the portid property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getPortid()
	{
		return this.portid;
	}

	/**
	 * Gets the value of the protocol property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getProtocol()
	{
		return this.protocol;
	}

	/**
	 * Gets the value of the script property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any
	 * modification you make to the returned list will be present inside the JAXB object. This is
	 * why there is not a <CODE>set</CODE> method for the script property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
     *    getScript( ).add( newItem );
     * </pre>
	 * <p>
	 * Objects of the following type( s ) are allowed in the list {@link Script }
	 *
	 * @return
	 */
	public List<Script> getScript()
	{
		if ( this.script == null )
		{
			this.script = new ArrayList<Script>();
		}
		return this.script;
	}

	/**
	 * Gets the value of the service property.
	 *
	 * @return possible object is {@link Service }
	 */
	public Service getService()
	{
		return this.service;
	}

	/**
	 * Gets the value of the state property.
	 *
	 * @return possible object is {@link State }
	 */
	public State getState()
	{
		return this.state;
	}

	/**
	 * Sets the value of the owner property.
	 *
	 * @param value
	 *            allowed object is {@link Owner }
	 */
	public void setOwner( final Owner value )
	{
		this.owner = value;
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
	 * Sets the value of the protocol property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setProtocol( final String value )
	{
		this.protocol = value;
	}

	/**
	 * Sets the value of the service property.
	 *
	 * @param value
	 *            allowed object is {@link Service }
	 */
	public void setService( final Service value )
	{
		this.service = value;
	}

	/**
	 * Sets the value of the state property.
	 *
	 * @param value
	 *            allowed object is {@link State }
	 */
	public void setState( final State value )
	{
		this.state = value;
	}

	/**
	 * <p>
	 * Field <code>owner</code>
	 * </p>
	 */
	private Owner owner;

	/**
	 * <p>
	 * Field <code>portid</code>
	 * </p>
	 */
	@XmlAttribute( name = "portid", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String portid;

	/**
	 * <p>
	 * Field <code>protocol</code>
	 * </p>
	 */
	@XmlAttribute( name = "protocol", required = true )
	@XmlJavaTypeAdapter( CollapsedStringAdapter.class )
	private String protocol;

	/**
	 * <p>
	 * Field <code>script</code>
	 * </p>
	 */
	private List<Script> script;

	/**
	 * <p>
	 * Field <code>service</code>
	 * </p>
	 */
	private Service service;

	/**
	 * <p>
	 * Field <code>state</code>
	 * </p>
	 */
	@XmlElement( required = true )
	private State state;

}