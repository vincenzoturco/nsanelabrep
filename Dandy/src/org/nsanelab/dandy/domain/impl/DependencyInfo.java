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

}