import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!df", name = "A", descriptor = "I")
	public static int anInt1814;

	@OriginalMember(owner = "client!df", name = "E", descriptor = "I")
	public static int anInt1817;

	@OriginalMember(owner = "client!df", name = "w", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_24 = new Class67("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!df", name = "G", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_43 = new Class133(3, 6);

	@OriginalMember(owner = "client!df", name = "H", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method1705(@OriginalArg(0) Class5 arg0) {
		if (Static179.anInt4933 < 2 && !Static506.aBoolean659 || Static166.aClass245_12 != null) {
			return;
		}
		@Pc(44) String local44;
		if (Static506.aBoolean659 && Static179.anInt4933 < 2) {
			local44 = Static88.aString19 + Static142.aClass67_40.method1934(Static193.anInt7803) + Static117.aString29 + " ->";
		} else if (Static37.aBoolean72 && Static364.aClass101_1.method2589(81) && Static179.anInt4933 > 2) {
			local44 = Static409.method6186((Class3_Sub11) Static255.aClass71_43.aClass3_73.aClass3_283.aClass3_283);
		} else {
			@Pc(73) Class3_Sub11 local73 = (Class3_Sub11) Static255.aClass71_43.aClass3_73.aClass3_283;
			local44 = Static409.method6186(local73);
			@Pc(79) int[] local79 = null;
			if (Static95.method1856(local73.anInt1419)) {
				local79 = Static99.aClass96_7.method2508((int) local73.aLong48).anIntArray132;
			} else if (local73.anInt1422 != -1) {
				local79 = Static99.aClass96_7.method2508(local73.anInt1422).anIntArray132;
			} else if (Static153.method2639(local73.anInt1419)) {
				@Pc(163) Class3_Sub3 local163 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local73.aLong48);
				if (local163 != null) {
					@Pc(168) Class6_Sub1_Sub2_Sub2 local168 = local163.aClass6_Sub1_Sub2_Sub2_1;
					@Pc(171) Class230 local171 = local168.aClass230_1;
					if (local171.anIntArray627 != null) {
						local171 = local171.method5898(Static127.aClass215_1);
					}
					if (local171 != null) {
						local79 = local171.anIntArray629;
					}
				}
			} else if (Static359.method5619(local73.anInt1419)) {
				@Pc(128) Class242 local128;
				if (local73.anInt1419 == 1008) {
					local128 = Static454.aClass298_3.method7185((int) local73.aLong48);
				} else {
					local128 = Static454.aClass298_3.method7185((int) (local73.aLong48 >>> 32 & 0x7FFFFFFFL));
				}
				if (local128.anIntArray632 != null) {
					local128 = local128.method5975(Static127.aClass215_1);
				}
				if (local128 != null) {
					local79 = local128.anIntArray636;
				}
			}
			if (local79 != null) {
				local44 = local44 + Static180.method3434(local79);
			}
		}
		if (Static179.anInt4933 > 2) {
			local44 = local44 + "<col=ffffff> / " + (Static179.anInt4933 - 2) + Static377.aClass67_118.method1934(Static193.anInt7803);
		}
		if (Static496.aClass245_15 != null) {
			@Pc(227) Class59 local227 = Static496.aClass245_15.method6015(arg0);
			if (local227 == null) {
				local227 = Static294.aClass59_2;
			}
			local227.method7267(Static518.anInt1786, Static525.aClass119Array16, Static496.aClass245_15.anInt7229, Static496.aClass245_15.anInt7281, Static482.aRandom1, Static496.aClass245_15.anInt7249, Static260.anIntArray466, Static496.aClass245_15.anInt7222, Static447.anIntArray693, Static496.aClass245_15.anInt7296, Static496.aClass245_15.anInt7269, Static30.anInt2584, Static337.anInt6396, local44);
			Static33.method833(Static447.anIntArray693[0], Static447.anIntArray693[1], Static447.anIntArray693[3], Static447.anIntArray693[2]);
		} else if (Static398.aClass245_14 != null && Static8.aClass44_1 == Static222.aClass44_2) {
			@Pc(292) int local292 = Static294.aClass59_2.method7279(Static216.anInt2086 + 16, local44, Static30.anInt2584, Static482.aRandom1, Static489.anInt8713 + 4, Static525.aClass119Array16, Static260.anIntArray466);
			Static33.method833(Static489.anInt8713 + 4, Static216.anInt2086, 16, Static25.aClass53_6.method1378(local44) + local292);
		}
	}

	@OriginalMember(owner = "client!df", name = "j", descriptor = "(I)V")
	public static void method1706() {
		for (@Pc(10) Class3_Sub10_Sub15 local10 = (Class3_Sub10_Sub15) Static436.aClass71_60.method2089(); local10 != null; local10 = (Class3_Sub10_Sub15) Static436.aClass71_60.method2086()) {
			@Pc(16) Class6_Sub1_Sub3 local16 = local10.aClass6_Sub1_Sub3_1;
			if (local16.anInt2855 < Static223.anInt4829) {
				local10.method7820();
				local16.method2453();
			} else if (local16.anInt2853 <= Static223.anInt4829) {
				if (local16.anInt2871 > 0) {
					@Pc(49) Class3_Sub3 local49 = (Class3_Sub3) Static240.aClass267_20.method6644((long) (local16.anInt2871 - 1));
					if (local49 != null) {
						@Pc(54) Class6_Sub1_Sub2_Sub2 local54 = local49.aClass6_Sub1_Sub2_Sub2_1;
						if (local54.anInt8811 >= 0 && local54.anInt8811 < Static118.anInt2527 * 512 && local54.anInt8813 >= 0 && local54.anInt8813 < Static549.anInt9482 * 512) {
							local16.method2451(local54.anInt8811, Static58.method1166(local54.anInt8813, local54.anInt8811, local16.aByte100) - local16.anInt2874, Static223.anInt4829, local54.anInt8813);
						}
					}
				}
				if (local16.anInt2871 < 0) {
					@Pc(107) int local107 = -local16.anInt2871 - 1;
					@Pc(112) Class6_Sub1_Sub2_Sub1 local112;
					if (Static342.anInt6448 == local107) {
						local112 = Static111.aClass6_Sub1_Sub2_Sub1_3;
					} else {
						local112 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local107];
					}
					if (local112 != null && local112.anInt8811 >= 0 && local112.anInt8811 < Static118.anInt2527 * 512 && local112.anInt8813 >= 0 && local112.anInt8813 < Static549.anInt9482 * 512) {
						local16.method2451(local112.anInt8811, Static58.method1166(local112.anInt8813, local112.anInt8811, local16.aByte100) - local16.anInt2874, Static223.anInt4829, local112.anInt8813);
					}
				}
				local16.method2458(Static276.anInt5695);
				Static483.method7135(local16, true);
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 >= Static190.anInt4314 && arg0 <= Static145.anInt2941 && Static269.anInt5577 <= arg2 && Static81.anInt1788 >= arg1) {
			method1708(arg6, arg0, arg1, arg4, arg5, arg2, arg3);
		} else {
			Static385.method5948(arg4, arg5, arg6, arg3, arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIZIII)V")
	private static void method1708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg5 + arg3;
		@Pc(14) int local14 = arg2 - arg3;
		for (@Pc(16) int local16 = arg5; local16 < local10; local16++) {
			Static257.method4540(Static68.anIntArrayArray24[local16], arg6, arg0, arg1);
		}
		@Pc(38) int local38 = arg3 + arg0;
		for (@Pc(40) int local40 = arg2; local40 > local14; local40--) {
			Static257.method4540(Static68.anIntArrayArray24[local40], arg6, arg0, arg1);
		}
		@Pc(59) int local59 = arg1 - arg3;
		for (@Pc(67) int local67 = local10; local67 <= local14; local67++) {
			@Pc(73) int[] local73 = Static68.anIntArrayArray24[local67];
			Static257.method4540(local73, arg6, arg0, local38);
			Static257.method4540(local73, arg4, local38, local59);
			Static257.method4540(local73, arg6, local59, arg1);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZZ)Z")
	public static boolean method1709(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)Z")
	public static boolean method1710(@OriginalArg(0) int arg0) {
		return arg0 == 50 || arg0 == 13 || arg0 == 1003 || arg0 == 20 || arg0 == 58;
	}
}
