/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.smark.vm.tools;

import org.smark.vm.tools.orbd.ORBDViewPluginProvider;
import com.sun.tools.visualvm.application.type.ApplicationTypeFactory;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {

    private static SmarkApplicationTypeFactory INSTANCE = new SmarkApplicationTypeFactory();

    @Override
    public void restored() {
        ApplicationTypeFactory.getDefault().registerProvider(INSTANCE);
        ORBDViewPluginProvider.initialize();
    }

    @Override
    public void uninstalled() {
        ApplicationTypeFactory.getDefault().unregisterProvider(INSTANCE);
        ORBDViewPluginProvider.uninitialize();
    }
}

