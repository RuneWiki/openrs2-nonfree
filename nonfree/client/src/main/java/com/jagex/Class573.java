package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xe")
public class Class573 {

	@OriginalMember(owner = "client!xe", name = "l", descriptor = "I")
	int anInt5422;

	@OriginalMember(owner = "client!xe", name = "p", descriptor = "I")
	public int anInt5423;

	@OriginalMember(owner = "client!xe", name = "a", descriptor = "I")
	public int anInt5424;

	@OriginalMember(owner = "client!xe", name = "g", descriptor = "I")
	public int anInt5425;

	@OriginalMember(owner = "client!xe", name = "<init>", descriptor = "()V", line = 10)
	Class573() {
	}

	@OriginalMember(owner = "client!xe", name = "jn", descriptor = "(Lclient!ahn;IZB)V", line = 5967)
	static final void method33077(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		Class580.method33215(arg0, arg1, false, arg2);
	}
}
