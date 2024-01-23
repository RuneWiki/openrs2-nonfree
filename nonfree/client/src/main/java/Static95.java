import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
	private static int anInt2092;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
	private static int anInt2093;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
	private static int anInt2094;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
	private static int anInt2095;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
	private static int anInt2096;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
	private static int anInt2097;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "[I")
	private static int[] anIntArray169;

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
	private static int anInt2098;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
	private static void method1626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = anIntArray169[arg0];
		@Pc(17) int local17 = anIntArray169[arg0 + 1];
		@Pc(23) int local23 = anIntArray169[arg0 + 2];
		@Pc(29) int local29 = anIntArray169[arg0 + 3];
		for (@Pc(33) int local33 = arg0 + 4; local33 < arg1; local33 += 4) {
			@Pc(42) int local42 = anIntArray169[local33 + 1];
			if (local42 < local17) {
				anIntArray169[local7] = anIntArray169[local33];
				anIntArray169[local7 + 1] = local42;
				anIntArray169[local7 + 2] = anIntArray169[local33 + 2];
				anIntArray169[local7 + 3] = anIntArray169[local33 + 3];
				local7 += 4;
				anIntArray169[local33] = anIntArray169[local7];
				anIntArray169[local33 + 1] = anIntArray169[local7 + 1];
				anIntArray169[local33 + 2] = anIntArray169[local7 + 2];
				anIntArray169[local33 + 3] = anIntArray169[local7 + 3];
			}
		}
		anIntArray169[local7] = local11;
		anIntArray169[local7 + 1] = local17;
		anIntArray169[local7 + 2] = local23;
		anIntArray169[local7 + 3] = local29;
		method1626(arg0, local7);
		method1626(local7 + 4, arg1);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[I[I)V")
	private static void method1627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		method1634();
		while (method1631()) {
			@Pc(4) int local4 = anInt2093;
			@Pc(6) int local6 = anInt2092;
			@Pc(8) int local8 = anInt2098;
			if (arg2 != null) {
				@Pc(14) int local14 = local8 - Static270.anInt5184;
				if (local4 < arg2[local14] + Static270.anInt5186) {
					local4 = arg2[local14] + Static270.anInt5186;
				}
				if (local6 > arg2[local14] + arg3[local14] + Static270.anInt5186) {
					local6 = arg2[local14] + arg3[local14] + Static270.anInt5186;
				}
			}
			Static270.method4262(local4, local8, local6 - local4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([III)V")
	public static void method1628(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method1633(arg0, arg0.length, arg1, arg2, null, null);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([III[I[I)V")
	public static void method1630(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		method1633(arg0, arg0.length, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "()Z")
	private static boolean method1631() {
		@Pc(1) int local1 = anInt2095;
		@Pc(3) int local3 = anInt2097;
		@Pc(5) int local5 = anInt2098;
		while (local3 >= local1) {
			local5++;
			anInt2098 = local5;
			if (local5 >= Static270.anInt5188) {
				return false;
			}
			@Pc(18) int local18 = anInt2096;
			@Pc(27) int local27;
			@Pc(35) int local35;
			while (local1 < anInt2094) {
				local27 = anIntArray169[local1 + 1];
				if (local5 < local27) {
					break;
				}
				local35 = anIntArray169[local1];
				@Pc(41) int local41 = anIntArray169[local1 + 2];
				@Pc(47) int local47 = anIntArray169[local1 + 3];
				@Pc(57) int local57 = (local41 - local35 << 16) / (local47 - local27);
				@Pc(63) int local63 = (local35 << 16) + 32768;
				anIntArray169[local1] = local63;
				anIntArray169[local1 + 2] = local57;
				local1 += 4;
			}
			for (local27 = local18; local27 < local1; local27 += 4) {
				local35 = anIntArray169[local27 + 3];
				if (local5 >= local35) {
					anIntArray169[local27] = anIntArray169[local18];
					anIntArray169[local27 + 1] = anIntArray169[local18 + 1];
					anIntArray169[local27 + 2] = anIntArray169[local18 + 2];
					anIntArray169[local27 + 3] = anIntArray169[local18 + 3];
					local18 += 4;
				}
			}
			if (local18 == anInt2094) {
				anInt2094 = 0;
				return false;
			}
			method1635(local18, local1);
			anInt2096 = local18;
			anInt2095 = local1;
			local3 = local18;
		}
		anInt2093 = anIntArray169[local3] >> 16;
		anInt2092 = anIntArray169[local3 + 4] >> 16;
		anIntArray169[local3] += anIntArray169[local3 + 2];
		anIntArray169[local3 + 4] += anIntArray169[local3 + 6];
		local3 += 8;
		anInt2097 = local3;
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "([III)V")
	private static void method1632(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = anInt2094 + (arg1 << 1);
		@Pc(16) int local16;
		if (anIntArray169 == null || anIntArray169.length < local5) {
			@Pc(14) int[] local14 = new int[local5];
			for (local16 = 0; local16 < anInt2094; local16++) {
				local14[local16] = anIntArray169[local16];
			}
			anIntArray169 = local14;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = local33 - 2;
		for (local16 = 0; local16 < local33; local16 += 2) {
			@Pc(48) int local48 = arg0[local37 + 1];
			@Pc(54) int local54 = arg0[local16 + 1];
			if (local48 < local54) {
				anIntArray169[anInt2094++] = arg0[local37];
				anIntArray169[anInt2094++] = local48;
				anIntArray169[anInt2094++] = arg0[local16];
				anIntArray169[anInt2094++] = local54;
			} else if (local54 < local48) {
				anIntArray169[anInt2094++] = arg0[local16];
				anIntArray169[anInt2094++] = local54;
				anIntArray169[anInt2094++] = arg0[local37];
				anIntArray169[anInt2094++] = local48;
			}
			local37 = local16;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([IIIII[I[I)V")
	private static void method1633(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		if (arg4 != null && Static270.anInt5188 - Static270.anInt5184 != arg4.length) {
			throw new IllegalStateException();
		}
		method1636();
		method1632(arg0, arg1);
		method1627(arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "()V")
	private static void method1634() {
		if (anInt2094 < 0) {
			anInt2097 = 0;
			anInt2095 = 0;
			anInt2096 = 0;
			anInt2098 = 2147483646;
			return;
		}
		method1626(0, anInt2094);
		@Pc(17) int local17 = anIntArray169[1];
		if (local17 < Static270.anInt5184) {
			local17 = Static270.anInt5184;
		}
		@Pc(26) int local26;
		for (local26 = 0; local26 < anInt2094; local26 += 4) {
			@Pc(35) int local35 = anIntArray169[local26 + 1];
			if (local17 < local35) {
				break;
			}
			@Pc(43) int local43 = anIntArray169[local26];
			@Pc(49) int local49 = anIntArray169[local26 + 2];
			@Pc(55) int local55 = anIntArray169[local26 + 3];
			@Pc(65) int local65 = (local49 - local43 << 16) / (local55 - local35);
			@Pc(71) int local71 = (local43 << 16) + 32768;
			anIntArray169[local26] = local71 + (local17 - local35) * local65;
			anIntArray169[local26 + 2] = local65;
		}
		anInt2096 = 0;
		anInt2095 = local26;
		anInt2097 = local26;
		anInt2098 = local17 - 1;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V")
	private static void method1635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				@Pc(6) boolean local6 = true;
				for (@Pc(10) int local10 = arg0 + 4; local10 < arg1; local10 += 4) {
					@Pc(19) int local19 = anIntArray169[local10 - 4];
					@Pc(23) int local23 = anIntArray169[local10];
					if (local19 > local23) {
						local6 = false;
						anIntArray169[local10 - 4] = local23;
						anIntArray169[local10] = local19;
						local19 = anIntArray169[local10 - 2];
						anIntArray169[local10 - 2] = anIntArray169[local10 + 2];
						anIntArray169[local10 + 2] = local19;
						local19 = anIntArray169[local10 - 1];
						anIntArray169[local10 - 1] = anIntArray169[local10 + 3];
						anIntArray169[local10 + 3] = local19;
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

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "()V")
	private static void method1636() {
		anInt2094 = 0;
	}
}
