package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public class Class98 implements Interface13 {

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
	int anInt2956;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
	int anInt2955;

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "[F")
	float[] aFloatArray91;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(II)V", line = 10)
	Class98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2956 = arg0 * 1647259087;
		this.anInt2955 = arg1 * 127667411;
		this.aFloatArray91 = new float[this.anInt2956 * -1241204433 * this.anInt2955 * -1189074085];
	}

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "()I", line = 17)
	@Override
	public int method27214() {
		return this.anInt2956 * -1241204433;
	}

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "()I", line = 17)
	@Override
	public int method27217() {
		return this.anInt2956 * -1241204433;
	}

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "()I", line = 17)
	@Override
	public int method27213() {
		return this.anInt2956 * -1241204433;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "()I", line = 21)
	@Override
	public int method27212() {
		return this.anInt2955 * -1189074085;
	}

	@OriginalMember(owner = "client!bp", name = "x", descriptor = "()I", line = 21)
	@Override
	public int method27211() {
		return this.anInt2955 * -1189074085;
	}

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "()I", line = 21)
	@Override
	public int method27216() {
		return this.anInt2955 * -1189074085;
	}

	@OriginalMember(owner = "client!bp", name = "u", descriptor = "()I", line = 21)
	@Override
	public int method27215() {
		return this.anInt2955 * -1189074085;
	}

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "()V", line = 24)
	@Override
	public void method27209() {
	}

	@OriginalMember(owner = "client!bp", name = "y", descriptor = "()V", line = 24)
	@Override
	public void method27208() {
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "()V", line = 24)
	@Override
	public void method27210() {
	}

	@OriginalMember(owner = "client!bp", name = "x", descriptor = "(III)Lclient!amy;", line = 49)
	public static Class3_Sub1_Sub18 method21817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class214 local5 = (Class214) Class196.aMap9.get(arg0);
		return local5.method24268(arg1);
	}

	@OriginalMember(owner = "client!bp", name = "mm", descriptor = "(Lclient!vs;I)V", line = 6388)
	static final void method21812(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class283.method25457(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!bp", name = "agu", descriptor = "(Lclient!vs;I)V", line = 10066)
	static final void method21813(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		Class10.method720(local13, local23 >> 14 & 0x3FFF, local23 & 0x3FFF, false);
	}

	@OriginalMember(owner = "client!bp", name = "ali", descriptor = "(Lclient!vs;I)V", line = 11151)
	static final void method21816(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class60_Sub22.method13724().method33765();
	}

	@OriginalMember(owner = "client!bp", name = "amd", descriptor = "(Lclient!vs;I)V", line = 11250)
	static final void method21814(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class190.anInt3675 * 1134204935;
	}

	@OriginalMember(owner = "client!bp", name = "auq", descriptor = "(Lclient!vs;B)V", line = 12511)
	static final void method21815(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = ((Class26_Sub1_Sub1_Sub1_Sub2) arg0.aClass26_Sub1_Sub1_Sub1_4).method16735(true);
	}
}
