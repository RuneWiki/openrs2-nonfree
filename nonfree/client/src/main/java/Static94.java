import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "Lclient!en;")
	public static Class44 aClass44_9;

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "Lclient!pg;")
	public static Class2_Sub8_Sub16 aClass2_Sub8_Sub16_1;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "Lclient!oe;")
	public static Class2_Sub16 aClass2_Sub16_5 = new Class2_Sub16(new byte[5000]);

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
	public static int anInt2280 = 1;

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
	public static void method1658() {
		Static141.aClass157_26.method4027();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLclient!ek;)V")
	public static void method1659(@OriginalArg(1) Class42 arg0) {
		Static183.aClass42_52 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BIIIILclient!hb;I)Lclient!hb;")
	public static Class15_Sub5 method1660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class15_Sub5 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg5;
		@Pc(14) Class15_Sub5 local14 = (Class15_Sub5) Static80.aClass157_14.method4031(local8);
		if (local14 == null) {
			@Pc(22) Class15_Sub7 local22 = Static267.method4203(Static290.aClass42_105, arg5);
			if (local22 == null) {
				return null;
			}
			local14 = local22.method4225(64, 768, -50, -10, -50);
			Static80.aClass157_14.method4026(local8, local14);
		}
		@Pc(50) int local50 = arg4.method2359();
		@Pc(53) int local53 = arg4.method2343();
		@Pc(56) int local56 = arg4.method2349();
		@Pc(59) int local59 = arg4.method2353();
		local14 = local14.method2358(true, true, true);
		if (arg3 != 0) {
			local14.method2348(arg3);
		}
		@Pc(105) int local105;
		if (Static116.aBoolean184) {
			@Pc(150) Class15_Sub5_Sub2 local150 = (Class15_Sub5_Sub2) local14;
			if (Static234.method3798(arg1 + local56, local50 + arg0, Static32.anInt876) != arg2 || Static234.method3798(local59 + arg1, local53 + arg0, Static32.anInt876) != arg2) {
				for (local105 = 0; local105 < local150.anInt2972; local105++) {
					local150.anIntArray287[local105] += Static234.method3798(local150.anIntArray288[local105] + arg1, arg0 + local150.anIntArray285[local105], Static32.anInt876) - arg2;
				}
				local150.aClass61_1.aBoolean148 = false;
				local150.aClass12_4.aBoolean24 = false;
			}
		} else {
			@Pc(76) Class15_Sub5_Sub1 local76 = (Class15_Sub5_Sub1) local14;
			if (arg2 != Static234.method3798(arg1 + local56, local50 + arg0, Static32.anInt876) || Static234.method3798(local59 + arg1, local53 + arg0, Static32.anInt876) != arg2) {
				for (local105 = 0; local105 < local76.anInt2884; local105++) {
					local76.anIntArray244[local105] += Static234.method3798(local76.anIntArray249[local105] + arg1, local76.anIntArray251[local105] - -arg0, Static32.anInt876) - arg2;
				}
				local76.aBoolean197 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)V")
	public static void method1661(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub8_Sub10 local12 = Static92.method1633(10, arg0);
		local12.method2043();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1662(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(28) int local28 = 0;
			@Pc(30) long local30 = arg0;
			while (local30 != 0L) {
				local30 /= 37L;
				local28++;
			}
			@Pc(46) StringBuffer local46 = new StringBuffer(local28);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static37.aCharArray1[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					local68 = ' ';
					@Pc(79) int local79 = local46.length() - 1;
					local46.setCharAt(local79, Character.toUpperCase(local46.charAt(local79)));
				}
				local46.append(local68);
			}
			local46.reverse();
			local46.setCharAt(0, Character.toUpperCase(local46.charAt(0)));
			return local46.toString();
		}
	}
}
