// This file was generated by Mendix Modeler 6.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package administration.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Administration module

	public static void manageMyAccount(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "Administration.ManageMyAccount", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void markAsWebServiceUser(IContext context, administration.proxies.Account _account)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Account", _account == null ? null : _account.getMendixObject());
			Core.execute(context, "Administration.MarkAsWebServiceUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void newNormalAccount(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "Administration.NewNormalAccount", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void newWebServiceAccount(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "Administration.NewWebServiceAccount", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static java.util.List<system.proxies.TimeZone> retrieveTimeZones(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			java.util.List<IMendixObject> objs = Core.execute(context, "Administration.RetrieveTimeZones", params);
			java.util.List<system.proxies.TimeZone> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<system.proxies.TimeZone>();
				for (IMendixObject obj : objs)
					result.add(system.proxies.TimeZone.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void saveAccount(IContext context, administration.proxies.Account _account)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Account", _account == null ? null : _account.getMendixObject());
			Core.execute(context, "Administration.SaveAccount", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}