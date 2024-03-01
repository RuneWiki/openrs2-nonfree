package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iy")
public abstract class Class37 implements Interface22 {

	@OriginalMember(owner = "client!iy", name = "p", descriptor = "[Lclient!jb;")
	public final Class252[] aClass252Array3;

	@OriginalMember(owner = "client!iy", name = "<init>", descriptor = "([Lclient!jb;)V", line = 7)
	Class37(@OriginalArg(0) Class252[] arg0) {
		this.aClass252Array3 = arg0;
	}
}
