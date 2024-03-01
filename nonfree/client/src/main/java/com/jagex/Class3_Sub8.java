package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afp")
public class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!afp", name = "l", descriptor = "Lclient!xn;")
	static final Class581 aClass581_6 = new Class581(32);

	@OriginalMember(owner = "client!afp", name = "h", descriptor = "Lclient!ew;")
	static final Class161 aClass161_3 = new Class161(11);

	@OriginalMember(owner = "client!afp", name = "s", descriptor = "[I")
	int[] anIntArray178 = new int[] { -1 };

	@OriginalMember(owner = "client!afp", name = "u", descriptor = "[I")
	int[] anIntArray179 = new int[] { 0 };

	@OriginalMember(owner = "client!afp", name = "<init>", descriptor = "()V", line = 23)
	Class3_Sub8() {
	}

	@OriginalMember(owner = "client!afp", name = "k", descriptor = "(IIZ)I", line = 26)
	public static int method10833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg2);
		if (local4 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray178.length) {
			return local4.anIntArray178[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!afp", name = "at", descriptor = "(IIZ)I", line = 26)
	public static int method10844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg2);
		if (local4 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray178.length) {
			return local4.anIntArray178[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!afp", name = "f", descriptor = "(IIZ)I", line = 26)
	public static int method10851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg2);
		if (local4 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray178.length) {
			return local4.anIntArray178[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!afp", name = "ak", descriptor = "(IIZ)I", line = 33)
	public static int method10829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg2);
		if (local4 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray179.length) {
			return local4.anIntArray179[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!afp", name = "af", descriptor = "(IIZ)I", line = 33)
	public static int method10834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg2);
		if (local4 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray179.length) {
			return local4.anIntArray179[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!afp", name = "aa", descriptor = "(IIZ)I", line = 40)
	public static int method10836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg2);
		if (local4 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(16) int local16 = 0;
			for (@Pc(18) int local18 = 0; local18 < local4.anIntArray179.length; local18++) {
				if (local4.anIntArray178[local18] == arg1) {
					local16 += local4.anIntArray179[local18];
				}
			}
			return local16;
		}
	}

	@OriginalMember(owner = "client!afp", name = "ah", descriptor = "(IIZ)I", line = 51)
	public static int method10837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class3_Sub8 local6 = Class14.method3338(arg0, arg2);
		if (local6 == null) {
			return 0;
		}
		for (@Pc(12) int local12 = 0; local12 < local6.anIntArray178.length; local12++) {
			if (local6.anIntArray178[local12] >= 0 && Class44_Sub3.aClass596_1.method33435(local6.anIntArray178[local12]).anInt5466 * 2120045409 == arg1) {
				local1 += Class440.method28240(arg0, local12, arg2);
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!afp", name = "an", descriptor = "(IIZZ)I", line = 61)
	public static int method10838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg3);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < local4.anIntArray178.length; local13++) {
			if (local4.anIntArray178[local13] >= 0 && local4.anIntArray178[local13] < Class44_Sub3.aClass596_1.anInt5517 * 386588925) {
				@Pc(40) Class594 local40 = Class44_Sub3.aClass596_1.method33435(local4.anIntArray178[local13]);
				@Pc(52) int local52 = local40.method33375(arg1, Class3_Sub20.aClass625_1.method33783(arg1).anInt5585 * 100041865);
				if (arg2) {
					local11 += local4.anIntArray179[local13] * local52;
				} else {
					local11 += local52;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!afp", name = "aj", descriptor = "(IIZZ)I", line = 61)
	public static int method10839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg3);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < local4.anIntArray178.length; local13++) {
			if (local4.anIntArray178[local13] >= 0 && local4.anIntArray178[local13] < Class44_Sub3.aClass596_1.anInt5517 * 386588925) {
				@Pc(40) Class594 local40 = Class44_Sub3.aClass596_1.method33435(local4.anIntArray178[local13]);
				@Pc(52) int local52 = local40.method33375(arg1, Class3_Sub20.aClass625_1.method33783(arg1).anInt5585 * 100041865);
				if (arg2) {
					local11 += local4.anIntArray179[local13] * local52;
				} else {
					local11 += local52;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!afp", name = "as", descriptor = "(IIZZ)I", line = 61)
	public static int method10840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg3);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < local4.anIntArray178.length; local13++) {
			if (local4.anIntArray178[local13] >= 0 && local4.anIntArray178[local13] < Class44_Sub3.aClass596_1.anInt5517 * 386588925) {
				@Pc(40) Class594 local40 = Class44_Sub3.aClass596_1.method33435(local4.anIntArray178[local13]);
				@Pc(52) int local52 = local40.method33375(arg1, Class3_Sub20.aClass625_1.method33783(arg1).anInt5585 * 100041865);
				if (arg2) {
					local11 += local4.anIntArray179[local13] * local52;
				} else {
					local11 += local52;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!afp", name = "aq", descriptor = "(IZ)I", line = 76)
	public static int method10853(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			return 0;
		}
		@Pc(8) Class3_Sub8 local8 = Class14.method3338(arg0, arg1);
		if (local8 == null) {
			return Class352.aClass621_1.method33757(arg0).anInt5549 * -613706239;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local8.anIntArray178.length; local23++) {
			if (local8.anIntArray178[local23] == -1) {
				local21++;
			}
		}
		return local21 + (Class352.aClass621_1.method33757(arg0).anInt5549 * -613706239 - local8.anIntArray178.length);
	}

	@OriginalMember(owner = "client!afp", name = "av", descriptor = "(IZ)I", line = 76)
	public static int method10855(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			return 0;
		}
		@Pc(8) Class3_Sub8 local8 = Class14.method3338(arg0, arg1);
		if (local8 == null) {
			return Class352.aClass621_1.method33757(arg0).anInt5549 * -613706239;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local8.anIntArray178.length; local23++) {
			if (local8.anIntArray178[local23] == -1) {
				local21++;
			}
		}
		return local21 + (Class352.aClass621_1.method33757(arg0).anInt5549 * -613706239 - local8.anIntArray178.length);
	}

	@OriginalMember(owner = "client!afp", name = "ai", descriptor = "(IZ)I", line = 76)
	public static int method10858(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			return 0;
		}
		@Pc(8) Class3_Sub8 local8 = Class14.method3338(arg0, arg1);
		if (local8 == null) {
			return Class352.aClass621_1.method33757(arg0).anInt5549 * -613706239;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local8.anIntArray178.length; local23++) {
			if (local8.anIntArray178[local23] == -1) {
				local21++;
			}
		}
		return local21 + (Class352.aClass621_1.method33757(arg0).anInt5549 * -613706239 - local8.anIntArray178.length);
	}

	@OriginalMember(owner = "client!afp", name = "ap", descriptor = "(IZ)Lclient!afp;", line = 88)
	static Class3_Sub8 method10835(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) long local8 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub8) aClass581_6.method33217(local8);
	}

	@OriginalMember(owner = "client!afp", name = "al", descriptor = "(IZ)Lclient!afp;", line = 88)
	static Class3_Sub8 method10842(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) long local8 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub8) aClass581_6.method33217(local8);
	}

	@OriginalMember(owner = "client!afp", name = "az", descriptor = "(IZ)Lclient!afp;", line = 88)
	static Class3_Sub8 method10845(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) long local8 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub8) aClass581_6.method33217(local8);
	}

	@OriginalMember(owner = "client!afp", name = "ao", descriptor = "(IZ)Lclient!afp;", line = 88)
	static Class3_Sub8 method10846(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) long local8 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub8) aClass581_6.method33217(local8);
	}

	@OriginalMember(owner = "client!afp", name = "ax", descriptor = "(IZ)Lclient!afp;", line = 88)
	static Class3_Sub8 method10861(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) long local8 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub8) aClass581_6.method33217(local8);
	}

	@OriginalMember(owner = "client!afp", name = "ab", descriptor = "(IIIIZ)V", line = 93)
	static void method10849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) long local8 = (long) (arg0 | (arg4 ? Integer.MIN_VALUE : 0));
		@Pc(13) Class3_Sub8 local13 = (Class3_Sub8) aClass581_6.method33217(local8);
		if (local13 == null) {
			local13 = new Class3_Sub8();
			aClass581_6.method33241(local13, local8);
		}
		if (local13.anIntArray178.length <= arg1) {
			@Pc(34) int[] local34 = new int[arg1 + 1];
			@Pc(39) int[] local39 = new int[arg1 + 1];
			@Pc(41) int local41;
			for (local41 = 0; local41 < local13.anIntArray178.length; local41++) {
				local34[local41] = local13.anIntArray178[local41];
				local39[local41] = local13.anIntArray179[local41];
			}
			for (local41 = local13.anIntArray178.length; local41 < arg1; local41++) {
				local34[local41] = -1;
				local39[local41] = 0;
			}
			local13.anIntArray178 = local34;
			local13.anIntArray179 = local39;
		}
		local13.anIntArray178[arg1] = arg2;
		local13.anIntArray179[arg1] = arg3;
	}

	@OriginalMember(owner = "client!afp", name = "am", descriptor = "(IZ)V", line = 118)
	static void method10847(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg1);
		if (local4 != null) {
			for (@Pc(10) int local10 = 0; local10 < local4.anIntArray178.length; local10++) {
				local4.anIntArray178[local10] = -1;
				local4.anIntArray179[local10] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "ay", descriptor = "(IZ)V", line = 118)
	static void method10848(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg1);
		if (local4 != null) {
			for (@Pc(10) int local10 = 0; local10 < local4.anIntArray178.length; local10++) {
				local4.anIntArray178[local10] = -1;
				local4.anIntArray179[local10] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "au", descriptor = "(IZ)V", line = 118)
	static void method10850(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg1);
		if (local4 != null) {
			for (@Pc(10) int local10 = 0; local10 < local4.anIntArray178.length; local10++) {
				local4.anIntArray178[local10] = -1;
				local4.anIntArray179[local10] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "ag", descriptor = "(IZ)V", line = 118)
	static void method10852(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg1);
		if (local4 != null) {
			for (@Pc(10) int local10 = 0; local10 < local4.anIntArray178.length; local10++) {
				local4.anIntArray178[local10] = -1;
				local4.anIntArray179[local10] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!afp", name = "ae", descriptor = "(IZ)V", line = 127)
	static void method10841(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg1);
		if (local4 != null) {
			local4.method33656();
		}
	}

	@OriginalMember(owner = "client!afp", name = "ar", descriptor = "(IZ)V", line = 127)
	static void method10854(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg1);
		if (local4 != null) {
			local4.method33656();
		}
	}

	@OriginalMember(owner = "client!afp", name = "ad", descriptor = "()V", line = 133)
	static void method10856() {
		aClass581_6.method33222();
	}

	@OriginalMember(owner = "client!afp", name = "z", descriptor = "([II[IZI)J", line = 137)
	long method10830(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) long[] local1 = Class3_Sub41.aLongArray8;
		@Pc(3) long local3 = -1L;
		@Pc(19) long local19 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg1 >> 8)) & 0xFFL)];
		local3 = local19 >>> 8 ^ local1[(int) ((local19 ^ (long) arg1) & 0xFFL)];
		@Pc(35) int local35;
		for (local35 = 0; local35 < arg0.length; local35++) {
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 24)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 16)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 8)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg0[local35]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg2[local35]) & 0xFFL)];
			}
		}
		return local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!afp", name = "aw", descriptor = "([II[IZ)J", line = 137)
	long method10857(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) long[] local1 = Class3_Sub41.aLongArray8;
		@Pc(3) long local3 = -1L;
		@Pc(19) long local19 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg1 >> 8)) & 0xFFL)];
		local3 = local19 >>> 8 ^ local1[(int) ((local19 ^ (long) arg1) & 0xFFL)];
		@Pc(35) int local35;
		for (local35 = 0; local35 < arg0.length; local35++) {
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 24)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 16)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 8)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg0[local35]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg2[local35]) & 0xFFL)];
			}
		}
		return local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!afp", name = "ac", descriptor = "([II[IZ)J", line = 137)
	long method10864(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) long[] local1 = Class3_Sub41.aLongArray8;
		@Pc(3) long local3 = -1L;
		@Pc(19) long local19 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg1 >> 8)) & 0xFFL)];
		local3 = local19 >>> 8 ^ local1[(int) ((local19 ^ (long) arg1) & 0xFFL)];
		@Pc(35) int local35;
		for (local35 = 0; local35 < arg0.length; local35++) {
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 24)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 16)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg0[local35] >> 8)) & 0xFFL)];
			local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg0[local35]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				local3 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) arg2[local35]) & 0xFFL)];
			}
		}
		return local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!afp", name = "j", descriptor = "(Lclient!de;ILclient!wi;IZLclient!tq;I)Lclient!dh;", line = 157)
	final Class20 method10831(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class488 arg5) {
		@Pc(1) Class20 local1 = null;
		@Pc(3) int local3 = arg1;
		@Pc(5) Class445 local5 = null;
		if (arg3 != -1) {
			local5 = Class399.aClass428_1.method27917(arg3);
		}
		@Pc(16) int[] local16 = this.anIntArray178;
		if (local5 != null && local5.anIntArray456 != null) {
			local16 = new int[local5.anIntArray456.length];
			for (@Pc(28) int local28 = 0; local28 < local5.anIntArray456.length; local28++) {
				@Pc(38) int local38 = local5.anIntArray456[local28];
				if (local38 >= 0 && local38 < this.anIntArray178.length) {
					local16[local28] = this.anIntArray178[local38];
				} else {
					local16[local28] = -1;
				}
			}
		}
		if (arg2 != null) {
			local3 = arg1 | arg2.method20035();
		}
		@Pc(81) long local81 = this.method10830(local16, arg3, arg5 == null ? null : arg5.anIntArray473, arg4);
		if (aClass161_3 != null) {
			local1 = (Class20) aClass161_3.method23219(local81);
		}
		if (local1 == null || arg0.method17117(local1.method5327(), local3) != 0) {
			if (local1 != null) {
				local3 = arg0.method17102(local3, local1.method5327());
			}
			@Pc(108) int local108 = local3;
			@Pc(110) boolean local110 = false;
			for (@Pc(112) int local112 = 0; local112 < local16.length; local112++) {
				if (local16[local112] != -1 && !Class44_Sub3.aClass596_1.method33435(local16[local112]).method33371(arg4, null)) {
					local110 = true;
				}
			}
			if (local110) {
				return null;
			}
			@Pc(145) Class138[] local145 = new Class138[local16.length];
			@Pc(147) int local147;
			for (local147 = 0; local147 < local16.length; local147++) {
				if (local16[local147] != -1) {
					local145[local147] = Class44_Sub3.aClass596_1.method33435(local16[local147]).method33368(arg4, null);
				}
			}
			@Pc(204) int local204;
			@Pc(211) int local211;
			if (local5 != null && local5.anIntArrayArray55 != null) {
				for (local147 = 0; local147 < local5.anIntArrayArray55.length; local147++) {
					if (local5.anIntArrayArray55[local147] != null && local145[local147] != null) {
						local204 = local5.anIntArrayArray55[local147][0];
						local211 = local5.anIntArrayArray55[local147][1];
						@Pc(218) int local218 = local5.anIntArrayArray55[local147][2];
						@Pc(225) int local225 = local5.anIntArrayArray55[local147][3];
						@Pc(232) int local232 = local5.anIntArrayArray55[local147][4];
						@Pc(239) int local239 = local5.anIntArrayArray55[local147][5];
						if (local225 != 0 || local232 != 0 || local239 != 0) {
							local145[local147].method22972(local225, local232, local239);
						}
						if (local204 != 0 || local211 != 0 || local218 != 0) {
							local145[local147].method22966(local204, local211, local218);
						}
					}
				}
			}
			@Pc(279) Class138 local279 = new Class138(local145, local145.length);
			if (arg5 != null) {
				local108 = local3 | 0x4000;
			}
			local1 = arg0.method17100(local279, local108, Class325.anInt4566 * 109543943, 65, 852);
			if (arg5 != null) {
				for (local204 = 0; local204 < 10; local204++) {
					for (local211 = 0; local211 < Class346.aShortArrayArray4[local204].length; local211++) {
						if (arg5.anIntArray473[local204] < Class488.aShortArrayArrayArray5[local204][local211].length) {
							local1.method5415(Class346.aShortArrayArray4[local204][local211], Class488.aShortArrayArrayArray5[local204][local211][arg5.anIntArray473[local204]]);
						}
					}
				}
			}
			if (aClass161_3 != null) {
				local1.method5326(local3);
				aClass161_3.method23222(local1, local81);
			}
		}
		if (arg2 == null) {
			return local1;
		} else {
			@Pc(364) Class20 local364 = local1.method5430((byte) 1, local3, true);
			arg2.method20066(local364, 0);
			return local364;
		}
	}

	@OriginalMember(owner = "client!afp", name = "bw", descriptor = "(Lclient!de;ILclient!wi;IZLclient!tq;)Lclient!dh;", line = 157)
	final Class20 method10859(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class488 arg5) {
		@Pc(1) Class20 local1 = null;
		@Pc(3) int local3 = arg1;
		@Pc(5) Class445 local5 = null;
		if (arg3 != -1) {
			local5 = Class399.aClass428_1.method27917(arg3);
		}
		@Pc(16) int[] local16 = this.anIntArray178;
		if (local5 != null && local5.anIntArray456 != null) {
			local16 = new int[local5.anIntArray456.length];
			for (@Pc(28) int local28 = 0; local28 < local5.anIntArray456.length; local28++) {
				@Pc(38) int local38 = local5.anIntArray456[local28];
				if (local38 >= 0 && local38 < this.anIntArray178.length) {
					local16[local28] = this.anIntArray178[local38];
				} else {
					local16[local28] = -1;
				}
			}
		}
		if (arg2 != null) {
			local3 = arg1 | arg2.method20035();
		}
		@Pc(81) long local81 = this.method10830(local16, arg3, arg5 == null ? null : arg5.anIntArray473, arg4);
		if (aClass161_3 != null) {
			local1 = (Class20) aClass161_3.method23219(local81);
		}
		if (local1 == null || arg0.method17117(local1.method5327(), local3) != 0) {
			if (local1 != null) {
				local3 = arg0.method17102(local3, local1.method5327());
			}
			@Pc(108) int local108 = local3;
			@Pc(110) boolean local110 = false;
			for (@Pc(112) int local112 = 0; local112 < local16.length; local112++) {
				if (local16[local112] != -1 && !Class44_Sub3.aClass596_1.method33435(local16[local112]).method33371(arg4, null)) {
					local110 = true;
				}
			}
			if (local110) {
				return null;
			}
			@Pc(145) Class138[] local145 = new Class138[local16.length];
			@Pc(147) int local147;
			for (local147 = 0; local147 < local16.length; local147++) {
				if (local16[local147] != -1) {
					local145[local147] = Class44_Sub3.aClass596_1.method33435(local16[local147]).method33368(arg4, null);
				}
			}
			@Pc(204) int local204;
			@Pc(211) int local211;
			if (local5 != null && local5.anIntArrayArray55 != null) {
				for (local147 = 0; local147 < local5.anIntArrayArray55.length; local147++) {
					if (local5.anIntArrayArray55[local147] != null && local145[local147] != null) {
						local204 = local5.anIntArrayArray55[local147][0];
						local211 = local5.anIntArrayArray55[local147][1];
						@Pc(218) int local218 = local5.anIntArrayArray55[local147][2];
						@Pc(225) int local225 = local5.anIntArrayArray55[local147][3];
						@Pc(232) int local232 = local5.anIntArrayArray55[local147][4];
						@Pc(239) int local239 = local5.anIntArrayArray55[local147][5];
						if (local225 != 0 || local232 != 0 || local239 != 0) {
							local145[local147].method22972(local225, local232, local239);
						}
						if (local204 != 0 || local211 != 0 || local218 != 0) {
							local145[local147].method22966(local204, local211, local218);
						}
					}
				}
			}
			@Pc(279) Class138 local279 = new Class138(local145, local145.length);
			if (arg5 != null) {
				local108 = local3 | 0x4000;
			}
			local1 = arg0.method17100(local279, local108, Class325.anInt4566 * 109543943, 65, 852);
			if (arg5 != null) {
				for (local204 = 0; local204 < 10; local204++) {
					for (local211 = 0; local211 < Class346.aShortArrayArray4[local204].length; local211++) {
						if (arg5.anIntArray473[local204] < Class488.aShortArrayArrayArray5[local204][local211].length) {
							local1.method5415(Class346.aShortArrayArray4[local204][local211], Class488.aShortArrayArrayArray5[local204][local211][arg5.anIntArray473[local204]]);
						}
					}
				}
			}
			if (aClass161_3 != null) {
				local1.method5326(local3);
				aClass161_3.method23222(local1, local81);
			}
		}
		if (arg2 == null) {
			return local1;
		} else {
			@Pc(364) Class20 local364 = local1.method5430((byte) 1, local3, true);
			arg2.method20066(local364, 0);
			return local364;
		}
	}

	@OriginalMember(owner = "client!afp", name = "bp", descriptor = "(Lclient!de;ILclient!wi;IZLclient!tq;)Lclient!dh;", line = 157)
	final Class20 method10860(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class488 arg5) {
		@Pc(1) Class20 local1 = null;
		@Pc(3) int local3 = arg1;
		@Pc(5) Class445 local5 = null;
		if (arg3 != -1) {
			local5 = Class399.aClass428_1.method27917(arg3);
		}
		@Pc(16) int[] local16 = this.anIntArray178;
		if (local5 != null && local5.anIntArray456 != null) {
			local16 = new int[local5.anIntArray456.length];
			for (@Pc(28) int local28 = 0; local28 < local5.anIntArray456.length; local28++) {
				@Pc(38) int local38 = local5.anIntArray456[local28];
				if (local38 >= 0 && local38 < this.anIntArray178.length) {
					local16[local28] = this.anIntArray178[local38];
				} else {
					local16[local28] = -1;
				}
			}
		}
		if (arg2 != null) {
			local3 = arg1 | arg2.method20035();
		}
		@Pc(81) long local81 = this.method10830(local16, arg3, arg5 == null ? null : arg5.anIntArray473, arg4);
		if (aClass161_3 != null) {
			local1 = (Class20) aClass161_3.method23219(local81);
		}
		if (local1 == null || arg0.method17117(local1.method5327(), local3) != 0) {
			if (local1 != null) {
				local3 = arg0.method17102(local3, local1.method5327());
			}
			@Pc(108) int local108 = local3;
			@Pc(110) boolean local110 = false;
			for (@Pc(112) int local112 = 0; local112 < local16.length; local112++) {
				if (local16[local112] != -1 && !Class44_Sub3.aClass596_1.method33435(local16[local112]).method33371(arg4, null)) {
					local110 = true;
				}
			}
			if (local110) {
				return null;
			}
			@Pc(145) Class138[] local145 = new Class138[local16.length];
			@Pc(147) int local147;
			for (local147 = 0; local147 < local16.length; local147++) {
				if (local16[local147] != -1) {
					local145[local147] = Class44_Sub3.aClass596_1.method33435(local16[local147]).method33368(arg4, null);
				}
			}
			@Pc(204) int local204;
			@Pc(211) int local211;
			if (local5 != null && local5.anIntArrayArray55 != null) {
				for (local147 = 0; local147 < local5.anIntArrayArray55.length; local147++) {
					if (local5.anIntArrayArray55[local147] != null && local145[local147] != null) {
						local204 = local5.anIntArrayArray55[local147][0];
						local211 = local5.anIntArrayArray55[local147][1];
						@Pc(218) int local218 = local5.anIntArrayArray55[local147][2];
						@Pc(225) int local225 = local5.anIntArrayArray55[local147][3];
						@Pc(232) int local232 = local5.anIntArrayArray55[local147][4];
						@Pc(239) int local239 = local5.anIntArrayArray55[local147][5];
						if (local225 != 0 || local232 != 0 || local239 != 0) {
							local145[local147].method22972(local225, local232, local239);
						}
						if (local204 != 0 || local211 != 0 || local218 != 0) {
							local145[local147].method22966(local204, local211, local218);
						}
					}
				}
			}
			@Pc(279) Class138 local279 = new Class138(local145, local145.length);
			if (arg5 != null) {
				local108 = local3 | 0x4000;
			}
			local1 = arg0.method17100(local279, local108, Class325.anInt4566 * 109543943, 65, 852);
			if (arg5 != null) {
				for (local204 = 0; local204 < 10; local204++) {
					for (local211 = 0; local211 < Class346.aShortArrayArray4[local204].length; local211++) {
						if (arg5.anIntArray473[local204] < Class488.aShortArrayArrayArray5[local204][local211].length) {
							local1.method5415(Class346.aShortArrayArray4[local204][local211], Class488.aShortArrayArrayArray5[local204][local211][arg5.anIntArray473[local204]]);
						}
					}
				}
			}
			if (aClass161_3 != null) {
				local1.method5326(local3);
				aClass161_3.method23222(local1, local81);
			}
		}
		if (arg2 == null) {
			return local1;
		} else {
			@Pc(364) Class20 local364 = local1.method5430((byte) 1, local3, true);
			arg2.method20066(local364, 0);
			return local364;
		}
	}

	@OriginalMember(owner = "client!afp", name = "bf", descriptor = "(I)V", line = 222)
	static void method10832(@OriginalArg(0) int arg0) {
		Class325.anInt4566 = arg0 * -1020900425;
		aClass161_3.method23224();
	}

	@OriginalMember(owner = "client!afp", name = "bs", descriptor = "(I)V", line = 222)
	static void method10843(@OriginalArg(0) int arg0) {
		Class325.anInt4566 = arg0 * -1020900425;
		aClass161_3.method23224();
	}

	@OriginalMember(owner = "client!afp", name = "bd", descriptor = "(I)V", line = 222)
	static void method10862(@OriginalArg(0) int arg0) {
		Class325.anInt4566 = arg0 * -1020900425;
		aClass161_3.method23224();
	}

	@OriginalMember(owner = "client!afp", name = "bm", descriptor = "(I)V", line = 222)
	static void method10863(@OriginalArg(0) int arg0) {
		Class325.anInt4566 = arg0 * -1020900425;
		aClass161_3.method23224();
	}
}
