package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hy")
public abstract class Class36 {

	@OriginalMember(owner = "client!hy", name = "a", descriptor = "Lclient!ic;")
	public Interface20 anInterface20_20;

	@OriginalMember(owner = "client!hy", name = "p", descriptor = "Lclient!abv;")
	protected Class21_Sub3 aClass21_Sub3_23;

	@OriginalMember(owner = "client!hy", name = "<init>", descriptor = "(Lclient!abv;)V", line = 10)
	Class36(@OriginalArg(0) Class21_Sub3 arg0) {
		this.aClass21_Sub3_23 = arg0;
	}

	@OriginalMember(owner = "client!hy", name = "g", descriptor = "()V")
	public abstract void method8313();

	@OriginalMember(owner = "client!hy", name = "p", descriptor = "()V")
	public abstract void method8314();

	@OriginalMember(owner = "client!hy", name = "a", descriptor = "()V")
	public abstract void method8315();

	@OriginalMember(owner = "client!hy", name = "l", descriptor = "()V")
	public abstract void method8316();
}
