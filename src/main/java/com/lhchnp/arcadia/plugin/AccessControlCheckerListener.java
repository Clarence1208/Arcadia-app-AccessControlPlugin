package com.lhchnp.arcadia.plugin;


import com.lhchnp.arcadia.application.plugin.events.EventListener;
import com.lhchnp.arcadia.application.plugin.events.security.AccessControlEventWrapper;
import com.lhchnp.arcadia.application.views.activity.ManageActivitiesView;

public class AccessControlCheckerListener implements EventListener<AccessControlEventWrapper> {
    @Override
    public void onEvent(AccessControlEventWrapper event) {

        if (event.getViewClass().equals(ManageActivitiesView.class)) {
            if (event.getCurrentUser().getEmail().equals("hirsch.clarence@gmail.com")) {
                System.out.println("L'utilisateur " + event.getCurrentUser().getEmail() + " a accédé à la vue " + event.getViewClass().getSimpleName() + " et a été bloqué");
                event.setCancelled(true);
            }
        }
    }
}