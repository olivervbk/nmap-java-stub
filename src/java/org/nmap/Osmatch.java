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
@XmlType( name = "", propOrder = {"osclass"} )
@XmlRootElement( name = "osmatch" )
public class Osmatch
{

	/**
	 * Gets the value of the accuracy property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getAccuracy()
	{
		return this.accuracy;
	}

	/**
	 * Gets the value of the line property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getLine()
	{
		return this.line;
	}

	/**
	 * Gets the value of the name property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * Gets the value of the osclass property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any
	 * modification you make to the returned list will be present inside the JAXB object. This is
	 * why there is not a <CODE>set</CODE> method for the osclass property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
     *    getOsclass( ).add( newItem );
     * </pre>
	 * <p>
	 * Objects of the following type( s ) are allowed in the list {@link Osclass }
	 * 
	 * @return
	 */
	public List<Osclass> getOsclass()
	{
		if ( this.osclass == null )
		{
			this.osclass = new ArrayList<Osclass>();
		}
		return this.osclass;
	}

	/**
	 * Sets the value of the accuracy property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setAccuracy( final String value )
	{
		this.accuracy = value;
	}

	/**
	 * Sets the value of the line property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setLine( final String value )
	{
		this.line = value;
	}

	/**
	 * Sets the value of the name property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setName( final String value )
	{
		this.name = value;
	}

	@XmlAttribute( name = "accuracy", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String accuracy;

	@XmlAttribute( name = "line", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String line;

	@XmlAttribute( name = "name", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String name;

	private List<Osclass> osclass;

}
