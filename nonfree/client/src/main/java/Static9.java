import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!pa;")
	public static Class35_Sub1 aClass35_Sub1_7;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Lclient!id;")
	public static Class34 aClass34_228 = method266("(U2");

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[Lclient!nf;")
	public static Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array1 = new Class1_Sub1_Sub1_Sub4[4];

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public static int anInt451 = -1;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!id;")
	public static Class34 aClass34_229 = method266("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	public static int anInt457 = 0;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
	public static int anInt458 = 0;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
	public static int anInt459 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method264() {
		@Pc(10) int local10;
		for (@Pc(3) int local3 = -1; local3 < Static40.anInt1154; local3++) {
			if (local3 == -1) {
				local10 = 2047;
			} else {
				local10 = Static102.anIntArray321[local3];
			}
			@Pc(20) Class1_Sub1_Sub1_Sub1_Sub1 local20 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local10];
			if (local20 != null && local20.anInt1408 > 0) {
				local20.anInt1408--;
				if (local20.anInt1408 == 0) {
					local20.aClass34_701 = null;
				}
			}
		}
		for (local10 = 0; local10 < Static64.anInt1731; local10++) {
			@Pc(55) int local55 = Static1.anIntArray19[local10];
			@Pc(59) Class1_Sub1_Sub1_Sub1_Sub2 local59 = Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local55];
			if (local59 != null && local59.anInt1408 > 0) {
				local59.anInt1408--;
				if (local59.anInt1408 == 0) {
					local59.aClass34_701 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method265() {
		aClass34_228 = null;
		aClass34_229 = null;
		aClass35_Sub1_7 = null;
		aClass1_Sub1_Sub1_Sub4Array1 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!id;")
	public static Class34 method266(@OriginalArg(0) String arg0) {
		@Pc(14) byte[] local14 = arg0.getBytes();
		@Pc(17) int local17 = local14.length;
		@Pc(19) int local19 = 0;
		@Pc(23) Class34 local23 = new Class34();
		local23.aByteArray20 = new byte[local17];
		while (local19 < local17) {
			@Pc(35) int local35 = local14[local19++] & 0xFF;
			if (local35 <= 45 && local35 >= 40) {
				if (local19 >= local17) {
					break;
				}
				@Pc(57) int local57 = local14[local19++] & 0xFF;
				local23.aByteArray20[local23.anInt1553++] = (byte) (local57 + (local35 + -40) * 43 - 48);
			} else if (local35 != 0) {
				local23.aByteArray20[local23.anInt1553++] = (byte) local35;
			}
		}
		local23.method974();
		return local23.method984();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIILclient!l;Lclient!pb;I)V")
	public static void method267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class44 arg6, @OriginalArg(8) Class58 arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = Static98.anIntArrayArrayArray4[arg1][arg8][arg3];
		@Pc(23) int local23 = Static98.anIntArrayArrayArray4[arg1][arg8 + 1][arg3];
		@Pc(33) int local33 = Static98.anIntArrayArrayArray4[arg1][arg8][arg3 + 1];
		@Pc(45) int local45 = Static98.anIntArrayArrayArray4[arg1][arg8 + 1][arg3 + 1];
		@Pc(55) int local55 = local33 + local45 + local13 + local23 >> 2;
		@Pc(59) Class1_Sub1_Sub16 local59 = Static28.method2008(arg4);
		@Pc(72) int local72 = (arg4 << 14) + (arg8 - (-(arg3 << 7) - 1073741824));
		if (local59.anInt2980 == 0) {
			local72 += Integer.MIN_VALUE;
		}
		@Pc(88) int local88 = arg0 + (arg5 << 6);
		if (local59.anInt2958 == 1) {
			local88 += 256;
		}
		@Pc(115) Class1_Sub1_Sub1 local115;
		if (arg0 == 22) {
			if (local59.anInt2947 == -1 && local59.anIntArray366 == null) {
				local115 = local59.method1957(local45, 22, local33, local13, local23, arg5);
			} else {
				local115 = new Class1_Sub1_Sub1_Sub7(arg4, 22, arg5, local13, local23, local45, local33, local59.anInt2947, true, null);
			}
			arg6.method1165(arg2, arg8, arg3, local55, local115, local72, local88);
			if (local59.anInt2971 == 1) {
				arg7.method1601(arg3, arg8);
			}
			return;
		}
		@Pc(206) int local206;
		if (arg0 == 10 || arg0 == 11) {
			if (local59.anInt2947 == -1 && local59.anIntArray366 == null) {
				local115 = local59.method1957(local45, 10, local33, local13, local23, arg5);
			} else {
				local115 = new Class1_Sub1_Sub1_Sub7(arg4, 10, arg5, local13, local23, local45, local33, local59.anInt2947, true, null);
			}
			if (local115 != null) {
				@Pc(209) int local209;
				if (arg5 == 1 || arg5 == 3) {
					local209 = local59.anInt2962;
					local206 = local59.anInt2946;
				} else {
					local206 = local59.anInt2962;
					local209 = local59.anInt2946;
				}
				@Pc(219) int local219 = 0;
				if (arg0 == 11) {
					local219 += 256;
				}
				arg6.method1174(arg2, arg8, arg3, local55, local206, local209, local115, local219, local72, local88);
			}
			if (local59.anInt2971 != 0) {
				arg7.method1598(arg5, arg8, local59.anInt2946, local59.aBoolean173, local59.anInt2962, arg3);
			}
		} else if (arg0 >= 12) {
			if (local59.anInt2947 == -1 && local59.anIntArray366 == null) {
				local115 = local59.method1957(local45, arg0, local33, local13, local23, arg5);
			} else {
				local115 = new Class1_Sub1_Sub1_Sub7(arg4, arg0, arg5, local13, local23, local45, local33, local59.anInt2947, true, null);
			}
			arg6.method1174(arg2, arg8, arg3, local55, 1, 1, local115, 0, local72, local88);
			if (local59.anInt2971 != 0) {
				arg7.method1598(arg5, arg8, local59.anInt2946, local59.aBoolean173, local59.anInt2962, arg3);
			}
		} else if (arg0 == 0) {
			if (local59.anInt2947 == -1 && local59.anIntArray366 == null) {
				local115 = local59.method1957(local45, 0, local33, local13, local23, arg5);
			} else {
				local115 = new Class1_Sub1_Sub1_Sub7(arg4, 0, arg5, local13, local23, local45, local33, local59.anInt2947, true, null);
			}
			arg6.method1149(arg2, arg8, arg3, local55, local115, null, Static62.anIntArray177[arg5], 0, local72, local88);
			if (local59.anInt2971 != 0) {
				arg7.method1600(arg3, arg0, arg8, arg5, local59.aBoolean173);
			}
		} else if (arg0 == 1) {
			if (local59.anInt2947 == -1 && local59.anIntArray366 == null) {
				local115 = local59.method1957(local45, 1, local33, local13, local23, arg5);
			} else {
				local115 = new Class1_Sub1_Sub1_Sub7(arg4, 1, arg5, local13, local23, local45, local33, local59.anInt2947, true, null);
			}
			arg6.method1149(arg2, arg8, arg3, local55, local115, null, Static15.anIntArray58[arg5], 0, local72, local88);
			if (local59.anInt2971 != 0) {
				arg7.method1600(arg3, arg0, arg8, arg5, local59.aBoolean173);
			}
		} else {
			@Pc(466) int local466;
			@Pc(495) Class1_Sub1_Sub1 local495;
			if (arg0 == 2) {
				local466 = arg5 + 1 & 0x3;
				@Pc(485) Class1_Sub1_Sub1 local485;
				if (local59.anInt2947 == -1 && local59.anIntArray366 == null) {
					local485 = local59.method1957(local45, 2, local33, local13, local23, arg5 + 4);
					local495 = local59.method1957(local45, 2, local33, local13, local23, local466);
				} else {
					local485 = new Class1_Sub1_Sub1_Sub7(arg4, 2, arg5 + 4, local13, local23, local45, local33, local59.anInt2947, true, null);
					local495 = new Class1_Sub1_Sub1_Sub7(arg4, 2, local466, local13, local23, local45, local33, local59.anInt2947, true, null);
				}
				arg6.method1149(arg2, arg8, arg3, local55, local485, local495, Static62.anIntArray177[arg5], Static62.anIntArray177[local466], local72, local88);
				if (local59.anInt2971 != 0) {
					arg7.method1600(arg3, arg0, arg8, arg5, local59.aBoolean173);
				}
			} else if (arg0 == 3) {
				if (local59.anInt2947 == -1 && local59.anIntArray366 == null) {
					local115 = local59.method1957(local45, 3, local33, local13, local23, arg5);
				} else {
					local115 = new Class1_Sub1_Sub1_Sub7(arg4, 3, arg5, local13, local23, local45, local33, local59.anInt2947, true, null);
				}
				arg6.method1149(arg2, arg8, arg3, local55, local115, null, Static15.anIntArray58[arg5], 0, local72, local88);
				if (local59.anInt2971 != 0) {
					arg7.method1600(arg3, arg0, arg8, arg5, local59.aBoolean173);
				}
			} else if (arg0 == 9) {
				if (local59.anInt2947 == -1 && local59.anIntArray366 == null) {
					local115 = local59.method1957(local45, arg0, local33, local13, local23, arg5);
				} else {
					local115 = new Class1_Sub1_Sub1_Sub7(arg4, arg0, arg5, local13, local23, local45, local33, local59.anInt2947, true, null);
				}
				arg6.method1174(arg2, arg8, arg3, local55, 1, 1, local115, 0, local72, local88);
				if (local59.anInt2971 != 0) {
					arg7.method1598(arg5, arg8, local59.anInt2946, local59.aBoolean173, local59.anInt2962, arg3);
				}
			} else {
				if (local59.aBoolean170) {
					if (arg5 == 1) {
						local466 = local33;
						local33 = local45;
						local45 = local23;
						local23 = local13;
						local13 = local466;
					} else if (arg5 == 2) {
						local466 = local33;
						local33 = local23;
						local23 = local466;
						local466 = local45;
						local45 = local13;
						local13 = local466;
					} else if (arg5 == 3) {
						local466 = local33;
						local33 = local13;
						local13 = local23;
						local23 = local45;
						local45 = local466;
					}
				}
				if (arg0 == 4) {
					if (local59.anInt2947 == -1 && local59.anIntArray366 == null) {
						local115 = local59.method1957(local45, 4, local33, local13, local23, 0);
					} else {
						local115 = new Class1_Sub1_Sub1_Sub7(arg4, 4, 0, local13, local23, local45, local33, local59.anInt2947, true, null);
					}
					arg6.method1176(arg2, arg8, arg3, local55, local115, Static62.anIntArray177[arg5], arg5 * 512, 0, 0, local72, local88);
				} else if (arg0 == 5) {
					local466 = 16;
					local206 = arg6.method1145(arg2, arg8, arg3);
					if (local206 != 0) {
						local466 = Static28.method2008(local206 >> 14 & 0x7FFF).anInt2960;
					}
					if (local59.anInt2947 == -1 && local59.anIntArray366 == null) {
						local495 = local59.method1957(local45, 4, local33, local13, local23, 0);
					} else {
						local495 = new Class1_Sub1_Sub1_Sub7(arg4, 4, 0, local13, local23, local45, local33, local59.anInt2947, true, null);
					}
					arg6.method1176(arg2, arg8, arg3, local55, local495, Static62.anIntArray177[arg5], arg5 * 512, Static86.anIntArray295[arg5] * local466, Static115.anIntArray348[arg5] * local466, local72, local88);
				} else if (arg0 == 6) {
					if (local59.anInt2947 == -1 && local59.anIntArray366 == null) {
						local115 = local59.method1957(local45, 4, local33, local13, local23, 0);
					} else {
						local115 = new Class1_Sub1_Sub1_Sub7(arg4, 4, 0, local13, local23, local45, local33, local59.anInt2947, true, null);
					}
					arg6.method1176(arg2, arg8, arg3, local55, local115, 256, arg5, 0, 0, local72, local88);
				} else if (arg0 == 7) {
					if (local59.anInt2947 == -1 && local59.anIntArray366 == null) {
						local115 = local59.method1957(local45, 4, local33, local13, local23, 0);
					} else {
						local115 = new Class1_Sub1_Sub1_Sub7(arg4, 4, 0, local13, local23, local45, local33, local59.anInt2947, true, null);
					}
					arg6.method1176(arg2, arg8, arg3, local55, local115, 512, arg5, 0, 0, local72, local88);
				} else if (arg0 == 8) {
					if (local59.anInt2947 == -1 && local59.anIntArray366 == null) {
						local115 = local59.method1957(local45, 4, local33, local13, local23, 0);
					} else {
						local115 = new Class1_Sub1_Sub1_Sub7(arg4, 4, 0, local13, local23, local45, local33, local59.anInt2947, true, null);
					}
					arg6.method1176(arg2, arg8, arg3, local55, local115, 768, arg5, 0, 0, local72, local88);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public static void method268() {
		Static133.aBoolean186 = true;
		Static90.anInt3107 = 0;
		Static48.aClass36_1.anInt1626 = 0;
		Static72.aLong100 = 0L;
		Static31.aBoolean47 = true;
		Static17.method390();
		Static93.anInt2428 = 0;
		Static115.aBoolean158 = false;
		Static87.anInt2260 = -1;
		Static71.anInt1876 = 0;
		Static106.anInt2602 = 0;
		Static32.anInt1445 = -1;
		Static2.anInt273 = -1;
		Static71.anInt1879 = -1;
		Static21.aClass1_Sub19_Sub1_1.anInt3111 = 0;
		Static38.anInt1129 = 0;
		Static40.anInt1147 = 0;
		Static51.aClass1_Sub19_Sub1_4.anInt3111 = 0;
		Static8.method258(0);
		for (@Pc(1935) int local1935 = 0; local1935 < 100; local1935++) {
			Static64.aClass34Array14[local1935] = null;
		}
		Static26.anInt848 = (int) (Math.random() * 80.0D) - 40;
		Static40.anInt1154 = 0;
		Static130.anInt1509 = 0;
		Static26.anInt834 = -1;
		Static31.anInt924 = 0;
		Static132.anInt3154 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static64.anInt1731 = 0;
		Static66.anInt1755 = (int) (Math.random() * 100.0D) - 50;
		Static42.anInt1195 = 0;
		Static120.anInt2857 = (int) (Math.random() * 110.0D) - 55;
		Static54.anInt1521 = 0;
		Static126.anInt2999 = (int) (Math.random() * 120.0D) - 60;
		Static122.anInt2890 = (int) (Math.random() * 30.0D) - 20;
		Static1.aBoolean14 = false;
		Static44.anInt1248 = 0;
		for (@Pc(2017) int local2017 = 0; local2017 < 2048; local2017++) {
			Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local2017] = null;
			Static93.aClass1_Sub19Array1[local2017] = null;
		}
		for (@Pc(2035) int local2035 = 0; local2035 < 32768; local2035++) {
			Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local2035] = null;
		}
		Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[2047] = new Class1_Sub1_Sub1_Sub1_Sub1();
		Static24.aClass38_7.method1044();
		Static95.aClass38_20.method1044();
		@Pc(2067) int local2067;
		@Pc(2071) int local2071;
		for (@Pc(2063) int local2063 = 0; local2063 < 4; local2063++) {
			for (local2067 = 0; local2067 < 104; local2067++) {
				for (local2071 = 0; local2071 < 104; local2071++) {
					Static94.aClass38ArrayArrayArray1[local2063][local2067][local2071] = null;
				}
			}
		}
		Static48.aClass38_10 = new Class38();
		Static17.anInt644 = 0;
		Static90.anInt3112 = 0;
		for (local2067 = 0; local2067 < Static11.anInt494; local2067++) {
			@Pc(2111) Class1_Sub1_Sub4 local2111 = Static100.method1666(local2067);
			if (local2111 != null && local2111.anInt394 == 0) {
				Static84.anIntArray294[local2067] = 0;
				Static39.anIntArray116[local2067] = 0;
			}
		}
		for (local2071 = 0; local2071 < Static59.anIntArray174.length; local2071++) {
			Static59.anIntArray174[local2071] = -1;
		}
		if (anInt451 != -1) {
			Static96.method1642(anInt451);
		}
		for (@Pc(2156) Class1_Sub16 local2156 = (Class1_Sub16) Static35.aClass48_5.method1337(); local2156 != null; local2156 = (Class1_Sub16) Static35.aClass48_5.method1335()) {
			Static95.method1619(local2156, true);
		}
		anInt451 = -1;
		Static35.aClass48_5 = new Class48(8);
		Static115.aBoolean158 = false;
		Static105.aClass1_Sub9_13 = null;
		Static71.anInt1876 = 0;
		Static62.aClass10_2.method362(-1, null, new int[5], false);
		for (@Pc(2192) int local2192 = 0; local2192 < 8; local2192++) {
			Static65.aClass34Array15[local2192] = null;
			Static40.aBooleanArray7[local2192] = false;
		}
		Static60.method1037();
		Static81.aBoolean114 = true;
		for (@Pc(2214) int local2214 = 0; local2214 < 100; local2214++) {
			Static12.aBooleanArray3[local2214] = true;
		}
		Static88.aClass1_Sub14Array1 = null;
		Static30.anInt908 = 0;
		Static90.aClass34_1584 = null;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public static void method269() {
		@Pc(7) boolean local7 = true;
		Static64.method1106(false);
		Static124.anInt2987 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static57.aByteArrayArray6.length; local14++) {
			if (Static78.anIntArray247[local14] != -1 && Static57.aByteArrayArray6[local14] == null) {
				Static57.aByteArrayArray6[local14] = Static10.aClass35_Sub1_8.method1573(Static78.anIntArray247[local14], 0);
				if (Static57.aByteArrayArray6[local14] == null) {
					Static124.anInt2987++;
					local7 = false;
				}
			}
			if (Static105.anIntArray325[local14] != -1 && Static112.aByteArrayArray9[local14] == null) {
				Static112.aByteArrayArray9[local14] = Static10.aClass35_Sub1_8.method1574(Static126.anIntArrayArray29[local14], 0, Static105.anIntArray325[local14]);
				if (Static112.aByteArrayArray9[local14] == null) {
					Static124.anInt2987++;
					local7 = false;
				}
			}
		}
		if (!local7) {
			Static116.anInt2802 = 1;
			return;
		}
		local7 = true;
		Static89.anInt1975 = 0;
		@Pc(117) int local117;
		@Pc(128) int local128;
		for (@Pc(98) int local98 = 0; local98 < Static57.aByteArrayArray6.length; local98++) {
			@Pc(104) byte[] local104 = Static112.aByteArrayArray9[local98];
			if (local104 != null) {
				local117 = (Static28.anIntArray372[local98] >> 8) * 64 - Static37.anInt1098;
				local128 = (Static28.anIntArray372[local98] & 0xFF) * 64 - Static121.anInt2871;
				if (Static32.aBoolean81) {
					local117 = 10;
					local128 = 10;
				}
				local7 &= Static69.method1194(local128, local104, local117);
			}
		}
		if (!local7) {
			Static116.anInt2802 = 2;
			return;
		}
		if (Static116.anInt2802 != 0) {
			Static72.method1267(true, Static91.method1554(new Class34[] { Static17.aClass34_347, Static12.aClass34_279 }));
		}
		Static118.method1873();
		Static16.method382();
		Static118.method1873();
		Static39.aClass44_1.method1171();
		Static118.method1873();
		System.gc();
		for (@Pc(182) int local182 = 0; local182 < 4; local182++) {
			Static114.aClass58Array1[local182].method1594();
		}
		@Pc(205) int local205;
		for (local117 = 0; local117 < 4; local117++) {
			for (local128 = 0; local128 < 104; local128++) {
				for (local205 = 0; local205 < 104; local205++) {
					Static105.aByteArrayArrayArray9[local117][local128][local205] = 0;
				}
			}
		}
		Static118.method1873();
		Static87.method1483();
		local128 = Static57.aByteArrayArray6.length;
		Static99.method1662();
		Static64.method1106(true);
		@Pc(260) int local260;
		@Pc(271) int local271;
		@Pc(389) int local389;
		@Pc(333) int local333;
		@Pc(378) int local378;
		if (!Static32.aBoolean81) {
			@Pc(275) byte[] local275;
			for (local205 = 0; local205 < local128; local205++) {
				local260 = (Static28.anIntArray372[local205] >> 8) * 64 - Static37.anInt1098;
				local271 = (Static28.anIntArray372[local205] & 0xFF) * 64 - Static121.anInt2871;
				local275 = Static57.aByteArrayArray6[local205];
				if (local275 != null) {
					Static118.method1873();
					Static32.method900(local260, (Static76.anInt2062 - 6) * 8, Static114.aClass58Array1, local275, local271, (Static89.anInt1976 - 6) * 8);
				}
			}
			for (local260 = 0; local260 < local128; local260++) {
				local271 = (Static28.anIntArray372[local260] >> 8) * 64 - Static37.anInt1098;
				@Pc(322) byte[] local322 = Static57.aByteArrayArray6[local260];
				local333 = (Static28.anIntArray372[local260] & 0xFF) * 64 - Static121.anInt2871;
				if (local322 == null && Static76.anInt2062 < 800) {
					Static118.method1873();
					Static65.method1111(local333, 64, local271, 64);
				}
			}
			Static64.method1106(true);
			for (local271 = 0; local271 < local128; local271++) {
				local275 = Static112.aByteArrayArray9[local271];
				if (local275 != null) {
					local378 = (Static28.anIntArray372[local271] >> 8) * 64 - Static37.anInt1098;
					local389 = (Static28.anIntArray372[local271] & 0xFF) * 64 - Static121.anInt2871;
					Static118.method1873();
					Static127.method1357(local378, Static39.aClass44_1, local275, local389, Static114.aClass58Array1);
				}
			}
		}
		@Pc(465) int local465;
		@Pc(443) int local443;
		@Pc(449) int local449;
		if (Static32.aBoolean81) {
			@Pc(459) int local459;
			@Pc(467) int local467;
			for (local205 = 0; local205 < 4; local205++) {
				Static118.method1873();
				for (local260 = 0; local260 < 13; local260++) {
					for (local271 = 0; local271 < 13; local271++) {
						@Pc(420) boolean local420 = false;
						local378 = Static133.anIntArrayArrayArray7[local205][local260][local271];
						if (local378 != -1) {
							local389 = local378 >> 24 & 0x3;
							local443 = local378 >> 14 & 0x3FF;
							local449 = local378 >> 3 & 0x7FF;
							local459 = local449 / 8 + (local443 / 8 << 8);
							local465 = local378 >> 1 & 0x3;
							for (local467 = 0; local467 < Static28.anIntArray372.length; local467++) {
								if (local459 == Static28.anIntArray372[local467] && Static57.aByteArrayArray6[local467] != null) {
									local420 = true;
									Static101.method1688((local449 & 0x7) * 8, Static57.aByteArrayArray6[local467], Static114.aClass58Array1, local260 * 8, local465, local389, local271 * 8, (local443 & 0x7) * 8, local205);
									break;
								}
							}
						}
						if (!local420) {
							Static51.method919(local271 * 8, local205, local260 * 8);
						}
					}
				}
			}
			for (local260 = 0; local260 < 13; local260++) {
				for (local271 = 0; local271 < 13; local271++) {
					local333 = Static133.anIntArrayArrayArray7[0][local260][local271];
					if (local333 == -1) {
						Static65.method1111(local271 * 8, 8, local260 * 8, 8);
					}
				}
			}
			Static64.method1106(true);
			for (local271 = 0; local271 < 4; local271++) {
				Static118.method1873();
				for (local333 = 0; local333 < 13; local333++) {
					for (local378 = 0; local378 < 13; local378++) {
						local389 = Static133.anIntArrayArrayArray7[local271][local333][local378];
						if (local389 != -1) {
							local465 = local389 >> 24 & 0x3;
							local443 = local389 >> 1 & 0x3;
							local449 = local389 >> 14 & 0x3FF;
							local459 = local389 >> 3 & 0x7FF;
							local467 = local459 / 8 + (local449 / 8 << 8);
							for (@Pc(647) int local647 = 0; local647 < Static28.anIntArray372.length; local647++) {
								if (local467 == Static28.anIntArray372[local647] && Static112.aByteArrayArray9[local647] != null) {
									Static2.method96(Static112.aByteArrayArray9[local647], (local459 & 0x7) * 8, local378 * 8, Static114.aClass58Array1, local465, local271, local443, local333 * 8, (local449 & 0x7) * 8, Static39.aClass44_1);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static64.method1106(true);
		Static16.method382();
		Static118.method1873();
		Static101.method1689(Static39.aClass44_1, Static114.aClass58Array1);
		Static64.method1106(true);
		local205 = Static5.anInt358;
		if (Static42.anInt1208 < local205) {
			local205 = Static42.anInt1208;
		}
		if (Static42.anInt1208 - 1 > local205) {
		}
		if (Static21.aBoolean39) {
			Static39.aClass44_1.method1154(Static5.anInt358);
		} else {
			Static39.aClass44_1.method1154(0);
		}
		for (local271 = 0; local271 < 104; local271++) {
			for (local333 = 0; local333 < 104; local333++) {
				Static110.method1675(local271, local333);
			}
		}
		Static118.method1873();
		Static126.method1985();
		Static10.aClass63_4.method1665();
		if (Static116.aFrame1 != null) {
			Static21.aClass1_Sub19_Sub1_1.method2105(114);
			Static21.aClass1_Sub19_Sub1_1.method2062(1057001181);
		}
		if (!Static32.aBoolean81) {
			local333 = (Static89.anInt1976 - 6) / 8;
			local389 = (Static76.anInt2062 - 6) / 8;
			local465 = (Static76.anInt2062 + 6) / 8;
			local378 = (Static89.anInt1976 + 6) / 8;
			for (local443 = local333 - 1; local443 <= local378 + 1; local443++) {
				for (local449 = local389 - 1; local449 <= local465 + 1; local449++) {
					if (local333 > local443 || local443 > local378 || local389 > local449 || local465 < local449) {
						Static10.aClass35_Sub1_8.method1565(Static91.method1554(new Class34[] { Static15.aClass34_309, Static85.method1456(local443), Static2.aClass34_105, Static85.method1456(local449) }));
						Static10.aClass35_Sub1_8.method1565(Static91.method1554(new Class34[] { Static6.aClass34_198, Static85.method1456(local443), Static2.aClass34_105, Static85.method1456(local449) }));
					}
				}
			}
		}
		Static41.method695(30);
		Static118.method1873();
		Static75.method1338();
		Static21.aClass1_Sub19_Sub1_1.method2105(43);
		Static85.method1460();
	}
}
