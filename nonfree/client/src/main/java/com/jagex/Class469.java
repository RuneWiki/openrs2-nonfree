package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sx")
public class Class469 implements Interface50 {

	@OriginalMember(owner = "client!sx", name = "bh", descriptor = "Lclient!vk;")
	public static Class530 aClass530_2;

	@OriginalMember(owner = "client!sx", name = "p", descriptor = "I")
	final int anInt5115;

	@OriginalMember(owner = "client!sx", name = "a", descriptor = "I")
	final int anInt5116;

	@OriginalMember(owner = "client!sx", name = "g", descriptor = "[I")
	final int[] anIntArray469;

	@OriginalMember(owner = "client!sx", name = "<init>", descriptor = "(II[I)V", line = 13)
	Class469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.anInt5115 = arg0 * 552199523;
		this.anInt5116 = arg1 * -1412366305;
		this.anIntArray469 = arg2;
	}

	@OriginalMember(owner = "client!sx", name = "p", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;I)Z", line = 20)
	@Override
	public boolean method28750(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3) {
		if (arg0 != null) {
			if (this.anInt5115 * -186727349 != arg0.method19853()) {
				return false;
			}
			if (this.anInt5116 * 1373535199 > arg0.method19856()) {
				return false;
			}
			@Pc(32) int[] local32 = this.anIntArray469;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(42) int local42 = local32[local34];
				if (!arg3.method13145(local42)) {
					return false;
				}
			}
		} else if (-186727349 * this.anInt5115 != -1) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!sx", name = "a", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;)Z", line = 20)
	@Override
	public boolean method28751(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3) {
		if (arg0 != null) {
			if (this.anInt5115 * -186727349 != arg0.method19853()) {
				return false;
			}
			if (this.anInt5116 * 1373535199 > arg0.method19856()) {
				return false;
			}
			@Pc(32) int[] local32 = this.anIntArray469;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(42) int local42 = local32[local34];
				if (!arg3.method13145(local42)) {
					return false;
				}
			}
		} else if (-186727349 * this.anInt5115 != -1) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!sx", name = "l", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;)Z", line = 20)
	@Override
	public boolean method28753(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3) {
		if (arg0 != null) {
			if (this.anInt5115 * -186727349 != arg0.method19853()) {
				return false;
			}
			if (this.anInt5116 * 1373535199 > arg0.method19856()) {
				return false;
			}
			@Pc(32) int[] local32 = this.anIntArray469;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(42) int local42 = local32[local34];
				if (!arg3.method13145(local42)) {
					return false;
				}
			}
		} else if (-186727349 * this.anInt5115 != -1) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!sx", name = "g", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;)Z", line = 20)
	@Override
	public boolean method28752(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3) {
		if (arg0 != null) {
			if (this.anInt5115 * -186727349 != arg0.method19853()) {
				return false;
			}
			if (this.anInt5116 * 1373535199 > arg0.method19856()) {
				return false;
			}
			@Pc(32) int[] local32 = this.anIntArray469;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(42) int local42 = local32[local34];
				if (!arg3.method13145(local42)) {
					return false;
				}
			}
		} else if (-186727349 * this.anInt5115 != -1) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!sx", name = "g", descriptor = "(Ljava/lang/CharSequence;I)Z", line = 43)
	public static boolean method28756(@OriginalArg(0) CharSequence arg0) {
		return Class462.method28603(arg0, 10, true);
	}

	@OriginalMember(owner = "client!sx", name = "is", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5634)
	static final void method28754(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(12) int local12 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381];
		if (local12 == Class178.anInt3504 * 1056961711 || Class178.anInt3477 * 1063106475 == local12 || Class178.anInt3478 * -32959165 == local12 || local12 == Class178.anInt3479 * 1336562021) {
			arg0.anInt3516 = local12 * 1825684975;
		}
	}

	@OriginalMember(owner = "client!sx", name = "adg", descriptor = "(Lclient!vs;I)V", line = 9290)
	static final void method28755(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class110.aClass436_1.method27999(local12).anInt4931 * 1398638399;
	}

	@OriginalMember(owner = "client!sx", name = "lm", descriptor = "(II)V", line = 11177)
	static final void method28757(@OriginalArg(0) int arg0) {
		if (Class33.method7569(arg0, null)) {
			Class156.method23181(Class178.aClass186Array1[arg0].aClass178Array8, -1);
		}
	}
}
