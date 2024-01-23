import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "Lclient!si;")
	public static Class1_Sub3_Sub13_Sub2 aClass1_Sub3_Sub13_Sub2_2;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString111 = "Loading fonts - ";

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!wf;IZI)V")
	public static void method1458(@OriginalArg(1) Class191 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0.anInt6088;
		if (arg0.aByte27 == 0) {
			arg0.anInt6088 = arg0.anInt6150;
		} else if (arg0.aByte27 == 1) {
			arg0.anInt6088 = arg1 - arg0.anInt6150;
		} else if (arg0.aByte27 == 2) {
			arg0.anInt6088 = arg0.anInt6150 * arg1 >> 14;
		} else if (arg0.aByte27 == 3) {
			if (arg0.anInt6086 == 2) {
				arg0.anInt6088 = (arg0.anInt6150 - 1) * arg0.anInt6135 + arg0.anInt6150 * 32;
			} else if (arg0.anInt6086 == 7) {
				arg0.anInt6088 = arg0.anInt6150 * 115 + (arg0.anInt6150 - 1) * arg0.anInt6135;
			}
		}
		@Pc(97) int local97 = arg0.anInt6128;
		if (arg0.aByte26 == 0) {
			arg0.anInt6128 = arg0.anInt6102;
		} else if (arg0.aByte26 == 1) {
			arg0.anInt6128 = arg3 - arg0.anInt6102;
		} else if (arg0.aByte26 == 2) {
			arg0.anInt6128 = arg0.anInt6102 * arg3 >> 14;
		} else if (arg0.aByte26 == 3) {
			if (arg0.anInt6086 == 2) {
				arg0.anInt6128 = arg0.anInt6102 * 32 + (arg0.anInt6102 - 1) * arg0.anInt6148;
			} else if (arg0.anInt6086 == 7) {
				arg0.anInt6128 = (arg0.anInt6102 - 1) * arg0.anInt6148 + arg0.anInt6102 * 12;
			}
		}
		if (arg0.aByte27 == 4) {
			arg0.anInt6088 = arg0.anInt6128 * arg0.anInt6164 / arg0.anInt6158;
		}
		if (arg0.aByte26 == 4) {
			arg0.anInt6128 = arg0.anInt6158 * arg0.anInt6088 / arg0.anInt6164;
		}
		if (Static303.aBoolean389 && (Static35.method737(arg0).anInt5933 != 0 || arg0.anInt6086 == 0)) {
			if (arg0.anInt6128 < 5 && arg0.anInt6088 < 5) {
				arg0.anInt6088 = 5;
				arg0.anInt6128 = 5;
			} else {
				if (arg0.anInt6128 <= 0) {
					arg0.anInt6128 = 5;
				}
				if (arg0.anInt6088 <= 0) {
					arg0.anInt6088 = 5;
				}
			}
		}
		if (arg0.anInt6115 == 1337) {
			Static210.aClass191_10 = arg0;
		}
		if (arg2 && arg0.anObjectArray22 != null && (local8 != arg0.anInt6088 || arg0.anInt6128 != local97)) {
			@Pc(297) Class1_Sub27 local297 = new Class1_Sub27();
			local297.aClass191_14 = arg0;
			local297.anObjectArray1 = arg0.anObjectArray22;
			Static262.aClass26_50.method668(local297);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!na;III)Ljava/awt/Frame;")
	public static Frame method1461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method2894()) {
			return null;
		}
		@Pc(22) Class22[] local22 = Static23.method501(arg2);
		if (local22 == null) {
			return null;
		}
		@Pc(28) boolean local28 = false;
		for (@Pc(30) int local30 = 0; local30 < local22.length; local30++) {
			if (local22[local30].anInt660 == arg1 && arg0 == local22[local30].anInt661 && (!local28 || arg3 < local22[local30].anInt664)) {
				arg3 = local22[local30].anInt664;
				local28 = true;
			}
		}
		if (!local28) {
			return null;
		}
		@Pc(102) Class47 local102 = arg2.method2878(arg3, arg1, arg0);
		while (local102.anInt1417 == 0) {
			Static312.method4734(10L);
		}
		@Pc(117) Frame local117 = (Frame) local102.anObject2;
		if (local117 == null) {
			return null;
		} else if (local102.anInt1417 == 2) {
			Static173.method2821(local117, arg2);
			return null;
		} else {
			return local117;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BILclient!sl;)V")
	public static void method1462(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub27 arg1) {
		@Pc(8) Object[] local8 = arg1.anObjectArray1;
		@Pc(20) int local20 = (Integer) local8[0];
		@Pc(24) Class1_Sub3_Sub6 local24 = Static44.method878(local20);
		if (local24 == null) {
			return;
		}
		Static127.aStringArray27 = new String[local24.anInt1263];
		@Pc(35) int local35 = 0;
		Static61.anIntArray161 = new int[local24.anInt1262];
		@Pc(41) int local41 = 0;
		for (@Pc(43) int local43 = 1; local43 < local8.length; local43++) {
			if (local8[local43] instanceof Integer) {
				@Pc(83) int local83 = (Integer) local8[local43];
				if (local83 == -2147483647) {
					local83 = arg1.anInt5234;
				}
				if (local83 == -2147483646) {
					local83 = arg1.anInt5232;
				}
				if (local83 == -2147483645) {
					local83 = arg1.aClass191_14 == null ? -1 : arg1.aClass191_14.anInt6134;
				}
				if (local83 == -2147483644) {
					local83 = arg1.anInt5235;
				}
				if (local83 == -2147483643) {
					local83 = arg1.aClass191_14 == null ? -1 : arg1.aClass191_14.anInt6165;
				}
				if (local83 == -2147483642) {
					local83 = arg1.aClass191_13 == null ? -1 : arg1.aClass191_13.anInt6134;
				}
				if (local83 == -2147483641) {
					local83 = arg1.aClass191_13 == null ? -1 : arg1.aClass191_13.anInt6165;
				}
				if (local83 == -2147483640) {
					local83 = arg1.anInt5229;
				}
				if (local83 == -2147483639) {
					local83 = arg1.anInt5228;
				}
				Static61.anIntArray161[local35++] = local83;
			} else if (local8[local43] instanceof String) {
				@Pc(63) String local63 = (String) local8[local43];
				if (local63.equals("event_opbase")) {
					local63 = arg1.aString371;
				}
				Static127.aStringArray27[local41++] = local63;
			}
		}
		Static65.method1145(local24, arg0);
	}
}
