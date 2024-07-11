package com.lhchnp.arcadia.plugin;

import com.google.auto.service.AutoService;
import com.lhchnp.arcadia.application.plugin.CustomPlugin;
import com.lhchnp.arcadia.application.plugin.events.EventManager;
import com.lhchnp.arcadia.application.plugin.events.security.AccessControlEventWrapper;
import com.lhchnp.arcadia.application.plugin.manager.MainLayoutPluginManager;


@AutoService(CustomPlugin.class)
public class CustomAccessControl implements CustomPlugin {

    @Override
    public void load(EventManager eventManager, MainLayoutPluginManager mainLayoutService) {
        System.out.println("Le plugin  a été chargé avec succès !");
        eventManager.registerListener(AccessControlEventWrapper.class, new AccessControlCheckerListener(), this);
    }

    @Override
    public void unload() {
    }
}
