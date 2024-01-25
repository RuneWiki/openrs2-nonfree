import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "U", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ah", name = "Y", descriptor = "Lclient!bu;")
	public static Class32 aClass32_3;

	@OriginalMember(owner = "client!ah", name = "H", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_7 = new Class119(102, 8);

	@OriginalMember(owner = "client!ah", name = "K", descriptor = "Z")
	public static boolean aBoolean15 = true;

	@OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
	public static int anInt191 = 0;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
	public static void method111() {
		for (@Pc(6) int local6 = 0; local6 < Static51.anInt1367; local6++) {
			@Pc(11) int local11 = Static444.anIntArray524[local6];
			@Pc(15) Class7_Sub2_Sub3_Sub1 local15 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local11];
			@Pc(19) int local19 = Static237.aClass3_Sub7_Sub1_1.method2582();
			if ((local19 & 0x20) != 0) {
				local19 += Static237.aClass3_Sub7_Sub1_1.method2582() << 8;
			}
			if ((local19 & 0x200) != 0) {
				local15.aByte80 = Static237.aClass3_Sub7_Sub1_1.method2609();
				local15.aByte81 = Static237.aClass3_Sub7_Sub1_1.method2619();
				local15.aByte78 = Static237.aClass3_Sub7_Sub1_1.method2609();
				local15.aByte79 = (byte) Static237.aClass3_Sub7_Sub1_1.method2639();
				local15.anInt4361 = Static253.anInt4787 + Static237.aClass3_Sub7_Sub1_1.method2593();
				local15.anInt4365 = Static253.anInt4787 + Static237.aClass3_Sub7_Sub1_1.method2588();
			}
			if ((local19 & 0x800) != 0) {
				local15.anInt681 = Static237.aClass3_Sub7_Sub1_1.method2635();
				local15.anInt687 = Static237.aClass3_Sub7_Sub1_1.method2598();
			}
			if ((local19 & 0x2) != 0) {
				if (local15.aClass47_1.method1240()) {
					Static152.method2472(local15);
				}
				local15.method454(Static364.aClass96_2.method2199(Static237.aClass3_Sub7_Sub1_1.method2588()));
				local15.method3515(local15.aClass47_1.anInt1616);
				local15.anInt4363 = local15.aClass47_1.anInt1592 << 3;
				if (local15.aClass47_1.method1240()) {
					Static387.method5032(local15.aByte77, 0, null, local15.anIntArray288[0], null, local15, local15.anIntArray287[0]);
				}
			}
			if ((local19 & 0x4) != 0) {
				local15.anInt4332 = Static237.aClass3_Sub7_Sub1_1.method2593();
				if (local15.anInt4332 == 65535) {
					local15.anInt4332 = -1;
				}
			}
			@Pc(181) int local181;
			@Pc(185) int local185;
			if ((local19 & 0x40) != 0) {
				local181 = Static237.aClass3_Sub7_Sub1_1.method2638();
				local185 = Static237.aClass3_Sub7_Sub1_1.method2639();
				local15.method3502(local181, Static253.anInt4787, local185);
			}
			if ((local19 & 0x2000) != 0) {
				local15.anInt4372 = Static237.aClass3_Sub7_Sub1_1.method2612();
				local15.anInt4343 = Static237.aClass3_Sub7_Sub1_1.method2630();
				local15.anInt4378 = Static237.aClass3_Sub7_Sub1_1.method2612();
				local15.anInt4394 = Static237.aClass3_Sub7_Sub1_1.method2630();
				local15.anInt4339 = Static237.aClass3_Sub7_Sub1_1.method2593() + Static253.anInt4787;
				local15.anInt4398 = Static237.aClass3_Sub7_Sub1_1.method2593() + Static253.anInt4787;
				local15.anInt4393 = Static237.aClass3_Sub7_Sub1_1.method2582();
				local15.anInt4372 += local15.anIntArray287[0];
				local15.anInt4403 = 0;
				local15.anInt4378 += local15.anIntArray287[0];
				local15.anInt4343 += local15.anIntArray288[0];
				local15.anInt4404 = 1;
				local15.anInt4394 += local15.anIntArray288[0];
			}
			if ((local19 & 0x10) != 0) {
				local181 = Static237.aClass3_Sub7_Sub1_1.method2635();
				if (local181 == 65535) {
					local181 = -1;
				}
				local185 = Static237.aClass3_Sub7_Sub1_1.method2582();
				Static293.method4127(local15, local181, local185);
			}
			if ((local19 & 0x100) != 0) {
				local181 = Static237.aClass3_Sub7_Sub1_1.method2582();
				@Pc(317) int[] local317 = new int[local181];
				@Pc(320) int[] local320 = new int[local181];
				@Pc(323) int[] local323 = new int[local181];
				for (@Pc(325) int local325 = 0; local325 < local181; local325++) {
					@Pc(330) int local330 = Static237.aClass3_Sub7_Sub1_1.method2598();
					if (local330 == 65535) {
						local330 = -1;
					}
					local317[local325] = local330;
					local320[local325] = Static237.aClass3_Sub7_Sub1_1.method2582();
					local323[local325] = Static237.aClass3_Sub7_Sub1_1.method2588();
				}
				Static306.method4282(local320, local15, local323, local317);
			}
			if ((local19 & 0x80) != 0) {
				local15.aString35 = Static237.aClass3_Sub7_Sub1_1.method2620();
				local15.anInt4335 = 100;
			}
			@Pc(402) int local402;
			if ((local19 & 0x8) != 0) {
				local181 = Static237.aClass3_Sub7_Sub1_1.method2593();
				local185 = Static237.aClass3_Sub7_Sub1_1.method2596();
				if (local181 == 65535) {
					local181 = -1;
				}
				local402 = Static237.aClass3_Sub7_Sub1_1.method2637();
				local15.method3500(local402, local181, local185, false);
			}
			if ((local19 & 0x400) != 0) {
				local181 = Static237.aClass3_Sub7_Sub1_1.method2593();
				if (local181 == 65535) {
					local181 = -1;
				}
				local185 = Static237.aClass3_Sub7_Sub1_1.method2632();
				local402 = Static237.aClass3_Sub7_Sub1_1.method2582();
				local15.method3500(local402, local181, local185, true);
			}
			if ((local19 & 0x1) != 0) {
				local181 = Static237.aClass3_Sub7_Sub1_1.method2638();
				local185 = Static237.aClass3_Sub7_Sub1_1.method2584();
				local15.method3502(local181, Static253.anInt4787, local185);
				local15.anInt4344 = Static253.anInt4787 + 300;
				local15.anInt4376 = Static237.aClass3_Sub7_Sub1_1.method2637();
			}
			if ((local19 & 0x1000) != 0) {
				local181 = Static237.aClass3_Sub7_Sub1_1.method2588();
				local15.anInt4383 = Static237.aClass3_Sub7_Sub1_1.method2639();
				local15.anInt4358 = Static237.aClass3_Sub7_Sub1_1.method2582();
				local15.aBoolean377 = (local181 & 0x8000) != 0;
				local15.anInt4337 = local181 & 0x7FFF;
				local15.anInt4334 = local15.anInt4383 + local15.anInt4337 + Static253.anInt4787;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!qa;IIIIIZLclient!c;IIILclient!kf;II)Lclient!c;")
	public static Class9 method113(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class9 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class128 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg7 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg11 != null) {
			local11 = arg11.method3181(false, arg8, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(55) long local55 = ((long) arg9 << 32) + (long) (arg2 + (arg3 << 16) + (arg13 << 24)) + ((long) arg4 << 48);
		@Pc(57) Class126 local57 = Static101.aClass126_58;
		@Pc(65) Class9 local65;
		synchronized (Static101.aClass126_58) {
			local65 = (Class9) Static101.aClass126_58.method3141(local55);
		}
		@Pc(159) int local159;
		@Pc(165) int local165;
		@Pc(171) int local171;
		@Pc(175) int local175;
		if (local65 == null || arg0.method5501(local65.n(), local11) != 0) {
			if (local65 != null) {
				local11 = arg0.method5492(local11, local65.n());
			}
			@Pc(100) byte local100;
			if (arg2 == 1) {
				local100 = 9;
			} else if (arg2 == 2) {
				local100 = 12;
			} else if (arg2 == 3) {
				local100 = 15;
			} else if (arg2 == 4) {
				local100 = 18;
			} else {
				local100 = 21;
			}
			@Pc(134) int[] local134 = new int[] { 64, 96, 128 };
			@Pc(152) Class161 local152 = new Class161(local100 * 3 + 1, 2 * 3 * local100 + -local100, 0);
			local159 = local152.method3827(0, 0, 0);
			@Pc(163) int[][] local163 = new int[3][local100];
			@Pc(177) int local177;
			@Pc(201) int local201;
			for (local165 = 0; local165 < 3; local165++) {
				local171 = local134[local165];
				local175 = local134[local165];
				for (local177 = 0; local177 < local100; local177++) {
					@Pc(185) int local185 = (local177 << 14) / local100;
					@Pc(193) int local193 = local171 * Class3_Sub2_Sub17.anIntArray289[local185] >> 15;
					local201 = local175 * Class3_Sub2_Sub17.anIntArray290[local185] >> 15;
					local163[local165][local177] = local152.method3827(local193, 0, local201);
				}
			}
			for (local171 = 0; local171 < 3; local171++) {
				local175 = (local171 * 256 + 128) / 3;
				local177 = 256 - local175;
				@Pc(248) byte local248 = (byte) (local177 * arg3 + arg13 * local175 >> 8);
				@Pc(293) short local293 = (short) ((local175 * (arg4 & 0x380) + (arg9 & 0x380) * local177 & 0x38000) + ((arg4 & 0xFC00) * local175 + (arg9 & 0xFC00) * local177 & 0xFC0000) + ((arg4 & 0x7F) * local175 + local177 * (arg9 & 0x7F) & 0x7F00) >> 8);
				for (local201 = 0; local201 < local100; local201++) {
					if (local171 == 0) {
						local152.method3821(local163[0][local201], local248, local293, (byte) 1, local159, (short) -1, local163[0][(local201 + 1) % local100], (byte) -1);
					} else {
						local152.method3821(local163[local171][(local201 + 1) % local100], local248, local293, (byte) 1, local163[local171 - 1][local201], (short) -1, local163[local171 - 1][(local201 + 1) % local100], (byte) -1);
						local152.method3821(local163[local171][local201], local248, local293, (byte) 1, local163[local171 - 1][local201], (short) -1, local163[local171][(local201 + 1) % local100], (byte) -1);
					}
				}
			}
			local65 = arg0.method5537(local152, local11, Static151.anInt3052, 64, 768);
			@Pc(414) Class126 local414 = Static101.aClass126_58;
			synchronized (Static101.aClass126_58) {
				Static101.aClass126_58.method3132(local55, local65);
			}
		}
		@Pc(433) int local433 = (arg2 << 6) - 1;
		@Pc(436) int local436 = -local433;
		@Pc(439) int local439 = -local433;
		@Pc(441) int local441 = local433;
		local159 = local433;
		if (arg6) {
			if (arg1 > 9216 && arg1 < 15360) {
				local441 = local433 + 128;
			}
			if (arg1 > 5120 && arg1 < 11264) {
				local159 = local433 + 128;
			}
			if (arg1 > 1024 && arg1 < 7168) {
				local436 -= 128;
			}
			if (arg1 > 13312 || arg1 < 3072) {
				local439 -= 128;
			}
		}
		@Pc(486) int local486 = arg7.la();
		local165 = arg7.VA();
		local171 = arg7.X();
		local175 = arg7.C();
		if (local436 > local486) {
			local486 = local436;
		}
		if (local439 > local171) {
			local171 = local439;
		}
		if (local165 > local441) {
			local165 = local441;
		}
		if (local159 < local175) {
			local175 = local159;
		}
		@Pc(529) Class3_Sub4_Sub16 local529 = null;
		if (arg11 != null) {
			@Pc(536) int local536 = arg11.anIntArray252[arg8];
			local529 = Static301.aClass170_3.method3928(local536 >> 16);
			arg8 = local536 & 0xFFFF;
		}
		if (local529 == null) {
			local65 = local65.method5699((byte) 3, local11, true);
			local65.XA(local165 - local486 >> 1, 128, local175 - local171 >> 1);
			local65.ja(local165 + local486 >> 1, 0, local175 + local171 >> 1);
		} else {
			local65 = local65.method5699((byte) 3, local11, true);
			local65.XA(local165 - local486 >> 1, 128, local175 - local171 >> 1);
			local65.ja(local165 + local486 >> 1, 0, local171 + local175 >> 1);
			local65.method5698(local529, arg8);
		}
		if (arg5 != 0) {
			local65.WA(arg5);
		}
		if (arg10 != 0) {
			local65.o(arg10);
		}
		if (arg12 != 0) {
			local65.ja(0, arg12, 0);
		}
		return local65;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(III)Z")
	public static boolean method114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(CI)Z")
	public static boolean method115(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
	public static void method116() {
		Static375.aClass3_Sub14_3 = new Class3_Sub14(Static368.aClass189_201.method4262(Static53.anInt1454), "", Static25.anInt849, 1001, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[B)Lclient!dj;")
	public static Class3_Sub4_Sub7 method117(@OriginalArg(1) byte[] arg0) {
		@Pc(7) Class3_Sub4_Sub7 local7 = new Class3_Sub4_Sub7();
		@Pc(12) Class3_Sub7 local12 = new Class3_Sub7(arg0);
		local12.anInt3235 = local12.aByteArray46.length - 2;
		@Pc(23) int local23 = local12.method2588();
		@Pc(34) int local34 = local12.aByteArray46.length - local23 - 2 - 12;
		local12.anInt3235 = local34;
		@Pc(48) int local48 = local12.method2589();
		local7.anInt1791 = local12.method2588();
		local7.anInt1793 = local12.method2588();
		local7.anInt1794 = local12.method2588();
		local7.anInt1790 = local12.method2588();
		@Pc(72) int local72 = local12.method2582();
		@Pc(80) int local80;
		@Pc(85) int local85;
		if (local72 > 0) {
			local7.aClass11Array1 = new Class11[local72];
			for (local80 = 0; local80 < local72; local80++) {
				local85 = local12.method2588();
				@Pc(92) Class11 local92 = new Class11(Static288.method4088(local85));
				local7.aClass11Array1[local80] = local92;
				while (local85-- > 0) {
					@Pc(104) int local104 = local12.method2589();
					@Pc(108) int local108 = local12.method2589();
					local92.method319(new Class3_Sub34(local108), (long) local104);
				}
			}
		}
		local12.anInt3235 = 0;
		local7.aString8 = local12.method2631();
		local7.anIntArray107 = new int[local48];
		local7.aStringArray11 = new String[local48];
		local7.anIntArray108 = new int[local48];
		local80 = 0;
		while (local34 > local12.anInt3235) {
			local85 = local12.method2588();
			if (local85 == 3) {
				local7.aStringArray11[local80] = local12.method2620().intern();
			} else if (local85 >= 100 || local85 == 21 || local85 == 38 || local85 == 39) {
				local7.anIntArray108[local80] = local12.method2582();
			} else {
				local7.anIntArray108[local80] = local12.method2589();
			}
			local7.anIntArray107[local80++] = local85;
		}
		return local7;
	}
}
