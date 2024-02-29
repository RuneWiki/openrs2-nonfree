package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public abstract class Class113 implements Interface35 {

	@OriginalMember(owner = "client!kt", name = "p", descriptor = "[Lclient!lz;")
	public final Class391[] aClass391Array3;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "([Lclient!lz;)V", line = 7)
	Class113(@OriginalArg(0) Class391[] arg0) {
		this.aClass391Array3 = arg0;
	}
}
