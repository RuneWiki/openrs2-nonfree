package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aix")
public class Class131_Sub5 extends Class131 {

	@OriginalMember(owner = "client!aix", name = "l", descriptor = "I")
	int anInt1442;

	@OriginalMember(owner = "client!aix", name = "v", descriptor = "I")
	int anInt1443;

	@OriginalMember(owner = "client!aix", name = "t", descriptor = "I")
	int anInt1444;

	@OriginalMember(owner = "client!aix", name = "w", descriptor = "I")
	int anInt1445;

	@OriginalMember(owner = "client!aix", name = "y", descriptor = "I")
	int anInt1446;

	@OriginalMember(owner = "client!aix", name = "q", descriptor = "I")
	int anInt1447;

	@OriginalMember(owner = "client!aix", name = "x", descriptor = "Ljava/lang/String;")
	String aString46;

	@OriginalMember(owner = "client!aix", name = "<init>", descriptor = "()V", line = 14)
	Class131_Sub5() {
	}

	@OriginalMember(owner = "client!aix", name = "d", descriptor = "(IIB)I", line = 109)
	static int method13120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >> 31 & arg1 - 1;
		return (arg0 + (arg0 >>> 31)) % arg1 + local7;
	}
}
