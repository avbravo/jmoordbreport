/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.jmoordbreport.domains;

import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.openide.NotifyDescriptor;

/**
 *
 * @author avbravo
 */
public enum MessageType {
    PLAIN(NotifyDescriptor.PLAIN_MESSAGE, null),
    INFO(NotifyDescriptor.INFORMATION_MESSAGE, "info.png"),
    QUESTION(NotifyDescriptor.QUESTION_MESSAGE, "question.png"),
    ERROR(NotifyDescriptor.ERROR_MESSAGE, "error.png"),
    WARNING(NotifyDescriptor.WARNING_MESSAGE, "warning.png");

    private int notifyDescriptorType;
    private Icon icon;

    private MessageType(int notifyDescriptorType, String resourceName) {
        this.notifyDescriptorType = notifyDescriptorType;
        if (resourceName == null) {
            icon = new ImageIcon();
        } else {
            icon = loadIcon(resourceName);
        }
    }

    private static Icon loadIcon(String resourceName) {
        URL resource = MessageType.class.getResource("icons/" + resourceName);
        if (resource == null) {
            return new ImageIcon();
        }
        return new ImageIcon(resource);
    }

    int getNotifyDescriptorType() {
        return notifyDescriptorType;
    }

    Icon getIcon() {
        return icon;
    }
}
