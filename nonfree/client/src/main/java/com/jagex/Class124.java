package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public class Class124 {

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
	static int anInt3214;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
	static int anInt3215;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
	static int anInt3216;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "[I")
	static int[] anIntArray323;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	static int anInt3217;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
	static int anInt3218;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
	static int anInt3219;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
	static int anInt3220;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 15)
	Class124() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "(Lclient!de;[II)V", line = 20)
	public static void method22848(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method22856(arg0, arg1, 0, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Lclient!de;[II)V", line = 20)
	public static void method22857(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		method22856(arg0, arg1, 0, arg1.length, arg2, null, null);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!de;[II[I[I)V", line = 24)
	public static void method22849(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method22856(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(Lclient!de;[II[I[I)V", line = 24)
	public static void method22858(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method22856(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "(Lclient!de;[II[I[I)V", line = 24)
	public static void method22867(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method22856(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(Lclient!de;[IIII[I[I)V", line = 28)
	static void method22856(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(2) int[] local2 = new int[4];
		arg0.method17060(local2);
		if (arg5 != null && local2[3] - local2[1] != arg5.length) {
			throw new IllegalStateException();
		}
		method22850();
		method22847(arg1, arg2, arg3);
		method22853(local2[1]);
		while (true) {
			@Pc(37) int local37;
			@Pc(39) int local39;
			@Pc(41) int local41;
			do {
				if (!method22854(local2[3])) {
					return;
				}
				local37 = anInt3217;
				local39 = anInt3218;
				local41 = anInt3216;
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
			arg0.method17072(local37, local41, local39 - local37, arg4, 1);
		}
	}

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "(Lclient!de;[IIII[I[I)V", line = 28)
	static void method22859(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(2) int[] local2 = new int[4];
		arg0.method17060(local2);
		if (arg5 != null && local2[3] - local2[1] != arg5.length) {
			throw new IllegalStateException();
		}
		method22850();
		method22847(arg1, arg2, arg3);
		method22853(local2[1]);
		while (true) {
			@Pc(37) int local37;
			@Pc(39) int local39;
			@Pc(41) int local41;
			do {
				if (!method22854(local2[3])) {
					return;
				}
				local37 = anInt3217;
				local39 = anInt3218;
				local41 = anInt3216;
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
			arg0.method17072(local37, local41, local39 - local37, arg4, 1);
		}
	}

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "(Lclient!de;[IIII[I[I)V", line = 28)
	static void method22865(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(2) int[] local2 = new int[4];
		arg0.method17060(local2);
		if (arg5 != null && local2[3] - local2[1] != arg5.length) {
			throw new IllegalStateException();
		}
		method22850();
		method22847(arg1, arg2, arg3);
		method22853(local2[1]);
		while (true) {
			@Pc(37) int local37;
			@Pc(39) int local39;
			@Pc(41) int local41;
			do {
				if (!method22854(local2[3])) {
					return;
				}
				local37 = anInt3217;
				local39 = anInt3218;
				local41 = anInt3216;
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
			arg0.method17072(local37, local41, local39 - local37, arg4, 1);
		}
	}

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "()V", line = 49)
	static void method22850() {
		anInt3220 = 0;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "()V", line = 49)
	static void method22861() {
		anInt3220 = 0;
	}

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "()V", line = 49)
	static void method22862() {
		anInt3220 = 0;
	}

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "([III)V", line = 53)
	static void method22847(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = anInt3220 + (arg2 << 1);
		@Pc(16) int local16;
		if (anIntArray323 == null || anIntArray323.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3220; local16++) {
				local14[local16] = anIntArray323[local16];
			}
			anIntArray323 = local14;
		}
		@Pc(33) int local33 = arg2 + arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = arg1; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray323[anInt3220++] = arg0[local37];
				anIntArray323[anInt3220++] = local48;
				anIntArray323[anInt3220++] = arg0[local16];
				anIntArray323[anInt3220++] = local54;
			} else if (local54 < local48) {
				anIntArray323[anInt3220++] = arg0[local16];
				anIntArray323[anInt3220++] = local54;
				anIntArray323[anInt3220++] = arg0[local37];
				anIntArray323[anInt3220++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "([III)V", line = 53)
	static void method22852(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = anInt3220 + (arg2 << 1);
		@Pc(16) int local16;
		if (anIntArray323 == null || anIntArray323.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3220; local16++) {
				local14[local16] = anIntArray323[local16];
			}
			anIntArray323 = local14;
		}
		@Pc(33) int local33 = arg2 + arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = arg1; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray323[anInt3220++] = arg0[local37];
				anIntArray323[anInt3220++] = local48;
				anIntArray323[anInt3220++] = arg0[local16];
				anIntArray323[anInt3220++] = local54;
			} else if (local54 < local48) {
				anIntArray323[anInt3220++] = arg0[local16];
				anIntArray323[anInt3220++] = local54;
				anIntArray323[anInt3220++] = arg0[local37];
				anIntArray323[anInt3220++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "([III)V", line = 53)
	static void method22863(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = anInt3220 + (arg2 << 1);
		@Pc(16) int local16;
		if (anIntArray323 == null || anIntArray323.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3220; local16++) {
				local14[local16] = anIntArray323[local16];
			}
			anIntArray323 = local14;
		}
		@Pc(33) int local33 = arg2 + arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = arg1; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray323[anInt3220++] = arg0[local37];
				anIntArray323[anInt3220++] = local48;
				anIntArray323[anInt3220++] = arg0[local16];
				anIntArray323[anInt3220++] = local54;
			} else if (local54 < local48) {
				anIntArray323[anInt3220++] = arg0[local16];
				anIntArray323[anInt3220++] = local54;
				anIntArray323[anInt3220++] = arg0[local37];
				anIntArray323[anInt3220++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "([III)V", line = 53)
	static void method22864(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = anInt3220 + (arg2 << 1);
		@Pc(16) int local16;
		if (anIntArray323 == null || anIntArray323.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt3220; local16++) {
				local14[local16] = anIntArray323[local16];
			}
			anIntArray323 = local14;
		}
		@Pc(33) int local33 = arg2 + arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = arg1; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray323[anInt3220++] = arg0[local37];
				anIntArray323[anInt3220++] = local48;
				anIntArray323[anInt3220++] = arg0[local16];
				anIntArray323[anInt3220++] = local54;
			} else if (local54 < local48) {
				anIntArray323[anInt3220++] = arg0[local16];
				anIntArray323[anInt3220++] = local54;
				anIntArray323[anInt3220++] = arg0[local37];
				anIntArray323[anInt3220++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "(I)V", line = 80)
	static void method22853(@OriginalArg(0) int arg0) {
		if (anInt3220 < 0) {
			anInt3214 = 0;
			anInt3219 = 0;
			anInt3215 = 0;
			anInt3216 = 2147483646;
			return;
		}
		method22855(0, anInt3220);
		@Pc(17) int local17 = anIntArray323[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt3220; local26 += 4) {
			@Pc(35) int local35 = anIntArray323[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray323[local26];
			@Pc(49) int local49 = anIntArray323[local26 + 2];
			@Pc(55) int local55 = anIntArray323[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray323[local26] = local71 + (local17 - local35) * local65;
			anIntArray323[local26 + 2] = local65;
		}
		anInt3215 = local24;
		anInt3219 = local26;
		anInt3214 = local26;
		anInt3216 = local17 - 1;
	}

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "(I)V", line = 80)
	static void method22866(@OriginalArg(0) int arg0) {
		if (anInt3220 < 0) {
			anInt3214 = 0;
			anInt3219 = 0;
			anInt3215 = 0;
			anInt3216 = 2147483646;
			return;
		}
		method22855(0, anInt3220);
		@Pc(17) int local17 = anIntArray323[1];
		if (local17 < arg0) {
			local17 = arg0;
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt3220; local26 += 4) {
			@Pc(35) int local35 = anIntArray323[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray323[local26];
			@Pc(49) int local49 = anIntArray323[local26 + 2];
			@Pc(55) int local55 = anIntArray323[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray323[local26] = local71 + (local17 - local35) * local65;
			anIntArray323[local26 + 2] = local65;
		}
		anInt3215 = local24;
		anInt3219 = local26;
		anInt3214 = local26;
		anInt3216 = local17 - 1;
	}

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "(I)Z", line = 111)
	static boolean method22854(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt3219;
		@Pc(3) int local3 = anInt3214;
		@Pc(5) int local5 = anInt3216;
		while (local3 >= local1) {
			local5++;
			anInt3216 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(18) int local18 = anInt3215;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt3220) {
				local27 = anIntArray323[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray323[local1];
				@Pc(41) int local41 = anIntArray323[local1 + 2];
				@Pc(47) int local47 = anIntArray323[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray323[local1] = local63;
				anIntArray323[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray323[local27 + 3];
				if (local5 >= local35) {
					anIntArray323[local27] = anIntArray323[local18];
					anIntArray323[local27 + 1] = anIntArray323[local18 + 1];
					anIntArray323[local27 + 2] = anIntArray323[local18 + 2];
					anIntArray323[local27 + 3] = anIntArray323[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt3220) {
				anInt3220 = 0;
				return false;
			}
			method22851(local18, local1);
			anInt3215 = local18;
			anInt3219 = local1;
			local3 = local18;
		}
		anInt3217 = anIntArray323[local3] >> 16;
		anInt3218 = anIntArray323[local3 + 4] >> 16;
		anIntArray323[local3] += anIntArray323[local3 + 2];
		anIntArray323[local3 + 4] += anIntArray323[local3 + 6];
		local3 += 8;
		anInt3214 = local3;
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "(I)Z", line = 111)
	static boolean method22860(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt3219;
		@Pc(3) int local3 = anInt3214;
		@Pc(5) int local5 = anInt3216;
		while (local3 >= local1) {
			local5++;
			anInt3216 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(18) int local18 = anInt3215;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt3220) {
				local27 = anIntArray323[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray323[local1];
				@Pc(41) int local41 = anIntArray323[local1 + 2];
				@Pc(47) int local47 = anIntArray323[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray323[local1] = local63;
				anIntArray323[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray323[local27 + 3];
				if (local5 >= local35) {
					anIntArray323[local27] = anIntArray323[local18];
					anIntArray323[local27 + 1] = anIntArray323[local18 + 1];
					anIntArray323[local27 + 2] = anIntArray323[local18 + 2];
					anIntArray323[local27 + 3] = anIntArray323[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt3220) {
				anInt3220 = 0;
				return false;
			}
			method22851(local18, local1);
			anInt3215 = local18;
			anInt3219 = local1;
			local3 = local18;
		}
		anInt3217 = anIntArray323[local3] >> 16;
		anInt3218 = anIntArray323[local3 + 4] >> 16;
		anIntArray323[local3] += anIntArray323[local3 + 2];
		anIntArray323[local3 + 4] += anIntArray323[local3 + 6];
		local3 += 8;
		anInt3214 = local3;
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "(I)Z", line = 111)
	static boolean method22868(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = anInt3219;
		@Pc(3) int local3 = anInt3214;
		@Pc(5) int local5 = anInt3216;
		while (local3 >= local1) {
			local5++;
			anInt3216 = local5;
			if (local5 >= arg0) {
				return false;
			}
			@Pc(18) int local18 = anInt3215;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt3220) {
				local27 = anIntArray323[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray323[local1];
				@Pc(41) int local41 = anIntArray323[local1 + 2];
				@Pc(47) int local47 = anIntArray323[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray323[local1] = local63;
				anIntArray323[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray323[local27 + 3];
				if (local5 >= local35) {
					anIntArray323[local27] = anIntArray323[local18];
					anIntArray323[local27 + 1] = anIntArray323[local18 + 1];
					anIntArray323[local27 + 2] = anIntArray323[local18 + 2];
					anIntArray323[local27 + 3] = anIntArray323[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt3220) {
				anInt3220 = 0;
				return false;
			}
			method22851(local18, local1);
			anInt3215 = local18;
			anInt3219 = local1;
			local3 = local18;
		}
		anInt3217 = anIntArray323[local3] >> 16;
		anInt3218 = anIntArray323[local3 + 4] >> 16;
		anIntArray323[local3] += anIntArray323[local3 + 2];
		anIntArray323[local3 + 4] += anIntArray323[local3 + 6];
		local3 += 8;
		anInt3214 = local3;
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "(II)V", line = 159)
	static void method22855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray323[arg0];
		@Pc(17) int local17 = anIntArray323[arg0 + 1];
		@Pc(23) int local23 = anIntArray323[arg0 + 2];
		@Pc(29) int local29 = anIntArray323[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray323[local33 + 1];
			if (local42 < local17) {
				anIntArray323[local7] = anIntArray323[local33];
				anIntArray323[local7 + 1] = local42;
				anIntArray323[local7 + 2] = anIntArray323[local33 + 2];
				anIntArray323[local7 + 3] = anIntArray323[local33 + 3];
				local7 += 4;
				anIntArray323[local33] = anIntArray323[local7];
				anIntArray323[local33 + 1] = anIntArray323[local7 + 1];
				anIntArray323[local33 + 2] = anIntArray323[local7 + 2];
				anIntArray323[local33 + 3] = anIntArray323[local7 + 3];
			}
		}
		anIntArray323[local7] = local11;
		anIntArray323[local7 + 1] = local17;
		anIntArray323[local7 + 2] = local23;
		anIntArray323[local7 + 3] = local29;
		method22855(arg0, local7);
		method22855(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "(II)V", line = 159)
	static void method22869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray323[arg0];
		@Pc(17) int local17 = anIntArray323[arg0 + 1];
		@Pc(23) int local23 = anIntArray323[arg0 + 2];
		@Pc(29) int local29 = anIntArray323[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray323[local33 + 1];
			if (local42 < local17) {
				anIntArray323[local7] = anIntArray323[local33];
				anIntArray323[local7 + 1] = local42;
				anIntArray323[local7 + 2] = anIntArray323[local33 + 2];
				anIntArray323[local7 + 3] = anIntArray323[local33 + 3];
				local7 += 4;
				anIntArray323[local33] = anIntArray323[local7];
				anIntArray323[local33 + 1] = anIntArray323[local7 + 1];
				anIntArray323[local33 + 2] = anIntArray323[local7 + 2];
				anIntArray323[local33 + 3] = anIntArray323[local7 + 3];
			}
		}
		anIntArray323[local7] = local11;
		anIntArray323[local7 + 1] = local17;
		anIntArray323[local7 + 2] = local23;
		anIntArray323[local7 + 3] = local29;
		method22855(arg0, local7);
		method22855(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "(II)V", line = 188)
	static void method22851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray323[local10 - 4];
					@Pc(23) int local23 = anIntArray323[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray323[local10 - 4] = local23;
						anIntArray323[local10] = local19;
						local19 = anIntArray323[local10 - 2];
						anIntArray323[local10 - 2] = anIntArray323[local10 + 2];
						anIntArray323[local10 + 2] = local19;
						local19 = anIntArray323[local10 - 1];
						anIntArray323[local10 - 1] = anIntArray323[local10 + 3];
						anIntArray323[local10 + 3] = local19;
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

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "(II)V", line = 188)
	static void method22870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray323[local10 - 4];
					@Pc(23) int local23 = anIntArray323[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray323[local10 - 4] = local23;
						anIntArray323[local10] = local19;
						local19 = anIntArray323[local10 - 2];
						anIntArray323[local10 - 2] = anIntArray323[local10 + 2];
						anIntArray323[local10 + 2] = local19;
						local19 = anIntArray323[local10 - 1];
						anIntArray323[local10 - 1] = anIntArray323[local10 + 3];
						anIntArray323[local10 + 3] = local19;
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
