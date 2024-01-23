import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
	public static int anInt2057;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "[I")
	public static int[] anIntArray214;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
	public static int anInt2063;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!kb;I)V")
	public static void method1533(@OriginalArg(0) Class83 arg0) {
		Static271.anInt5844 = arg0.method2322("p11_full");
		Static204.anInt4558 = arg0.method2322("p12_full");
		Static171.anInt3868 = arg0.method2322("b12_full");
		Static14.anInt388 = arg0.method2322("mapfunction");
		Static202.anInt4502 = arg0.method2322("hitmarks");
		Static86.anInt2029 = arg0.method2322("hitbar_default");
		Static61.anInt1560 = arg0.method2322("headicons_pk");
		Static14.anInt391 = arg0.method2322("headicons_prayer");
		Static161.anInt3717 = arg0.method2322("hint_headicons");
		Static3.anInt106 = arg0.method2322("hint_mapmarkers");
		Static52.anInt1406 = arg0.method2322("mapflag");
		Static92.anInt2147 = arg0.method2322("cross");
		Static224.anInt4944 = arg0.method2322("mapdots");
		Static246.anInt5374 = arg0.method2322("scrollbar");
		Static152.anInt3528 = arg0.method2322("name_icons");
		Static229.anInt5078 = arg0.method2322("floorshadows");
		Static229.anInt5088 = arg0.method2322("compass");
		Static52.anInt1407 = arg0.method2322("hint_mapedge");
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!hl;ILclient!hl;)V")
	public static void method1534(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_230 != null) {
			arg1.method4742();
		}
		arg1.aClass1_231 = arg0;
		arg1.aClass1_230 = arg0.aClass1_230;
		arg1.aClass1_230.aClass1_231 = arg1;
		arg1.aClass1_231.aClass1_230 = arg1;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1535(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static222.method3915(Static94.method4774(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BII)I")
	public static int method1536(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static247.method4247(arg1 - 1, arg0 + -1) + Static247.method4247(arg1 + 1, arg0 + -1) + Static247.method4247(arg1 + -1, arg0 + 1) + Static247.method4247(arg1 + 1, arg0 + 1);
		@Pc(78) int local78 = Static247.method4247(arg1 - 1, arg0) + Static247.method4247(arg1 + 1, arg0) + Static247.method4247(arg1, arg0 + -1) + Static247.method4247(arg1, arg0 + 1);
		@Pc(85) int local85 = Static247.method4247(arg1, arg0);
		return local85 / 4 + local39 / 16 + local78 / 8;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIBIIII)V")
	public static void method1537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 - arg2 >= Static102.anInt2239 && Static88.anInt2052 >= arg3 + arg2 && Static152.anInt3532 <= arg4 - arg2 && Static223.anInt1245 >= arg4 + arg2) {
			Static282.method4668(arg2, arg0, arg5, arg3, arg1, arg4);
		} else {
			Static61.method1190(arg2, arg5, arg1, arg0, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[IIII)V")
	public static void method1538(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(8) int local8 = arg1 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (local11 > arg2) {
			@Pc(16) int local16 = arg2 + 1;
			arg0[local16] = arg3;
			@Pc(21) int local21 = local16 + 1;
			arg0[local21] = arg3;
			@Pc(26) int local26 = local21 + 1;
			arg0[local26] = arg3;
			@Pc(31) int local31 = local26 + 1;
			arg0[local31] = arg3;
			@Pc(36) int local36 = local31 + 1;
			arg0[local36] = arg3;
			@Pc(41) int local41 = local36 + 1;
			arg0[local41] = arg3;
			@Pc(46) int local46 = local41 + 1;
			arg0[local46] = arg3;
			arg2 = local46 + 1;
			arg0[arg2] = arg3;
		}
		while (local8 > arg2) {
			arg2++;
			arg0[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!tf;)V")
	public static void method1539(@OriginalArg(0) Class152 arg0) {
		for (@Pc(2) int local2 = arg0.anInt5509; local2 <= arg0.anInt5510; local2++) {
			for (@Pc(9) int local9 = arg0.anInt5519; local9 <= arg0.anInt5512; local9++) {
				@Pc(22) Class1_Sub14 local22 = Static132.aClass1_Sub14ArrayArrayArray2[arg0.anInt5515][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.anInt2332; local26++) {
						if (local22.aClass152Array1[local26] == arg0) {
							local22.anInt2332--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt2332; local44++) {
								local22.aClass152Array1[local44] = local22.aClass152Array1[local44 + 1];
								local22.anIntArray234[local44] = local22.anIntArray234[local44 + 1];
							}
							local22.aClass152Array1[local22.anInt2332] = null;
							break;
						}
					}
					local22.anInt2333 = 0;
					for (local26 = 0; local26 < local22.anInt2332; local26++) {
						local22.anInt2333 |= local22.anIntArray234[local26];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)V")
	public static void method1540(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static120.method2661(arg2, arg0, null, -1, arg1);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIILclient!ch;IZI)Z")
	public static boolean method1541(@OriginalArg(2) int arg0, @OriginalArg(3) Class30 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(10) Class126 local10 = Static75.method1384(arg1.anInt828);
		if (local10.anInt4628 == -1) {
			return true;
		}
		if (arg1.aBoolean55) {
			@Pc(24) int local24 = arg3 + arg1.anInt862;
			arg3 = local24 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(39) Class7_Sub1 local39 = local10.method3681(arg1.aBoolean50, arg3);
		if (local39 == null) {
			return false;
		}
		@Pc(53) int local53 = arg1.anInt848;
		@Pc(56) int local56 = local39.anInt5424;
		@Pc(59) int local59 = local39.anInt5425;
		@Pc(62) int local62 = arg1.anInt863;
		if ((arg3 & 0x1) == 1) {
			local62 = arg1.anInt848;
			local53 = arg1.anInt863;
		}
		if (local10.aBoolean244) {
			local56 = local53 * 4;
			local59 = local62 * 4;
		}
		if (local10.anInt4635 == 0) {
			local39.method129(arg2 * 4 + 48, (104 - arg0 - local62) * 4 + 48, local56, local59);
		} else {
			local39.method128(arg2 * 4 + 48, 48 - -((-local62 + 104 + -arg0) * 4), local56, local59, local10.anInt4635);
		}
		return true;
	}
}
