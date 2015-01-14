/**
 *     This file is a part of Rails, licensed under the MIT License (MIT)
 *     
 *     Copyright (c) PoweredRails <http://www.poweredrails.org>
 *     
 *     Read "LICENSE.md" for the full license!
 *     
 *     @author RONNOC777, BlazingBroGamer
 *     
 */


package org.poweredrails.bootstrap;

import java.awt.Toolkit;
import java.io.IOException;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Launcher {
    
    JFrame mainLauncher;
    String vercheck = "";
    String launcherVersion = "1.0";
    String launcherName = "Powered Rails Version " + launcherVersion;
    
    public static void main(String[] args){
        new Launcher();
    }
    
    public Launcher(){
        LauncherState.setState(LauncherState.LOADING);
        boolean isconnected = isConnectedToInternet();
        if(isconnected){
            LauncherState.setState(LauncherState.CHECKUPDATE);
            if(!checkVersion()){
                int rpl = JOptionPane.showConfirmDialog(null, "Update is Available!\nDo you want to"
                                                        + " download this version?", "[Powered Rails]",
                                                        JOptionPane.YES_NO_OPTION);
                if(rpl == JOptionPane.YES_OPTION){
                    updateLauncher();
                }
            }
        }
        if(!isconnected)
            launcherName += " [Offline!]";
        LauncherState.setState(LauncherState.LAUNCHER_OPENED);
        mainLauncher = new JFrame(launcherName);
        mainLauncher.setVisible(true);
        mainLauncher.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        mainLauncher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     *
     * Updates the Launcher, from the download page, from inside the launcher.
     *
     */
    
    public void updateLauncher(){
        
    }
    
    /**
     *
     * Check if the person is connected to the internet.
     *
     * @return
     */
    
    public boolean isConnectedToInternet(){
        try {
            if(InetAddress.getLocalHost().isReachable(200000))
                return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
    
    /**
     * Checks the version, and if it needs updating or not. (Under Development)
     * 
     * @return
     */
    
    public boolean checkVersion(){
        return true;
    }
    
    /**
     * This returns the newest version. (Under Development)
     * 
     * @return
     */
    
    public String getVersion(){
        return "";
    }
    
}
