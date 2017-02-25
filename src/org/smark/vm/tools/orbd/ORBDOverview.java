/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.smark.vm.tools.orbd;

import com.sun.tools.visualvm.application.Application;
import com.sun.tools.visualvm.core.ui.DataSourceViewPlugin;
import com.sun.tools.visualvm.core.ui.components.DataViewComponent;
import com.sun.tools.visualvm.core.ui.components.ScrollableContainer;
import javax.swing.JPanel;

/**
 *
 * @author geertjan
 */
public class ORBDOverview extends DataSourceViewPlugin {

    ORBDOverview(Application application) {
        super(application);
    }

    public DataViewComponent.DetailsView createView(int location) {
        switch (location) {
            case DataViewComponent.TOP_RIGHT:
                JPanel panel = new ORBDInfoPanel();
                return new DataViewComponent.DetailsView("ORBD Information", null, 30,
                        new ScrollableContainer(panel), null);
            default:
                return null;
        }
    }
}