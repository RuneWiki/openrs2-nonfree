package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abu")
public class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!abu", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 7)
	Class13_Sub3(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!abu", name = "a", descriptor = "(I)V", line = 11)
	@Override
	public void method16888() {
		Class43.method9505(true);
	}

	@OriginalMember(owner = "client!abu", name = "h", descriptor = "()V", line = 11)
	@Override
	public void method16896() {
		Class43.method9505(true);
	}
}
