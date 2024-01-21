import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!l", name = "H", descriptor = "I")
	public static int anInt2525 = 0;

	@OriginalMember(owner = "client!l", name = "I", descriptor = "I")
	public static int anInt2526 = -1;

	@OriginalMember(owner = "client!l", name = "O", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!l", name = "R", descriptor = "J")
	public static volatile long aLong82 = 0L;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
	public static void method1985() {
		Static30.method785();
		Static108.method2204();
		Static47.method1120();
		Static53.method1212();
		Static43.method1042();
		Static161.method3003();
		Static14.method527();
		Static34.method854();
		Static24.method667();
		Static101.method2113();
		Static106.method2171();
		Static99.method2101();
		((Class44) Static13.anInterface2_1).method1833();
		Static131.aClass63_23.method2344();
		Static181.aClass7_Sub1_19.method1013();
		Static79.aClass7_Sub1_11.method1013();
		Static144.aClass7_Sub1_7.method1013();
		Static127.aClass7_Sub1_14.method1013();
		Static76.aClass7_Sub1_10.method1013();
		Static164.aClass7_Sub1_17.method1013();
		Static41.aClass7_Sub1_5.method1013();
		Static2.aClass7_Sub1_1.method1013();
		Static21.aClass7_Sub1_3.method1013();
		Static61.aClass7_Sub1_8.method1013();
		Static127.aClass7_Sub1_13.method1013();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lclient!ma;")
	public static Class3_Sub2_Sub13 method1987(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub2_Sub13 local15 = (Class3_Sub2_Sub13) Static179.aClass63_31.method2337((long) arg0);
		if (local15 != null) {
			return local15;
		}
		local15 = Static158.method626(Static78.aClass7_34, arg0, Static133.aClass7_54);
		if (local15 != null) {
			Static179.aClass63_31.method2338((long) arg0, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
	public static void method1988() {
		@Pc(7) Class16 local7 = Static127.aClass16_1;
		synchronized (Static127.aClass16_1) {
			Static133.anInt3377 = Static48.anInt1377;
			@Pc(15) int local15;
			if (Static92.anInt4203 < 0) {
				for (local15 = 0; local15 < 112; local15++) {
					Static78.aBooleanArray12[local15] = false;
				}
				Static92.anInt4203 = Static71.anInt2135;
			} else {
				while (Static71.anInt2135 != Static92.anInt4203) {
					local15 = Static129.anIntArray568[Static71.anInt2135];
					Static71.anInt2135 = Static71.anInt2135 + 1 & 0x7F;
					if (local15 < 0) {
						Static78.aBooleanArray12[~local15] = false;
					} else {
						Static78.aBooleanArray12[local15] = true;
					}
				}
			}
			Static48.anInt1377 = Static52.anInt1498;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!gd;)V")
	public static void method1990(@OriginalArg(0) Class32 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1450; local2 <= arg0.anInt1439; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1449; local6 <= arg0.anInt1447; local6++) {
				@Pc(16) Class3_Sub20 local16 = Static149.aClass3_Sub20ArrayArrayArray1[arg0.anInt1441][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt3336; local20++) {
						if (local16.aClass32Array3[local20] == arg0) {
							local16.anInt3336--;
							for (local35 = local20; local35 < local16.anInt3336; local35++) {
								local16.aClass32Array3[local35] = local16.aClass32Array3[local35 + 1];
								local16.anIntArray576[local35] = local16.anIntArray576[local35 + 1];
							}
							local16.aClass32Array3[local16.anInt3336] = null;
							break;
						}
					}
					local16.anInt3342 = 0;
					for (local35 = 0; local35 < local16.anInt3336; local35++) {
						local16.anInt3342 |= local16.anIntArray576[local35];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)Lclient!wd;")
	public static Class3_Sub2_Sub18 method1991(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub2_Sub18 local10 = (Class3_Sub2_Sub18) Static70.aClass63_11.method2337((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static146.aClass7_61.method1021(6, arg0);
		local10 = new Class3_Sub2_Sub18();
		local10.anInt4238 = arg0;
		if (local20 != null) {
			local10.method3187(new Class3_Sub8(local20));
		}
		local10.method3178();
		if (local10.aBoolean198) {
			local10.aBoolean196 = false;
			local10.anInt4236 = 0;
		}
		Static70.aClass63_11.method2338((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
	public static void method1992() {
		while (true) {
			if (Static18.aClass3_Sub8_Sub1_1.method1556(Static11.anInt410) >= 11) {
				@Pc(17) int local17 = Static18.aClass3_Sub8_Sub1_1.method1557(11);
				if (local17 != 2047) {
					@Pc(24) boolean local24 = false;
					if (Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local17] == null) {
						local24 = true;
						Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local17] = new Class3_Sub2_Sub1_Sub2_Sub1();
						if (Static137.aClass3_Sub8Array1[local17] != null) {
							Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local17].method742(Static137.aClass3_Sub8Array1[local17]);
						}
					}
					Static126.anIntArray557[Static112.anInt2872++] = local17;
					@Pc(60) Class3_Sub2_Sub1_Sub2_Sub1 local60 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local17];
					local60.anInt1830 = Static14.anInt481;
					@Pc(70) int local70 = Static18.aClass3_Sub8_Sub1_1.method1557(5);
					if (local70 > 15) {
						local70 -= 32;
					}
					@Pc(81) int local81 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
					@Pc(88) int local88 = Static50.anIntArray253[Static18.aClass3_Sub8_Sub1_1.method1557(3)];
					if (local24) {
						local60.anInt1793 = local60.anInt1795 = local88;
					}
					@Pc(103) int local103 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
					if (local103 == 1) {
						Static171.anIntArray684[Static81.anInt2370++] = local17;
					}
					@Pc(123) int local123 = Static18.aClass3_Sub8_Sub1_1.method1557(5);
					if (local123 > 15) {
						local123 -= 32;
					}
					local60.method1431(Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0] + local70, local81 == 1, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0] + local123);
					continue;
				}
			}
			Static18.aClass3_Sub8_Sub1_1.method1563();
			return;
		}
	}
}
