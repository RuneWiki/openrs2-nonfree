import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
	public static int anInt1964;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
	public static int anInt1965;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
	public static int anInt1966;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
	public static int anInt1972;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "[I")
	public static int[] anIntArray173 = new int[14];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB[Lclient!g;)V")
	public static void method1510(@OriginalArg(0) int arg0, @OriginalArg(2) Class56[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(15) Class56 local15 = arg1[local7];
			if (local15 != null && arg0 == local15.anInt2030 && (!local15.aBoolean132 || !Static42.method801(local15))) {
				if (local15.anInt2092 == 0) {
					if (!local15.aBoolean132 && Static42.method801(local15) && Static141.aClass56_14 != local15) {
						continue;
					}
					method1510(local15.anInt2096, arg1);
					if (local15.aClass56Array1 != null) {
						method1510(local15.anInt2096, local15.aClass56Array1);
					}
					@Pc(75) Class2_Sub4 local75 = (Class2_Sub4) Static132.aClass101_8.method2867((long) local15.anInt2096);
					if (local75 != null) {
						Static25.method487(local75.anInt274);
					}
				}
				if (local15.anInt2092 == 6) {
					@Pc(107) int local107;
					if (local15.anInt2089 != -1 || local15.anInt2069 != -1) {
						@Pc(102) boolean local102 = Static312.method4083(local15);
						if (local102) {
							local107 = local15.anInt2069;
						} else {
							local107 = local15.anInt2089;
						}
						if (local107 != -1) {
							@Pc(120) Class112 local120 = Static208.method3496(local107);
							if (local120 != null) {
								local15.anInt2095 += Static247.anInt1733;
								while (local15.anInt2095 > local120.anIntArray377[local15.anInt2093]) {
									local15.anInt2095 -= local120.anIntArray377[local15.anInt2093];
									local15.anInt2093++;
									if (local15.anInt2093 >= local120.anIntArray378.length) {
										local15.anInt2093 -= local120.anInt3856;
										if (local15.anInt2093 < 0 || local120.anIntArray378.length <= local15.anInt2093) {
											local15.anInt2093 = 0;
										}
									}
									local15.anInt2047 = local15.anInt2093 + 1;
									if (local120.anIntArray378.length <= local15.anInt2047) {
										local15.anInt2047 -= local120.anInt3856;
										if (local15.anInt2047 < 0 || local120.anIntArray378.length <= local15.anInt2047) {
											local15.anInt2047 = -1;
										}
									}
									Static287.method4466(local15);
								}
							}
						}
					}
					if (local15.anInt2060 != 0 && !local15.aBoolean132) {
						@Pc(241) int local241 = local15.anInt2060 >> 16;
						local107 = local15.anInt2060 << 16 >> 16;
						@Pc(252) int local252 = local241 * Static247.anInt1733;
						local15.anInt2042 = local15.anInt2042 + local252 & 0x7FF;
						local107 *= Static247.anInt1733;
						local15.anInt2109 = local107 + local15.anInt2109 & 0x7FF;
						Static287.method4466(local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BB)C")
	public static char method1511(@OriginalArg(1) byte arg0) {
		@Pc(8) int local8 = arg0 & 0xFF;
		if (local8 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local8, 16) + " provided");
		}
		if (local8 >= 128 && local8 < 160) {
			@Pc(45) char local45 = Static169.aCharArray5[local8 - 128];
			if (local45 == '\u0000') {
				local45 = '?';
			}
			local8 = local45;
		}
		return (char) local8;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIIILclient!ml;IZJ)Z")
	public static boolean method1512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class15 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static9.anIntArrayArrayArray7 == Static85.anIntArrayArrayArray4;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static38.anInt954 || local17 >= Static232.anInt4680) {
					return false;
				}
				@Pc(42) Class2_Sub13 local42 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][local10][local17];
				if (local42 != null && local42.anInt1544 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class170 local58 = new Class170();
		local58.aLong195 = arg11;
		local58.anInt5439 = arg0;
		local58.anInt5443 = arg5;
		local58.anInt5432 = arg6;
		local58.anInt5431 = arg7;
		local58.aClass15_9 = arg8;
		local58.anInt5438 = arg9;
		local58.anInt5433 = arg1;
		local58.anInt5437 = arg2;
		local58.anInt5435 = arg1 + arg3 - 1;
		local58.anInt5448 = arg2 + arg4 - 1;
		@Pc(108) int local108;
		for (local17 = arg1; local17 < arg1 + arg3; local17++) {
			for (local108 = arg2; local108 < arg2 + arg4; local108++) {
				@Pc(115) int local115 = 0;
				if (local17 > arg1) {
					local115++;
				}
				if (local17 < arg1 + arg3 - 1) {
					local115 += 4;
				}
				if (local108 > arg2) {
					local115 += 8;
				}
				if (local108 < arg2 + arg4 - 1) {
					local115 += 2;
				}
				for (@Pc(141) int local141 = arg0; local141 >= 0; local141--) {
					if (Static52.aClass2_Sub13ArrayArrayArray1[local141][local17][local108] == null) {
						Static52.aClass2_Sub13ArrayArrayArray1[local141][local17][local108] = new Class2_Sub13(local141, local17, local108);
					}
				}
				@Pc(174) Class2_Sub13 local174 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][local17][local108];
				local174.aClass170Array1[local174.anInt1544] = local58;
				local174.anIntArray131[local174.anInt1544] = local115;
				local174.anInt1550 |= local115;
				local174.anInt1544++;
				if (local6 && Static170.anIntArrayArray23[local17][local108] != 0) {
					local8 = Static170.anIntArrayArray23[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (Static170.anIntArrayArray23[local17][local108] == 0) {
						Static170.anIntArrayArray23[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static315.aClass170Array3[Static273.anInt5430++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Lclient!pg;")
	public static Class2_Sub8_Sub16 method1513() {
		return Static250.aClass2_Sub8_Sub16_3;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
	public static String method1515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(19) String local19 = arg2[arg1];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg1 + arg0;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg1; local34 < local30; local34++) {
				@Pc(41) String local41 = arg2[local34];
				if (local41 == null) {
					local32 += 4;
				} else {
					local32 += local41.length();
				}
			}
			@Pc(70) StringBuffer local70 = new StringBuffer(local32);
			for (@Pc(72) int local72 = arg1; local72 < local30; local72++) {
				@Pc(79) String local79 = arg2[local72];
				if (local79 == null) {
					local70.append("null");
				} else {
					local70.append(local79);
				}
			}
			return local70.toString();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static268.method4233(arg0)) {
			Static208.method3498(arg2, arg7, arg4, arg5, Static262.aClass56ArrayArray1[arg0], -1, arg1, arg3, arg6);
		} else if (arg3 == -1) {
			for (@Pc(27) int local27 = 0; local27 < 100; local27++) {
				Static293.aBooleanArray23[local27] = true;
			}
		} else {
			Static293.aBooleanArray23[arg3] = true;
		}
	}
}
