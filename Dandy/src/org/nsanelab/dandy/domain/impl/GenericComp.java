package org.nsanelab.dandy.domain.impl;

import java.io.Serializable;
import java.util.Collection;

import java.util.LinkedHashSet;
import java.util.StringTokenizer;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.iface.IGraphVisitor;
import org.nsanelab.dandy.exceptions.GraphTraversalException;

public class GenericComp implements IGenericComp, Serializable {

    private Collection<IBaseDependency> inDep;
    private Collection<IBaseDependency> outDep;
    private String name;
    private String vendor;

    public GenericComp() {
        this.inDep = new LinkedHashSet<IBaseDependency>();
        this.outDep = new LinkedHashSet<IBaseDependency>();
    }

    public boolean isStandard() {
        return this.vendor.equals("sap.com");
    }

    @Override
    public Collection<IBaseDependency> getInDep() {
        return this.inDep;
    }

    @Override
    public Collection<IBaseDependency> getOutDep() {
        return this.outDep;
    }

    @Override
    public void setInDep(Collection<IBaseDependency> inDep) {
        this.inDep = inDep;

    }

    @Override
    public void setOutDep(Collection<IBaseDependency> outDep) {
        this.outDep = outDep;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getVendor() {
        return this.vendor;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && this.getClass().isInstance(obj) && ((GenericComp) obj).getName().equals(this.getName()) && ((GenericComp) obj).getVendor().equals(this.getVendor());

    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31 * this.vendor.hashCode();
    }

    public String toString() {
        String retVal;
        String[] nameTokens;
        String displayName;
        int tokNum;
        boolean longName, veryLongName;

        nameTokens = this.name.split("/");
        tokNum = nameTokens.length;

        longName = tokNum > 1;
        veryLongName = tokNum > 2;

        retVal = this.vendor + "/";
        if (veryLongName) {
            retVal += ".../";
        }
        if (longName) {
            retVal += nameTokens[tokNum - 2] + "/";
        }

        retVal += nameTokens[tokNum - 1];

        return retVal;
    }

    @Override
    public void accept(IGraphVisitor visitor) throws GraphTraversalException {
        visitor.visit(this);
    }
}
