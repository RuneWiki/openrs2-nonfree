package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class Class150 {

	@OriginalMember(owner = "client!an", name = "v", descriptor = "I")
	int anInt2325;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "I")
	int anInt2326;

	@OriginalMember(owner = "client!an", name = "p", descriptor = "I")
	int anInt2327;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V", line = 3239)
	Class150() {
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!an;)V", line = 3241)
	Class150(@OriginalArg(0) Class150 arg0) {
		this.anInt2327 = arg0.anInt2327;
		this.anInt2326 = arg0.anInt2326;
		this.anInt2325 = arg0.anInt2325;
	}
}
