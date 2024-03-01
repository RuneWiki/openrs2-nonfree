package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahs")
public class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!ahs", name = "u", descriptor = "Z")
	boolean aBoolean327;

	@OriginalMember(owner = "client!ahs", name = "y", descriptor = "Z")
	boolean aBoolean329;

	@OriginalMember(owner = "client!ahs", name = "b", descriptor = "Z")
	boolean aBoolean330;

	@OriginalMember(owner = "client!ahs", name = "l", descriptor = "I")
	final int anInt1497;

	@OriginalMember(owner = "client!ahs", name = "h", descriptor = "Lclient!ahc;")
	final Class57_Sub1 aClass57_Sub1_1;

	@OriginalMember(owner = "client!ahs", name = "x", descriptor = "I")
	final int anInt1498;

	@OriginalMember(owner = "client!ahs", name = "s", descriptor = "Z")
	final boolean aBoolean328;

	@OriginalMember(owner = "client!ahs", name = "<init>", descriptor = "(ILclient!ahc;IZ)V", line = 155)
	Class3_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) Class57_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1497 = arg0 * 125039025;
		this.aClass57_Sub1_1 = arg1;
		this.anInt1498 = arg2 * -2081303537;
		this.aBoolean328 = arg3;
	}

	@OriginalMember(owner = "client!ahs", name = "hk", descriptor = "(Lclient!vs;I)V", line = 5353)
	static final void method12982(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class174.method23395(local16, local22, false, 2, arg0);
	}
}
