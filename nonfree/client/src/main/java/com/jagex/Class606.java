package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public class Class606 {

	@OriginalMember(owner = "client!vv", name = "s", descriptor = "I")
	static int anInt5564;

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
	int anInt5563;

	@OriginalMember(owner = "client!vv", name = "p", descriptor = "Ljava/lang/String;")
	String aString237;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V", line = 7)
	Class606() {
	}

	@OriginalMember(owner = "client!vv", name = "la", descriptor = "(Lclient!yf;B)V", line = 6605)
	static final void method32078(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class545.method30967(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!vv", name = "aql", descriptor = "(Lclient!yf;B)V", line = 12391)
	static final void method32079(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1.method15926();
	}
}
