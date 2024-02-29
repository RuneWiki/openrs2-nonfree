package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xj")
public class Class645 {

	@OriginalMember(owner = "client!xj", name = "p", descriptor = "I")
	public int anInt5723;

	@OriginalMember(owner = "client!xj", name = "<init>", descriptor = "(I)V", line = 6)
	public Class645(@OriginalArg(0) int arg0) {
		this.anInt5723 = arg0 * 511701673;
	}

	@OriginalMember(owner = "client!xj", name = "cs", descriptor = "(Lclient!yf;I)V", line = 4991)
	static final void method32828(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class438.method28920(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!xj", name = "afi", descriptor = "(Lclient!yf;B)V", line = 10085)
	static final void method32829(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3518 * -700159681;
	}
}
