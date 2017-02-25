/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.smark.vm.tools;

import org.smark.vm.tools.orbd.ORBDApplicationType;
import com.sun.tools.visualvm.application.Application;
import com.sun.tools.visualvm.application.jvm.Jvm;
import com.sun.tools.visualvm.application.type.ApplicationType;
import com.sun.tools.visualvm.application.type.MainClassApplicationTypeFactory;

public class SmarkApplicationTypeFactory extends MainClassApplicationTypeFactory {

    @Override
    public ApplicationType createApplicationTypeFor(Application app, Jvm jvm, String mainClass) {

        app.getStorage().getCustomProperty("");
        //TODO: Specify the name of the application's main class here
        if ("com.sun.corba.se.impl.activation.ORBD".equals(mainClass)) {
            
            return new ORBDApplicationType(app.getPid());
        }
        return null;

    }
}
