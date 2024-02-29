package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public class Class213 {

	@OriginalMember(owner = "client!du", name = "c", descriptor = "I")
	static int anInt3680;

	@OriginalMember(owner = "client!du", name = "w", descriptor = "I")
	static int anInt3681;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "[I")
	static int[] anIntArray349;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	static int anInt3682;

	@OriginalMember(owner = "client!du", name = "y", descriptor = "I")
	static int anInt3683;

	@OriginalMember(owner = "client!du", name = "v", descriptor = "I")
	static int anInt3684;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	static int anInt3685;

	@OriginalMember(owner = "client!du", name = "q", descriptor = "I")
	static int anInt3686;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V", line = 15)
	Class213() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!du", name = "p", descriptor = "(Lclient!dx;[II)V", line = 20)
	public static void method25614(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method25618(arg0, arg1, 0, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(Lclient!dx;[II[I[I)V", line = 24)
	public static void method25615(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method25618(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!du", name = "d", descriptor = "(Lclient!dx;[II[I[I)V", line = 24)
	public static void method25616(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method25618(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!du", name = "s", descriptor = "(Lclient!dx;[II[I[I)V", line = 24)
	public static void method25617(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method25618(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!du", name = "v", descriptor = "(Lclient!dx;[IIII[I[I)V", line = 28)
	static void method25618(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(2) int[] local2 = new int[4];
		arg0.method20142(local2);
		if (arg5 != null && local2[3] - local2[1] != arg5.length) {
			throw new IllegalStateException();
		}
		method25619();
		method25621(arg1, arg2, arg3);
		method25624(local2[1]);
		while (true) {
			@Pc(37) int local37;
			@Pc(39) int local39;
			@Pc(41) int local41;
			do {
				if (!method25625(local2[3])) {
					return;
				}
				local37 = anInt3682;
				local39 = anInt3680;
				local41 = anInt3684;
				if (arg5 == null) {
					break;
				}
				@Pc(49) int local49 = local41 - local2[1];
				if (local37 < arg5[local49] + local2[0]) {
					local37 = arg5[local49] + local2[0];
				}
				if (local39 > arg5[local49] + arg6[local49] + local2[0]) {
					local39 = arg5[local49] + arg6[local49] + local2[0];
				}
			} while (local39 - local37 <= 0);
			arg0.method20057(local37, local41, local39 - local37, arg4, 1);
		}
	}

	@OriginalMember(owner = "client!du", name = "l", descriptor = "()V", line = 49)
	static void method25619() {
		anInt3683 = 0;
	}

	@OriginalMember(owner = "client!du", name = "r", descriptor = "()V", line = 49)
	static void method25620() {
		anInt3683 = 0;
	}

	@OriginalMember(owner = "client!du", name = "y", descriptor = "([III)V", line = 53)
	static void method25621(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = anInt3683 + (arg2 << 1);
		@Pc(16) int local16;
		if (anIntArray349 == null || anIntArray349.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3683; local16++) {
				local14[local16] = anIntArray349[local16];
			}
			anIntArray349 = local14;
		}
		@Pc(33) int local33 = arg2 + arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = arg1; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray349[anInt3683++] = arg0[local37];
				anIntArray349[anInt3683++] = local48;
				anIntArray349[anInt3683++] = arg0[local16];
				anIntArray349[anInt3683++] = local54;
			} else if (local54 < local48) {
				anIntArray349[anInt3683++] = arg0[local16];
				anIntArray349[anInt3683++] = local54;
				anIntArray349[anInt3683++] = arg0[local37];
				anIntArray349[anInt3683++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!du", name = "g", descriptor = "([III)V", line = 53)
	static void method25622(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = anInt3683 + (arg2 << 1);
		@Pc(16) int local16;
		if (anIntArray349 == null || anIntArray349.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3683; local16++) {
				local14[local16] = anIntArray349[local16];
			}
			anIntArray349 = local14;
		}
		@Pc(33) int local33 = arg2 + arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = arg1; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray349[anInt3683++] = arg0[local37];
				anIntArray349[anInt3683++] = local48;
				anIntArray349[anInt3683++] = arg0[local16];
				anIntArray349[anInt3683++] = local54;
			} else if (local54 < local48) {
				anIntArray349[anInt3683++] = arg0[local16];
				anIntArray349[anInt3683++] = local54;
				anIntArray349[anInt3683++] = arg0[local37];
				anIntArray349[anInt3683++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!du", name = "z", descriptor = "([III)V", line = 53)
	static void method25623(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = anInt3683 + (arg2 << 1);
		@Pc(16) int local16;
		if (anIntArray349 == null || anIntArray349.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3683; local16++) {
				local14[local16] = anIntArray349[local16];
			}
			anIntArray349 = local14;
		}
		@Pc(33) int local33 = arg2 + arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = arg1; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray349[anInt3683++] = arg0[local37];
				anIntArray349[anInt3683++] = local48;
				anIntArray349[anInt3683++] = arg0[local16];
				anIntArray349[anInt3683++] = local54;
			} else if (local54 < local48) {
				anIntArray349[anInt3683++] = arg0[local16];
				anIntArray349[anInt3683++] = local54;
				anIntArray349[anInt3683++] = arg0[local37];
				anIntArray349[anInt3683++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!du", name = "w", descriptor = "(I)V", line = 80)
	static void method25624(@OriginalArg(0) int arg0) {
		if (anInt3683 < 0) {
			anInt3686 = 0;
			anInt3685 = 0;
			anInt3681 = 0;
			anInt3684 = 2147483646;
			return;
		}
		method25627(0, anInt3683);
		@Pc(17) int local17 = anIntArray349[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt3683; local26 += 4) {
			@Pc(35) int local35 = anIntArray349[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray349[local26];
			@Pc(49) int local49 = anIntArray349[local26 + 2];
			@Pc(55) int local55 = anIntArray349[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray349[local26] = local71 + (local17 - local35) * local65;
			anIntArray349[local26 + 2] = local65;
		}
		anInt3681 = local24;
		anInt3685 = local26;
		anInt3686 = local26;
		anInt3684 = local17 - 1;
	}

	@OriginalMember(owner = "client!du", name = "t", descriptor = "(I)Z", line = 111)
	static boolean method25625(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt3685;
		@Pc(3) int local3 = anInt3686;
		@Pc(5) int local5 = anInt3684;
		while (local3 >= local1) {
			local5++;
			anInt3684 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(18) int local18 = anInt3681;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt3683) {
				local27 = anIntArray349[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray349[local1];
				@Pc(41) int local41 = anIntArray349[local1 + 2];
				@Pc(47) int local47 = anIntArray349[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray349[local1] = local63;
				anIntArray349[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray349[local27 + 3];
				if (local5 >= local35) {
					anIntArray349[local27] = anIntArray349[local18];
					anIntArray349[local27 + 1] = anIntArray349[local18 + 1];
					anIntArray349[local27 + 2] = anIntArray349[local18 + 2];
					anIntArray349[local27 + 3] = anIntArray349[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt3683) {
				anInt3683 = 0;
				return false;
			}
			method25629(local18, local1);
			anInt3681 = local18;
			anInt3685 = local1;
			local3 = local18;
		}
		anInt3682 = anIntArray349[local3] >> 16;
		anInt3680 = anIntArray349[local3 + 4] >> 16;
		anIntArray349[local3] += anIntArray349[local3 + 2];
		anIntArray349[local3 + 4] += anIntArray349[local3 + 6];
		local3 += 8;
		anInt3686 = local3;
		return true;
	}

	@OriginalMember(owner = "client!du", name = "j", descriptor = "(II)V", line = 159)
	static void method25626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray349[arg0];
		@Pc(17) int local17 = anIntArray349[arg0 + 1];
		@Pc(23) int local23 = anIntArray349[arg0 + 2];
		@Pc(29) int local29 = anIntArray349[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray349[local33 + 1];
			if (local42 < local17) {
				anIntArray349[local7] = anIntArray349[local33];
				anIntArray349[local7 + 1] = local42;
				anIntArray349[local7 + 2] = anIntArray349[local33 + 2];
				anIntArray349[local7 + 3] = anIntArray349[local33 + 3];
				local7 += 4;
				anIntArray349[local33] = anIntArray349[local7];
				anIntArray349[local33 + 1] = anIntArray349[local7 + 1];
				anIntArray349[local33 + 2] = anIntArray349[local7 + 2];
				anIntArray349[local33 + 3] = anIntArray349[local7 + 3];
			}
		}
		anIntArray349[local7] = local11;
		anIntArray349[local7 + 1] = local17;
		anIntArray349[local7 + 2] = local23;
		anIntArray349[local7 + 3] = local29;
		method25627(arg0, local7);
		method25627(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!du", name = "q", descriptor = "(II)V", line = 159)
	static void method25627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray349[arg0];
		@Pc(17) int local17 = anIntArray349[arg0 + 1];
		@Pc(23) int local23 = anIntArray349[arg0 + 2];
		@Pc(29) int local29 = anIntArray349[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray349[local33 + 1];
			if (local42 < local17) {
				anIntArray349[local7] = anIntArray349[local33];
				anIntArray349[local7 + 1] = local42;
				anIntArray349[local7 + 2] = anIntArray349[local33 + 2];
				anIntArray349[local7 + 3] = anIntArray349[local33 + 3];
				local7 += 4;
				anIntArray349[local33] = anIntArray349[local7];
				anIntArray349[local33 + 1] = anIntArray349[local7 + 1];
				anIntArray349[local33 + 2] = anIntArray349[local7 + 2];
				anIntArray349[local33 + 3] = anIntArray349[local7 + 3];
			}
		}
		anIntArray349[local7] = local11;
		anIntArray349[local7 + 1] = local17;
		anIntArray349[local7 + 2] = local23;
		anIntArray349[local7 + 3] = local29;
		method25627(arg0, local7);
		method25627(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!du", name = "i", descriptor = "(II)V", line = 159)
	static void method25628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray349[arg0];
		@Pc(17) int local17 = anIntArray349[arg0 + 1];
		@Pc(23) int local23 = anIntArray349[arg0 + 2];
		@Pc(29) int local29 = anIntArray349[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray349[local33 + 1];
			if (local42 < local17) {
				anIntArray349[local7] = anIntArray349[local33];
				anIntArray349[local7 + 1] = local42;
				anIntArray349[local7 + 2] = anIntArray349[local33 + 2];
				anIntArray349[local7 + 3] = anIntArray349[local33 + 3];
				local7 += 4;
				anIntArray349[local33] = anIntArray349[local7];
				anIntArray349[local33 + 1] = anIntArray349[local7 + 1];
				anIntArray349[local33 + 2] = anIntArray349[local7 + 2];
				anIntArray349[local33 + 3] = anIntArray349[local7 + 3];
			}
		}
		anIntArray349[local7] = local11;
		anIntArray349[local7 + 1] = local17;
		anIntArray349[local7 + 2] = local23;
		anIntArray349[local7 + 3] = local29;
		method25627(arg0, local7);
		method25627(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!du", name = "x", descriptor = "(II)V", line = 188)
	static void method25629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray349[local10 - 4];
					@Pc(23) int local23 = anIntArray349[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray349[local10 - 4] = local23;
						anIntArray349[local10] = local19;
						local19 = anIntArray349[local10 - 2];
						anIntArray349[local10 - 2] = anIntArray349[local10 + 2];
						anIntArray349[local10 + 2] = local19;
						local19 = anIntArray349[local10 - 1];
						anIntArray349[local10 - 1] = anIntArray349[local10 + 3];
						anIntArray349[local10 + 3] = local19;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!du", name = "u", descriptor = "(II)V", line = 188)
	static void method25630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray349[local10 - 4];
					@Pc(23) int local23 = anIntArray349[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray349[local10 - 4] = local23;
						anIntArray349[local10] = local19;
						local19 = anIntArray349[local10 - 2];
						anIntArray349[local10 - 2] = anIntArray349[local10 + 2];
						anIntArray349[local10 + 2] = local19;
						local19 = anIntArray349[local10 - 1];
						anIntArray349[local10 - 1] = anIntArray349[local10 + 3];
						anIntArray349[local10 + 3] = local19;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!du", name = "f", descriptor = "(II)V", line = 188)
	static void method25631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray349[local10 - 4];
					@Pc(23) int local23 = anIntArray349[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray349[local10 - 4] = local23;
						anIntArray349[local10] = local19;
						local19 = anIntArray349[local10 - 2];
						anIntArray349[local10 - 2] = anIntArray349[local10 + 2];
						anIntArray349[local10 + 2] = local19;
						local19 = anIntArray349[local10 - 1];
						anIntArray349[local10 - 1] = anIntArray349[local10 + 3];
						anIntArray349[local10 + 3] = local19;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!du", name = "k", descriptor = "(II)V", line = 188)
	static void method25632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray349[local10 - 4];
					@Pc(23) int local23 = anIntArray349[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray349[local10 - 4] = local23;
						anIntArray349[local10] = local19;
						local19 = anIntArray349[local10 - 2];
						anIntArray349[local10 - 2] = anIntArray349[local10 + 2];
						anIntArray349[local10 + 2] = local19;
						local19 = anIntArray349[local10 - 1];
						anIntArray349[local10 - 1] = anIntArray349[local10 + 3];
						anIntArray349[local10 + 3] = local19;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!du", name = "e", descriptor = "(II)V", line = 188)
	static void method25633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray349[local10 - 4];
					@Pc(23) int local23 = anIntArray349[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray349[local10 - 4] = local23;
						anIntArray349[local10] = local19;
						local19 = anIntArray349[local10 - 2];
						anIntArray349[local10 - 2] = anIntArray349[local10 + 2];
						anIntArray349[local10 + 2] = local19;
						local19 = anIntArray349[local10 - 1];
						anIntArray349[local10 - 1] = anIntArray349[local10 + 3];
						anIntArray349[local10 + 3] = local19;
					}
				}
				if (!local6) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}
}
