/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.ui.impl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author I044892
 */
public class StatusMngr implements Serializable {

   
    private String status;
    private boolean indeterminate;
    private int taskSize;
    private int taskCurrentStatus;
    public static final String ST_GRAPH_GENERATION = "Generating graph";
    public static final String ST_GRAPH_REFRESH = "Refreshing graph";
    public static final String ST_READY = "Ready";
    public static final String ST_TASK_COMPLETE = "Complete";
    public static final String ST_NO_DC_FOUND = "No component descriptor found";
    public static final String ST_ABORTED = "Operation aborted";
    public static final String ST_SELECTING = "Selection ...";
    public static final int DEFAULT_TASK_SIZE = 100;
    private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public StatusMngr() {
    }

    public boolean isIndeterminate() {
        return indeterminate;
    }

    public String getStatus() {
        return status;
    }

    public int getTaskCurrentStatus() {
        return taskCurrentStatus;
    }

    public int getTaskSize() {
        return taskSize;
    }

    public void setIndeterminate(boolean isIndeterminate) {
        boolean oldIndeterminate = this.indeterminate;
        this.indeterminate = isIndeterminate;
        changeSupport.firePropertyChange("indeterminate", oldIndeterminate, isIndeterminate);
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status",oldStatus,status);
    }

    public void setTaskCurrentStatus(int taskCurrentStatus) {
        int oldCurrStatus = this.taskCurrentStatus;
        this.taskCurrentStatus = taskCurrentStatus;
        changeSupport.firePropertyChange("taskCurrentStatus",oldCurrStatus,this.taskCurrentStatus);
    }

    public void setTaskSize(int taskSize) {
        int oldTaskSize = this.taskSize;
        this.taskSize = taskSize;
        changeSupport.firePropertyChange("taskSize",oldTaskSize,taskSize);
    }
}
