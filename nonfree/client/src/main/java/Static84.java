import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
	public static int anInt2036;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_32 = new Class92(1, 16);

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Lclient!ak;")
	public static final Class10 aClass10_5 = new Class10(14, 0, 4, 1);

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Lclient!tq;")
	public static final Class238 aClass238_9 = new Class238(5, 5);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg0 && arg8 == arg5 && arg4 == arg6 && arg3 == arg2) {
			Static159.method4801(arg8, arg3, arg4, arg0, arg1);
			return;
		}
		@Pc(20) int local20 = arg0;
		@Pc(22) int local22 = arg8;
		@Pc(26) int local26 = arg0 * 3;
		@Pc(30) int local30 = arg8 * 3;
		@Pc(34) int local34 = arg7 * 3;
		@Pc(38) int local38 = arg5 * 3;
		@Pc(42) int local42 = arg6 * 3;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(55) int local55 = local34 + arg4 - arg0 - local42;
		@Pc(65) int local65 = arg3 + local38 - local46 - arg8;
		@Pc(74) int local74 = local42 + local26 - local34 - local34;
		@Pc(82) int local82 = local46 + local30 - local38 - local38;
		@Pc(87) int local87 = local34 - local26;
		@Pc(92) int local92 = local38 - local30;
		for (@Pc(94) int local94 = 128; local94 <= 4096; local94 += 128) {
			@Pc(102) int local102 = local94 * local94 >> 12;
			@Pc(108) int local108 = local102 * local94 >> 12;
			@Pc(112) int local112 = local108 * local55;
			@Pc(116) int local116 = local108 * local65;
			@Pc(120) int local120 = local102 * local74;
			@Pc(124) int local124 = local102 * local82;
			@Pc(128) int local128 = local87 * local94;
			@Pc(132) int local132 = local94 * local92;
			@Pc(142) int local142 = arg0 + (local128 + local120 + local112 >> 12);
			@Pc(153) int local153 = arg8 + (local132 + local124 + local116 >> 12);
			Static159.method4801(local22, local153, local142, local20, arg1);
			local20 = local142;
			local22 = local153;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!qn;ZZLjava/lang/String;Z)V")
	public static void method1576(@OriginalArg(0) Class209 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		if (!arg2) {
			Static330.method4776(arg0, 3, arg3);
			return;
		}
		@Pc(24) String local24;
		if (Static325.aString41.startsWith("win") && Static325.anInt5594 != 3) {
			local24 = null;
			if (arg0.anApplet1 != null) {
				local24 = arg0.anApplet1.getParameter("haveie6");
			}
			if (local24 == null || !local24.equals("1")) {
				@Pc(44) Class122 local44 = Static330.method4776(arg0, 0, arg3);
				Static384.aString58 = arg3;
				Static257.aClass209_74 = arg0;
				Static77.aClass122_1 = local44;
				return;
			}
		}
		if (Static325.aString41.startsWith("mac")) {
			local24 = null;
			if (arg0.anApplet1 != null) {
				local24 = arg0.anApplet1.getParameter("havefirefox");
			}
			if (local24 != null && local24.equals("1") && arg1) {
				Static330.method4776(arg0, 1, arg3);
				return;
			}
		}
		Static330.method4776(arg0, 2, arg3);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILjava/awt/Component;Lclient!qn;)Lclient!wg;")
	public static Class2 method1577(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Class209 arg3) {
		if (Static275.anInt4927 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class2 local36 = (Class2) Class.forName("Class2_Sub1").getDeclaredConstructor().newInstance();
			local36.anInt421 = arg1;
			local36.anIntArray18 = new int[(Static314.aBoolean348 ? 2 : 1) * 256];
			local36.method357(arg2);
			local36.anInt414 = (arg1 & 0xFFFFFC00) + 1024;
			if (local36.anInt414 > 16384) {
				local36.anInt414 = 16384;
			}
			local36.method349(local36.anInt414);
			if (Static152.anInt3131 > 0 && Static295.aClass65_2 == null) {
				Static295.aClass65_2 = new Class65();
				Static295.aClass65_2.aClass209_34 = arg3;
				arg3.method4687(Static295.aClass65_2, Static152.anInt3131);
			}
			if (Static295.aClass65_2 != null) {
				if (Static295.aClass65_2.aClass2Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static295.aClass65_2.aClass2Array1[arg0] = local36;
			}
			return local36;
		} catch (@Pc(109) Throwable local109) {
			try {
				@Pc(115) Class2_Sub2 local115 = new Class2_Sub2(arg3, arg0);
				local115.anInt421 = arg1;
				local115.anIntArray18 = new int[(Static314.aBoolean348 ? 2 : 1) * 256];
				local115.method357(arg2);
				local115.anInt414 = 16384;
				local115.method349(local115.anInt414);
				if (Static152.anInt3131 > 0 && Static295.aClass65_2 == null) {
					Static295.aClass65_2 = new Class65();
					Static295.aClass65_2.aClass209_34 = arg3;
					arg3.method4687(Static295.aClass65_2, Static152.anInt3131);
				}
				if (Static295.aClass65_2 != null) {
					if (Static295.aClass65_2.aClass2Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static295.aClass65_2.aClass2Array1[arg0] = local115;
				}
				return local115;
			} catch (@Pc(179) Throwable local179) {
				return new Class2();
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[JI[Ljava/lang/Object;B)V")
	public static void method1578(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg2 + arg0) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) long local24 = arg1[local18];
		arg1[local18] = arg1[arg2];
		arg1[arg2] = local24;
		@Pc(38) Object local38 = arg3[local18];
		arg3[local18] = arg3[arg2];
		arg3[arg2] = local38;
		@Pc(58) int local58 = ~local24 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg0; local60 < arg2; local60++) {
			if (arg1[local60] < (long) (local60 & local58) + local24) {
				@Pc(81) long local81 = arg1[local60];
				arg1[local60] = arg1[local20];
				arg1[local20] = local81;
				@Pc(95) Object local95 = arg3[local60];
				arg3[local60] = arg3[local20];
				arg3[local20++] = local95;
			}
		}
		arg1[arg2] = arg1[local20];
		arg1[local20] = local24;
		arg3[arg2] = arg3[local20];
		arg3[local20] = local38;
		method1578(arg0, arg1, local20 - 1, arg3);
		method1578(local20 + 1, arg1, arg2, arg3);
	}
}
