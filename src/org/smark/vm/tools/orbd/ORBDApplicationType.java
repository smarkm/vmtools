/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.smark.vm.tools.orbd;

import com.sun.tools.visualvm.application.type.ApplicationType;
import java.awt.Image;
import org.openide.util.Utilities;

public class ORBDApplicationType extends ApplicationType {

    protected final int appPID;

    public ORBDApplicationType(int pid) {
        appPID = pid;
    }

    @Override
    public String getName() {
        return "ORBD";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String getDescription() {
        return "Application type for ORBD";
    }

    @Override
    public Image getIcon() {
        return Utilities.loadImage("com/sun/tools/visualvm/core/ui/resources/snapshot.png", true);
    }
}
