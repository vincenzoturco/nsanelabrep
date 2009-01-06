package org.nsanelab.dandy.domain.impl;

import org.nsanelab.dandy.domain.EDependencyTime;
import org.nsanelab.dandy.domain.iface.IDependencyInfo;

public class DependencyInfo implements IDependencyInfo {

	private EDependencyTime depTime;
	private String pp;

	@Override
	public EDependencyTime getDepTime() {
		return this.depTime;
	}

	@Override
	public String getPublicPart() {
		return this.pp;
	}

	@Override
	public void setDepTime(EDependencyTime depTime) {
		this.depTime = depTime;

	}

	@Override
	public void setPublicPart(String publicPart) {
		this.pp = publicPart;
	}
	
	public boolean equals(Object obj) {
		return obj != null && this.getClass().isInstance(obj)
				&& ((DependencyInfo) obj).getPublicPart().equals(this.getPublicPart())
				&& ((DependencyInfo) obj).getDepTime().equals(this.getDepTime());

	}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.depTime != null ? this.depTime.hashCode() : 0);
        hash = 47 * hash + (this.pp != null ? this.pp.hashCode() : 0);
        return hash;
    }

}
