/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.smark.vm.tools;

import org.smark.vm.tools.orbd.ORBDApplicationType;
import com.sun.tools.visualvm.application.Application;
import com.sun.tools.visualvm.application.type.ApplicationTypeFactory;
import com.sun.tools.visualvm.core.ui.actions.SingleDataSourceAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JOptionPane;

public class AnagramAction extends SingleDataSourceAction<Application> {

    public AnagramAction() {
        super(Application.class);
        putValue(Action.NAME, "Show Anagram PID");
        putValue(Action.SHORT_DESCRIPTION, "Demoes a menu item");
    }

    @Override
    protected void actionPerformed(Application application, ActionEvent arg1) {
        JOptionPane.showMessageDialog(null, application.getPid());
    }

    //Here you can determine whether the menu item is enabled,
    //depending on the data source type that is selected. In this
    //example, the menu item is enabled for all types within
    //the current data source:
    @Override
    protected boolean isEnabled(Application application) {
        if (ApplicationTypeFactory.getApplicationTypeFor(application) instanceof ORBDApplicationType) {
            return true;
        }
        return false;
    }
}

