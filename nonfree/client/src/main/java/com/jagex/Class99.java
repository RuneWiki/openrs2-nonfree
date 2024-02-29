package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class Class99 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!ks;")
	public Interface37 anInterface37_12;

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Lclient!aed;")
	protected Class86_Sub1 aClass86_Sub1_10;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!aed;)V", line = 10)
	Class99(@OriginalArg(0) Class86_Sub1 arg0) {
		this.aClass86_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "()V")
	public abstract void method8408();

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "()V")
	public abstract void method8409();

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "()V")
	public abstract void method8410();
}
