package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public class Class383 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
	static final int anInt4711 = 7;

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
	static final int anInt4712 = 14;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
	static final int anInt4714 = 6;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "Ljava/lang/Thread;")
	static Thread aThread8;

	@OriginalMember(owner = "client!pa", name = "ex", descriptor = "Lclient!mp;")
	public static Class327 aClass327_2;

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
	int anInt4713;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	int anInt4710;

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "[[I")
	int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(II)V", line = 13)
	public Class383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(10) int local10 = Class429.method27932(arg0, arg1);
			@Pc(14) int local14 = arg0 / local10;
			@Pc(18) int local18 = arg1 / local10;
			this.anInt4713 = local14 * -1402534289;
			this.anInt4710 = local18 * 1149470851;
			this.anIntArrayArray52 = new int[local14][14];
			for (@Pc(35) int local35 = 0; local35 < local14; local35++) {
				@Pc(43) int[] local43 = this.anIntArrayArray52[local35];
				@Pc(51) double local51 = (double) local35 / (double) local14 + 6.0D;
				@Pc(59) int local59 = (int) Math.floor(local51 - 7.0D + 1.0D);
				if (local59 < 0) {
					local59 = 0;
				}
				@Pc(69) int local69 = (int) Math.ceil(local51 + 7.0D);
				if (local69 > 14) {
					local69 = 14;
				}
				@Pc(80) double local80 = (double) local18 / (double) local14;
				while (local59 < local69) {
					@Pc(90) double local90 = ((double) local59 - local51) * 3.141592653589793D;
					@Pc(92) double local92 = local80;
					if (local90 < -1.0E-4D || local90 > 1.0E-4D) {
						local92 = local80 * (Math.sin(local90) / local90);
					}
					local92 *= Math.cos(((double) local59 - local51) * 0.2243994752564138D) * 0.46D + 0.54D;
					local43[local59] = (int) Math.floor(local92 * 65536.0D + 0.5D);
					local59++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(J)V", line = 20)
	static final void method27327(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "([SI)[S", line = 40)
	public short[] method27324(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray52 != null) {
			@Pc(21) int local21 = (int) ((long) arg0.length * (long) (this.anInt4710 * -731445717) / (long) (this.anInt4713 * -667477873)) + 14;
			@Pc(24) int[] local24 = new int[local21];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg0.length; local30++) {
				@Pc(38) short local38 = arg0[local30];
				@Pc(43) int[] local43 = this.anIntArrayArray52[local28];
				@Pc(45) int local45;
				for (local45 = 0; local45 < 14; local45++) {
					local24[local26 + local45] += local38 * local43[local45] >> 2;
				}
				local28 += this.anInt4710 * -731445717;
				local45 = local28 / (this.anInt4713 * -667477873);
				local26 += local45;
				local28 -= this.anInt4713 * -667477873 * local45;
			}
			arg0 = new short[local21];
			for (local30 = 0; local30 < local21; local30++) {
				@Pc(110) int local110 = local24[local30] + 8192 >> 14;
				if (local110 < -32768) {
					arg0[local30] = -32768;
				} else if (local110 > 32767) {
					arg0[local30] = 32767;
				} else {
					arg0[local30] = (short) local110;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([S)[S", line = 40)
	public short[] method27325(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray52 != null) {
			@Pc(21) int local21 = (int) ((long) arg0.length * (long) (this.anInt4710 * -731445717) / (long) (this.anInt4713 * -667477873)) + 14;
			@Pc(24) int[] local24 = new int[local21];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg0.length; local30++) {
				@Pc(38) short local38 = arg0[local30];
				@Pc(43) int[] local43 = this.anIntArrayArray52[local28];
				@Pc(45) int local45;
				for (local45 = 0; local45 < 14; local45++) {
					local24[local26 + local45] += local38 * local43[local45] >> 2;
				}
				local28 += this.anInt4710 * -731445717;
				local45 = local28 / (this.anInt4713 * -667477873);
				local26 += local45;
				local28 -= this.anInt4713 * -667477873 * local45;
			}
			arg0 = new short[local21];
			for (local30 = 0; local30 < local21; local30++) {
				@Pc(110) int local110 = local24[local30] + 8192 >> 14;
				if (local110 < -32768) {
					arg0[local30] = -32768;
				} else if (local110 > 32767) {
					arg0[local30] = 32767;
				} else {
					arg0[local30] = (short) local110;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pa", name = "ul", descriptor = "(Lclient!vs;B)V", line = 7765)
	static final void method27326(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(16) Class3_Sub1_Sub19 local16 = Class352.aClass621_1.method33757(arg0.anIntArray496[arg0.anInt5319 * 960738381]);
		@Pc(26) int local26 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) int local28 = -1;
		for (@Pc(30) int local30 = 0; local30 < local16.anInt5550 * 1511174559; local30++) {
			if (local16.anIntArray525[local30] == local26) {
				local28 = local16.anIntArray526[local30];
				break;
			}
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local28;
	}

	@OriginalMember(owner = "client!pa", name = "abw", descriptor = "(Lclient!vs;I)V", line = 8935)
	static final void method27328(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class271.method25310(local12);
	}

	@OriginalMember(owner = "client!pa", name = "adt", descriptor = "(Lclient!vs;I)V", line = 9603)
	static final void method27329(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3126 * -1610512763;
	}
}
