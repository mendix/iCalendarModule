// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package icalendarmodule.proxies;

/**
 * 
 */
public class AppointmentTemplate
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject appointmentTemplateMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "iCalendarModule.AppointmentTemplate";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		UID("UID"),
		UpdateSequence("UpdateSequence"),
		StartDateTime("StartDateTime"),
		EndDateTime("EndDateTime"),
		Subject("Subject"),
		BodyText("BodyText"),
		RecipientEmailAddress("RecipientEmailAddress"),
		SenderEmailAddress("SenderEmailAddress"),
		Location("Location");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public AppointmentTemplate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "iCalendarModule.AppointmentTemplate"));
	}

	protected AppointmentTemplate(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject appointmentTemplateMendixObject)
	{
		if (appointmentTemplateMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("iCalendarModule.AppointmentTemplate", appointmentTemplateMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a iCalendarModule.AppointmentTemplate");

		this.appointmentTemplateMendixObject = appointmentTemplateMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AppointmentTemplate.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static icalendarmodule.proxies.AppointmentTemplate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return icalendarmodule.proxies.AppointmentTemplate.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static icalendarmodule.proxies.AppointmentTemplate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("iCalendarModule.Appointment", mendixObject.getType()))
			return icalendarmodule.proxies.Appointment.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("iCalendarModule.AppointmentNotification", mendixObject.getType()))
			return icalendarmodule.proxies.AppointmentNotification.initialize(context, mendixObject);

		return new icalendarmodule.proxies.AppointmentTemplate(context, mendixObject);
	}

	public static icalendarmodule.proxies.AppointmentTemplate load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return icalendarmodule.proxies.AppointmentTemplate.initialize(context, mendixObject);
	}

	public static java.util.List<? extends icalendarmodule.proxies.AppointmentTemplate> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<icalendarmodule.proxies.AppointmentTemplate> result = new java.util.ArrayList<icalendarmodule.proxies.AppointmentTemplate>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//iCalendarModule.AppointmentTemplate" + xpathConstraint))
			result.add(icalendarmodule.proxies.AppointmentTemplate.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of UID
	 */
	public final String getUID()
	{
		return getUID(getContext());
	}

	/**
	 * @param context
	 * @return value of UID
	 */
	public final String getUID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.UID.toString());
	}

	/**
	 * Set value of UID
	 * @param uid
	 */
	public final void setUID(String uid)
	{
		setUID(getContext(), uid);
	}

	/**
	 * Set value of UID
	 * @param context
	 * @param uid
	 */
	public final void setUID(com.mendix.systemwideinterfaces.core.IContext context, String uid)
	{
		getMendixObject().setValue(context, MemberNames.UID.toString(), uid);
	}

	/**
	 * @return value of UpdateSequence
	 */
	public final Integer getUpdateSequence()
	{
		return getUpdateSequence(getContext());
	}

	/**
	 * @param context
	 * @return value of UpdateSequence
	 */
	public final Integer getUpdateSequence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.UpdateSequence.toString());
	}

	/**
	 * Set value of UpdateSequence
	 * @param updatesequence
	 */
	public final void setUpdateSequence(Integer updatesequence)
	{
		setUpdateSequence(getContext(), updatesequence);
	}

	/**
	 * Set value of UpdateSequence
	 * @param context
	 * @param updatesequence
	 */
	public final void setUpdateSequence(com.mendix.systemwideinterfaces.core.IContext context, Integer updatesequence)
	{
		getMendixObject().setValue(context, MemberNames.UpdateSequence.toString(), updatesequence);
	}

	/**
	 * @return value of StartDateTime
	 */
	public final java.util.Date getStartDateTime()
	{
		return getStartDateTime(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDateTime
	 */
	public final java.util.Date getStartDateTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDateTime.toString());
	}

	/**
	 * Set value of StartDateTime
	 * @param startdatetime
	 */
	public final void setStartDateTime(java.util.Date startdatetime)
	{
		setStartDateTime(getContext(), startdatetime);
	}

	/**
	 * Set value of StartDateTime
	 * @param context
	 * @param startdatetime
	 */
	public final void setStartDateTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdatetime)
	{
		getMendixObject().setValue(context, MemberNames.StartDateTime.toString(), startdatetime);
	}

	/**
	 * @return value of EndDateTime
	 */
	public final java.util.Date getEndDateTime()
	{
		return getEndDateTime(getContext());
	}

	/**
	 * @param context
	 * @return value of EndDateTime
	 */
	public final java.util.Date getEndDateTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndDateTime.toString());
	}

	/**
	 * Set value of EndDateTime
	 * @param enddatetime
	 */
	public final void setEndDateTime(java.util.Date enddatetime)
	{
		setEndDateTime(getContext(), enddatetime);
	}

	/**
	 * Set value of EndDateTime
	 * @param context
	 * @param enddatetime
	 */
	public final void setEndDateTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date enddatetime)
	{
		getMendixObject().setValue(context, MemberNames.EndDateTime.toString(), enddatetime);
	}

	/**
	 * @return value of Subject
	 */
	public final String getSubject()
	{
		return getSubject(getContext());
	}

	/**
	 * @param context
	 * @return value of Subject
	 */
	public final String getSubject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Subject.toString());
	}

	/**
	 * Set value of Subject
	 * @param subject
	 */
	public final void setSubject(String subject)
	{
		setSubject(getContext(), subject);
	}

	/**
	 * Set value of Subject
	 * @param context
	 * @param subject
	 */
	public final void setSubject(com.mendix.systemwideinterfaces.core.IContext context, String subject)
	{
		getMendixObject().setValue(context, MemberNames.Subject.toString(), subject);
	}

	/**
	 * @return value of BodyText
	 */
	public final String getBodyText()
	{
		return getBodyText(getContext());
	}

	/**
	 * @param context
	 * @return value of BodyText
	 */
	public final String getBodyText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.BodyText.toString());
	}

	/**
	 * Set value of BodyText
	 * @param bodytext
	 */
	public final void setBodyText(String bodytext)
	{
		setBodyText(getContext(), bodytext);
	}

	/**
	 * Set value of BodyText
	 * @param context
	 * @param bodytext
	 */
	public final void setBodyText(com.mendix.systemwideinterfaces.core.IContext context, String bodytext)
	{
		getMendixObject().setValue(context, MemberNames.BodyText.toString(), bodytext);
	}

	/**
	 * @return value of RecipientEmailAddress
	 */
	public final String getRecipientEmailAddress()
	{
		return getRecipientEmailAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of RecipientEmailAddress
	 */
	public final String getRecipientEmailAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.RecipientEmailAddress.toString());
	}

	/**
	 * Set value of RecipientEmailAddress
	 * @param recipientemailaddress
	 */
	public final void setRecipientEmailAddress(String recipientemailaddress)
	{
		setRecipientEmailAddress(getContext(), recipientemailaddress);
	}

	/**
	 * Set value of RecipientEmailAddress
	 * @param context
	 * @param recipientemailaddress
	 */
	public final void setRecipientEmailAddress(com.mendix.systemwideinterfaces.core.IContext context, String recipientemailaddress)
	{
		getMendixObject().setValue(context, MemberNames.RecipientEmailAddress.toString(), recipientemailaddress);
	}

	/**
	 * @return value of SenderEmailAddress
	 */
	public final String getSenderEmailAddress()
	{
		return getSenderEmailAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of SenderEmailAddress
	 */
	public final String getSenderEmailAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.SenderEmailAddress.toString());
	}

	/**
	 * Set value of SenderEmailAddress
	 * @param senderemailaddress
	 */
	public final void setSenderEmailAddress(String senderemailaddress)
	{
		setSenderEmailAddress(getContext(), senderemailaddress);
	}

	/**
	 * Set value of SenderEmailAddress
	 * @param context
	 * @param senderemailaddress
	 */
	public final void setSenderEmailAddress(com.mendix.systemwideinterfaces.core.IContext context, String senderemailaddress)
	{
		getMendixObject().setValue(context, MemberNames.SenderEmailAddress.toString(), senderemailaddress);
	}

	/**
	 * @return value of Location
	 */
	public final String getLocation()
	{
		return getLocation(getContext());
	}

	/**
	 * @param context
	 * @return value of Location
	 */
	public final String getLocation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Location.toString());
	}

	/**
	 * Set value of Location
	 * @param location
	 */
	public final void setLocation(String location)
	{
		setLocation(getContext(), location);
	}

	/**
	 * Set value of Location
	 * @param context
	 * @param location
	 */
	public final void setLocation(com.mendix.systemwideinterfaces.core.IContext context, String location)
	{
		getMendixObject().setValue(context, MemberNames.Location.toString(), location);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return appointmentTemplateMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final icalendarmodule.proxies.AppointmentTemplate that = (icalendarmodule.proxies.AppointmentTemplate) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "iCalendarModule.AppointmentTemplate";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}