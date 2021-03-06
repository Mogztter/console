/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */

package org.jboss.as.console.client.domain.hosts;

import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.Widget;
import org.jboss.as.console.client.Console;
import org.jboss.ballroom.client.layout.LHSNavTree;
import org.jboss.ballroom.client.layout.LHSNavTreeItem;
import org.jboss.ballroom.client.widgets.stack.DisclosureStackPanel;

/**
 * @author Heiko Braun
 * @date 3/4/11
 */
class HostConfigSection {

    private DisclosurePanel panel;

    private LHSNavTree hostTree;

    public HostConfigSection() {
        super();

        panel = new DisclosureStackPanel(Console.CONSTANTS.common_label_hostConfiguration()).asWidget();

        hostTree = new LHSNavTree("hosts");

        //LHSNavTreeItem paths = new LHSNavTreeItem(Console.CONSTANTS.common_label_paths(), "hosts/host-paths");
        LHSNavTreeItem jvms = new LHSNavTreeItem(Console.CONSTANTS.common_label_virtualMachines(), "hosts/host-jvms");
        LHSNavTreeItem interfaces = new LHSNavTreeItem(Console.CONSTANTS.common_label_interfaces(), "hosts/host-interfaces");
        LHSNavTreeItem properties = new LHSNavTreeItem("Host Properties", "host/host-properties");

        //hostTree.addItem(paths);
        hostTree.addItem(jvms);
        hostTree.addItem(interfaces);
        hostTree.addItem(properties);

        panel.setContent(hostTree);

    }

    public Widget asWidget() {
        return panel;
    }
}