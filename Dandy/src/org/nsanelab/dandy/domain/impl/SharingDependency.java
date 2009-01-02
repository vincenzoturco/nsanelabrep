package org.nsanelab.dandy.domain.impl;

import org.nsanelab.dandy.domain.iface.IDependencyInfo;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.iface.ISharingDependency;

public class SharingDependency implements ISharingDependency {

	private IDependencyInfo info;
	private IGenericComp src;
	private IGenericComp tgt;

	@Override
	public IDependencyInfo getInfo() {
		return this.info;
	}

	@Override
	public IGenericComp getSrc() {
		return this.src;
	}

	@Override
	public IGenericComp getTgt() {
		return this.tgt;
	}

	@Override
	public void setInfo(IDependencyInfo info) {
		this.info = info;

	}

	@Override
	public void setSrc(IGenericComp src) {
		this.src = src;

	}

	@Override
	public void setTgt(IGenericComp tgt) {
		this.tgt = tgt;

	}

	@Override
	public boolean equals(Object arg0) {
		return arg0!=null && this.getClass().isInstance(arg0) && ((SharingDependency)arg0).getTgt().equals(this.getTgt())
		&& ((SharingDependency)arg0).getSrc().equals(this.getSrc())
		&& ((SharingDependency)arg0).getInfo().equals(this.getInfo());
	}

}
