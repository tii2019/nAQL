/**
 * 
 */
package xquery;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 */
public class AuxiliaryXQueryNode {

	private static AtomicInteger nextId = new AtomicInteger(0);
	
	private int id;
	
	public AuxiliaryXQueryNode() {
		// TODO Auto-generated constructor stub
		id = nextId.getAndIncrement();
	}
	
	public String getName() {
		return "n" + id;
	}
	
	public static void resetIdx() {
		nextId.getAndSet(0); 
	}
	
	public String getExpression () {
		return "$" + getName();
	} 
	
	public String toString () {
		return getExpression();
	}
	
}
