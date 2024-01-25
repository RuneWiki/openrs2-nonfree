import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!df", name = "h", descriptor = "[I")
	public static int[] anIntArray140;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	public static int anInt2200;

	@OriginalMember(owner = "client!df", name = "o", descriptor = "I")
	public static int anInt2201;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Lclient!ow;")
	public static final Class252 aClass252_2 = new Class252();

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)V")
	public static void method1969(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static305.anInt5560 - Static62.anInt4794;
		if (local8 >= 100) {
			Static446.anInt7363 = 1;
			Static205.anInt4130 = -1;
			Static471.anInt7695 = -1;
			return;
		}
		@Pc(21) int local21 = (int) Static527.aFloat183;
		if (local21 < Static168.anInt8982 >> 8) {
			local21 = Static168.anInt8982 >> 8;
		}
		if (Static508.aBooleanArray30[4] && local21 < Static47.anIntArray92[4] + 128) {
			local21 = Static47.anIntArray92[4] + 128;
		}
		@Pc(71) int local71 = (int) Static439.aFloat151 + Static91.anInt2282 & 0x3FFF;
		Static162.method2890(local21, arg0, (local21 >> 3) * 3 + 600 << 2, Static498.anInt7926, local71, Static45.anInt998, Static130.method2562(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980, Static209.anInt8182, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975) - 200);
		@Pc(114) float local114 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static545.anInt8633 = (int) ((float) (Static545.anInt8633 - Static53.anInt1243) * local114 + (float) Static53.anInt1243);
		Static37.anInt878 = (int) ((float) (Static37.anInt878 - Static462.anInt7550) * local114 + (float) Static462.anInt7550);
		Static421.anInt7061 = (int) ((float) (Static421.anInt7061 - Static296.anInt5367) * local114 + (float) Static296.anInt5367);
		Static233.anInt4431 = (int) ((float) Static366.anInt6301 + local114 * (float) (Static233.anInt4431 - Static366.anInt6301));
		@Pc(166) int local166 = Static154.anInt3150 - Static461.anInt7534;
		if (local166 > 8192) {
			local166 -= 16384;
		} else if (local166 < -8192) {
			local166 += 16384;
		}
		Static154.anInt3150 = (int) ((float) Static461.anInt7534 + local114 * (float) local166);
		Static154.anInt3150 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Z")
	public static boolean method1971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B[I[Ljava/lang/Object;II)V")
	public static void method1973(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg2 + arg3) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) int local24 = arg0[local18];
		arg0[local18] = arg0[arg2];
		arg0[arg2] = local24;
		@Pc(38) Object local38 = arg1[local18];
		arg1[local18] = arg1[arg2];
		arg1[arg2] = local38;
		@Pc(57) int local57 = ~local24 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg3; local59 < arg2; local59++) {
			if (arg0[local59] < local24 + (local57 & local59)) {
				@Pc(75) int local75 = arg0[local59];
				arg0[local59] = arg0[local20];
				arg0[local20] = local75;
				@Pc(89) Object local89 = arg1[local59];
				arg1[local59] = arg1[local20];
				arg1[local20++] = local89;
			}
		}
		arg0[arg2] = arg0[local20];
		arg0[local20] = local24;
		arg1[arg2] = arg1[local20];
		arg1[local20] = local38;
		method1973(arg0, arg1, local20 - 1, arg3);
		method1973(arg0, arg1, arg2, local20 + 1);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)C")
	public static char method1974(@OriginalArg(1) byte arg0) {
		@Pc(16) int local16 = arg0 & 0xFF;
		if (local16 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local16, 16) + " provided");
		}
		if (local16 >= 128 && local16 < 160) {
			@Pc(50) char local50 = Static595.aCharArray12[local16 - 128];
			if (local50 == '\u0000') {
				local50 = '?';
			}
			local16 = local50;
		}
		return (char) local16;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BII)Z")
	public static boolean method1975(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static199.method3589(arg0, arg1) || Static92.method2051(arg1, arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZBILclient!r;)Lclient!lb;")
	public static Class197 method1976(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class43 arg2) {
		if (arg1 == -1) {
			return null;
		}
		if (Static22.anIntArray52 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static22.anIntArray52.length; local14++) {
				if (arg1 == Static22.anIntArray52[local14]) {
					return Static129.aClass197Array1[local14];
				}
			}
		}
		@Pc(45) Class197 local45 = (Class197) Static493.aClass10_44.method250((long) arg1);
		if (local45 != null) {
			if (arg0 && local45.aClass58_9 == null) {
				@Pc(57) Class58 local57 = Static213.method3761(arg1, Static350.aClass246_238);
				if (local57 == null) {
					return null;
				}
				local45.aClass58_9 = local57;
			}
			return local45;
		}
		@Pc(75) Class355[] local75 = Static606.method7589(Static299.aClass246_141, arg1);
		if (local75 == null) {
			return null;
		}
		@Pc(84) Class58 local84 = Static213.method3761(arg1, Static350.aClass246_238);
		if (local84 == null) {
			return null;
		}
		if (arg0) {
			local45 = new Class197(arg2.method7139(local84, local75), local84);
		} else {
			local45 = new Class197(arg2.method7139(local84, local75));
		}
		Static493.aClass10_44.method254(local45, (long) arg1);
		return local45;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(IB)Lclient!fe;")
	public static Class9_Sub2 method1977(@OriginalArg(0) int arg0) {
		@Pc(7) Class309[] local7 = Class222.aClass309Array5;
		synchronized (Class222.aClass309Array5) {
			@Pc(32) Class9_Sub2 local32;
			if (arg0 >= Class222.aClass309Array5.length || Class222.aClass309Array5[arg0].method6596()) {
				local32 = new Class9_Sub2();
				local32.aClass9_Sub9Array1 = new Class9_Sub9[arg0];
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					local32.aClass9_Sub9Array1[local38] = new Class9_Sub9();
				}
			} else {
				local32 = (Class9_Sub2) Class222.aClass309Array5[arg0].method6589();
				local32.method7465();
				@Pc(67) int local67 = Static537.anIntArray350[arg0]--;
			}
			return local32;
		}
	}
}
