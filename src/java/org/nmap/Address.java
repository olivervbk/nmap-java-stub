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
@XmlRootElement( name = "address" )
public class Address
{

	/**
	 * Gets the value of the addr property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getAddr()
	{
		return this.addr;
	}

	/**
	 * Gets the value of the addrtype property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getAddrtype()
	{
		if ( this.addrtype == null )
		{
			return "ipv4";
		}
		return this.addrtype;
	}

	/**
	 * Gets the value of the vendor property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getVendor()
	{
		return this.vendor;
	}

	/**
	 * Sets the value of the addr property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setAddr( final String value )
	{
		this.addr = value;
	}

	/**
	 * Sets the value of the addrtype property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setAddrtype( final String value )
	{
		this.addrtype = value;
	}

	/**
	 * Sets the value of the vendor property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setVendor( final String value )
	{
		this.vendor = value;
	}

	/**
	 * <p>
	 * Field <code>addr</code>
	 * </p>
	 */
	@XmlAttribute( name = "addr", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String addr;

	/**
	 * <p>
	 * Field <code>addrtype</code>
	 * </p>
	 */
	@XmlAttribute( name = "addrtype" )
	@XmlJavaTypeAdapter( CollapsedStringAdapter.class )
	private String addrtype;

	/**
	 * <p>
	 * Field <code>vendor</code>
	 * </p>
	 */
	@XmlAttribute( name = "vendor" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String vendor;

}
