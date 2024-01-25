import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "Lclient!ra;")
	public static Class170 aClass170_22;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
	public static int anInt1584;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "Lclient!bk;")
	public static final Class5_Sub1 aClass5_Sub1_5 = new Class5_Sub1(new byte[5000]);

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
	public static int anInt1583 = 0;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "[I")
	public static final int[] anIntArray74 = new int[128];

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!jf;I)Lclient!jf;")
	public static Class96 method1380(@OriginalArg(0) Class96 arg0) {
		if (arg0.anInt2929 != -1) {
			return Static121.method2396(arg0.anInt2929);
		}
		@Pc(28) int local28 = arg0.anInt2877 >>> 16;
		@Pc(33) Class124 local33 = new Class124(Static265.aClass42_53);
		for (@Pc(38) Class5_Sub40 local38 = (Class5_Sub40) local33.method3323(); local38 != null; local38 = (Class5_Sub40) local33.method3324()) {
			if (local28 == local38.anInt6233) {
				return Static121.method2396((int) local38.aLong218);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Lclient!qd;")
	public static Class165 method1382(@OriginalArg(0) int arg0) {
		@Pc(5) Class66 local5 = Static342.aClass66_108;
		@Pc(14) Class165 local14;
		synchronized (Static342.aClass66_108) {
			local14 = (Class165) Static342.aClass66_108.method1939((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static317.aClass170_115.method4584(Static193.method3494(arg0), Static262.method4495(arg0));
		local14 = new Class165();
		local14.anInt4906 = arg0;
		if (local34 != null) {
			local14.method4432(new Class5_Sub1(local34));
		}
		local14.method4425();
		if (local14.anInt4944 != -1) {
			local14.method4427(method1382(local14.anInt4944), method1382(local14.anInt4908));
		}
		if (local14.anInt4920 != -1) {
			local14.method4431(method1382(local14.anInt4919), method1382(local14.anInt4920));
		}
		if (!Static219.aBoolean319 && local14.aBoolean380) {
			local14.anInt4954 = 0;
			local14.aStringArray38 = Static57.aStringArray6;
			local14.aBoolean379 = false;
			local14.anIntArray382 = null;
			local14.aStringArray37 = Static100.aStringArray12;
			local14.aString291 = Static35.aString56;
		}
		@Pc(114) Class66 local114 = Static342.aClass66_108;
		synchronized (Static342.aClass66_108) {
			Static342.aClass66_108.method1936((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method1383(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		Static176.aClass170_34.anInt5179 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(25) int local25 = 0; local25 < Static177.anInt2358; local25++) {
			@Pc(31) Class165 local31 = method1382(local25);
			if ((!arg1 || local31.aBoolean379) && local31.anInt4944 == -1 && local31.anInt4920 == -1 && local31.anInt4961 == 0 && local31.aString291.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static331.anInt6231 = -1;
					Static288.aShortArray90 = null;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(83) short[] local83 = new short[local14.length * 2];
					for (@Pc(85) int local85 = 0; local85 < local16; local85++) {
						local83[local85] = local14[local85];
					}
					local14 = local83;
				}
				local14[local16++] = (short) local25;
			}
		}
		Static215.anInt4278 = 0;
		Static331.anInt6231 = local16;
		Static288.aShortArray90 = local14;
		@Pc(118) String[] local118 = new String[Static331.anInt6231];
		for (@Pc(120) int local120 = 0; local120 < Static331.anInt6231; local120++) {
			local118[local120] = method1382(local14[local120]).aString291;
		}
		Static299.method5079(Static288.aShortArray90, local118);
		Static176.aClass170_34.method4561();
		Static176.aClass170_34.anInt5179 = 2;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)Z")
	public static boolean method1385(@OriginalArg(1) int arg0) {
		if (arg0 == 26 || arg0 == 34 || arg0 == 22 || arg0 == 49 || arg0 == 44 || arg0 == 41 || arg0 == 47 || arg0 == 60) {
			return true;
		} else if (arg0 == 48 || arg0 == 5 || arg0 == 1012 || arg0 == 1004) {
			return true;
		} else if (arg0 == 23 || arg0 == 2 || arg0 == 19 || arg0 == 11 || arg0 == 57) {
			return true;
		} else {
			return arg0 == 29 || arg0 == 8 || arg0 == 28 || arg0 == 30 || arg0 == 37 || arg0 == 20;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)C")
	public static char method1387(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(44) char local44 = Static95.aCharArray26[local7 - 128];
			if (local44 == '\u0000') {
				local44 = '?';
			}
			local7 = local44;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(CI)Z")
	public static boolean method1389(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
