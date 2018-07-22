
package com.jcg.antdemo;

import javax.servlet.http.HttpServlet;

/**
 * @author Chandan Singh
 */
public class HelloWorld extends HttpServlet
{
		public int add(int operand1, int operand2)
    {
		   return operand1+operand2;
    }
}
