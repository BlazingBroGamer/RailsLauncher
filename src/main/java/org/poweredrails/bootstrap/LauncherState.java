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


package org.poweredrails.bootstrap;


    public enum LauncherState {
        LOADING,
        CHECKUPDATE,
        OPENCONNECTION,
        PRELOAD,
        LAUNCHER_OPENED,
        LAUNCHER_CLOSING,
        CLOSE_CLIENT,
        END;

        static LauncherState currentState;

        public static LauncherState getState(){
            return currentState;
        }

        public static void setState(LauncherState ls){
            currentState = ls;
        }

}


