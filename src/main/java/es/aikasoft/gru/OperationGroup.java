/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.aikasoft.gru;

import java.util.Collection;

/**
 *
 * @author Angel
 */
public interface OperationGroup extends Operation {

    Collection<Operation> getOperations();

    Collection<OperationGroup> getChildren();
    
    void addOperation(Operation operation);
    
}
