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
@XmlRootElement( name = "tcpsequence" )
public class Tcpsequence
{

	/**
	 * Gets the value of the difficulty property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getDifficulty( )
	{
		return this.difficulty;
	}

	/**
	 * Gets the value of the index property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getIndex( )
	{
		return this.index;
	}

	/**
	 * Gets the value of the values property.
	 * 
	 * @return possible object is {@link String }
	 */
	public String getValues( )
	{
		return this.values;
	}

	/**
	 * Sets the value of the difficulty property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setDifficulty( final String value )
	{
		this.difficulty = value;
	}

	/**
	 * Sets the value of the index property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setIndex( final String value )
	{
		this.index = value;
	}

	/**
	 * Sets the value of the values property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setValues( final String value )
	{
		this.values = value;
	}

	@XmlAttribute( name = "difficulty", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String difficulty;

	@XmlAttribute( name = "index", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String index;

	@XmlAttribute( name = "values", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String values;

}
