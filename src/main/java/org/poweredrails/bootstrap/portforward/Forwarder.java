/**
 *     This file is a part of Rails, licensed under the MIT License (MIT)
 *     
 *     Copyright (c) PoweredRails <http://www.poweredrails.org>
 *     
 *     Read "LICENSE.md" for the full license!
 *     
 *     @author RONNOC777
 *     
 */


package org.poweredrails.bootstrap.portforward;

public interface Forwarder {
	
	/**
	 * Returns the forwarder.
	 * 
	 * @return
	 */
	
	Forwarder forwarder();
	
	/**
	 * Gets the main arguments needed to portforward.
	 * 
	 * @param args
	 * @return
	 */
    
    Forwarder main(String[] args);

}
