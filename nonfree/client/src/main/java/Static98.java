import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "[I")
	public static int[] anIntArray525;

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
	public static int anInt6646;

	@OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
	public static int anInt6647;

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "[I")
	public static int[] anIntArray526;

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Lclient!dm;")
	public static Class53 aClass53_3 = new Class53();

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
	public static int anInt6644 = 0;

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
	public static int anInt6645 = -1;

	@OriginalMember(owner = "client!gd", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString246 = "red:";

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)Lclient!tl;")
	public static Class117 method5501() {
		try {
			return (Class117) Class.forName("Class117_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(20) Throwable local20) {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)Lclient!vp;")
	public static Class4_Sub1_Sub21 method5502(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub1_Sub21 local10 = (Class4_Sub1_Sub21) Static157.aClass15_5.method356((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static221.aClass11_86.method288(arg0, 11);
		local10 = new Class4_Sub1_Sub21();
		if (local25 != null) {
			local10.method5557(new Class4_Sub7(local25));
		}
		Static157.aClass15_5.method352((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIBI)I")
	public static int method5503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class4_Sub4_Sub25.anIntArray383[arg3 * 8192 / arg0] >> 1;
		return (local16 * arg1 >> 16) + (arg2 * (65536 - local16) >> 16);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!vm;Lclient!ir;Lclient!nj;)V")
	public static void method5504(@OriginalArg(1) Class92 arg0, @OriginalArg(2) Class4_Sub20 arg1, @OriginalArg(3) Class139 arg2) {
		@Pc(10) Class60 local10 = arg2.method3654(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5679();
		if (local10.method5687() > local16) {
			local16 = local10.method5687();
		}
		@Pc(28) int local28 = arg1.anInt3078;
		@Pc(31) int local31 = arg1.anInt3084;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(74) int local74;
		if (arg2.aString156 != null) {
			local33 = Static259.aClass106_8.method2875(arg2.aString156, null, null, Static344.aStringArray46);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static344.aStringArray46[local51];
				if (local33 - 1 > local51) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local74 = Static135.aClass147_4.method3908(local57);
				if (local74 > local35) {
					local35 = local74;
				}
			}
			local37 = local33 * Static135.aClass147_4.method3910() + Static135.aClass147_4.method3907() / 2;
		}
		local51 = local16 / 2 + arg1.anInt3078;
		if (local28 < Static42.anInt2444 + local16) {
			local28 = Static42.anInt2444;
			local51 = Static42.anInt2444 + local16 / 2 + local35 / 2 + 5 + 10;
		} else if (Static42.anInt2435 - local16 < local28) {
			local51 = Static42.anInt2435 - local16 / 2 - local35 / 2 - 10 - 5;
			local28 = Static42.anInt2435 - local16;
		}
		@Pc(162) int local162 = arg1.anInt3084;
		if (local31 < Static42.anInt2442 + local16) {
			local162 = Static42.anInt2442 + local16 / 2 + 10;
			local31 = Static42.anInt2442;
		} else if (local31 > Static42.anInt2436 - local16) {
			local31 = Static42.anInt2436 - local16;
			local162 = Static42.anInt2436 - local37 - local16 / 2 - 10;
		}
		local74 = (int) (Math.atan2((double) (local28 - arg1.anInt3078), (double) (local31 - arg1.anInt3084)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5685((float) local28 + (float) local16 / 2.0F, (float) local31 + (float) local16 / 2.0F, 4096, local74);
		@Pc(244) int local244 = -2;
		@Pc(246) int local246 = -2;
		@Pc(248) int local248 = -2;
		@Pc(250) int local250 = -2;
		if (arg2.aString156 != null) {
			local246 = local162;
			local244 = local51 - local35 / 2 - 5;
			local250 = local162 + Static135.aClass147_4.method3910() * local33 + 3;
			local248 = local35 + local244 + 10;
			if (arg2.anInt4382 != 0) {
				arg0.method4502(local162, local248 - local244, local244, local250 - local162, arg2.anInt4382);
			}
			if (arg2.anInt4364 != 0) {
				arg0.method4522(local250 - local162, local248 - local244, local244, local162, arg2.anInt4364);
			}
			for (@Pc(318) int local318 = 0; local318 < local33; local318++) {
				@Pc(324) String local324 = Static344.aStringArray46[local318];
				if (local33 - 1 > local318) {
					local324 = local324.substring(0, local324.length() - 4);
				}
				Static135.aClass147_4.method3913(arg0, local324, local51, local162, arg2.anInt4378);
				local162 += Static135.aClass147_4.method3910();
			}
		}
		local16 >>= 0x1;
		if ((local28 - local16 >= Static38.anInt830 || local16 + local28 <= Static38.anInt830 || local31 - local16 >= Static184.anInt4055 || local16 + local31 <= Static184.anInt4055) && (local244 >= Static38.anInt830 || Static38.anInt830 >= local248 || local246 >= Static184.anInt4055 || Static184.anInt4055 >= local250)) {
			return;
		}
		if (arg2.aStringArray35[4] != null) {
			Static285.method4888(0, arg2.aString158, (long) arg1.anInt3082, -1, arg2.aStringArray35[4], 0, 1005);
		}
		if (arg2.aStringArray35[3] != null) {
			Static285.method4888(0, arg2.aString158, (long) arg1.anInt3082, -1, arg2.aStringArray35[3], 0, 1008);
		}
		if (arg2.aStringArray35[2] != null) {
			Static285.method4888(0, arg2.aString158, (long) arg1.anInt3082, -1, arg2.aStringArray35[2], 0, 1004);
		}
		if (arg2.aStringArray35[1] != null) {
			Static285.method4888(0, arg2.aString158, (long) arg1.anInt3082, -1, arg2.aStringArray35[1], 0, 1012);
		}
		if (arg2.aStringArray35[0] != null) {
			Static285.method4888(0, arg2.aString158, (long) arg1.anInt3082, -1, arg2.aStringArray35[0], 0, 1009);
			return;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!vm;Lclient!wm;IIIZ)V")
	public static void method5505(@OriginalArg(1) Class92 arg0, @OriginalArg(2) Class78 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg5) {
			Static115.aClass60_10.method5675((Static202.anInt4258 - Static115.aClass60_10.method5683()) / 2, (Static38.anInt832 - Static115.aClass60_10.method5691()) / 2);
			Static333.aClass60_2.method5675((Static202.anInt4258 - Static333.aClass60_2.method5683()) / 2, 18);
		}
		arg1.method4072(Static269.anInt5508 == 1 ? Static37.aString26 : Static44.aString31, Static202.anInt4258 / 2, arg3, -1, Static38.anInt832 / 2 - 26);
		@Pc(58) int local58 = Static38.anInt832 / 2 - 18;
		arg0.method4495(Static202.anInt4258 / 2 - 152, local58, 304, 34, arg2, 0);
		arg0.method4495(Static202.anInt4258 / 2 - 151, local58 + 1, 302, 32, 0, 0);
		arg0.method4436(Static202.anInt4258 / 2 - 150, local58 + 2, Static345.anInt6761 * 3, 30, arg4, 0);
		arg0.method4436(Static345.anInt6761 * 3 + Static202.anInt4258 / 2 - 150, local58 + 2, 300 - Static345.anInt6761 * 3, 30, 0, 0);
		arg1.method4072(Static100.aString77, Static202.anInt4258 / 2, arg3, -1, Static38.anInt832 / 2 + 4);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(ZI)I")
	public static int method5506(@OriginalArg(1) int arg0) {
		if (Static131.aClass171_3 != null) {
			Static131.aClass171_3.method4637();
			Static131.aClass171_3 = null;
		}
		Static166.anInt3695++;
		if (Static166.anInt3695 > 4) {
			Static166.anInt3695 = 0;
			Static131.anInt2971 = 0;
			return arg0;
		}
		Static131.anInt2971 = 0;
		if (Static5.anInt152 == Static109.anInt2399) {
			Static109.anInt2399 = Static294.anInt3990;
		} else {
			Static109.anInt2399 = Static5.anInt152;
		}
		return -1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([I[I[ILclient!c;Z)V")
	public static void method5509(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class2_Sub2_Sub1_Sub1 arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) int local13 = arg2[local7];
			@Pc(17) int local17 = arg1[local7];
			@Pc(21) int local21 = arg0[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && local23 < arg3.aClass186Array3.length) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg3.aClass186Array3[local23] = null;
					} else {
						@Pc(40) Class116 local40 = Static340.method5560(local13);
						@Pc(43) int local43 = local40.anInt3739;
						@Pc(48) Class186 local48 = arg3.aClass186Array3[local23];
						if (local48 != null) {
							if (local13 == local48.anInt5820) {
								if (local43 == 0) {
									local48 = arg3.aClass186Array3[local23] = null;
								} else if (local43 == 1) {
									local48.anInt5815 = 0;
									local48.anInt5825 = 0;
									local48.anInt5816 = local21;
									local48.anInt5818 = 1;
									local48.anInt5819 = 0;
									Static291.method4975(Static110.aClass2_Sub2_Sub1_Sub1_1 == arg3, local40, 0, arg3.anInt6465, arg3.anInt6466);
								} else if (local43 == 2) {
									local48.anInt5815 = 0;
								}
							} else if (local40.anInt3749 >= Static340.method5560(local48.anInt5820).anInt3749) {
								local48 = arg3.aClass186Array3[local23] = null;
							}
						}
						if (local48 == null) {
							local48 = arg3.aClass186Array3[local23] = new Class186();
							local48.anInt5825 = 0;
							local48.anInt5820 = local13;
							local48.anInt5816 = local21;
							local48.anInt5815 = 0;
							local48.anInt5819 = 0;
							local48.anInt5818 = 1;
							Static291.method4975(Static110.aClass2_Sub2_Sub1_Sub1_1 == arg3, local40, 0, arg3.anInt6465, arg3.anInt6466);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}
}
