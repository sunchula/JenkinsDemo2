/**
 * 
 */
package com.jcg.customTasks;


import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;


/**
 * @author Chandan Singh
 */
public class LogTasks extends Task
{
		String messageStr;

		public void setMessage(String message)
		{
				this.messageStr = message;
		}
		
		public void execute() throws BuildException
		{
				log(getProject().getProperty("ant.project.name"),Project.MSG_INFO);
				log("Message: " + messageStr, Project.MSG_INFO);
		}
		
}
