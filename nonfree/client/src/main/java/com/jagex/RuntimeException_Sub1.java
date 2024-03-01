package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anp")
public class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!anp", name = "p", descriptor = "J")
	static long aLong192;

	@OriginalMember(owner = "client!anp", name = "<init>", descriptor = "()V", line = 5)
	public RuntimeException_Sub1() {
		super("");
	}

	@OriginalMember(owner = "client!anp", name = "jq", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 5726)
	static final void method20141(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.aStringArray11 = null;
	}
}
