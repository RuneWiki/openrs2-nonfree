import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	public static int anInt2154 = 0;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	public static void method1596() {
		@Pc(9) Class129 local9 = Static88.aClass129_14;
		synchronized (Static88.aClass129_14) {
			Static88.aClass129_14.method3025();
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!it;)V")
	public static void method1597(@OriginalArg(1) Class4_Sub2_Sub2 arg0) {
		arg0.aBoolean560 = false;
		@Pc(19) Class46 local19;
		if (arg0.anInt6458 != -1) {
			local19 = Static9.aClass194_1.method4371(arg0.anInt6458);
			if (local19 == null || local19.anIntArray90 == null) {
				arg0.aBoolean561 = false;
				arg0.anInt6458 = -1;
			} else {
				label394: {
					arg0.anInt6494++;
					if (local19.anIntArray90.length > arg0.anInt6452 && local19.anIntArray89[arg0.anInt6452] < arg0.anInt6494) {
						arg0.anInt6494 = 1;
						arg0.anInt6452++;
						arg0.anInt6520++;
						Static4.method137(local19, arg0.anInt6452, arg0.anInt7111, arg0.aByte92, arg0.anInt7117, Static231.aClass4_Sub2_Sub2_Sub1_2 == arg0);
					}
					if (local19.anIntArray90.length <= arg0.anInt6452) {
						arg0.anInt6494 = 0;
						arg0.anInt6452 = 0;
						if (arg0.aBoolean561) {
							arg0.anInt6458 = arg0.method5131().method223();
							if (arg0.anInt6458 == -1) {
								arg0.aBoolean561 = false;
								break label394;
							}
							local19 = Static9.aClass194_1.method4371(arg0.anInt6458);
						}
						Static4.method137(local19, arg0.anInt6452, arg0.anInt7111, arg0.aByte92, arg0.anInt7117, arg0 == Static231.aClass4_Sub2_Sub2_Sub1_2);
					}
					arg0.anInt6520 = arg0.anInt6452 + 1;
					if (local19.anIntArray90.length <= arg0.anInt6520) {
						arg0.anInt6520 = 0;
					}
				}
			}
		}
		@Pc(184) int local184;
		@Pc(192) Class46 local192;
		@Pc(181) Class77 local181;
		if (arg0.anInt6449 != -1 && Static164.anInt3206 >= arg0.anInt6488) {
			local181 = Static137.aClass16_2.method251(arg0.anInt6449);
			local184 = local181.anInt2238;
			if (local184 == -1) {
				arg0.anInt6449 = -1;
			} else {
				label396: {
					local192 = Static9.aClass194_1.method4371(local184);
					if (local181.aBoolean191) {
						if (local192.anInt1765 == 3) {
							if (arg0.anInt6525 > 0 && Static164.anInt3206 >= arg0.anInt6463 && Static164.anInt3206 > arg0.anInt6457) {
								arg0.anInt6449 = -1;
								break label396;
							}
						} else if (local192.anInt1765 == 1 && arg0.anInt6525 > 0 && arg0.anInt6463 <= Static164.anInt3206 && Static164.anInt3206 > arg0.anInt6457) {
							arg0.anInt6488 = Static164.anInt3206 + 1;
							break label396;
						}
					}
					if (local192 == null || local192.anIntArray90 == null) {
						arg0.anInt6449 = -1;
					} else {
						if (arg0.anInt6515 < 0) {
							arg0.anInt6515 = 0;
							Static4.method137(local192, 0, arg0.anInt7111, arg0.aByte92, arg0.anInt7117, Static231.aClass4_Sub2_Sub2_Sub1_2 == arg0);
						}
						arg0.anInt6480++;
						if (local192.anIntArray90.length > arg0.anInt6515 && local192.anIntArray89[arg0.anInt6515] < arg0.anInt6480) {
							arg0.anInt6515++;
							arg0.anInt6480 = 1;
							Static4.method137(local192, arg0.anInt6515, arg0.anInt7111, arg0.aByte92, arg0.anInt7117, Static231.aClass4_Sub2_Sub2_Sub1_2 == arg0);
						}
						if (arg0.anInt6515 >= local192.anIntArray90.length) {
							if (local181.aBoolean191) {
								arg0.anInt6515 -= local192.anInt1763;
								arg0.anInt6450++;
								if (arg0.anInt6450 >= local192.anInt1760) {
									arg0.anInt6449 = -1;
								} else if (arg0.anInt6515 >= 0 && arg0.anInt6515 < local192.anIntArray90.length) {
									Static4.method137(local192, arg0.anInt6515, arg0.anInt7111, arg0.aByte92, arg0.anInt7117, arg0 == Static231.aClass4_Sub2_Sub2_Sub1_2);
								} else {
									arg0.anInt6449 = -1;
								}
							} else {
								arg0.anInt6449 = -1;
							}
						}
						arg0.anInt6521 = arg0.anInt6515 + 1;
						if (arg0.anInt6521 >= local192.anIntArray90.length) {
							if (local181.aBoolean191) {
								arg0.anInt6521 -= local192.anInt1763;
								if (local192.anInt1760 <= arg0.anInt6450 + 1) {
									arg0.anInt6521 = -1;
								} else if (arg0.anInt6521 < 0 || local192.anIntArray90.length <= arg0.anInt6521) {
									arg0.anInt6521 = -1;
								}
							} else {
								arg0.anInt6521 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6509 != -1 && arg0.anInt6491 <= Static164.anInt3206) {
			local181 = Static137.aClass16_2.method251(arg0.anInt6509);
			local184 = local181.anInt2238;
			if (local184 == -1) {
				arg0.anInt6509 = -1;
			} else {
				label400: {
					local192 = Static9.aClass194_1.method4371(local184);
					if (local181.aBoolean191) {
						if (local192.anInt1765 == 3) {
							if (arg0.anInt6525 > 0 && Static164.anInt3206 >= arg0.anInt6463 && Static164.anInt3206 > arg0.anInt6457) {
								arg0.anInt6509 = -1;
								break label400;
							}
						} else if (local192.anInt1765 == 1 && arg0.anInt6525 > 0 && arg0.anInt6463 <= Static164.anInt3206 && arg0.anInt6457 < Static164.anInt3206) {
							arg0.anInt6491 = Static164.anInt3206 + 1;
							break label400;
						}
					}
					if (local192 == null || local192.anIntArray90 == null) {
						arg0.anInt6509 = -1;
					} else {
						if (arg0.anInt6459 < 0) {
							arg0.anInt6459 = 0;
							Static4.method137(local192, 0, arg0.anInt7111, arg0.aByte92, arg0.anInt7117, arg0 == Static231.aClass4_Sub2_Sub2_Sub1_2);
						}
						arg0.anInt6477++;
						if (arg0.anInt6459 < local192.anIntArray90.length && arg0.anInt6477 > local192.anIntArray89[arg0.anInt6459]) {
							arg0.anInt6477 = 1;
							arg0.anInt6459++;
							Static4.method137(local192, arg0.anInt6459, arg0.anInt7111, arg0.aByte92, arg0.anInt7117, Static231.aClass4_Sub2_Sub2_Sub1_2 == arg0);
						}
						if (local192.anIntArray90.length <= arg0.anInt6459) {
							if (local181.aBoolean191) {
								arg0.anInt6459 -= local192.anInt1763;
								arg0.anInt6504++;
								if (arg0.anInt6504 >= local192.anInt1760) {
									arg0.anInt6509 = -1;
								} else if (arg0.anInt6459 >= 0 && local192.anIntArray90.length > arg0.anInt6459) {
									Static4.method137(local192, arg0.anInt6459, arg0.anInt7111, arg0.aByte92, arg0.anInt7117, Static231.aClass4_Sub2_Sub2_Sub1_2 == arg0);
								} else {
									arg0.anInt6509 = -1;
								}
							} else {
								arg0.anInt6509 = -1;
							}
						}
						arg0.anInt6499 = arg0.anInt6459 + 1;
						if (arg0.anInt6499 >= local192.anIntArray90.length) {
							if (local181.aBoolean191) {
								arg0.anInt6499 -= local192.anInt1763;
								if (arg0.anInt6504 + 1 >= local192.anInt1760) {
									arg0.anInt6499 = -1;
								} else if (arg0.anInt6499 < 0 || local192.anIntArray90.length <= arg0.anInt6499) {
									arg0.anInt6499 = -1;
								}
							} else {
								arg0.anInt6499 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6469 != -1 && arg0.anInt6517 <= 1) {
			local19 = Static9.aClass194_1.method4371(arg0.anInt6469);
			if (local19.anInt1765 == 3) {
				if (arg0.anInt6525 > 0 && arg0.anInt6463 <= Static164.anInt3206 && arg0.anInt6457 < Static164.anInt3206) {
					arg0.anInt6469 = -1;
				}
			} else if (local19.anInt1765 == 1 && arg0.anInt6525 > 0 && arg0.anInt6463 <= Static164.anInt3206 && Static164.anInt3206 > arg0.anInt6457) {
				arg0.anInt6517 = 2;
			}
		}
		if (arg0.anInt6469 != -1 && arg0.anInt6517 == 0) {
			local19 = Static9.aClass194_1.method4371(arg0.anInt6469);
			if (local19 == null || local19.anIntArray90 == null) {
				arg0.anInt6469 = -1;
			} else {
				arg0.anInt6460++;
				if (arg0.anInt6483 < local19.anIntArray90.length && arg0.anInt6460 > local19.anIntArray89[arg0.anInt6483]) {
					arg0.anInt6460 = 1;
					arg0.anInt6483++;
					Static4.method137(local19, arg0.anInt6483, arg0.anInt7111, arg0.aByte92, arg0.anInt7117, Static231.aClass4_Sub2_Sub2_Sub1_2 == arg0);
				}
				if (local19.anIntArray90.length <= arg0.anInt6483) {
					arg0.anInt6483 -= local19.anInt1763;
					arg0.anInt6513++;
					if (local19.anInt1760 <= arg0.anInt6513) {
						arg0.anInt6469 = -1;
					} else if (arg0.anInt6483 >= 0 && arg0.anInt6483 < local19.anIntArray90.length) {
						Static4.method137(local19, arg0.anInt6483, arg0.anInt7111, arg0.aByte92, arg0.anInt7117, Static231.aClass4_Sub2_Sub2_Sub1_2 == arg0);
					} else {
						arg0.anInt6469 = -1;
					}
				}
				arg0.anInt6501 = arg0.anInt6483 + 1;
				if (local19.anIntArray90.length <= arg0.anInt6501) {
					arg0.anInt6501 -= local19.anInt1763;
					if (local19.anInt1760 <= arg0.anInt6513 + 1) {
						arg0.anInt6501 = -1;
					} else if (arg0.anInt6501 < 0 || local19.anIntArray90.length <= arg0.anInt6501) {
						arg0.anInt6501 = -1;
					}
				}
				arg0.aBoolean560 = local19.aBoolean151;
			}
		}
		if (arg0.anInt6517 > 0) {
			arg0.anInt6517--;
		}
		for (@Pc(1061) int local1061 = 0; local1061 < arg0.aClass268Array3.length; local1061++) {
			@Pc(1068) Class268 local1068 = arg0.aClass268Array3[local1061];
			if (local1068 != null) {
				if (local1068.anInt7841 > 0) {
					local1068.anInt7841--;
				} else {
					local192 = Static9.aClass194_1.method4371(local1068.anInt7848);
					if (local192 == null || local192.anIntArray90 == null) {
						arg0.aClass268Array3[local1061] = null;
					} else {
						local1068.anInt7843++;
						if (local192.anIntArray90.length > local1068.anInt7839 && local192.anIntArray89[local1068.anInt7839] < local1068.anInt7843) {
							local1068.anInt7839++;
							local1068.anInt7843 = 1;
							Static4.method137(local192, local1068.anInt7839, arg0.anInt7111, arg0.aByte92, arg0.anInt7117, Static231.aClass4_Sub2_Sub2_Sub1_2 == arg0);
						}
						if (local192.anIntArray90.length <= local1068.anInt7839) {
							local1068.anInt7840++;
							local1068.anInt7839 -= local192.anInt1763;
							if (local1068.anInt7840 >= local192.anInt1760) {
								arg0.aClass268Array3[local1061] = null;
							} else if (local1068.anInt7839 >= 0 && local192.anIntArray90.length > local1068.anInt7839) {
								Static4.method137(local192, local1068.anInt7839, arg0.anInt7111, arg0.aByte92, arg0.anInt7117, arg0 == Static231.aClass4_Sub2_Sub2_Sub1_2);
							} else {
								arg0.aClass268Array3[local1061] = null;
							}
						}
						local1068.anInt7842 = local1068.anInt7839 + 1;
						if (local192.anIntArray90.length <= local1068.anInt7842) {
							local1068.anInt7842 -= local192.anInt1763;
							if (local192.anInt1760 <= local1068.anInt7840 + 1) {
								local1068.anInt7842 = -1;
							} else if (local1068.anInt7842 < 0 || local192.anIntArray90.length <= local1068.anInt7842) {
								local1068.anInt7842 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)Z")
	public static boolean method1599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static233.method3560(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static250.anInt4056;
			@Pc(14) int local14 = arg2 << Static250.anInt4056;
			return Static379.method5283(local10 + 1, Static372.aClass106Array11[arg0].I(arg1, arg2) + arg3, local14 + 1) && Static379.method5283(local10 + Static284.anInt5177 - 1, Static372.aClass106Array11[arg0].I(arg1 + 1, arg2) + arg3, local14 + 1) && Static379.method5283(local10 + Static284.anInt5177 - 1, Static372.aClass106Array11[arg0].I(arg1 + 1, arg2 + 1) + arg3, local14 + Static284.anInt5177 - 1) && Static379.method5283(local10 + 1, Static372.aClass106Array11[arg0].I(arg1, arg2 + 1) + arg3, local14 + Static284.anInt5177 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!j;III[Z)Z")
	public static boolean method1600(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static372.aClass106Array11 != Static77.aClass106Array12) {
			@Pc(11) int local11 = Static72.aClass106Array4[arg1].va(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class106 local18 = Static72.aClass106Array4[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.va(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method5478(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.SA(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
