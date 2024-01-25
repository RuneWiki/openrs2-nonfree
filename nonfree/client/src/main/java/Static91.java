import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!de", name = "p", descriptor = "I")
	public static int anInt1475;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Lclient!vv;")
	public static final Class368 aClass368_1 = new Class368(64);

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!dia;")
	public static final Class74 aClass74_5 = new Class74("", 17);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2 + arg6;
		@Pc(14) int local14 = arg3 - arg2;
		for (@Pc(21) int local21 = arg6; local21 < local9; local21++) {
			Static260.method3979(arg5, arg0, Static267.anIntArrayArray20[local21], arg4);
		}
		for (@Pc(37) int local37 = arg3; local37 > local14; local37--) {
			Static260.method3979(arg5, arg0, Static267.anIntArrayArray20[local37], arg4);
		}
		@Pc(55) int local55 = arg4 - arg2;
		@Pc(59) int local59 = arg2 + arg0;
		for (@Pc(61) int local61 = local9; local61 <= local14; local61++) {
			@Pc(67) int[] local67 = Static267.anIntArrayArray20[local61];
			Static260.method3979(arg5, arg0, local67, local59);
			Static260.method3979(arg1, local59, local67, local55);
			Static260.method3979(arg5, local55, local67, arg4);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!la;ZI)V")
	public static void method1412(@OriginalArg(0) Class200 arg0, @OriginalArg(2) int arg1) {
		if (Static44.anInt730 >= 50 || (arg0 == null || arg0.anIntArrayArray23 == null || arg1 >= arg0.anIntArrayArray23.length || arg0.anIntArrayArray23[arg1] == null)) {
			return;
		}
		@Pc(38) int local38 = arg0.anIntArrayArray23[arg1][0];
		@Pc(42) int local42 = local38 >> 8;
		@Pc(61) int local61;
		if (arg0.anIntArrayArray23[arg1].length > 1) {
			local61 = (int) (Math.random() * (double) arg0.anIntArrayArray23[arg1].length);
			if (local61 > 0) {
				local42 = arg0.anIntArrayArray23[arg1][local61];
			}
		}
		@Pc(76) int local76 = local38 >> 5 & 0x7;
		local61 = 256;
		if (arg0.anIntArray387 != null && arg0.anIntArray390 != null) {
			local61 = Static329.method5124(arg0.anIntArray390[arg1], arg0.anIntArray387[arg1]);
		}
		if (arg0.aBoolean404) {
			Static392.method6102(255, local76, local42, local61, false, 0);
		} else {
			Static301.method4383(local61, local42, 0, 255, local76);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method1414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 > 2000 || arg1 > 2000 || arg4 > 2000 || arg2 > 2000 || arg6 > 2000 || arg5 > 2000) {
			return false;
		} else if (arg3 >= -2000 && arg1 >= -2000 && arg4 >= -2000 && arg2 >= -2000 && arg6 >= -2000 && arg5 >= -2000) {
			@Pc(64) int local64;
			if (Static303.anInt4820 == 2) {
				local64 = arg2 + Static536.anInt8903 * arg3;
				if (local64 >= 0 && local64 < Static174.anIntArray272.length && Static174.anIntArray272[local64] > (arg7 << 8) - 38400) {
					return false;
				}
				local64 = arg6 + Static536.anInt8903 * arg1;
				if (local64 >= 0 && local64 < Static174.anIntArray272.length && (arg0 << 8) - 38400 < Static174.anIntArray272[local64]) {
					return false;
				}
				local64 = arg4 * Static536.anInt8903 + arg5;
				if (local64 >= 0 && local64 < Static174.anIntArray272.length && (arg8 << 8) - 38400 < Static174.anIntArray272[local64]) {
					return false;
				}
			}
			local64 = arg6 - arg2;
			@Pc(138) int local138 = arg1 - arg3;
			@Pc(143) int local143 = arg5 - arg2;
			@Pc(148) int local148 = arg4 - arg3;
			@Pc(153) int local153 = arg0 - arg7;
			@Pc(157) int local157 = arg8 - arg7;
			if (arg1 > arg3 && arg4 > arg4) {
				if (arg1 <= arg4) {
					arg4++;
				} else {
					arg1++;
				}
				arg3--;
			} else if (arg1 >= arg4) {
				if (arg3 > arg1) {
					arg3++;
				} else {
					arg1++;
				}
				arg4--;
			} else {
				arg1--;
				if (arg3 <= arg4) {
					arg4++;
				} else {
					arg3++;
				}
			}
			@Pc(204) int local204 = 0;
			if (arg1 != arg3) {
				local204 = (arg6 - arg2 << 12) / (arg1 - arg3);
			}
			@Pc(224) int local224 = 0;
			if (arg1 != arg4) {
				local224 = (arg5 - arg6 << 12) / (arg4 - arg1);
			}
			@Pc(241) int local241 = 0;
			if (arg4 != arg3) {
				local241 = (arg2 - arg5 << 12) / (arg3 - arg4);
			}
			@Pc(269) int local269 = local148 * local64 - local138 * local143;
			if (local269 == 0) {
				return false;
			}
			@Pc(291) int local291 = (local148 * local153 - local138 * local157 << 8) / local269;
			@Pc(303) int local303 = (local64 * local157 - local143 * local153 << 8) / local269;
			if (arg1 >= arg3 && arg4 >= arg3) {
				if (arg3 >= Static106.anInt1658) {
					return true;
				}
				arg7 = (arg7 << 8) + local291 - arg2 * local291;
				if (Static106.anInt1658 < arg1) {
					arg1 = Static106.anInt1658;
				}
				if (arg4 > Static106.anInt1658) {
					arg4 = Static106.anInt1658;
				}
				if (arg4 <= arg1) {
					arg6 = arg2 <<= 0xC;
					arg5 <<= 0xC;
					if (arg3 < 0) {
						arg6 -= arg3 * local241;
						arg7 -= local303 * arg3;
						arg2 -= local204 * arg3;
						arg3 = 0;
					}
					if (arg4 < 0) {
						arg5 -= local224 * arg4;
						arg4 = 0;
					}
					if ((arg4 == arg3 || local204 <= local241) && (arg3 != arg4 || local224 <= local204)) {
						arg1 -= arg4;
						arg4 -= arg3;
						arg3 = Static536.anInt8903 * arg3;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static480.method3408((arg5 >> 12) + 1, Static174.anIntArray272, arg7, (arg2 >> 12) - 1, local291, arg3)) {
										return false;
									}
									arg2 += local204;
									arg7 += local303;
									arg5 += local224;
									arg3 += Static536.anInt8903;
								}
							}
							if (!Static480.method3408((arg6 >> 12) + 1, Static174.anIntArray272, arg7, (arg2 >> 12) - 1, local291, arg3)) {
								return false;
							}
							arg6 += local241;
							arg3 += Static536.anInt8903;
							arg7 += local303;
							arg2 += local204;
						}
					} else {
						arg1 -= arg4;
						arg4 -= arg3;
						arg3 = Static536.anInt8903 * arg3;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static480.method3408((arg2 >> 12) + 1, Static174.anIntArray272, arg7, (arg5 >> 12) - 1, local291, arg3)) {
										return false;
									}
									arg5 += local224;
									arg2 += local204;
									arg3 += Static536.anInt8903;
									arg7 += local303;
								}
							}
							if (!Static480.method3408((arg2 >> 12) + 1, Static174.anIntArray272, arg7, (arg6 >> 12) - 1, local291, arg3)) {
								return false;
							}
							arg2 += local204;
							arg7 += local303;
							arg6 += local241;
							arg3 += Static536.anInt8903;
						}
					}
				} else {
					arg5 = arg2 <<= 0xC;
					arg6 <<= 0xC;
					if (arg3 < 0) {
						arg7 -= arg3 * local303;
						arg5 -= local241 * arg3;
						arg2 -= arg3 * local204;
						arg3 = 0;
					}
					if (arg1 < 0) {
						arg6 -= arg1 * local224;
						arg1 = 0;
					}
					if (arg1 != arg3 && local204 > local241 || arg1 == arg3 && local224 < local241) {
						arg4 -= arg1;
						arg1 -= arg3;
						arg3 = Static536.anInt8903 * arg3;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static480.method3408((arg6 >> 12) + 1, Static174.anIntArray272, arg7, (arg5 >> 12) - 1, local291, arg3)) {
										return false;
									}
									arg5 += local241;
									arg6 += local224;
									arg3 += Static536.anInt8903;
									arg7 += local303;
								}
							}
							if (!Static480.method3408((arg2 >> 12) + 1, Static174.anIntArray272, arg7, (arg5 >> 12) - 1, local291, arg3)) {
								return false;
							}
							arg2 += local204;
							arg5 += local241;
							arg7 += local303;
							arg3 += Static536.anInt8903;
						}
					} else {
						arg4 -= arg1;
						arg1 -= arg3;
						arg3 *= Static536.anInt8903;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static480.method3408((arg5 >> 12) + 1, Static174.anIntArray272, arg7, (arg6 >> 12) - 1, local291, arg3)) {
										return false;
									}
									arg3 += Static536.anInt8903;
									arg5 += local241;
									arg7 += local303;
									arg6 += local224;
								}
							}
							if (!Static480.method3408((arg5 >> 12) + 1, Static174.anIntArray272, arg7, (arg2 >> 12) - 1, local291, arg3)) {
								return false;
							}
							arg3 += Static536.anInt8903;
							arg7 += local303;
							arg5 += local241;
							arg2 += local204;
						}
					}
				}
			} else if (arg1 > arg4) {
				if (arg4 >= Static106.anInt1658) {
					return true;
				}
				if (arg3 > Static106.anInt1658) {
					arg3 = Static106.anInt1658;
				}
				arg8 = (arg8 << 8) + local291 - (arg5 * local291);
				if (arg1 > Static106.anInt1658) {
					arg1 = Static106.anInt1658;
				}
				if (arg1 <= arg3) {
					arg2 = arg5 <<= 0xC;
					arg6 <<= 0xC;
					if (arg4 < 0) {
						arg8 -= local303 * arg4;
						arg2 -= local224 * arg4;
						arg5 -= local241 * arg4;
						arg4 = 0;
					}
					if (arg1 < 0) {
						arg6 -= local204 * arg1;
						arg1 = 0;
					}
					if (local241 > local224) {
						arg3 -= arg1;
						arg1 -= arg4;
						arg4 *= Static536.anInt8903;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static480.method3408((arg5 >> 12) + 1, Static174.anIntArray272, arg8, (arg6 >> 12) - 1, local291, arg4)) {
										return false;
									}
									arg8 += local303;
									arg5 += local241;
									arg6 += local204;
									arg4 += Static536.anInt8903;
								}
							}
							if (!Static480.method3408((arg5 >> 12) + 1, Static174.anIntArray272, arg8, (arg2 >> 12) - 1, local291, arg4)) {
								return false;
							}
							arg5 += local241;
							arg4 += Static536.anInt8903;
							arg8 += local303;
							arg2 += local224;
						}
					} else {
						arg3 -= arg1;
						arg1 -= arg4;
						arg4 = Static536.anInt8903 * arg4;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static480.method3408((arg6 >> 12) + 1, Static174.anIntArray272, arg8, (arg5 >> 12) - 1, local291, arg4)) {
										return false;
									}
									arg5 += local241;
									arg6 += local204;
									arg8 += local303;
									arg4 += Static536.anInt8903;
								}
							}
							if (!Static480.method3408((arg2 >> 12) + 1, Static174.anIntArray272, arg8, (arg5 >> 12) - 1, local291, arg4)) {
								return false;
							}
							arg8 += local303;
							arg2 += local224;
							arg4 += Static536.anInt8903;
							arg5 += local241;
						}
					}
				} else {
					arg6 = arg5 <<= 0xC;
					if (arg4 < 0) {
						arg6 -= arg4 * local224;
						arg5 -= arg4 * local241;
						arg8 -= local303 * arg4;
						arg4 = 0;
					}
					arg2 <<= 0xC;
					if (arg3 < 0) {
						arg2 -= arg3 * local204;
						arg3 = 0;
					}
					if (local224 >= local241) {
						arg1 -= arg3;
						arg3 -= arg4;
						arg4 = Static536.anInt8903 * arg4;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static480.method3408((arg6 >> 12) + 1, Static174.anIntArray272, arg8, (arg2 >> 12) - 1, local291, arg4)) {
										return false;
									}
									arg2 += local204;
									arg8 += local303;
									arg6 += local224;
									arg4 += Static536.anInt8903;
								}
							}
							if (!Static480.method3408((arg6 >> 12) + 1, Static174.anIntArray272, arg8, (arg5 >> 12) - 1, local291, arg4)) {
								return false;
							}
							arg8 += local303;
							arg5 += local241;
							arg4 += Static536.anInt8903;
							arg6 += local224;
						}
					} else {
						arg1 -= arg3;
						arg3 -= arg4;
						arg4 = Static536.anInt8903 * arg4;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static480.method3408((arg2 >> 12) + 1, Static174.anIntArray272, arg8, (arg6 >> 12) - 1, local291, arg4)) {
										return false;
									}
									arg8 += local303;
									arg4 += Static536.anInt8903;
									arg6 += local224;
									arg2 += local204;
								}
							}
							if (!Static480.method3408((arg5 >> 12) + 1, Static174.anIntArray272, arg8, (arg6 >> 12) - 1, local291, arg4)) {
								return false;
							}
							arg6 += local224;
							arg4 += Static536.anInt8903;
							arg5 += local241;
							arg8 += local303;
						}
					}
				}
			} else if (arg1 >= Static106.anInt1658) {
				return true;
			} else {
				if (Static106.anInt1658 < arg4) {
					arg4 = Static106.anInt1658;
				}
				arg0 = local291 + (arg0 << 8) - local291 * arg6;
				if (arg3 > Static106.anInt1658) {
					arg3 = Static106.anInt1658;
				}
				if (arg4 < arg3) {
					arg2 = arg6 <<= 0xC;
					if (arg1 < 0) {
						arg0 -= local303 * arg1;
						arg2 -= local204 * arg1;
						arg6 -= arg1 * local224;
						arg1 = 0;
					}
					arg5 <<= 0xC;
					if (arg4 < 0) {
						arg5 -= arg4 * local241;
						arg4 = 0;
					}
					if (arg1 != arg4 && local224 > local204 || arg4 == arg1 && local204 > local241) {
						arg3 -= arg4;
						arg4 -= arg1;
						arg1 = Static536.anInt8903 * arg1;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static480.method3408((arg5 >> 12) + 1, Static174.anIntArray272, arg0, (arg2 >> 12) - 1, local291, arg1)) {
										return false;
									}
									arg5 += local241;
									arg1 += Static536.anInt8903;
									arg2 += local204;
									arg0 += local303;
								}
							}
							if (!Static480.method3408((arg6 >> 12) + 1, Static174.anIntArray272, arg0, (arg2 >> 12) - 1, local291, arg1)) {
								return false;
							}
							arg0 += local303;
							arg2 += local204;
							arg1 += Static536.anInt8903;
							arg6 += local224;
						}
					} else {
						arg3 -= arg4;
						arg4 -= arg1;
						arg1 *= Static536.anInt8903;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg3--;
									if (arg3 < 0) {
										return true;
									}
									if (!Static480.method3408((arg2 >> 12) + 1, Static174.anIntArray272, arg0, (arg5 >> 12) - 1, local291, arg1)) {
										return false;
									}
									arg0 += local303;
									arg2 += local204;
									arg5 += local241;
									arg1 += Static536.anInt8903;
								}
							}
							if (!Static480.method3408((arg2 >> 12) + 1, Static174.anIntArray272, arg0, (arg6 >> 12) - 1, local291, arg1)) {
								return false;
							}
							arg1 += Static536.anInt8903;
							arg2 += local204;
							arg6 += local224;
							arg0 += local303;
						}
					}
				} else {
					arg5 = arg6 <<= 0xC;
					arg2 <<= 0xC;
					if (arg1 < 0) {
						arg0 -= arg1 * local303;
						arg6 -= arg1 * local224;
						arg5 -= local204 * arg1;
						arg1 = 0;
					}
					if (arg3 < 0) {
						arg2 -= local241 * arg3;
						arg3 = 0;
					}
					if (local204 >= local224) {
						arg4 -= arg3;
						arg3 -= arg1;
						arg1 = Static536.anInt8903 * arg1;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static480.method3408((arg2 >> 12) + 1, Static174.anIntArray272, arg0, (arg6 >> 12) - 1, local291, arg1)) {
										return false;
									}
									arg0 += local303;
									arg6 += local224;
									arg1 += Static536.anInt8903;
									arg2 += local241;
								}
							}
							if (!Static480.method3408((arg5 >> 12) + 1, Static174.anIntArray272, arg0, (arg6 >> 12) - 1, local291, arg1)) {
								return false;
							}
							arg5 += local204;
							arg1 += Static536.anInt8903;
							arg6 += local224;
							arg0 += local303;
						}
					} else {
						arg4 -= arg3;
						arg3 -= arg1;
						arg1 = Static536.anInt8903 * arg1;
						while (true) {
							arg3--;
							if (arg3 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static480.method3408((arg6 >> 12) + 1, Static174.anIntArray272, arg0, (arg2 >> 12) - 1, local291, arg1)) {
										return false;
									}
									arg6 += local224;
									arg2 += local241;
									arg0 += local303;
									arg1 += Static536.anInt8903;
								}
							}
							if (!Static480.method3408((arg6 >> 12) + 1, Static174.anIntArray272, arg0, (arg5 >> 12) - 1, local291, arg1)) {
								return false;
							}
							arg6 += local224;
							arg1 += Static536.anInt8903;
							arg0 += local303;
							arg5 += local204;
						}
					}
				}
			}
		} else {
			return false;
		}
	}
}
