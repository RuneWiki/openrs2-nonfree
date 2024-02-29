package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xw")
public class Class655 {

	@OriginalMember(owner = "client!xw", name = "<init>", descriptor = "()V", line = 4)
	Class655() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!xw", name = "z", descriptor = "([Ljava/lang/String;[I)V", line = 9)
	public static void method32980(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1) {
		Class152.method17431(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!xw", name = "g", descriptor = "([Ljava/lang/String;[I)V", line = 9)
	public static void method32981(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1) {
		Class152.method17431(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!xw", name = "j", descriptor = "([Ljava/lang/String;[III)V", line = 13)
	static void method32982(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
				@Pc(62) String local62 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local62;
				@Pc(76) int local76 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local76;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class152.method17431(arg0, arg1, arg2, local10 - 1);
		Class152.method17431(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "i", descriptor = "([Ljava/lang/String;[III)V", line = 13)
	static void method32983(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
				@Pc(62) String local62 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local62;
				@Pc(76) int local76 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local76;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class152.method17431(arg0, arg1, arg2, local10 - 1);
		Class152.method17431(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "k", descriptor = "([Ljava/lang/String;[III)V", line = 13)
	static void method32984(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
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
				@Pc(62) String local62 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local62;
				@Pc(76) int local76 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local76;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		Class152.method17431(arg0, arg1, arg2, local10 - 1);
		Class152.method17431(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "u", descriptor = "([I[III)V", line = 43)
	public static void method32985(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = Integer.MAX_VALUE == local14 ? 0 : 1;
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
		Class474.method29672(arg0, arg1, arg2, local10 - 1);
		Class474.method29672(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "e", descriptor = "([I[III)V", line = 43)
	public static void method32986(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = Integer.MAX_VALUE == local14 ? 0 : 1;
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
		Class474.method29672(arg0, arg1, arg2, local10 - 1);
		Class474.method29672(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "f", descriptor = "([I[III)V", line = 43)
	public static void method32987(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = Integer.MAX_VALUE == local14 ? 0 : 1;
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
		Class474.method29672(arg0, arg1, arg2, local10 - 1);
		Class474.method29672(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "o", descriptor = "([J[I)V", line = 74)
	public static void method32988(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Class16.method277(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!xw", name = "b", descriptor = "([J[I)V", line = 74)
	public static void method32989(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Class16.method277(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!xw", name = "n", descriptor = "([J[III)V", line = 78)
	static void method32990(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = Long.MAX_VALUE == local14 ? 0 : 1;
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
		Class16.method277(arg0, arg1, arg2, local10 - 1);
		Class16.method277(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "a", descriptor = "([J[III)V", line = 78)
	static void method32991(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = Long.MAX_VALUE == local14 ? 0 : 1;
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
		Class16.method277(arg0, arg1, arg2, local10 - 1);
		Class16.method277(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "v", descriptor = "(I)Lclient!cy;", line = 86)
	public static Class83 method32992() {
		return Class574.aClass83_36;
	}

	@OriginalMember(owner = "client!xw", name = "h", descriptor = "([F[III)V", line = 109)
	public static void method32993(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
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
		Class590.method31811(arg0, arg1, arg2, local10 - 1);
		Class590.method31811(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "aj", descriptor = "([F[III)V", line = 109)
	public static void method32994(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
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
		Class590.method31811(arg0, arg1, arg2, local10 - 1);
		Class590.method31811(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "ai", descriptor = "([F[III)V", line = 109)
	public static void method32995(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
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
		Class590.method31811(arg0, arg1, arg2, local10 - 1);
		Class590.method31811(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "ag", descriptor = "([F[III)V", line = 109)
	public static void method32996(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
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
		Class590.method31811(arg0, arg1, arg2, local10 - 1);
		Class590.method31811(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "m", descriptor = "([F[III)V", line = 109)
	public static void method32997(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
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
		Class590.method31811(arg0, arg1, arg2, local10 - 1);
		Class590.method31811(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "al", descriptor = "([I[F[F)V", line = 139)
	public static void method32998(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		Class127_Sub5.method13159(arg0, arg1, arg2, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!xw", name = "au", descriptor = "([I[F[FII)V", line = 143)
	static void method32999(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg4) / 2;
		@Pc(10) int local10 = arg3;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg4];
		arg0[arg4] = local14;
		@Pc(28) float local28 = arg1[local8];
		arg1[local8] = arg1[arg4];
		arg1[arg4] = local28;
		@Pc(42) float local42 = arg2[local8];
		arg2[local8] = arg2[arg4];
		arg2[arg4] = local42;
		@Pc(61) int local61 = Long.MAX_VALUE == (long) local14 ? 0 : 1;
		for (@Pc(63) int local63 = arg3; local63 < arg4; local63++) {
			if (arg0[local63] < (local63 & local61) + local14) {
				@Pc(79) int local79 = arg0[local63];
				arg0[local63] = arg0[local10];
				arg0[local10] = local79;
				@Pc(93) float local93 = arg1[local63];
				arg1[local63] = arg1[local10];
				arg1[local10] = local93;
				@Pc(107) float local107 = arg2[local63];
				arg2[local63] = arg2[local10];
				arg2[local10] = local107;
				local10++;
			}
		}
		arg0[arg4] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg4] = arg1[local10];
		arg1[local10] = local28;
		arg2[arg4] = arg2[local10];
		arg2[local10] = local42;
		Class127_Sub5.method13159(arg0, arg1, arg2, arg3, local10 - 1);
		Class127_Sub5.method13159(arg0, arg1, arg2, local10 + 1, arg4);
	}

	@OriginalMember(owner = "client!xw", name = "ak", descriptor = "([I[F[FII)V", line = 143)
	static void method33000(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg4) / 2;
		@Pc(10) int local10 = arg3;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg4];
		arg0[arg4] = local14;
		@Pc(28) float local28 = arg1[local8];
		arg1[local8] = arg1[arg4];
		arg1[arg4] = local28;
		@Pc(42) float local42 = arg2[local8];
		arg2[local8] = arg2[arg4];
		arg2[arg4] = local42;
		@Pc(61) int local61 = Long.MAX_VALUE == (long) local14 ? 0 : 1;
		for (@Pc(63) int local63 = arg3; local63 < arg4; local63++) {
			if (arg0[local63] < (local63 & local61) + local14) {
				@Pc(79) int local79 = arg0[local63];
				arg0[local63] = arg0[local10];
				arg0[local10] = local79;
				@Pc(93) float local93 = arg1[local63];
				arg1[local63] = arg1[local10];
				arg1[local10] = local93;
				@Pc(107) float local107 = arg2[local63];
				arg2[local63] = arg2[local10];
				arg2[local10] = local107;
				local10++;
			}
		}
		arg0[arg4] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg4] = arg1[local10];
		arg1[local10] = local28;
		arg2[arg4] = arg2[local10];
		arg2[local10] = local42;
		Class127_Sub5.method13159(arg0, arg1, arg2, arg3, local10 - 1);
		Class127_Sub5.method13159(arg0, arg1, arg2, local10 + 1, arg4);
	}

	@OriginalMember(owner = "client!xw", name = "ax", descriptor = "([I[F[FII)V", line = 143)
	static void method33001(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg4) / 2;
		@Pc(10) int local10 = arg3;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg4];
		arg0[arg4] = local14;
		@Pc(28) float local28 = arg1[local8];
		arg1[local8] = arg1[arg4];
		arg1[arg4] = local28;
		@Pc(42) float local42 = arg2[local8];
		arg2[local8] = arg2[arg4];
		arg2[arg4] = local42;
		@Pc(61) int local61 = Long.MAX_VALUE == (long) local14 ? 0 : 1;
		for (@Pc(63) int local63 = arg3; local63 < arg4; local63++) {
			if (arg0[local63] < (local63 & local61) + local14) {
				@Pc(79) int local79 = arg0[local63];
				arg0[local63] = arg0[local10];
				arg0[local10] = local79;
				@Pc(93) float local93 = arg1[local63];
				arg1[local63] = arg1[local10];
				arg1[local10] = local93;
				@Pc(107) float local107 = arg2[local63];
				arg2[local63] = arg2[local10];
				arg2[local10] = local107;
				local10++;
			}
		}
		arg0[arg4] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg4] = arg1[local10];
		arg1[local10] = local28;
		arg2[arg4] = arg2[local10];
		arg2[local10] = local42;
		Class127_Sub5.method13159(arg0, arg1, arg2, arg3, local10 - 1);
		Class127_Sub5.method13159(arg0, arg1, arg2, local10 + 1, arg4);
	}

	@OriginalMember(owner = "client!xw", name = "ao", descriptor = "([I[F[FII)V", line = 143)
	static void method33002(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg4) / 2;
		@Pc(10) int local10 = arg3;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg4];
		arg0[arg4] = local14;
		@Pc(28) float local28 = arg1[local8];
		arg1[local8] = arg1[arg4];
		arg1[arg4] = local28;
		@Pc(42) float local42 = arg2[local8];
		arg2[local8] = arg2[arg4];
		arg2[arg4] = local42;
		@Pc(61) int local61 = Long.MAX_VALUE == (long) local14 ? 0 : 1;
		for (@Pc(63) int local63 = arg3; local63 < arg4; local63++) {
			if (arg0[local63] < (local63 & local61) + local14) {
				@Pc(79) int local79 = arg0[local63];
				arg0[local63] = arg0[local10];
				arg0[local10] = local79;
				@Pc(93) float local93 = arg1[local63];
				arg1[local63] = arg1[local10];
				arg1[local10] = local93;
				@Pc(107) float local107 = arg2[local63];
				arg2[local63] = arg2[local10];
				arg2[local10] = local107;
				local10++;
			}
		}
		arg0[arg4] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg4] = arg1[local10];
		arg1[local10] = local28;
		arg2[arg4] = arg2[local10];
		arg2[local10] = local42;
		Class127_Sub5.method13159(arg0, arg1, arg2, arg3, local10 - 1);
		Class127_Sub5.method13159(arg0, arg1, arg2, local10 + 1, arg4);
	}

	@OriginalMember(owner = "client!xw", name = "ac", descriptor = "([I[Ljava/lang/Object;II)V", line = 187)
	public static void method33003(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
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
		Class197.method25472(arg0, arg1, arg2, local10 - 1);
		Class197.method25472(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "ar", descriptor = "([I[Ljava/lang/Object;II)V", line = 187)
	public static void method33004(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
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
		Class197.method25472(arg0, arg1, arg2, local10 - 1);
		Class197.method25472(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "ad", descriptor = "([I[Ljava/lang/Object;II)V", line = 187)
	public static void method33005(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
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
		Class197.method25472(arg0, arg1, arg2, local10 - 1);
		Class197.method25472(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!xw", name = "at", descriptor = "([J[Ljava/lang/Object;)V", line = 218)
	public static void method33006(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Class602.method32048(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!xw", name = "av", descriptor = "([J[Ljava/lang/Object;)V", line = 218)
	public static void method33007(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Class602.method32048(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!xw", name = "ae", descriptor = "([J[Ljava/lang/Object;)V", line = 218)
	public static void method33008(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Class602.method32048(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!xw", name = "j", descriptor = "(II)V", line = 255)
	static void method33009(@OriginalArg(0) int arg0) {
		Class77_Sub7.anInt1466 = arg0 * -2060961383;
		Class77_Sub7.aClass232_18.method25850();
	}

	@OriginalMember(owner = "client!xw", name = "kd", descriptor = "(Lclient!gm;Lclient!yf;B)V", line = 6492)
	static final void method33010(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(1) byte local1 = 10;
		Class569.method31422(arg0, local1, arg1);
	}

	@OriginalMember(owner = "client!xw", name = "ng", descriptor = "(Lclient!yf;I)V", line = 7003)
	static final void method33011(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class131.method23062(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!xw", name = "oa", descriptor = "(Lclient!yf;I)V", line = 7093)
	static final void method33012(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class110_Sub1.method9164(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!xw", name = "wg", descriptor = "(Lclient!yf;B)V", line = 8525)
	static final void method33013(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1 != null && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1.aBoolean845 ? 1 : 0;
	}
}
