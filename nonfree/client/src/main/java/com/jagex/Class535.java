package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public class Class535 {

	@OriginalMember(owner = "client!si", name = "l", descriptor = "I")
	public int anInt5183;

	@OriginalMember(owner = "client!si", name = "v", descriptor = "I")
	public int anInt5184;

	@OriginalMember(owner = "client!si", name = "y", descriptor = "I")
	public int anInt5186;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	public int anInt5185 = -496843307;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "Lclient!zx;")
	public final Class151 aClass151_9;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!agh;)V", line = 12)
	Class535(@OriginalArg(0) Class104_Sub1_Sub1_Sub1 arg0) {
		this.aClass151_9 = new Class151_Sub3(arg0, false);
	}

	@OriginalMember(owner = "client!si", name = "op", descriptor = "(Lclient!yf;S)V", line = 7221)
	static final void method30820(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class285.method26726(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!si", name = "anb", descriptor = "(Lclient!yf;B)V", line = 11920)
	static final void method30821(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class589.anInt5490 * 1245290027;
	}
}
