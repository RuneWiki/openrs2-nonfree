package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public abstract class Class80 implements Interface13 {

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "Lclient!ih;")
	static Class322 aClass322_4;

	@OriginalMember(owner = "client!aq", name = "tb", descriptor = "I")
	static int anInt319;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
	protected int anInt318;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;I)V", line = 9)
	Class80(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) int arg2) {
		this.anInt318 = arg2 * -2002682299;
	}

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "()I", line = 14)
	@Override
	public int method18313() {
		return this.anInt318 * -1783044979;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)I", line = 14)
	@Override
	public int method18318() {
		return this.anInt318 * -1783044979;
	}

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "()I", line = 14)
	@Override
	public int method18316() {
		return this.anInt318 * -1783044979;
	}

	@OriginalMember(owner = "client!aq", name = "fp", descriptor = "(Lclient!yf;B)V", line = 5536)
	static final void method1938(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class656.method33035(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!aq", name = "ays", descriptor = "(Lclient!yf;I)V", line = 13638)
	static final void method1939(@OriginalArg(0) Class665 arg0) {
		Class536.method30848(Class136_Sub1.anInt1701 * 710990175);
	}
}
