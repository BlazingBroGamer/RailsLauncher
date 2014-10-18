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


package org.poweredrails.bootstrap.commandinterface;


public interface CPInterface {
	
    /**
     * Chooses the interface to open!
     * 
     * @param console
     * @param openPanel
     * @return
     */
	
	CPInterface createInterface(boolean console, boolean openPanel);

}
