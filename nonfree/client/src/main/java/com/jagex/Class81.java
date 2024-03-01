package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class Class81 {

	@OriginalMember(owner = "client!au", name = "p", descriptor = "I")
	int anInt2912;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "I")
	int anInt2913;

	@OriginalMember(owner = "client!au", name = "g", descriptor = "I")
	int anInt2914;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V", line = 3228)
	Class81() {
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!au;)V", line = 3230)
	Class81(@OriginalArg(0) Class81 arg0) {
		this.anInt2912 = arg0.anInt2912;
		this.anInt2913 = arg0.anInt2913;
		this.anInt2914 = arg0.anInt2914;
	}
}
