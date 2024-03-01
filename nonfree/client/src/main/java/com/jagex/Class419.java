package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public class Class419 {

	@OriginalMember(owner = "client!qw", name = "hp", descriptor = "Lclient!ajx;")
	public static Class70_Sub1_Sub2 aClass70_Sub1_Sub2_11;

	// $FF: synthetic field
	@OriginalMember(owner = "client!qw", name = "this$0", descriptor = "Lclient!aew;")
	final Class48_Sub2 this$0;

	@OriginalMember(owner = "client!qw", name = "p", descriptor = "Lclient!qz;")
	Class422 aClass422_1;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "[B")
	byte[] aByteArray87;

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "[B")
	byte[] aByteArray88;

	@OriginalMember(owner = "client!qw", name = "x", descriptor = "I")
	int anInt4842;

	@OriginalMember(owner = "client!qw", name = "u", descriptor = "F")
	final float aFloat300;

	@OriginalMember(owner = "client!qw", name = "y", descriptor = "I")
	final int anInt4844;

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
	final int anInt4841;

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
	int anInt4845;

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
	int anInt4840;

	@OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
	int anInt4843;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!aew;Lclient!qz;IFIIZZ)V", line = 524)
	Class419(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) Class422 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		this.this$0 = arg0;
		this.aClass422_1 = arg1;
		this.aByteArray87 = new byte[arg2];
		this.aByteArray88 = new byte[arg4 / 8];
		this.anInt4842 = this.aByteArray87.length * -728562587;
		this.aFloat300 = arg3;
		this.anInt4844 = arg4 * 1737647269;
		this.anInt4841 = arg5 * 1288356031;
		this.anInt4845 = 0;
		this.anInt4840 = 0;
		this.anInt4843 = 0;
	}

	@OriginalMember(owner = "client!qw", name = "p", descriptor = "([BIII)V", line = 538)
	void method27834(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = arg1;
		while (local1 < arg1 + arg2) {
			this.aByteArray87[this.anInt4845 * 1633016291] = arg0[local1];
			this.aByteArray87[this.anInt4845 * 1633016291 + 1] = arg0[local1 + 1];
			local1 += 2;
			this.anInt4845 += 223897494;
			this.anInt4845 = this.anInt4845 * 1633016291 % this.aByteArray87.length * 111948747;
			this.anInt4842 -= -1457125174;
		}
	}

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "()I", line = 550)
	int method27833() {
		return this.anInt4842 * -141161107;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)I", line = 550)
	int method27835() {
		return this.anInt4842 * -141161107;
	}

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "()I", line = 550)
	int method27836() {
		return this.anInt4842 * -141161107;
	}

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "()I", line = 550)
	int method27837() {
		return this.anInt4842 * -141161107;
	}

	@OriginalMember(owner = "client!qw", name = "er", descriptor = "(Lclient!vs;I)V", line = 4813)
	static final void method27841(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class221.method24419(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!qw", name = "kh", descriptor = "(Lclient!fo;Lclient!vs;I)V", line = 5976)
	static final void method27838(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class536 arg1) {
		arg1.anInt5319 -= 936373647;
		@Pc(15) int local15 = arg1.anIntArray496[arg1.anInt5319 * 960738381] - 1;
		@Pc(25) int local25 = arg1.anIntArray496[arg1.anInt5319 * 960738381 + 1];
		@Pc(35) int local35 = arg1.anIntArray496[arg1.anInt5319 * 960738381 + 2];
		if (local15 < 0 || local15 > 9) {
			throw new RuntimeException();
		}
		Class400.method27574(arg0, local15, local25, local35, arg1);
	}

	@OriginalMember(owner = "client!qw", name = "ach", descriptor = "(Lclient!vs;I)V", line = 9060)
	static final void method27839(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= 1580027550;
		@Pc(14) String local14 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575];
		@Pc(25) String local25 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1];
		@Pc(38) int local38 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local14.indexOf(local25, local38);
	}

	@OriginalMember(owner = "client!qw", name = "afz", descriptor = "(Lclient!vs;I)V", line = 9939)
	static final void method27840(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(15) Class3_Sub1_Sub4 local15 = Class58.method12390(local12);
		if (local15 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anInt2650 * -13600129;
		}
	}
}
