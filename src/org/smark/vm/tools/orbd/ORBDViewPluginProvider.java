package org.smark.vm.tools.orbd;

import org.smark.vm.tools.orbd.ORBDOverview;
import com.sun.tools.visualvm.application.Application;
import com.sun.tools.visualvm.application.type.ApplicationTypeFactory;
import com.sun.tools.visualvm.application.views.ApplicationViewsSupport;
import com.sun.tools.visualvm.core.ui.DataSourceViewPlugin;
import com.sun.tools.visualvm.core.ui.DataSourceViewPluginProvider;

/**
 *
 * @author Jiri Sedlacek
 */
public class ORBDViewPluginProvider extends DataSourceViewPluginProvider<Application> {

    protected DataSourceViewPlugin createPlugin(Application application) {
        return new ORBDOverview(application);
    }

    protected boolean supportsPluginFor(Application application) {
        if (ApplicationTypeFactory.getApplicationTypeFor(application) instanceof ORBDApplicationType) {
            return true;
        }
        return false;
    }

    public static void initialize() {
        ApplicationViewsSupport.sharedInstance().getOverviewView().
                registerPluginProvider(new ORBDViewPluginProvider());
    }

    public static void uninitialize() {
        ApplicationViewsSupport.sharedInstance().getMonitorView().unregisterPluginProvider(new ORBDViewPluginProvider());
    }
}
