// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package icalendarmodule.proxies;

public enum NotificationType
{
	Create(new String[][] { new String[] { "en_US", "Create" }, new String[] { "nl_NL", "Nieuw" } }),
	Update(new String[][] { new String[] { "en_US", "Update" }, new String[] { "nl_NL", "Update" } }),
	Cancel(new String[][] { new String[] { "en_US", "Cancel" }, new String[] { "nl_NL", "Annuleren" } });

	private java.util.Map<String,String> captions;

	private NotificationType(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}
