/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.micasa.gru;

import java.util.Map;
import org.micasa.gru.exceptions.OperationException;

/**
 *
 * @author Angel
 */
public interface Operation {

    String getId();

    String getName();

    String getDesciption();

    String getXml();

    String getURI();

    String getLabel();

    String getRequest();

    Object getTarget();

    OperationGroup getParent();

    Session getSession();

    Object execute(Map<String, Object> parameters) throws OperationException;
}
