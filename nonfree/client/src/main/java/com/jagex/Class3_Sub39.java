package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agy")
public class Class3_Sub39 extends Class3 {

	@OriginalMember(owner = "client!agy", name = "qy", descriptor = "I")
	static int anInt1355;

	@OriginalMember(owner = "client!agy", name = "l", descriptor = "[[S")
	final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!agy", name = "h", descriptor = "D")
	double aDouble1;

	@OriginalMember(owner = "client!agy", name = "<init>", descriptor = "([[SD)V", line = 60)
	Class3_Sub39(@OriginalArg(0) short[][] arg0, @OriginalArg(1) double arg1) {
		this.aShortArrayArray3 = arg0;
		this.aDouble1 = arg1;
	}
}
