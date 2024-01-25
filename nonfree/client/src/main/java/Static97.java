import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	public static int anInt2175 = 0;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_78 = new Class217(95, 7);

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "[C")
	public static final char[] aCharArray13 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_72 = new Class106("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_73 = new Class106("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt2177 = -1;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "[B")
	public static final byte[] aByteArray40 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method2089(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(18) int local18 = 0;
		@Pc(24) int local24 = arg0 ? 32768 : 0;
		@Pc(32) int local32 = (arg0 ? Static174.anInt3641 : Static270.anInt5274) + local24;
		for (@Pc(34) int local34 = local24; local34 < local32; local34++) {
			@Pc(40) Class1_Sub4_Sub16 local40 = Static113.method2414(local34);
			if (local40.aBoolean274 && local40.method3422().toLowerCase().indexOf(local8) != -1) {
				if (local18 >= 50) {
					Static171.aShortArray76 = null;
					Static126.anInt2758 = -1;
					return;
				}
				if (local18 >= local11.length) {
					@Pc(75) short[] local75 = new short[local11.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local18; local77++) {
						local75[local77] = local11[local77];
					}
					local11 = local75;
				}
				local11[local18++] = (short) local34;
			}
		}
		Static171.aShortArray76 = local11;
		Static126.anInt2758 = local18;
		Static105.anInt2399 = 0;
		@Pc(110) String[] local110 = new String[Static126.anInt2758];
		for (@Pc(112) int local112 = 0; local112 < Static126.anInt2758; local112++) {
			local110[local112] = Static113.method2414(local11[local112]).method3422();
		}
		Static176.method5670(Static171.aShortArray76, local110);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIILclient!fp;IIII)V")
	public static void method2090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class63 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(11) Interface4 local11 = (Interface4) Static342.method5727(arg6, arg2, arg7);
		@Pc(23) Class71 local23;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(39) int local39;
		if (local11 != null) {
			local23 = Static219.method4081(local11.method5927());
			local29 = local11.method5922() & 0x3;
			local33 = local11.method5925();
			if (local23.anInt2368 == -1) {
				local39 = arg0;
				if (local23.anInt2377 > 0) {
					local39 = arg5;
				}
				if (local33 == 0 || local33 == 2) {
					if (local29 == 0) {
						arg4.method4644(arg3, 4, local39, arg1);
					} else if (local29 == 1) {
						arg4.method4615(arg3, local39, 4, arg1);
					} else if (local29 == 2) {
						arg4.method4644(arg3 + 3, 4, local39, arg1);
					} else if (local29 == 3) {
						arg4.method4615(arg3, local39, 4, arg1 + 3);
					}
				}
				if (local33 == 3) {
					if (local29 == 0) {
						arg4.method4639(arg1, arg3, 1, local39, 1);
					} else if (local29 == 1) {
						arg4.method4639(arg1, arg3 + 3, 1, local39, 1);
					} else if (local29 == 2) {
						arg4.method4639(arg1 + 3, arg3 + 3, 1, local39, 1);
					} else if (local29 == 3) {
						arg4.method4639(arg1 + 3, arg3, 1, local39, 1);
					}
				}
				if (local33 == 2) {
					if (local29 == 0) {
						arg4.method4615(arg3, local39, 4, arg1);
					} else if (local29 == 1) {
						arg4.method4644(arg3 + 3, 4, local39, arg1);
					} else if (local29 == 2) {
						arg4.method4615(arg3, local39, 4, arg1 + 3);
					} else if (local29 == 3) {
						arg4.method4644(arg3, 4, local39, arg1);
					}
				}
			} else {
				Static74.method1620(local29, arg3, arg1, arg4, local23);
			}
		}
		local11 = (Interface4) Static138.method2791(arg6, arg2, arg7, jb.class);
		if (local11 != null) {
			local23 = Static219.method4081(local11.method5927());
			local29 = local11.method5922() & 0x3;
			local33 = local11.method5925();
			if (local23.anInt2368 != -1) {
				Static74.method1620(local29, arg3, arg1, arg4, local23);
			} else if (local33 == 9) {
				local39 = -1118482;
				if (local23.anInt2377 > 0) {
					local39 = -1179648;
				}
				if (local29 == 0 || local29 == 2) {
					arg4.method4619(local39, arg3, arg1, arg1 + 3, arg3 + 3);
				} else {
					arg4.method4619(local39, arg3, arg1 + 3, arg1, arg3 + 3);
				}
			}
		}
		local11 = (Interface4) Static109.method2324(arg6, arg2, arg7);
		if (local11 == null) {
			return;
		}
		local23 = Static219.method4081(local11.method5927());
		local29 = local11.method5922() & 0x3;
		if (local23.anInt2368 != -1) {
			Static74.method1620(local29, arg3, arg1, arg4, local23);
			return;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)V")
	public static void method2091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			Static280.method5009(Static339.aClass18_200);
		}
		if (arg0 == 1) {
			Static280.method5009(Static228.aClass18_155);
		}
		Static339.aClass1_Sub7_Sub2_4.method2121(Static271.aClass60_2.method1863(82) ? 1 : 0);
		Static339.aClass1_Sub7_Sub2_4.method2138(arg2 + Static299.anInt4036);
		Static339.aClass1_Sub7_Sub2_4.method2144(arg1 + Static50.anInt1271);
		anInt2177 = arg2;
		Static237.anInt2678 = arg1;
		Static361.aBoolean508 = false;
		Static56.method1386();
	}
}
