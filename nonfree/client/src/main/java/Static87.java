import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
	public static int anInt1875;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "[S")
	public static final short[] aShortArray25 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "Lclient!h;")
	public static final Class99 aClass99_1 = Static149.method5327();

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
	public static int anInt1874 = -1;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)I")
	public static int method1618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static105.aClass149Array1 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(14) int local14 = arg2 >> 7;
			@Pc(18) int local18 = arg3 >> 7;
			if (arg0 < 0 || arg4 < 0 || Static195.anInt3537 - 1 < arg0 || arg4 > Static118.anInt2419 - 1) {
				return 0;
			} else if (local14 >= 1 && local18 >= 1 && local14 <= Static195.anInt3537 - 1 && Static118.anInt2419 - 1 >= local18) {
				@Pc(74) boolean local74 = (Static2.aByteArrayArrayArray1[1][arg2 >> 7][arg3 >> 7] & 0x2) != 0;
				@Pc(99) boolean local99;
				@Pc(115) boolean local115;
				if ((arg2 & 0x7F) == 0) {
					local99 = (Static2.aByteArrayArrayArray1[1][local14 - 1][arg3 >> 7] & 0x2) != 0;
					local115 = (Static2.aByteArrayArrayArray1[1][local14][arg3 >> 7] & 0x2) != 0;
					if (local99 != local115) {
						local74 = (Static2.aByteArrayArrayArray1[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x7F) == 0) {
					local99 = (Static2.aByteArrayArrayArray1[1][arg2 >> 7][local18 - 1] & 0x2) != 0;
					local115 = (Static2.aByteArrayArrayArray1[1][arg2 >> 7][local18] & 0x2) != 0;
					if (local115 != local99) {
						local74 = (Static2.aByteArrayArrayArray1[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if (local74) {
					arg1++;
				}
				return Static105.aClass149Array1[arg1].a(arg2, arg3);
			} else {
				return 0;
			}
		} else {
			return Static105.aClass149Array1[arg1].a(arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIZ)I")
	public static int method1619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < arg1) {
			return arg1;
		} else if (arg0 >= arg2) {
			return arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILjava/lang/String;BII)V")
	public static void method1621(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class251 local10 = Static201.method3261(arg2, arg0);
		if (local10 == null) {
			return;
		}
		if (local10.anObjectArray24 != null) {
			@Pc(20) Class1_Sub24 local20 = new Class1_Sub24();
			local20.aString24 = arg1;
			local20.anInt3100 = arg3;
			local20.anObjectArray3 = local10.anObjectArray24;
			local20.aClass251_5 = local10;
			Static13.method366(local20);
		}
		if (Static342.anInt5771 != 9) {
			return;
		}
		@Pc(46) boolean local46 = true;
		if (local10.anInt6660 != 0) {
			local46 = Static110.method1984(local10);
		}
		if (!local46 || !Static57.method1248(local10).method1734(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static193.method2984(Static66.aClass179_11);
			Static419.method5588(local10.anInt6704, arg0, arg2);
		}
		if (arg3 == 2) {
			Static193.method2984(Static236.aClass179_49);
			Static419.method5588(local10.anInt6704, arg0, arg2);
		}
		if (arg3 == 3) {
			Static193.method2984(Static39.aClass179_6);
			Static419.method5588(local10.anInt6704, arg0, arg2);
		}
		if (arg3 == 4) {
			Static193.method2984(Static75.aClass179_17);
			Static419.method5588(local10.anInt6704, arg0, arg2);
		}
		if (arg3 == 5) {
			Static193.method2984(Static244.aClass179_50);
			Static419.method5588(local10.anInt6704, arg0, arg2);
		}
		if (arg3 == 6) {
			Static193.method2984(Static271.aClass179_55);
			Static419.method5588(local10.anInt6704, arg0, arg2);
		}
		if (arg3 == 7) {
			Static193.method2984(Static372.aClass179_78);
			Static419.method5588(local10.anInt6704, arg0, arg2);
		}
		if (arg3 == 8) {
			Static193.method2984(Static153.aClass179_35);
			Static419.method5588(local10.anInt6704, arg0, arg2);
		}
		if (arg3 == 9) {
			Static193.method2984(Static405.aClass179_88);
			Static419.method5588(local10.anInt6704, arg0, arg2);
		}
		if (arg3 == 10) {
			Static193.method2984(Static413.aClass179_92);
			Static419.method5588(local10.anInt6704, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)Z")
	public static boolean method1622(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static2.aByteArrayArrayArray1[1][arg0][arg1] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!cl;I)V")
	public static void method1623(@OriginalArg(0) Class31_Sub2_Sub1_Sub1 arg0) {
		@Pc(15) Class1_Sub35 local15 = (Class1_Sub35) Static348.aClass96_36.method2335((long) arg0.anInt7301);
		if (local15 == null) {
			return;
		}
		if (local15.aClass1_Sub19_Sub1_3 != null) {
			Static59.aClass1_Sub19_Sub2_1.method2185(local15.aClass1_Sub19_Sub1_3);
			local15.aClass1_Sub19_Sub1_3 = null;
		}
		local15.method6020();
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	public static void method1624() {
		Static201.aClass39_6.method4546(Static233.aFloat11, Static367.aFloat92, Static420.aFloat98);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1625(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static313.anInt5409 >= 100 && !Static158.aBoolean180 || Static313.anInt5409 >= 200) {
			Static135.method2324(Static152.aClass7_67.method331(Static341.anInt5770));
			return;
		}
		@Pc(31) String local31 = Static459.method4507(arg0);
		if (local31 == null) {
			return;
		}
		@Pc(73) String local73;
		for (@Pc(36) int local36 = 0; local36 < Static313.anInt5409; local36++) {
			@Pc(43) String local43 = Static459.method4507(Static22.aStringArray6[local36]);
			if (local43 != null && local43.equals(local31)) {
				Static135.method2324(arg0 + Static124.aClass7_159.method331(Static341.anInt5770));
				return;
			}
			if (Static172.aStringArray22[local36] != null) {
				local73 = Static459.method4507(Static172.aStringArray22[local36]);
				if (local73 != null && local73.equals(local31)) {
					Static135.method2324(arg0 + Static124.aClass7_159.method331(Static341.anInt5770));
					return;
				}
			}
		}
		for (@Pc(103) int local103 = 0; local103 < Static28.anInt641; local103++) {
			local73 = Static459.method4507(Static214.aStringArray34[local103]);
			if (local73 != null && local73.equals(local31)) {
				Static135.method2324(Static172.aClass7_74.method331(Static341.anInt5770) + arg0 + Static2.aClass7_1.method331(Static341.anInt5770));
				return;
			}
			if (Static260.aStringArray30[local103] != null) {
				@Pc(145) String local145 = Static459.method4507(Static260.aStringArray30[local103]);
				if (local145 != null && local145.equals(local31)) {
					Static135.method2324(Static172.aClass7_74.method331(Static341.anInt5770) + arg0 + Static2.aClass7_1.method331(Static341.anInt5770));
					return;
				}
			}
		}
		if (Static459.method4507(Static452.aClass31_Sub2_Sub1_Sub1_2.aString10).equals(local31)) {
			Static135.method2324(Static259.aClass7_108.method331(Static341.anInt5770));
		} else {
			Static193.method2984(Static34.aClass179_2);
			Static92.aClass1_Sub5_Sub1_1.method5396(Static119.method747(arg0));
			Static92.aClass1_Sub5_Sub1_1.method5385(arg0);
		}
	}
}
