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
@XmlRootElement( name = "taskend" )
public class Taskend
{

	/**
	 * Gets the value of the extrainfo property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getExtrainfo()
	{
		return this.extrainfo;
	}

	/**
	 * Gets the value of the task property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getTask()
	{
		return this.task;
	}

	/**
	 * Gets the value of the time property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getTime()
	{
		return this.time;
	}

	/**
	 * Sets the value of the extrainfo property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setExtrainfo( final String value )
	{
		this.extrainfo = value;
	}

	/**
	 * Sets the value of the task property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setTask( final String value )
	{
		this.task = value;
	}

	/**
	 * Sets the value of the time property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setTime( final String value )
	{
		this.time = value;
	}

	/**
	 * <p>
	 * Field <code>extrainfo</code>
	 * </p>
	 */
	@XmlAttribute( name = "extrainfo" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String extrainfo;

	/**
	 * <p>
	 * Field <code>task</code>
	 * </p>
	 */
	@XmlAttribute( name = "task", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String task;

	/**
	 * <p>
	 * Field <code>time</code>
	 * </p>
	 */
	@XmlAttribute( name = "time", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String time;

}
