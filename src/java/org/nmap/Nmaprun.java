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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "", propOrder = {	"scaninfo",
									"verbose",
									"debugging",
									"targetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput",
									"runstats"} )
@XmlRootElement( name = "nmaprun" )
public class Nmaprun
{

	/**
	 * Gets the value of the args property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getArgs()
	{
		return this.args;
	}

	/**
	 * Gets the value of the debugging property.
	 *
	 * @return possible object is {@link Debugging }
	 */
	public Debugging getDebugging()
	{
		return this.debugging;
	}

	/**
	 * Gets the value of the profileName property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getProfileName()
	{
		return this.profileName;
	}

	/**
	 * Gets the value of the runstats property.
	 *
	 * @return possible object is {@link Runstats }
	 */
	public Runstats getRunstats()
	{
		return this.runstats;
	}

	/**
	 * Gets the value of the scaninfo property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any
	 * modification you make to the returned list will be present inside the JAXB object. This is
	 * why there is not a <CODE>set</CODE> method for the scaninfo property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
     *    getScaninfo( ).add( newItem );
     * </pre>
	 * <p>
	 * Objects of the following type( s ) are allowed in the list {@link Scaninfo }
	 *
	 * @return
	 */
	public List<Scaninfo> getScaninfo()
	{
		if ( this.scaninfo == null )
		{
			this.scaninfo = new ArrayList<Scaninfo>();
		}
		return this.scaninfo;
	}

	/**
	 * Gets the value of the scanner property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getScanner()
	{
		return this.scanner;
	}

	/**
	 * Gets the value of the start property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getStart()
	{
		return this.start;
	}

	/**
	 * Gets the value of the startstr property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getStartstr()
	{
		return this.startstr;
	}

	/**
	 * Gets the value of the
	 * targetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any
	 * modification you make to the returned list will be present inside the JAXB object. This is
	 * why there is not a <CODE>set</CODE> method for the
	 * targetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
     *    getTargetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput( ).add( newItem );
     * </pre>
	 * <p>
	 * Objects of the following type( s ) are allowed in the list {@link Target } {@link Taskbegin }
	 * {@link Taskprogress } {@link Taskend } {@link Prescript } {@link Postscript } {@link Host }
	 * {@link Output }
	 * 
	 * @return
	 */
	public List<Object> getTargetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput()
	{
		if ( this.targetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput == null )
		{
			this.targetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput = new ArrayList<Object>();
		}
		return this.targetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput;
	}

	/**
	 * Gets the value of the verbose property.
	 *
	 * @return possible object is {@link Verbose }
	 */
	public Verbose getVerbose()
	{
		return this.verbose;
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
	 * Gets the value of the xmloutputversion property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getXmloutputversion()
	{
		return this.xmloutputversion;
	}

	/**
	 * Sets the value of the args property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setArgs( final String value )
	{
		this.args = value;
	}

	/**
	 * Sets the value of the debugging property.
	 *
	 * @param value
	 *            allowed object is {@link Debugging }
	 */
	public void setDebugging( final Debugging value )
	{
		this.debugging = value;
	}

	/**
	 * Sets the value of the profileName property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setProfileName( final String value )
	{
		this.profileName = value;
	}

	/**
	 * Sets the value of the runstats property.
	 *
	 * @param value
	 *            allowed object is {@link Runstats }
	 */
	public void setRunstats( final Runstats value )
	{
		this.runstats = value;
	}

	/**
	 * Sets the value of the scanner property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setScanner( final String value )
	{
		this.scanner = value;
	}

	/**
	 * Sets the value of the start property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setStart( final String value )
	{
		this.start = value;
	}

	/**
	 * Sets the value of the startstr property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setStartstr( final String value )
	{
		this.startstr = value;
	}

	/**
	 * Sets the value of the verbose property.
	 *
	 * @param value
	 *            allowed object is {@link Verbose }
	 */
	public void setVerbose( final Verbose value )
	{
		this.verbose = value;
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
	 * Sets the value of the xmloutputversion property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setXmloutputversion( final String value )
	{
		this.xmloutputversion = value;
	}

	@XmlAttribute( name = "args" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String args;

	@XmlElement( required = true )
	private Debugging debugging;

	@XmlAttribute( name = "profile_name" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String profileName;

	@XmlElement( required = true )
	private Runstats runstats;

	private List<Scaninfo> scaninfo;

	@XmlAttribute( name = "scanner", required = true )
	@XmlJavaTypeAdapter( CollapsedStringAdapter.class )
	private String scanner;

	@XmlAttribute( name = "start" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String start;

	@XmlAttribute( name = "startstr" )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String startstr;

	@XmlElements( {	@XmlElement( name = "target", type = Target.class ),
					@XmlElement( name = "taskbegin", type = Taskbegin.class ),
					@XmlElement( name = "taskprogress", type = Taskprogress.class ),
					@XmlElement( name = "taskend", type = Taskend.class ),
					@XmlElement( name = "prescript", type = Prescript.class ),
					@XmlElement( name = "postscript", type = Postscript.class ),
					@XmlElement( name = "host", type = Host.class ),
					@XmlElement( name = "output", type = Output.class )} )
	private List<Object> targetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput;

	@XmlElement( required = true )
	private Verbose verbose;

	@XmlAttribute( name = "version", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String version;

	@XmlAttribute( name = "xmloutputversion", required = true )
	@XmlJavaTypeAdapter( NormalizedStringAdapter.class )
	private String xmloutputversion;

}