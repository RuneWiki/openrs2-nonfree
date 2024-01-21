import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!q", name = "m", descriptor = "Lclient!rc;")
	public static Class3_Sub1_Sub14 aClass3_Sub1_Sub14_2;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1092 = Static75.method1216("mapedge");

	@OriginalMember(owner = "client!q", name = "x", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1097 = Static75.method1216("Add friend");

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1093 = aClass4_1097;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "[Lclient!ad;")
	public static Class4[] aClass4Array15 = new Class4[100];

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1094 = Static75.method1216("backbase2");

	@OriginalMember(owner = "client!q", name = "k", descriptor = "[I")
	public static int[] anIntArray245 = new int[128];

	@OriginalMember(owner = "client!q", name = "q", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1095 = Static75.method1216("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!q", name = "v", descriptor = "I")
	public static int anInt1934 = 0;

	@OriginalMember(owner = "client!q", name = "w", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1096 = Static75.method1216("backbase1");

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!td;II)V")
	public static void method1296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3) {
		if (Static4.anInt204 >= 400) {
			return;
		}
		if (arg2.anIntArray307 != null) {
			arg2 = arg2.method1676();
		}
		if (arg2 == null || !arg2.aBoolean214) {
			return;
		}
		@Pc(28) Class4 local28 = arg2.aClass4_1390;
		if (arg2.anInt2525 != 0) {
			local28 = Static60.method1012(new Class4[] { local28, Static5.method126(arg2.anInt2525, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2351), Static46.aClass4_1540, Static11.aClass4_1594, Static93.method1632(arg2.anInt2525), Static38.aClass4_1576 });
		}
		if (Static98.anInt2368 == 1) {
			Static62.method1082(Static60.method1012(new Class4[] { Static48.aClass4_630, Static89.aClass4_1155, local28 }), 63, Static9.aClass4_163, arg1, arg3, arg0);
		} else if (Static101.anInt2512 != 1) {
			@Pc(109) Class4[] local109 = arg2.aClass4Array19;
			if (Static15.aBoolean25) {
				local109 = Static82.method1292(local109);
			}
			@Pc(119) int local119;
			if (local109 != null) {
				for (local119 = 4; local119 >= 0; local119--) {
					if (local109[local119] != null && !local109[local119].method160(Static8.aClass4_156)) {
						@Pc(138) byte local138 = 0;
						if (local119 == 0) {
							local138 = 57;
						}
						if (local119 == 1) {
							local138 = 34;
						}
						if (local119 == 2) {
							local138 = 12;
						}
						if (local119 == 3) {
							local138 = 38;
						}
						if (local119 == 4) {
							local138 = 9;
						}
						Static62.method1082(Static60.method1012(new Class4[] { Static65.aClass4_832, local28 }), local138, local109[local119], arg1, arg3, arg0);
					}
				}
			}
			if (local109 != null) {
				for (local119 = 4; local119 >= 0; local119--) {
					if (local109[local119] != null && local109[local119].method160(Static8.aClass4_156)) {
						@Pc(220) int local220 = 0;
						@Pc(222) short local222 = 0;
						if (Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2351 < arg2.anInt2525) {
							local222 = 2000;
						}
						if (local119 == 0) {
							local220 = local222 + 57;
						}
						if (local119 == 1) {
							local220 = local222 + 34;
						}
						if (local119 == 2) {
							local220 = local222 + 12;
						}
						if (local119 == 3) {
							local220 = local222 + 38;
						}
						if (local119 == 4) {
							local220 = local222 + 9;
						}
						Static62.method1082(Static60.method1012(new Class4[] { Static65.aClass4_832, local28 }), local220, local109[local119], arg1, arg3, arg0);
					}
				}
			}
			Static62.method1082(Static60.method1012(new Class4[] { Static65.aClass4_832, local28 }), 1001, Static47.aClass4_602, arg1, arg3, arg0);
		} else if ((Static63.anInt1604 & 0x2) == 2) {
			Static62.method1082(Static60.method1012(new Class4[] { Static34.aClass4_519, Static89.aClass4_1155, local28 }), 5, Static92.aClass4_1188, arg1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIBIII)V")
	public static void method1297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(21) int local21 = Static38.aClass61_30.method1339(arg2, arg3, arg4);
		@Pc(33) int local33;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(45) int local45;
		@Pc(72) int local72;
		@Pc(78) int local78;
		if (local21 != 0) {
			local33 = Static38.aClass61_30.method1319(arg2, arg3, arg4, local21);
			local39 = local33 >> 6 & 0x3;
			local43 = local33 & 0x1F;
			local45 = arg1;
			@Pc(48) int[] local48 = Static5.aClass3_Sub1_Sub4_Sub2_6.anIntArray325;
			if (local21 > 0) {
				local45 = arg0;
			}
			local72 = arg3 * 4 + (-arg4 + 103) * 512 * 4 + 24624;
			local78 = local21 >> 14 & 0x7FFF;
			@Pc(82) Class3_Sub1_Sub5 local82 = Static38.method1911(local78);
			if (local82.anInt1519 == -1) {
				if (local43 == 0 || local43 == 2) {
					if (local39 == 0) {
						local48[local72] = local45;
						local48[local72 + 512] = local45;
						local48[local72 + 1024] = local45;
						local48[local72 + 1536] = local45;
					} else if (local39 == 1) {
						local48[local72] = local45;
						local48[local72 + 1] = local45;
						local48[local72 + 2] = local45;
						local48[local72 + 3] = local45;
					} else if (local39 == 2) {
						local48[local72 + 3] = local45;
						local48[local72 + 3 + 512] = local45;
						local48[local72 + 1027] = local45;
						local48[local72 + 1536 + 3] = local45;
					} else if (local39 == 3) {
						local48[local72 + 1536] = local45;
						local48[local72 + 1 + 1536] = local45;
						local48[local72 + 1538] = local45;
						local48[local72 + 3 + 1536] = local45;
					}
				}
				if (local43 == 3) {
					if (local39 == 0) {
						local48[local72] = local45;
					} else if (local39 == 1) {
						local48[local72 + 3] = local45;
					} else if (local39 == 2) {
						local48[local72 + 1536 + 3] = local45;
					} else if (local39 == 3) {
						local48[local72 + 1536] = local45;
					}
				}
				if (local43 == 2) {
					if (local39 == 3) {
						local48[local72] = local45;
						local48[local72 + 512] = local45;
						local48[local72 + 1024] = local45;
						local48[local72 + 1536] = local45;
					} else if (local39 == 0) {
						local48[local72] = local45;
						local48[local72 + 1] = local45;
						local48[local72 + 2] = local45;
						local48[local72 + 3] = local45;
					} else if (local39 == 1) {
						local48[local72 + 3] = local45;
						local48[local72 + 512 + 3] = local45;
						local48[local72 + 1024 + 3] = local45;
						local48[local72 + 1539] = local45;
					} else if (local39 == 2) {
						local48[local72 + 1536] = local45;
						local48[local72 + 1 + 1536] = local45;
						local48[local72 + 1536 + 2] = local45;
						local48[local72 + 1539] = local45;
					}
				}
			} else {
				@Pc(399) Class3_Sub1_Sub4_Sub3 local399 = Static48.aClass3_Sub1_Sub4_Sub3Array3[local82.anInt1519];
				if (local399 != null) {
					@Pc(412) int local412 = (local82.anInt1543 * 4 - local399.anInt2606) / 2;
					@Pc(422) int local422 = (local82.anInt1548 * 4 - local399.anInt2604) / 2;
					local399.method1771(local422 + arg3 * 4 + 48, 48 - -((-local82.anInt1543 + -arg4 + 104) * 4) - -local412);
				}
			}
		}
		local21 = Static38.aClass61_30.method1343(arg2, arg3, arg4);
		if (local21 != 0) {
			local45 = local21 >> 14 & 0x7FFF;
			local33 = Static38.aClass61_30.method1319(arg2, arg3, arg4, local21);
			local39 = local33 >> 6 & 0x3;
			@Pc(478) Class3_Sub1_Sub5 local478 = Static38.method1911(local45);
			local43 = local33 & 0x1F;
			@Pc(509) int local509;
			if (local478.anInt1519 != -1) {
				@Pc(588) Class3_Sub1_Sub4_Sub3 local588 = Static48.aClass3_Sub1_Sub4_Sub3Array3[local478.anInt1519];
				if (local588 != null) {
					local509 = (local478.anInt1543 * 4 - local588.anInt2606) / 2;
					local78 = (local478.anInt1548 * 4 - local588.anInt2604) / 2;
					local588.method1771(arg3 * 4 + local78 + 48, (104 - (arg4 + local478.anInt1543)) * 4 - -local509 + 48);
				}
			} else if (local43 == 9) {
				@Pc(492) int[] local492 = Static5.aClass3_Sub1_Sub4_Sub2_6.anIntArray325;
				local509 = arg3 * 4 + (-(arg4 * 512) + 52736) * 4 + 24624;
				local72 = 15658734;
				if (local21 > 0) {
					local72 = 15597568;
				}
				if (local39 == 0 || local39 == 2) {
					local492[local509 + 1536] = local72;
					local492[local509 + 1 + 1024] = local72;
					local492[local509 + 512 + 2] = local72;
					local492[local509 + 3] = local72;
				} else {
					local492[local509] = local72;
					local492[local509 + 512 + 1] = local72;
					local492[local509 + 1024 + 2] = local72;
					local492[local509 + 1536 + 3] = local72;
				}
			}
		}
		local21 = Static38.aClass61_30.method1335(arg2, arg3, arg4);
		if (local21 == 0) {
			return;
		}
		local33 = local21 >> 14 & 0x7FFF;
		@Pc(653) Class3_Sub1_Sub5 local653 = Static38.method1911(local33);
		if (local653.anInt1519 == -1) {
			return;
		}
		@Pc(662) Class3_Sub1_Sub4_Sub3 local662 = Static48.aClass3_Sub1_Sub4_Sub3Array3[local653.anInt1519];
		if (local662 != null) {
			local45 = (local653.anInt1548 * 4 - local662.anInt2604) / 2;
			@Pc(684) int local684 = (local653.anInt1543 * 4 - local662.anInt2606) / 2;
			local662.method1771(arg3 * 4 + local45 + 48, local684 + (-local653.anInt1543 + 104 + -arg4) * 4 + 48);
			return;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public static void method1298() {
		aClass3_Sub1_Sub14_2 = null;
		aClass4_1096 = null;
		anIntArray245 = null;
		aClass4_1095 = null;
		aClass4_1092 = null;
		aClass4Array15 = null;
		aClass4_1097 = null;
		aClass4_1094 = null;
		aClass4_1093 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1299(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static5.aClass68_1);
		arg0.removeFocusListener(Static5.aClass68_1);
	}
}
