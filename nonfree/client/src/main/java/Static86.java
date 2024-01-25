import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!dda", name = "I", descriptor = "Lclient!mc;")
	public static Class198 aClass198_3;

	@OriginalMember(owner = "client!dda", name = "A", descriptor = "Lclient!aba;")
	public static final Class4 aClass4_5 = new Class4();

	@OriginalMember(owner = "client!dda", name = "G", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_32 = new Class45(52, 2);

	@OriginalMember(owner = "client!dda", name = "H", descriptor = "[I")
	public static final int[] anIntArray191 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IILclient!ss;Lclient!qa;II)V")
	public static void method1906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class279 arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class310 local9 = Static149.aClass292_2.method7212(arg2.anInt8323);
		if (local9.anInt9357 == -1) {
			return;
		}
		if (arg2.aBoolean580) {
			@Pc(31) int local31 = arg4 + arg2.anInt8291;
			arg4 = local31 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(43) Class84 local43 = local9.method7754(arg4, arg2.aBoolean589, arg3);
		if (local43 == null) {
			return;
		}
		@Pc(49) int local49 = arg2.anInt8293;
		@Pc(52) int local52 = arg2.anInt8303;
		if ((arg4 & 0x1) == 1) {
			local49 = arg2.anInt8303;
			local52 = arg2.anInt8293;
		}
		@Pc(68) int local68 = local43.EA();
		@Pc(71) int local71 = local43.ma();
		if (local9.aBoolean661) {
			local68 = local49 * 4;
			local71 = local52 * 4;
		}
		if (local9.anInt9355 == 0) {
			local43.method7489(arg1, arg0 + 4 - local52 * 4, local68, local71);
		} else {
			local43.ra(arg1, arg0 - (local52 - 1) * 4, local68, local71, 0, local9.anInt9355 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
	public static boolean method1907(@OriginalArg(2) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local28 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(78) int local78;
			if (local48 >= '0' && local48 <= '9') {
				local78 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local78 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local78 = local48 - 'W';
			} else {
				return false;
			}
			if (local78 >= 10) {
				return false;
			}
			if (local28) {
				local78 = -local78;
			}
			@Pc(120) int local120 = local78 + local37 * 10;
			if (local37 != local120 / 10) {
				return false;
			}
			local37 = local120;
			local35 = true;
		}
		return local35;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)V")
	public static void method1908() {
		if (!Static8.method260()) {
			return;
		}
		if (Static255.aStringArray29 == null) {
			Static406.method6372();
		}
		Static530.aBoolean673 = true;
		Static61.anInt1462 = 0;
		try {
			Static178.aClipboard1 = Static314.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(16) Exception local16) {
		}
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)V")
	public static void method1909() {
		for (@Pc(14) Class12_Sub20 local14 = (Class12_Sub20) Static192.aClass73_33.method2005(); local14 != null; local14 = (Class12_Sub20) Static192.aClass73_33.method2009()) {
			if (Static526.method7802(local14.anInt4329)) {
				Static418.method6475(local14);
			}
		}
		if (Static8.anInt118 == 1) {
			Static544.method7975();
			return;
		}
		Static480.method7208(Static105.anInt2405, Static301.anInt5821, Static298.anInt3270, Static253.anInt5213);
		@Pc(51) int local51 = Static445.aClass244_7.method6147(Static499.aClass88_266.method2391(Static345.anInt6495));
		for (@Pc(56) Class12_Sub20 local56 = (Class12_Sub20) Static192.aClass73_33.method2005(); local56 != null; local56 = (Class12_Sub20) Static192.aClass73_33.method2009()) {
			@Pc(62) int local62 = Static55.method1412(local56);
			if (local51 < local62) {
				local51 = local62;
			}
		}
		Static253.anInt5213 = local51 + 8;
		Static298.anInt3270 = (Static386.aBoolean562 ? 26 : 22) + Static8.anInt118 * 16;
	}
}
