import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
	public static int anInt2246;

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
	public static int anInt2248;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "([JB[Ljava/lang/Object;)V")
	public static void method1886(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static429.method8910(arg1, arg0.length - 1, 0, arg0);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method1887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 > 2000 || arg3 > 2000 || arg5 > 2000 || arg8 > 2000 || arg2 > 2000 || arg7 > 2000) {
			return false;
		} else if (arg0 >= -2000 && arg3 >= -2000 && arg5 >= -2000 && arg8 >= -2000 && arg2 >= -2000 && arg7 >= -2000) {
			@Pc(69) int local69;
			if (Static138.anInt2931 == 2) {
				local69 = arg8 + Static317.anInt5596 * arg0;
				if (local69 >= 0 && Static649.anIntArray744.length > local69 && Static649.anIntArray744[local69] > (arg6 << 8) - 38400) {
					return false;
				}
				local69 = arg2 + Static317.anInt5596 * arg3;
				if (local69 >= 0 && Static649.anIntArray744.length > local69 && (arg4 << 8) - 38400 < Static649.anIntArray744[local69]) {
					return false;
				}
				local69 = arg7 + Static317.anInt5596 * arg5;
				if (local69 >= 0 && local69 < Static649.anIntArray744.length && Static649.anIntArray744[local69] > (arg1 << 8) - 38400) {
					return false;
				}
			}
			local69 = arg2 - arg8;
			@Pc(155) int local155 = arg3 - arg0;
			@Pc(159) int local159 = arg7 - arg8;
			@Pc(163) int local163 = arg5 - arg0;
			@Pc(168) int local168 = arg4 - arg6;
			if (arg3 > arg0 && arg5 > arg5) {
				arg0--;
				if (arg5 >= arg3) {
					arg5++;
				} else {
					arg3++;
				}
			} else if (arg5 > arg3) {
				if (arg5 < arg0) {
					arg0++;
				} else {
					arg5++;
				}
				arg3--;
			} else {
				arg5--;
				if (arg3 >= arg0) {
					arg3++;
				} else {
					arg0++;
				}
			}
			@Pc(217) int local217 = arg1 - arg6;
			@Pc(219) int local219 = 0;
			if (arg0 != arg3) {
				local219 = (arg2 - arg8 << 12) / (arg3 - arg0);
			}
			@Pc(240) int local240 = 0;
			if (arg5 != arg3) {
				local240 = (arg7 - arg2 << 12) / (arg5 - arg3);
			}
			@Pc(262) int local262 = 0;
			if (arg0 != arg5) {
				local262 = (arg8 - arg7 << 12) / (arg0 - arg5);
			}
			@Pc(289) int local289 = local163 * local69 - local159 * local155;
			if (local289 == 0) {
				return false;
			}
			@Pc(309) int local309 = (local168 * local163 - local155 * local217 << 8) / local289;
			@Pc(322) int local322 = (local217 * local69 - local168 * local159 << 8) / local289;
			if (arg3 >= arg0 && arg0 <= arg5) {
				if (arg0 >= Static179.anInt3584) {
					return true;
				}
				if (arg3 > Static179.anInt3584) {
					arg3 = Static179.anInt3584;
				}
				arg6 = (arg6 << 8) + local309 - local309 * arg8;
				if (arg5 > Static179.anInt3584) {
					arg5 = Static179.anInt3584;
				}
				if (arg3 >= arg5) {
					arg2 = arg8 <<= 0xC;
					if (arg0 < 0) {
						arg2 -= arg0 * local262;
						arg6 -= arg0 * local322;
						arg8 -= local219 * arg0;
						arg0 = 0;
					}
					arg7 <<= 0xC;
					if (arg5 < 0) {
						arg7 -= local240 * arg5;
						arg5 = 0;
					}
					if ((arg0 == arg5 || local219 <= local262) && (arg5 != arg0 || local240 <= local219)) {
						arg3 -= arg5;
						arg5 -= arg0;
						arg0 = Static317.anInt5596 * arg0;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static331.method5044(Static649.anIntArray744, arg0, arg6, local309, (arg7 >> 12) + 1, (arg8 >> 12) - 1)) {
										return false;
									}
									arg6 += local322;
									arg0 += Static317.anInt5596;
									arg7 += local240;
									arg8 += local219;
								}
							}
							if (!Static331.method5044(Static649.anIntArray744, arg0, arg6, local309, (arg2 >> 12) + 1, (arg8 >> 12) + -1)) {
								return false;
							}
							arg2 += local262;
							arg6 += local322;
							arg8 += local219;
							arg0 += Static317.anInt5596;
						}
					} else {
						arg3 -= arg5;
						arg5 -= arg0;
						arg0 = Static317.anInt5596 * arg0;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static331.method5044(Static649.anIntArray744, arg0, arg6, local309, (arg8 >> 12) + 1, (arg7 >> 12) - 1)) {
										return false;
									}
									arg0 += Static317.anInt5596;
									arg8 += local219;
									arg7 += local240;
									arg6 += local322;
								}
							}
							if (!Static331.method5044(Static649.anIntArray744, arg0, arg6, local309, (arg8 >> 12) + 1, (arg2 >> 12) + -1)) {
								return false;
							}
							arg2 += local262;
							arg0 += Static317.anInt5596;
							arg6 += local322;
							arg8 += local219;
						}
					}
				} else {
					arg7 = arg8 <<= 0xC;
					if (arg0 < 0) {
						arg6 -= local322 * arg0;
						arg8 -= arg0 * local219;
						arg7 -= arg0 * local262;
						arg0 = 0;
					}
					arg2 <<= 0xC;
					if (arg3 < 0) {
						arg2 -= local240 * arg3;
						arg3 = 0;
					}
					if ((arg3 == arg0 || local262 >= local219) && (arg0 != arg3 || local262 <= local240)) {
						arg5 -= arg3;
						arg3 -= arg0;
						arg0 = Static317.anInt5596 * arg0;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static331.method5044(Static649.anIntArray744, arg0, arg6, local309, (arg7 >> 12) + 1, (arg2 >> 12) + -1)) {
										return false;
									}
									arg6 += local322;
									arg2 += local240;
									arg0 += Static317.anInt5596;
									arg7 += local262;
								}
							}
							if (!Static331.method5044(Static649.anIntArray744, arg0, arg6, local309, (arg7 >> 12) + 1, (arg8 >> 12) - 1)) {
								return false;
							}
							arg7 += local262;
							arg0 += Static317.anInt5596;
							arg6 += local322;
							arg8 += local219;
						}
					} else {
						arg5 -= arg3;
						arg3 -= arg0;
						arg0 *= Static317.anInt5596;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static331.method5044(Static649.anIntArray744, arg0, arg6, local309, (arg2 >> 12) + 1, (arg7 >> 12) + -1)) {
										return false;
									}
									arg2 += local240;
									arg0 += Static317.anInt5596;
									arg6 += local322;
									arg7 += local262;
								}
							}
							if (!Static331.method5044(Static649.anIntArray744, arg0, arg6, local309, (arg8 >> 12) + 1, (arg7 >> 12) + -1)) {
								return false;
							}
							arg7 += local262;
							arg0 += Static317.anInt5596;
							arg8 += local219;
							arg6 += local322;
						}
					}
				}
			} else if (arg3 <= arg5) {
				if (arg3 >= Static179.anInt3584) {
					return true;
				}
				if (Static179.anInt3584 < arg5) {
					arg5 = Static179.anInt3584;
				}
				if (arg0 > Static179.anInt3584) {
					arg0 = Static179.anInt3584;
				}
				arg4 = local309 + (arg4 << 8) - arg2 * local309;
				if (arg0 <= arg5) {
					arg7 = arg2 <<= 0xC;
					if (arg3 < 0) {
						arg7 -= local219 * arg3;
						arg4 -= arg3 * local322;
						arg2 -= arg3 * local240;
						arg3 = 0;
					}
					arg8 <<= 0xC;
					if (arg0 < 0) {
						arg8 -= local262 * arg0;
						arg0 = 0;
					}
					if (local219 < local240) {
						arg5 -= arg0;
						arg0 -= arg3;
						arg3 = Static317.anInt5596 * arg3;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static331.method5044(Static649.anIntArray744, arg3, arg4, local309, (arg2 >> 12) + 1, (arg8 >> 12) - 1)) {
										return false;
									}
									arg4 += local322;
									arg8 += local262;
									arg2 += local240;
									arg3 += Static317.anInt5596;
								}
							}
							if (!Static331.method5044(Static649.anIntArray744, arg3, arg4, local309, (arg2 >> 12) + 1, (arg7 >> 12) + -1)) {
								return false;
							}
							arg2 += local240;
							arg4 += local322;
							arg7 += local219;
							arg3 += Static317.anInt5596;
						}
					} else {
						arg5 -= arg0;
						arg0 -= arg3;
						arg3 = Static317.anInt5596 * arg3;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static331.method5044(Static649.anIntArray744, arg3, arg4, local309, (arg8 >> 12) + 1, (arg2 >> 12) + -1)) {
										return false;
									}
									arg2 += local240;
									arg3 += Static317.anInt5596;
									arg4 += local322;
									arg8 += local262;
								}
							}
							if (!Static331.method5044(Static649.anIntArray744, arg3, arg4, local309, (arg7 >> 12) + 1, (arg2 >> 12) - 1)) {
								return false;
							}
							arg4 += local322;
							arg2 += local240;
							arg3 += Static317.anInt5596;
							arg7 += local219;
						}
					}
				} else {
					arg8 = arg2 <<= 0xC;
					arg7 <<= 0xC;
					if (arg3 < 0) {
						arg8 -= arg3 * local219;
						arg4 -= arg3 * local322;
						arg2 -= local240 * arg3;
						arg3 = 0;
					}
					if (arg5 < 0) {
						arg7 -= local262 * arg5;
						arg5 = 0;
					}
					if (arg3 != arg5 && local219 < local240 || arg5 == arg3 && local219 > local262) {
						arg0 -= arg5;
						arg5 -= arg3;
						arg3 = Static317.anInt5596 * arg3;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static331.method5044(Static649.anIntArray744, arg3, arg4, local309, (arg7 >> 12) + 1, (arg8 >> 12) + -1)) {
										return false;
									}
									arg4 += local322;
									arg7 += local262;
									arg8 += local219;
									arg3 += Static317.anInt5596;
								}
							}
							if (!Static331.method5044(Static649.anIntArray744, arg3, arg4, local309, (arg2 >> 12) + 1, (arg8 >> 12) + -1)) {
								return false;
							}
							arg4 += local322;
							arg3 += Static317.anInt5596;
							arg8 += local219;
							arg2 += local240;
						}
					} else {
						arg0 -= arg5;
						arg5 -= arg3;
						arg3 = Static317.anInt5596 * arg3;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static331.method5044(Static649.anIntArray744, arg3, arg4, local309, (arg8 >> 12) + 1, (arg7 >> 12) + -1)) {
										return false;
									}
									arg3 += Static317.anInt5596;
									arg8 += local219;
									arg7 += local262;
									arg4 += local322;
								}
							}
							if (!Static331.method5044(Static649.anIntArray744, arg3, arg4, local309, (arg8 >> 12) + 1, (arg2 >> 12) + -1)) {
								return false;
							}
							arg3 += Static317.anInt5596;
							arg4 += local322;
							arg8 += local219;
							arg2 += local240;
						}
					}
				}
			} else if (arg5 >= Static179.anInt3584) {
				return true;
			} else {
				if (arg0 > Static179.anInt3584) {
					arg0 = Static179.anInt3584;
				}
				arg1 = (arg1 << 8) + local309 - local309 * arg7;
				if (arg3 > Static179.anInt3584) {
					arg3 = Static179.anInt3584;
				}
				if (arg0 >= arg3) {
					arg8 = arg7 <<= 0xC;
					if (arg5 < 0) {
						arg1 -= local322 * arg5;
						arg7 -= local262 * arg5;
						arg8 -= arg5 * local240;
						arg5 = 0;
					}
					arg2 <<= 0xC;
					if (arg3 < 0) {
						arg2 -= local219 * arg3;
						arg3 = 0;
					}
					if (local240 >= local262) {
						arg0 -= arg3;
						arg3 -= arg5;
						arg5 *= Static317.anInt5596;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static331.method5044(Static649.anIntArray744, arg5, arg1, local309, (arg2 >> 12) + 1, (arg7 >> 12) - 1)) {
										return false;
									}
									arg2 += local219;
									arg5 += Static317.anInt5596;
									arg7 += local262;
									arg1 += local322;
								}
							}
							if (!Static331.method5044(Static649.anIntArray744, arg5, arg1, local309, (arg8 >> 12) + 1, (arg7 >> 12) + -1)) {
								return false;
							}
							arg5 += Static317.anInt5596;
							arg1 += local322;
							arg8 += local240;
							arg7 += local262;
						}
					} else {
						arg0 -= arg3;
						arg3 -= arg5;
						arg5 *= Static317.anInt5596;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!Static331.method5044(Static649.anIntArray744, arg5, arg1, local309, (arg7 >> 12) + 1, (arg2 >> 12) - 1)) {
										return false;
									}
									arg1 += local322;
									arg5 += Static317.anInt5596;
									arg7 += local262;
									arg2 += local219;
								}
							}
							if (!Static331.method5044(Static649.anIntArray744, arg5, arg1, local309, (arg7 >> 12) + 1, (arg8 >> 12) - 1)) {
								return false;
							}
							arg7 += local262;
							arg5 += Static317.anInt5596;
							arg8 += local240;
							arg1 += local322;
						}
					}
				} else {
					arg2 = arg7 <<= 0xC;
					arg8 <<= 0xC;
					if (arg5 < 0) {
						arg7 -= arg5 * local262;
						arg1 -= arg5 * local322;
						arg2 -= arg5 * local240;
						arg5 = 0;
					}
					if (arg0 < 0) {
						arg8 -= arg0 * local219;
						arg0 = 0;
					}
					if (local262 <= local240) {
						arg3 -= arg0;
						arg0 -= arg5;
						arg5 = Static317.anInt5596 * arg5;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static331.method5044(Static649.anIntArray744, arg5, arg1, local309, (arg2 >> 12) + 1, (arg8 >> 12) - 1)) {
										return false;
									}
									arg5 += Static317.anInt5596;
									arg2 += local240;
									arg8 += local219;
									arg1 += local322;
								}
							}
							if (!Static331.method5044(Static649.anIntArray744, arg5, arg1, local309, (arg2 >> 12) + 1, (arg7 >> 12) + -1)) {
								return false;
							}
							arg1 += local322;
							arg5 += Static317.anInt5596;
							arg2 += local240;
							arg7 += local262;
						}
					} else {
						arg3 -= arg0;
						arg0 -= arg5;
						arg5 = Static317.anInt5596 * arg5;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static331.method5044(Static649.anIntArray744, arg5, arg1, local309, (arg8 >> 12) + 1, (arg2 >> 12) + -1)) {
										return false;
									}
									arg2 += local240;
									arg5 += Static317.anInt5596;
									arg1 += local322;
									arg8 += local219;
								}
							}
							if (!Static331.method5044(Static649.anIntArray744, arg5, arg1, local309, (arg7 >> 12) + 1, (arg2 >> 12) + -1)) {
								return false;
							}
							arg2 += local240;
							arg7 += local262;
							arg5 += Static317.anInt5596;
							arg1 += local322;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V")
	public static void method1891() {
		@Pc(5) int local5 = 0;
		if (Static305.aClass2_Sub49_15 != null) {
			local5 = Static305.aClass2_Sub49_15.aClass33_Sub10_1.method3565();
		}
		@Pc(38) int local38;
		@Pc(49) int local49;
		if (local5 == 2) {
			local38 = Static334.anInt5861 > 800 ? 800 : Static334.anInt5861;
			Static1.anInt8341 = (Static334.anInt5861 - local38) / 2;
			local49 = Static16.anInt323 <= 600 ? Static16.anInt323 : 600;
			Class16_Sub1_Sub5_Sub1.lb = local38;
			Static71.anInt1925 = local49;
			Static500.anInt8002 = 0;
		} else if (local5 == 1) {
			local38 = Static334.anInt5861 > 1024 ? 1024 : Static334.anInt5861;
			Class16_Sub1_Sub5_Sub1.lb = local38;
			local49 = Static16.anInt323 <= 768 ? Static16.anInt323 : 768;
			Static1.anInt8341 = (Static334.anInt5861 - local38) / 2;
			Static71.anInt1925 = local49;
			Static500.anInt8002 = 0;
		} else {
			Static1.anInt8341 = 0;
			Class16_Sub1_Sub5_Sub1.lb = Static334.anInt5861;
			Static71.anInt1925 = Static16.anInt323;
			Static500.anInt8002 = 0;
		}
	}
}
