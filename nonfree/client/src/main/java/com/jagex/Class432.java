package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public class Class432 {

	@OriginalMember(owner = "client!rj", name = "x", descriptor = "Lclient!anv;")
	public Class26_Sub1_Sub4 aClass26_Sub1_Sub4_1;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Lclient!anl;")
	public Class26_Sub1_Sub3 aClass26_Sub1_Sub3_1;

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "Lclient!anl;")
	public Class26_Sub1_Sub3 aClass26_Sub1_Sub3_2;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "Lclient!anv;")
	public Class26_Sub1_Sub4 aClass26_Sub1_Sub4_2;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "S")
	short aShort169;

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "Lclient!anh;")
	public Class26_Sub1_Sub2 aClass26_Sub1_Sub2_1;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "Lclient!anf;")
	Class26_Sub1_Sub5 aClass26_Sub1_Sub5_1;

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "Lclient!ro;")
	public Class437 aClass437_1;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "S")
	short aShort170;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "Lclient!rj;")
	public Class432 aClass432_1;

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "S")
	short aShort171;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "S")
	short aShort172;

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "B")
	public byte aByte160;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(I)V", line = 18)
	public Class432(@OriginalArg(0) int arg0) {
		this.aByte160 = (byte) arg0;
	}

	@OriginalMember(owner = "client!rj", name = "va", descriptor = "(Lclient!vs;B)V", line = 7918)
	static final void method27964(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class633.method33876(local13, local23, true);
	}

	@OriginalMember(owner = "client!rj", name = "wp", descriptor = "(Lclient!vs;I)V", line = 8081)
	static final void method27966(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass106_7.method21910() >> 3;
	}

	@OriginalMember(owner = "client!rj", name = "abn", descriptor = "(Lclient!vs;B)V", line = 8993)
	static final void method27965(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class140.method23023(local13);
	}
}
