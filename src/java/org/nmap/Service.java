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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 */
/**
 * <p>
 * </p>
 *
 * @author oliver.kuster
 * @version 1.0 Created on 09/04/2015
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "", propOrder = {"cpe"} )
@XmlRootElement( name = "service" )
public class Service
{

	/**
	 * <p>
	 * </p>
	 */
	public Service()
	{
		super();
	}

	/**
	 * Gets the value of the conf property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getConf()
	{
		return this.conf;
	}

	/**
	 * Gets the value of the cpe property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any
	 * modification you make to the returned list will be present inside the JAXB object. This is
	 * why there is not a <CODE>set</CODE> method for the cpe property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
     *    getCpe( ).add( newItem );
     * </pre>
	 * <p>
	 * Objects of the following type( s ) are allowed in the list {@link Cpe }
	 *
	 * @return
	 */
	public List<Cpe> getCpe()
	{
		if ( this.cpe == null )
		{
			this.cpe = new ArrayList<Cpe>();
		}
		return this.cpe;
	}

	/**
	 * Gets the value of the devicetype property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getDevicetype()
	{
		return this.devicetype;
	}

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
	 * Gets the value of the highver property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getHighver()
	{
		return this.highver;
	}

	/**
	 * Gets the value of the hostname property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getHostname()
	{
		return this.hostname;
	}

	/**
	 * Gets the value of the lowver property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getLowver()
	{
		return this.lowver;
	}

	/**
	 * Gets the value of the method property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getMethod()
	{
		return this.method;
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
	 * Gets the value of the ostype property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getOstype()
	{
		return this.ostype;
	}

	/**
	 * Gets the value of the product property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getProduct()
	{
		return this.product;
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
	 * Gets the value of the rpcnum property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getRpcnum()
	{
		return this.rpcnum;
	}

	/**
	 * Gets the value of the servicefp property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getServicefp()
	{
		return this.servicefp;
	}

	/**
	 * Gets the value of the tunnel property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getTunnel()
	{
		return this.tunnel;
	}

	/**
	 * Gets the value of the version property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getVersion()
	{
		return this.version;
	}

	/**
	 * Sets the value of the conf property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setConf( final String value )
	{
		this.conf = value;
	}

	/**
	 * Sets the value of the devicetype property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setDevicetype( final String value )
	{
		this.devicetype = value;
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
	 * Sets the value of the highver property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setHighver( final String value )
	{
		this.highver = value;
	}

	/**
	 * Sets the value of the hostname property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setHostname( final String value )
	{
		this.hostname = value;
	}

	/**
	 * Sets the value of the lowver property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setLowver( final String value )
	{
		this.lowver = value;
	}

	/**
	 * Sets the value of the method property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setMethod( final String value )
	{
		this.method = value;
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

	/**
	 * Sets the value of the ostype property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setOstype( final String value )
	{
		this.ostype = value;
	}

	/**
	 * Sets the value of the product property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setProduct( final String value )
	{
		this.product = value;
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
	 * Sets the value of the rpcnum property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setRpcnum( final String value )
	{
		this.rpcnum = value;
	}

	/**
	 * Sets the value of the servicefp property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setServicefp( final String value )
	{
		this.servicefp = value;
	}

	/**
	 * Sets the value of the tunnel property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setTunnel( final String value )
	{
		this.tunnel = value;
	}

	/**
	 * Sets the value of the version property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setVersion( final String value )
	{
		this.version = value;
	}

	/**
	 * <p>
	 * Field <code>conf</code>
	 * </p>
	 */
	@XmlAttribute( name = "conf", required = true )
	@XmlJavaTypeAdapter( CollapsedStringAdapter.class )
	private String conf;

	/**
	 * <p>
	 * Field <code>cpe</code>
	 * </p>
	 */
	private List<Cpe> cpe;

	/**
	 * <p>
	 * Field <code>devicetype</code>
	 * </p>
	 */
	@XmlAttribute( name = "devicetype" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String devicetype;

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
	 * Field <code>highver</code>
	 * </p>
	 */
	@XmlAttribute( name = "highver" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String highver;

	/**
	 * <p>
	 * Field <code>hostname</code>
	 * </p>
	 */
	@XmlAttribute( name = "hostname" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String hostname;

	/**
	 * <p>
	 * Field <code>lowver</code>
	 * </p>
	 */
	@XmlAttribute( name = "lowver" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String lowver;

	/**
	 * <p>
	 * Field <code>method</code>
	 * </p>
	 */
	@XmlAttribute( name = "method", required = true )
	@XmlJavaTypeAdapter( CollapsedStringAdapter.class )
	private String method;

	/**
	 * <p>
	 * Field <code>name</code>
	 * </p>
	 */
	@XmlAttribute( name = "name", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String name;

	/**
	 * <p>
	 * Field <code>ostype</code>
	 * </p>
	 */
	@XmlAttribute( name = "ostype" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String ostype;

	/**
	 * <p>
	 * Field <code>product</code>
	 * </p>
	 */
	@XmlAttribute( name = "product" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String product;

	/**
	 * <p>
	 * Field <code>proto</code>
	 * </p>
	 */
	@XmlAttribute( name = "proto" )
	@XmlJavaTypeAdapter( CollapsedStringAdapter.class )
	private String proto;

	/**
	 * <p>
	 * Field <code>rpcnum</code>
	 * </p>
	 */
	@XmlAttribute( name = "rpcnum" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String rpcnum;

	/**
	 * <p>
	 * Field <code>servicefp</code>
	 * </p>
	 */
	@XmlAttribute( name = "servicefp" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String servicefp;

	/**
	 * <p>
	 * Field <code>tunnel</code>
	 * </p>
	 */
	@XmlAttribute( name = "tunnel" )
	@XmlJavaTypeAdapter( CollapsedStringAdapter.class )
	private String tunnel;

	/**
	 * <p>
	 * Field <code>version</code>
	 * </p>
	 */
	@XmlAttribute( name = "version" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String version;

}
