import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!f", name = "J", descriptor = "I")
	public static int anInt2020;

	@OriginalMember(owner = "client!f", name = "K", descriptor = "I")
	public static int anInt2021;

	@OriginalMember(owner = "client!f", name = "T", descriptor = "[Lclient!rg;")
	public static Class27[] aClass27Array12;

	@OriginalMember(owner = "client!f", name = "H", descriptor = "I")
	public static int anInt2018 = 0;

	@OriginalMember(owner = "client!f", name = "U", descriptor = "I")
	public static int anInt2030 = 1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Lclient!v;")
	public static Class1_Sub5 method1598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class188 local7 = Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub5_2;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZZ)V")
	public static void method1600(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0) {
			Static383.aClass48_9 = Static246.method2494(Static87.anInt1875 * 2, Static154.aClass123_2, Static332.anInterface3_7, arg0, Static343.aCanvas5);
		} else {
			if (arg1) {
				Static383.aClass48_9 = Static246.method2494(0, Static154.aClass123_2, Static332.anInterface3_7, 0, Static343.aCanvas5);
				Static383.aClass48_9.method2512(0);
				@Pc(35) Class24 local35 = Static346.method5534(Static107.anInt2387, Static381.aClass83_125);
				@Pc(44) Class44 local44 = Static383.aClass48_9.method2526(local35, Static399.method3369(Static324.aClass83_116, Static107.anInt2387));
				Static88.method1497(true, local44, Static87.aClass62_60.method1389(Static200.anInt4144));
				Static383.aClass48_9.method2538();
				Static215.method3857();
				Static383.aClass48_9.method2479();
			}
			try {
				Static383.aClass48_9 = Static246.method2494(Static87.anInt1875 * 2, Static154.aClass123_2, Static332.anInterface3_7, arg0, Static343.aCanvas5);
			} catch (@Pc(71) Throwable local71) {
				Static383.aClass48_9 = Static246.method2494(0, Static154.aClass123_2, Static332.anInterface3_7, 0, Static343.aCanvas5);
				arg0 = 0;
			}
		}
		if (Static383.aClass48_9.method2500()) {
			@Pc(93) Class2_Sub44 local93 = Static383.aClass48_9.method2466();
			Static383.aClass48_9.method2449(local93);
		}
		Static36.anInt2910 = arg0;
		Static11.method105();
		if (!Static383.aClass48_9.method2519()) {
			Static148.anInt3148 = 1;
		}
		Static383.aClass48_9.method2478(Static148.anInt3148);
		Static383.aClass48_9.method2518(0);
		Static61.aClass21_4 = Static383.aClass48_9.method2483();
		Static172.aClass21_8 = Static383.aClass48_9.method2483();
		@Pc(123) int local123 = (int) ((double) Static89.anInt1891 * 34.46D);
		if (Static383.aClass48_9.method2511()) {
			local123 += 128;
		}
		Static383.aClass48_9.method2492(50, local123);
		Static383.aClass48_9.method2499(!Static308.aBoolean416);
		if (Static383.aClass48_9.method2459()) {
			Static146.method2643(Static220.aBoolean317);
		}
		Static310.method5031(Static85.anInt1839 >> 3, Static89.anInt1891 >> 3, Static383.aClass48_9);
		Static370.method4288();
		Static383.aBoolean489 = false;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1601(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static204.aCharArray3[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(78) int local78 = local50.length() - 1;
					local50.setCharAt(local78, Character.toUpperCase(local50.charAt(local78)));
					local68 = ' ';
				}
				local50.append(local68);
			}
			local50.reverse();
			local50.setCharAt(0, Character.toUpperCase(local50.charAt(0)));
			return local50.toString();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ICI)I")
	public static int method1602(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIZ[Lclient!ab;)V")
	public static void method1603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class3[] arg4) {
		for (@Pc(12) int local12 = 0; local12 < arg4.length; local12++) {
			@Pc(18) Class3 local18 = arg4[local12];
			if (local18 != null && local18.anInt87 == arg1) {
				Static260.method4469(arg3, local18, arg0, arg2);
				Static361.method3589(local18, arg0, arg2);
				if (local18.anInt81 > local18.anInt76 - local18.anInt64) {
					local18.anInt81 = local18.anInt76 - local18.anInt64;
				}
				if (local18.anInt111 - local18.anInt116 < local18.anInt93) {
					local18.anInt93 = local18.anInt111 - local18.anInt116;
				}
				if (local18.anInt81 < 0) {
					local18.anInt81 = 0;
				}
				if (local18.anInt93 < 0) {
					local18.anInt93 = 0;
				}
				if (local18.anInt91 == 0) {
					Static378.method4266(local18, arg3);
				}
			}
		}
	}
}
