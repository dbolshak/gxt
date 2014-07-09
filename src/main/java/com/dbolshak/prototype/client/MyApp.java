package com.dbolshak.prototype.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

import com.sencha.gxt.core.client.dom.XDOM;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.MarginData;

/**
 * Execution entry point
 */
public class MyApp implements IsWidget, EntryPoint {
    private SimplePanel widget;

    @Override
    public Widget asWidget() {
        if (widget == null) {
            synchronized (this) {
                if (widget == null) {
                    widget = new SimplePanel();
                    widget.setLayoutData(new MarginData(10));

                    ContentPanel panel = new ContentPanel();
                    panel.setPixelSize(XDOM.getViewportWidth(), XDOM.getViewportHeight());

                    widget.add(panel);
                }
            }
        }

        return widget;
    }

    @Override
    public void onModuleLoad() {
        RootPanel.get().add(asWidget());
    }
}
