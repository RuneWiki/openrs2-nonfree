import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
	public static int anInt1950;

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "Lclient!wd;")
	public static Class8_Sub1_Sub7 aClass8_Sub1_Sub7_4;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	public static int anInt1952 = 0;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "Z")
	public static boolean aBoolean139 = true;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!lk;)V")
	public static void method1486(@OriginalArg(1) Class36_Sub3 arg0) {
		arg0.aBoolean330 = false;
		@Pc(17) Class76 local17;
		if (arg0.anInt4067 != -1) {
			local17 = Static115.method1855(arg0.anInt4067);
			if (local17 == null || local17.anIntArray159 == null) {
				arg0.anInt4067 = -1;
			} else {
				arg0.anInt4097++;
				if (local17.anIntArray159.length > arg0.anInt4104 && local17.anIntArray158[arg0.anInt4104] < arg0.anInt4097) {
					arg0.anInt4097 = 1;
					arg0.anInt4122++;
					arg0.anInt4104++;
					Static184.method2846(arg0 == Static21.aClass36_Sub3_Sub1_1, arg0.anInt4104, arg0.anInt4117, local17, arg0.anInt4118);
				}
				if (arg0.anInt4104 >= local17.anIntArray159.length) {
					arg0.anInt4097 = 0;
					arg0.anInt4104 = 0;
					Static184.method2846(arg0 == Static21.aClass36_Sub3_Sub1_1, arg0.anInt4104, arg0.anInt4117, local17, arg0.anInt4118);
				}
				arg0.anInt4122 = arg0.anInt4104 + 1;
				if (arg0.anInt4122 >= local17.anIntArray159.length) {
					arg0.anInt4122 = 0;
				}
			}
		}
		@Pc(169) Class76 local169;
		if (arg0.anInt4125 != -1 && arg0.anInt4149 <= Static183.anInt3590) {
			@Pc(153) Class144 local153 = Static81.method1346(arg0.anInt4125);
			@Pc(156) int local156 = local153.anInt4680;
			if (local156 == -1) {
				arg0.anInt4125 = -1;
			} else {
				label302: {
					local169 = Static115.method1855(local156);
					if (local153.aBoolean374) {
						if (local169.anInt2225 == 3) {
							if (arg0.anInt4090 > 0 && Static183.anInt3590 >= arg0.anInt4078 && Static183.anInt3590 > arg0.anInt4096) {
								arg0.anInt4125 = -1;
								break label302;
							}
						} else if (local169.anInt2225 == 1 && arg0.anInt4090 > 0 && Static183.anInt3590 >= arg0.anInt4078 && Static183.anInt3590 > arg0.anInt4096) {
							arg0.anInt4149 = Static183.anInt3590 + 1;
							break label302;
						}
					}
					if (local169 == null || local169.anIntArray159 == null) {
						arg0.anInt4125 = -1;
					} else {
						if (arg0.anInt4127 < 0) {
							arg0.anInt4127 = 0;
							Static184.method2846(Static21.aClass36_Sub3_Sub1_1 == arg0, 0, arg0.anInt4117, local169, arg0.anInt4118);
						}
						arg0.anInt4070++;
						if (arg0.anInt4127 < local169.anIntArray159.length && local169.anIntArray158[arg0.anInt4127] < arg0.anInt4070) {
							arg0.anInt4127++;
							arg0.anInt4070 = 1;
							Static184.method2846(Static21.aClass36_Sub3_Sub1_1 == arg0, arg0.anInt4127, arg0.anInt4117, local169, arg0.anInt4118);
						}
						if (local169.anIntArray159.length <= arg0.anInt4127) {
							if (local153.aBoolean374) {
								arg0.anInt4127 -= local169.anInt2214;
								arg0.anInt4094++;
								if (arg0.anInt4094 >= local169.anInt2215) {
									arg0.anInt4125 = -1;
								} else if (arg0.anInt4127 >= 0 && local169.anIntArray159.length > arg0.anInt4127) {
									Static184.method2846(arg0 == Static21.aClass36_Sub3_Sub1_1, arg0.anInt4127, arg0.anInt4117, local169, arg0.anInt4118);
								} else {
									arg0.anInt4125 = -1;
								}
							} else {
								arg0.anInt4125 = -1;
							}
						}
						arg0.anInt4124 = arg0.anInt4127 + 1;
						if (local169.anIntArray159.length <= arg0.anInt4124) {
							if (local153.aBoolean374) {
								arg0.anInt4124 -= local169.anInt2214;
								if (arg0.anInt4094 + 1 >= local169.anInt2215) {
									arg0.anInt4124 = -1;
								} else if (arg0.anInt4124 < 0 || arg0.anInt4124 >= local169.anIntArray159.length) {
									arg0.anInt4124 = -1;
								}
							} else {
								arg0.anInt4124 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4107 != -1 && arg0.anInt4113 <= 1) {
			local17 = Static115.method1855(arg0.anInt4107);
			if (local17.anInt2225 == 3) {
				if (arg0.anInt4090 > 0 && Static183.anInt3590 >= arg0.anInt4078 && arg0.anInt4096 < Static183.anInt3590) {
					arg0.anInt4107 = -1;
				}
			} else if (local17.anInt2225 == 1 && arg0.anInt4090 > 0 && Static183.anInt3590 >= arg0.anInt4078 && Static183.anInt3590 > arg0.anInt4096) {
				arg0.anInt4113 = 1;
			}
		}
		if (arg0.anInt4107 != -1 && arg0.anInt4113 == 0) {
			local17 = Static115.method1855(arg0.anInt4107);
			if (local17 == null || local17.anIntArray159 == null) {
				arg0.anInt4107 = -1;
			} else {
				arg0.anInt4132++;
				if (arg0.anInt4103 < local17.anIntArray159.length && arg0.anInt4132 > local17.anIntArray158[arg0.anInt4103]) {
					arg0.anInt4103++;
					arg0.anInt4132 = 1;
					Static184.method2846(arg0 == Static21.aClass36_Sub3_Sub1_1, arg0.anInt4103, arg0.anInt4117, local17, arg0.anInt4118);
				}
				if (arg0.anInt4103 >= local17.anIntArray159.length) {
					arg0.anInt4103 -= local17.anInt2214;
					arg0.anInt4085++;
					if (local17.anInt2215 <= arg0.anInt4085) {
						arg0.anInt4107 = -1;
					} else if (arg0.anInt4103 >= 0 && arg0.anInt4103 < local17.anIntArray159.length) {
						Static184.method2846(arg0 == Static21.aClass36_Sub3_Sub1_1, arg0.anInt4103, arg0.anInt4117, local17, arg0.anInt4118);
					} else {
						arg0.anInt4107 = -1;
					}
				}
				arg0.anInt4120 = arg0.anInt4103 + 1;
				if (local17.anIntArray159.length <= arg0.anInt4120) {
					arg0.anInt4120 -= local17.anInt2214;
					if (arg0.anInt4085 + 1 >= local17.anInt2215) {
						arg0.anInt4120 = -1;
					} else if (arg0.anInt4120 < 0 || arg0.anInt4120 >= local17.anIntArray159.length) {
						arg0.anInt4120 = -1;
					}
				}
				arg0.aBoolean330 = local17.aBoolean175;
			}
		}
		if (arg0.anInt4113 > 0) {
			arg0.anInt4113--;
		}
		for (@Pc(737) int local737 = 0; local737 < arg0.aClass83Array3.length; local737++) {
			@Pc(751) Class83 local751 = arg0.aClass83Array3[local737];
			if (local751 != null) {
				if (local751.anInt2344 > 0) {
					local751.anInt2344--;
				} else {
					local169 = Static115.method1855(local751.anInt2347);
					if (local169 == null || local169.anIntArray159 == null) {
						arg0.aClass83Array3[local737] = null;
					} else {
						local751.anInt2340++;
						if (local751.anInt2341 < local169.anIntArray159.length && local751.anInt2340 > local169.anIntArray158[local751.anInt2341]) {
							local751.anInt2341++;
							local751.anInt2340 = 1;
							Static184.method2846(Static21.aClass36_Sub3_Sub1_1 == arg0, local751.anInt2341, arg0.anInt4117, local169, arg0.anInt4118);
						}
						if (local751.anInt2341 >= local169.anIntArray159.length) {
							local751.anInt2345++;
							local751.anInt2341 -= local169.anInt2214;
							if (local169.anInt2215 <= local751.anInt2345) {
								arg0.aClass83Array3[local737] = null;
							} else if (local751.anInt2341 >= 0 && local751.anInt2341 < local169.anIntArray159.length) {
								Static184.method2846(arg0 == Static21.aClass36_Sub3_Sub1_1, local751.anInt2341, arg0.anInt4117, local169, arg0.anInt4118);
							} else {
								arg0.aClass83Array3[local737] = null;
							}
						}
						local751.anInt2343 = local751.anInt2341 + 1;
						if (local751.anInt2343 >= local169.anIntArray159.length) {
							local751.anInt2343 -= local169.anInt2214;
							if (local751.anInt2345 + 1 >= local169.anInt2215) {
								local751.anInt2343 = -1;
							} else if (local751.anInt2343 < 0 || local169.anIntArray159.length <= local751.anInt2343) {
								local751.anInt2343 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public static void method1488() {
		Static188.aClass129_20 = new Class129(32);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZI)V")
	public static void method1489(@OriginalArg(1) int arg0) {
		@Pc(8) Class8_Sub1_Sub6 local8 = Static181.method2779(1, arg0);
		local8.method929();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
	public static void method1490() {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < 104; local17++) {
			for (@Pc(24) int local24 = 0; local24 < 104; local24++) {
				if (Static269.method3758(true, local7, local24, Static178.aClass8_Sub27ArrayArrayArray1, local17)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V")
	public static void method1491() {
		Static270.aClass61_51.method1381(5);
		Static222.aClass61_42.method1381(5);
		Static156.aClass61_26.method1381(5);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIILclient!eh;Lclient!eh;IIIIJ)V")
	public static void method1492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class36 arg4, @OriginalArg(5) Class36 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class141 local6 = new Class141();
		local6.aLong166 = arg10;
		local6.anInt4610 = arg1 * 128 + 64;
		local6.anInt4612 = arg2 * 128 + 64;
		local6.anInt4618 = arg3;
		local6.aClass36_8 = arg4;
		local6.aClass36_9 = arg5;
		local6.anInt4617 = arg6;
		local6.anInt4615 = arg7;
		local6.anInt4613 = arg8;
		local6.anInt4607 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static178.aClass8_Sub27ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static178.aClass8_Sub27ArrayArrayArray1[local46][arg1][arg2] = new Class8_Sub27(local46, arg1, arg2);
			}
		}
		Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2].aClass141_1 = local6;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBII)V")
	public static void method1494(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			Static66.aClass8_Sub2_Sub1_4.method2398(160);
			Static66.aClass8_Sub2_Sub1_4.method2340(5);
		}
		if (arg2 == 1) {
			Static66.aClass8_Sub2_Sub1_4.method2398(186);
			Static66.aClass8_Sub2_Sub1_4.method2340(19);
		}
		Static66.aClass8_Sub2_Sub1_4.method2356(Static36.aBooleanArray2[82] ? 1 : 0);
		Static66.aClass8_Sub2_Sub1_4.method2363(arg0 + Static130.anInt2601);
		Static66.aClass8_Sub2_Sub1_4.method2366(arg1 + Static49.anInt1089);
		Static67.anInt1466 = arg0;
		Static292.anInt5659 = arg1;
	}
}
