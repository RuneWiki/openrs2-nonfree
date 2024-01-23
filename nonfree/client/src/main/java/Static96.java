import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!gj", name = "M", descriptor = "[[Lclient!rg;")
	public static Class151[][] aClass151ArrayArray1;

	@OriginalMember(owner = "client!gj", name = "S", descriptor = "[Lclient!qi;")
	public static Class81[] aClass81Array2;

	@OriginalMember(owner = "client!gj", name = "P", descriptor = "Z")
	public static boolean aBoolean144 = false;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V")
	public static void method1437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17;
		@Pc(47) int local47;
		if (Static153.anInt2895 == 0) {
			@Pc(13) int local13 = Static152.anInt2870;
			@Pc(15) int local15 = Static136.anInt2620;
			local17 = Static183.anInt3645;
			@Pc(30) int local30 = local13 + (local15 - local13) * (arg5 - arg2) / arg3;
			@Pc(32) int local32 = Static181.anInt3567;
			local47 = (arg1 - arg0) * (local32 - local17) / arg4 + local17;
			if (Static39.aBoolean56 && (Static75.anInt1408 & 0x40) != 0) {
				@Pc(91) Class151 local91 = Static114.method5019(Static296.anInt5869, Static63.anInt1200);
				if (local91 == null) {
					Static178.method2939();
				} else {
					Static167.method2784((short) 32, " ->", local47, Static269.anInt5498, Static26.aString14, 0L, local30);
				}
			} else {
				if (Static47.anInt5990 == 1) {
					Static167.method2784((short) 33, "", local47, -1, Static183.aString130, 0L, local30);
				}
				Static167.method2784((short) 49, "", local47, -1, Static54.aString40, 0L, local30);
			}
		}
		@Pc(108) long local108 = -1L;
		for (local17 = 0; local17 < Static120.anInt2259; local17++) {
			@Pc(121) long local121 = Static88.aLongArray4[local17];
			local47 = (int) local121 & 0x7F;
			@Pc(133) int local133 = (int) local121 >> 7 & 0x7F;
			@Pc(140) int local140 = (int) local121 >> 29 & 0x3;
			@Pc(147) int local147 = Integer.MAX_VALUE & (int) (local121 >>> 32);
			if (local121 != local108) {
				local108 = local121;
				@Pc(266) int local266;
				@Pc(290) int local290;
				if (local140 == 2 && Static181.method3048(Static99.anInt1826, local47, local133, local121)) {
					@Pc(173) Class49 local173 = Static175.method2874(local147);
					if (local173.anIntArray131 != null) {
						local173 = local173.method1112();
					}
					if (local173 == null) {
						continue;
					}
					if (Static153.anInt2895 == 1) {
						Static167.method2784((short) 34, Static246.aString173 + " -> <col=00ffff>" + local173.aString56, local133, Static270.anInt5516, Static149.aString103, local121, local47);
					} else if (Static39.aBoolean56) {
						@Pc(200) Class3_Sub4_Sub6 local200 = Static78.anInt1479 == -1 ? null : Static6.method109(Static78.anInt1479);
						if ((Static75.anInt1408 & 0x4) != 0 && (local200 == null || local173.method1122(Static78.anInt1479, local200.anInt1108) != local200.anInt1108)) {
							Static167.method2784((short) 18, Static286.aString205 + " -> <col=00ffff>" + local173.aString56, local133, Static269.anInt5498, Static26.aString14, local121, local47);
						}
					} else {
						@Pc(255) String[] local255 = local173.aStringArray12;
						if (Static208.aBoolean293) {
							local255 = Static113.method1828(local255);
						}
						if (local255 != null) {
							for (local266 = 4; local266 >= 0; local266--) {
								if (local255[local266] != null) {
									@Pc(281) short local281 = 0;
									if (local266 == 0) {
										local281 = 28;
									}
									local290 = -1;
									if (local266 == 1) {
										local281 = 45;
									}
									if (local173.anInt1328 == local266) {
										local290 = local173.anInt1336;
									}
									if (local266 == local173.anInt1345) {
										local290 = local173.anInt1348;
									}
									if (local266 == 2) {
										local281 = 46;
									}
									if (local266 == 3) {
										local281 = 41;
									}
									if (local266 == 4) {
										local281 = 1001;
									}
									Static167.method2784(local281, "<col=00ffff>" + local173.aString56, local133, local290, local255[local266], local121, local47);
								}
							}
						}
						Static167.method2784((short) 1012, "<col=00ffff>" + local173.aString56, local133, Static229.anInt4480, Static181.aString126, (long) local173.anInt1376, local47);
					}
				}
				@Pc(499) Class10_Sub5_Sub2 local499;
				@Pc(522) int local522;
				@Pc(532) int local532;
				@Pc(538) int local538;
				@Pc(465) int local465;
				@Pc(481) int local481;
				@Pc(576) Class10_Sub5_Sub1 local576;
				if (local140 == 1) {
					@Pc(409) Class10_Sub5_Sub2 local409 = Static110.aClass10_Sub5_Sub2Array1[local147];
					if ((local409.aClass124_1.anInt3781 & 0x1) == 0 && (local409.anInt5073 & 0x7F) == 0 && (local409.anInt5016 & 0x7F) == 0 || (local409.aClass124_1.anInt3781 & 0x1) == 1 && (local409.anInt5073 & 0x7F) == 64 && (local409.anInt5016 & 0x7F) == 64) {
						local465 = local409.anInt5073 - (local409.aClass124_1.anInt3781 << 6);
						local266 = local409.anInt5016 - (local409.aClass124_1.anInt3781 << 6);
						local481 = local409.aClass124_1.anInt3781 << 7;
						if (Static141.aBoolean201) {
							for (local290 = 0; local290 < Static118.anInt2202; local290++) {
								local499 = Static110.aClass10_Sub5_Sub2Array1[Static253.anIntArray547[local290]];
								if (local499 != null && !local499.aBoolean353 && local499 != local409 && local499.aBoolean351) {
									local522 = local499.anInt5073 - (local499.aClass124_1.anInt3781 << 6);
									local532 = local499.anInt5016 - (local499.aClass124_1.anInt3781 << 6);
									local538 = local499.aClass124_1.anInt3781 << 7;
									if (Static75.method1161(local266, local465, local538, local538, local532, local522, local481, local481)) {
										Static14.method227(local133, Static253.anIntArray547[local290], local47, local499.aClass124_1);
										local499.aBoolean353 = true;
									}
								}
							}
							for (local290 = 0; local290 < Static152.anInt2869; local290++) {
								local576 = Static52.aClass10_Sub5_Sub1Array1[Static102.anIntArray188[local290]];
								if (local576 != null && !local576.aBoolean353 && local576.aBoolean351) {
									local522 = local576.anInt5073 - (local576.method4186() << 6);
									local532 = local576.anInt5016 - (local576.method4186() << 6);
									local538 = local576.method4186() << 7;
									if (Static75.method1161(local266, local465, local538, local538, local532, local522, local481, local481)) {
										Static101.method1609(local576, local133, local47, Static102.anIntArray188[local290]);
										local576.aBoolean353 = true;
									}
								}
							}
						}
					}
					if (local409.aBoolean353) {
						continue;
					}
					Static14.method227(local133, local147, local47, local409.aClass124_1);
					local409.aBoolean353 = true;
				}
				if (local140 == 0) {
					@Pc(658) Class10_Sub5_Sub1 local658 = Static52.aClass10_Sub5_Sub1Array1[local147];
					if ((local658.anInt5073 & 0x7F) == 64 && (local658.anInt5016 & 0x7F) == 64) {
						local465 = local658.anInt5073 - (local658.method4186() << 6);
						local266 = local658.anInt5016 - (local658.method4186() << 6);
						local481 = local658.method4186() << 7;
						if (Static141.aBoolean201) {
							for (local290 = 0; local290 < Static118.anInt2202; local290++) {
								local499 = Static110.aClass10_Sub5_Sub2Array1[Static253.anIntArray547[local290]];
								if (local499 != null && !local499.aBoolean353 && local499.aBoolean351) {
									local538 = local499.aClass124_1.anInt3781 << 7;
									local532 = local499.anInt5016 - (local499.aClass124_1.anInt3781 << 6);
									local522 = local499.anInt5073 - (local499.aClass124_1.anInt3781 << 6);
									if (Static75.method1161(local266, local465, local538, local538, local532, local522, local481, local481)) {
										Static14.method227(local133, Static253.anIntArray547[local290], local47, local499.aClass124_1);
										local499.aBoolean353 = true;
									}
								}
							}
							for (local290 = 0; local290 < Static152.anInt2869; local290++) {
								local576 = Static52.aClass10_Sub5_Sub1Array1[Static102.anIntArray188[local290]];
								if (local576 != null && !local576.aBoolean353 && local576 != local658 && local576.aBoolean351) {
									local522 = local576.anInt5073 - (local576.method4186() << 6);
									local532 = local576.anInt5016 - (local576.method4186() << 6);
									local538 = local576.method4186() << 7;
									if (Static75.method1161(local266, local465, local538, local538, local532, local522, local481, local481)) {
										Static101.method1609(local576, local133, local47, Static102.anIntArray188[local290]);
										local576.aBoolean353 = true;
									}
								}
							}
						}
					}
					if (local658.aBoolean353) {
						continue;
					}
					Static101.method1609(local658, local133, local47, local147);
					local658.aBoolean353 = true;
				}
				if (local140 == 3) {
					@Pc(875) Class56 local875 = Static223.aClass56ArrayArrayArray1[Static99.anInt1826][local47][local133];
					if (local875 != null) {
						for (@Pc(882) Class3_Sub4_Sub13 local882 = (Class3_Sub4_Sub13) local875.method1275(); local882 != null; local882 = (Class3_Sub4_Sub13) local875.method1269()) {
							local266 = local882.aClass10_Sub2_1.anInt365;
							@Pc(892) Class21 local892 = Static133.method2309(local266);
							if (Static153.anInt2895 == 1) {
								Static167.method2784((short) 4, Static246.aString173 + " -> <col=ff9040>" + local892.aString18, local133, Static270.anInt5516, Static149.aString103, (long) local266, local47);
							} else if (Static39.aBoolean56) {
								@Pc(906) Class3_Sub4_Sub6 local906 = Static78.anInt1479 == -1 ? null : Static6.method109(Static78.anInt1479);
								if ((Static75.anInt1408 & 0x1) != 0 && (local906 == null || local892.method442(local906.anInt1108, Static78.anInt1479) != local906.anInt1108)) {
									Static167.method2784((short) 39, Static286.aString205 + " -> <col=ff9040>" + local892.aString18, local133, Static269.anInt5498, Static26.aString14, (long) local266, local47);
								}
							} else {
								@Pc(962) String[] local962 = local892.aStringArray7;
								if (Static208.aBoolean293) {
									local962 = Static113.method1828(local962);
								}
								for (@Pc(970) int local970 = 4; local970 >= 0; local970--) {
									if (local962 != null && local962[local970] != null) {
										@Pc(985) byte local985 = 0;
										local532 = -1;
										if (local970 == 0) {
											local985 = 38;
										}
										if (local970 == 1) {
											local985 = 5;
										}
										if (local970 == 2) {
											local985 = 25;
										}
										if (local892.anInt510 == local970) {
											local532 = local892.anInt512;
										}
										if (local970 == 3) {
											local985 = 60;
										}
										if (local892.anInt506 == local970) {
											local532 = local892.anInt516;
										}
										if (local970 == 4) {
											local985 = 23;
										}
										Static167.method2784(local985, "<col=ff9040>" + local892.aString18, local133, local532, local962[local970], (long) local266, local47);
									}
								}
								Static167.method2784((short) 1010, "<col=ff9040>" + local892.aString18, local133, Static229.anInt4480, Static181.aString126, (long) local266, local47);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(IB)Lclient!ec;")
	public static Class40 method1438(@OriginalArg(0) int arg0) {
		@Pc(14) Class40 local14 = (Class40) Static178.aClass98_29.method2570((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(29) byte[] local29 = Static311.aClass155_123.method4121(36, arg0);
		local14 = new Class40();
		local14.anInt1171 = arg0;
		if (local29 != null) {
			local14.method983(new Class3_Sub26(local29));
		}
		Static178.aClass98_29.method2568(local14, (long) arg0);
		return local14;
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(III)I")
	public static int method1440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class3_Sub16 local10 = (Class3_Sub16) Static49.aClass30_5.method663((long) arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && local10.anIntArray294.length > arg1) {
			return local10.anIntArray294[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BZLjava/lang/Object;)[B")
	public static byte[] method1441(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(16) byte[] local16 = (byte[]) arg1;
			return arg0 ? Static93.method1383(local16) : local16;
		} else if (arg1 instanceof Class73) {
			@Pc(37) Class73 local37 = (Class73) arg1;
			return local37.method2618();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
