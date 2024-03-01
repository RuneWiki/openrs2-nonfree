package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public class Class368 {

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
	public final int anInt4661;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public final int anInt4659;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
	public final int anInt4660;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	public final int anInt4658;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 12)
	Class368() {
		this.anInt4661 = ((int) (Math.random() * 4.0D) + 32) * -922986341;
		this.anInt4659 = ((int) (Math.random() * 2.0D) + 3) * -1984044387;
		this.anInt4660 = ((int) (Math.random() * 3.0D) + 16) * 1827325359;
		if (Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1) {
			this.anInt4658 = (int) (Math.random() * 6.0D) * 2044016913;
		} else {
			this.anInt4658 = (int) (Math.random() * 12.0D) * 2044016913;
		}
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(IIII)V", line = 20)
	Class368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4661 = arg0 * -922986341;
		this.anInt4659 = arg1 * -1984044387;
		this.anInt4660 = arg2 * 1827325359;
		this.anInt4658 = arg3 * 2044016913;
	}

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)Lclient!agh;", line = 39)
	public static Class3_Sub23 method26925() {
		@Pc(2) Class3_Sub23 local2 = Class378.method27248();
		local2.aClass311_1 = null;
		local2.anInt1296 = 0;
		local2.aClass3_Sub41_Sub1_1 = new Class3_Sub41_Sub1(5000);
		return local2;
	}

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "(Lclient!vs;I)V", line = 70)
	static void method26919(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).anIntArrayArray60[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]][1];
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!ok", name = "bq", descriptor = "(Lclient!vs;I)V", line = 4370)
	static final void method26924(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class237.method24611(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ok", name = "ys", descriptor = "(Lclient!vs;I)V", line = 8432)
	static final void method26920(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.anInt3194 * 963130851 == 0 || local12 >= client.anInt3174 * 918731051) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
			return;
		}
		@Pc(25) Class123 local25 = client.aClass123Array1[local12];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local25.aString161;
		if (local25.aString159 == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local25.aString159;
		}
	}

	@OriginalMember(owner = "client!ok", name = "ahy", descriptor = "(Lclient!vs;I)V", line = 10261)
	static final void method26926(@OriginalArg(0) Class536 arg0) {
		if (Class552.aBoolean823) {
			@Pc(4) Class573[] local4 = Class188.method23975();
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local4.length;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ok", name = "aib", descriptor = "(Lclient!vs;B)V", line = 10515)
	static final void method26921(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class283.method25449().toString();
	}

	@OriginalMember(owner = "client!ok", name = "aog", descriptor = "(Lclient!vs;I)V", line = 11559)
	static final void method26923(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub27_2.method13857();
	}

	@OriginalMember(owner = "client!ok", name = "avo", descriptor = "(Lclient!vs;S)V", line = 12784)
	static final void method26922(@OriginalArg(0) Class536 arg0) {
	}
}
