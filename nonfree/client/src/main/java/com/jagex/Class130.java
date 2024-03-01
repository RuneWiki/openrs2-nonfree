package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public class Class130 {

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
	public final int anInt3322;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
	public final int anInt3323;

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
	final int anInt3324;

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
	public final int anInt3325;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(IIII)V", line = 9)
	Class130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3322 = arg0 * 554574993;
		this.anInt3323 = arg1 * -2116135949;
		this.anInt3324 = arg2 * 1630795655;
		this.anInt3325 = arg3 * -1584142061;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Lclient!dm;", line = 17)
	Class130 method22885(@OriginalArg(0) int arg0) {
		return new Class130(this.anInt3322 * -1448993679, arg0, this.anInt3324 * 1334582839, this.anInt3325 * -2041558757);
	}

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "(IB)Lclient!dm;", line = 17)
	Class130 method22886(@OriginalArg(0) int arg0) {
		return new Class130(this.anInt3322 * -1448993679, arg0, this.anInt3324 * 1334582839, this.anInt3325 * -2041558757);
	}

	@OriginalMember(owner = "client!dm", name = "al", descriptor = "(III)V", line = 183)
	public static void method22889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub1_Sub11 local9 = Class60_Sub34.method14470(20, (long) arg1 << 32 | (long) arg0);
		local9.method19145();
	}

	@OriginalMember(owner = "client!dm", name = "rb", descriptor = "(Lclient!vs;I)V", line = 7258)
	static final void method22887(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3500 * 610124465;
	}

	@OriginalMember(owner = "client!dm", name = "zh", descriptor = "(Lclient!vs;B)V", line = 8665)
	static final void method22888(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass3_Sub30_3.aByte59;
	}
}
