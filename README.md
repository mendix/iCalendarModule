# iCalendarModule
This module sends appointment invites through e-mail.

## Description
Does your project contains planning functionality and for example generates appointments, scheduled meetings and you want them to be available in a user's personal agenda (Outlook, Gmail, Lotus Notes) then you might want to use this module.

This module facilitates the transportation mechanism to send the appointment invite to a user's client. Just like a normal 'Outlook' invite the recipient can accept or decline. This module also supports several mobile clients by using a vCalendar standard. By using this module you can create/update/cancel appointments the same way as in outlook, also multiple recipients can be added to an appointment. Each notification (create/update/cancel) will be added to a queue, every 1 minute the queue will be automatically processed by a scheduled event so that the e-mail notifications are sent to all recipients.

The implementation of this module is based on a iCal4j library.

http://ical4j.sourceforge.net

## Typical usage scenario
* Send an appointment invite to a user's personal agenda
* Useful in applications which contain planning/agenda functionality

## Features and limitations
* Create/update/cancel appointments
* Sent invites and notifications
* Contains simple logging of appointments

## Configuration
* Add 'SMTPSettings Snippet to the navigation
* Add 'Appointment_Overview' Snippet to a page
* As an administrator, set SMTP settings while being 'in runtime'
* Other 'Sub-microflows' in the Use Me folder can be used to control appointments
* Navigate to 'Appointment_Overview' to create/change appointments
* To implement this functionality in your own project you can use the sub microflows in Use Me folder
* When creating/updating appointments notifications will be sent when pressing the 'save' button.
* If the appointment is re-scheduled or recipients has been changed there will be automatically sent updates through mail on 'save'.

## Known Issues
In Mendix 5.x it possible to run into class loader issues with the email classes. Most common issues are related to messages that mime-types aren't support. If you have exceptions mentioning mime-types you should validate your libraries. Any jar file related to mail should be removed with the exception of: "com.sun.mail.javax.mail-1.4.5.jar"
