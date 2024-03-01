package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public class Class506 {

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 4)
	Class506() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!um", name = "n", descriptor = "([Ljava/lang/String;[S)V", line = 9)
	public static void method29525(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Class312.method25817(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "([Ljava/lang/String;[S)V", line = 9)
	public static void method29526(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Class312.method25817(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!um", name = "j", descriptor = "([Ljava/lang/String;[S)V", line = 9)
	public static void method29541(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Class312.method25817(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!um", name = "r", descriptor = "([Ljava/lang/String;[SII)V", line = 13)
	static void method29537(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) String local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) short local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (local14 == null || arg0[local40] != null && arg0[local40].compareTo(local14) < (local40 & 0x1)) {
				@Pc(63) String local63 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) short local77 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class312.method25817(arg0, arg1, arg2, local10 - 1);
		Class312.method25817(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "([Ljava/lang/String;[I)V", line = 43)
	public static void method29528(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1) {
		Class492.method29293(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!um", name = "m", descriptor = "([Ljava/lang/String;[III)V", line = 47)
	static void method29530(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) String local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (local14 == null || arg0[local40] != null && arg0[local40].compareTo(local14) < (local40 & 0x1)) {
				@Pc(63) String local63 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) int local77 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class492.method29293(arg0, arg1, arg2, local10 - 1);
		Class492.method29293(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "v", descriptor = "([Ljava/lang/String;[III)V", line = 47)
	static void method29531(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) String local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (local14 == null || arg0[local40] != null && arg0[local40].compareTo(local14) < (local40 & 0x1)) {
				@Pc(63) String local63 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) int local77 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class492.method29293(arg0, arg1, arg2, local10 - 1);
		Class492.method29293(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "q", descriptor = "([Ljava/lang/String;[III)V", line = 47)
	static void method29532(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) String local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (local14 == null || arg0[local40] != null && arg0[local40].compareTo(local14) < (local40 & 0x1)) {
				@Pc(63) String local63 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) int local77 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class492.method29293(arg0, arg1, arg2, local10 - 1);
		Class492.method29293(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "o", descriptor = "([I[III)V", line = 77)
	public static void method29524(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = local14 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < (local47 & local45) + local14) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) int local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class392.method27426(arg0, arg1, arg2, local10 - 1);
		Class392.method27426(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "w", descriptor = "([I[III)V", line = 77)
	public static void method29529(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = local14 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < (local47 & local45) + local14) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) int local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class392.method27426(arg0, arg1, arg2, local10 - 1);
		Class392.method27426(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "i", descriptor = "([I[III)V", line = 77)
	public static void method29535(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = local14 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < (local47 & local45) + local14) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) int local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class392.method27426(arg0, arg1, arg2, local10 - 1);
		Class392.method27426(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "t", descriptor = "([I[III)V", line = 77)
	public static void method29540(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = local14 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < (local47 & local45) + local14) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) int local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class392.method27426(arg0, arg1, arg2, local10 - 1);
		Class392.method27426(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "([J[I)V", line = 108)
	public static void method29536(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Class363.method26780(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!um", name = "at", descriptor = "([J[III)V", line = 112)
	static void method29538(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = local14 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < (long) (local48 & local46) + local14) {
				@Pc(66) long local66 = arg0[local48];
				arg0[local48] = arg0[local10];
				arg0[local10] = local66;
				@Pc(80) int local80 = arg1[local48];
				arg1[local48] = arg1[local10];
				arg1[local10++] = local80;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class363.method26780(arg0, arg1, arg2, local10 - 1);
		Class363.method26780(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "af", descriptor = "([J[III)V", line = 112)
	static void method29539(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = local14 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < (long) (local48 & local46) + local14) {
				@Pc(66) long local66 = arg0[local48];
				arg0[local48] = arg0[local10];
				arg0[local10] = local66;
				@Pc(80) int local80 = arg1[local48];
				arg1[local48] = arg1[local10];
				arg1[local10++] = local80;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class363.method26780(arg0, arg1, arg2, local10 - 1);
		Class363.method26780(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "k", descriptor = "([J[III)V", line = 112)
	static void method29544(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = local14 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < (long) (local48 & local46) + local14) {
				@Pc(66) long local66 = arg0[local48];
				arg0[local48] = arg0[local10];
				arg0[local10] = local66;
				@Pc(80) int local80 = arg1[local48];
				arg1[local48] = arg1[local10];
				arg1[local10++] = local80;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class363.method26780(arg0, arg1, arg2, local10 - 1);
		Class363.method26780(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "ak", descriptor = "([F[III)V", line = 143)
	public static void method29523(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) float local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (arg0[local40] > local14) {
				@Pc(53) float local53 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local53;
				@Pc(67) int local67 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local67;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class514.method29618(arg0, arg1, arg2, local10 - 1);
		Class514.method29618(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "aa", descriptor = "([F[III)V", line = 143)
	public static void method29527(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) float local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (arg0[local40] > local14) {
				@Pc(53) float local53 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local53;
				@Pc(67) int local67 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local67;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class514.method29618(arg0, arg1, arg2, local10 - 1);
		Class514.method29618(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "ah", descriptor = "([F[III)V", line = 143)
	public static void method29542(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) float local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (arg0[local40] > local14) {
				@Pc(53) float local53 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local53;
				@Pc(67) int local67 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local67;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class514.method29618(arg0, arg1, arg2, local10 - 1);
		Class514.method29618(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "an", descriptor = "([I[Ljava/lang/Object;)V", line = 173)
	public static void method29534(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Class204.method24176(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!um", name = "aj", descriptor = "([I[Ljava/lang/Object;II)V", line = 177)
	public static void method29543(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = Integer.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < local14 + (local47 & local45)) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) Object local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class204.method24176(arg0, arg1, arg2, local10 - 1);
		Class204.method24176(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "as", descriptor = "([J[Ljava/lang/Object;)V", line = 208)
	public static void method29533(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Class217.method24350(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!um", name = "ai", descriptor = "([J[Ljava/lang/Object;)V", line = 208)
	public static void method29545(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Class217.method24350(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!um", name = "aq", descriptor = "([J[Ljava/lang/Object;II)V", line = 212)
	static void method29546(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = Long.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < local14 + (long) (local48 & local46)) {
				@Pc(66) long local66 = arg0[local48];
				arg0[local48] = arg0[local10];
				arg0[local10] = local66;
				@Pc(80) Object local80 = arg1[local48];
				arg1[local48] = arg1[local10];
				arg1[local10++] = local80;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class217.method24350(arg0, arg1, arg2, local10 - 1);
		Class217.method24350(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "n", descriptor = "(I)I", line = 635)
	public static int method29550() {
		return Class231.anInt3738 * -1726241579;
	}

	@OriginalMember(owner = "client!um", name = "cj", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4407)
	static final void method29547(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 624249098;
		arg0.anInt3560 = arg2.anIntArray496[arg2.anInt5319 * 960738381] * -502714481;
		arg0.anInt3583 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1] * -1878054091;
		Class223.method24442(arg0);
		Class34_Sub3.method8311(arg1, arg0);
		if (arg0.anInt3492 * -107621169 == 0) {
			Class109.method21948(arg1, arg0, false);
		}
	}

	@OriginalMember(owner = "client!um", name = "akb", descriptor = "(Lclient!vs;I)V", line = 10990)
	static final void method29548(@OriginalArg(0) Class536 arg0) {
		if (Class80.aClass23_Sub1_1.method5887() != Class204.aClass204_3 || Class80.aClass23_Sub1_1.method5830() != Class208.aClass208_3) {
			throw new RuntimeException();
		}
		@Pc(20) Class320 local20 = ((Class30_Sub3) Class80.aClass23_Sub1_1.method5827()).method7841();
		@Pc(27) Class320 local27 = ((Class69_Sub5) Class80.aClass23_Sub1_1.method5799()).method14691();
		@Pc(30) Class320 local30 = Class320.method25906(local20);
		local30.method25867(local27);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) local30.method25861();
	}

	@OriginalMember(owner = "client!um", name = "akg", descriptor = "(Lclient!vs;B)V", line = 11067)
	static final void method29549(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 1248498196;
		@Pc(14) float local14 = (float) arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(25) float local25 = (float) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(36) float local36 = (float) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(49) float local49 = (float) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3] / 1000.0F;
		Class80.aClass23_Sub1_1.method5816(Class320.method25891(local14, local25, local36), local49);
	}

	@OriginalMember(owner = "client!um", name = "amn", descriptor = "(Lclient!vs;S)V", line = 11245)
	static final void method29551(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class477.method28828(local12);
	}
}
