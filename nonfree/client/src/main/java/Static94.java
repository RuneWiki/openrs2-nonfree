import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	public static int anInt2345;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "[Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3[] aClass1_Sub2_Sub5_Sub3Array2;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([IIIIIIIZIII)V")
	public static void method1775(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (Static194.anInt4134 > arg8) {
			arg5 -= Static194.anInt4134 - arg8;
			arg8 = Static194.anInt4134;
		}
		if (arg9 == 9) {
			arg2 = arg2 + 1 & 0x3;
			arg9 = 1;
		}
		if (arg1 < Static194.anInt4132) {
			arg4 -= Static194.anInt4132 - arg1;
			arg1 = Static194.anInt4132;
		}
		if (arg9 == 10) {
			arg9 = 1;
			arg2 = arg2 + 3 & 0x3;
		}
		if (arg5 + arg8 > Static194.anInt4130) {
			arg5 = Static194.anInt4130 - arg8;
		}
		if (arg9 == 11) {
			arg2 = arg2 + 3 & 0x3;
			arg9 = 8;
		}
		if (arg1 + arg4 > Static194.anInt4133) {
			arg4 = Static194.anInt4133 - arg1;
		}
		@Pc(107) int local107 = Static194.anInt4131 - arg5;
		@Pc(113) int local113 = Static194.anInt4131 * arg1 + arg8;
		@Pc(120) int local120;
		@Pc(124) int local124;
		if (arg9 == 1) {
			if (arg2 == 0) {
				for (local120 = 0; local120 < arg4; local120++) {
					for (local124 = 0; local124 < arg5; local124++) {
						if (local120 >= local124) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			} else if (arg2 == 1) {
				for (local120 = arg4 - 1; local120 >= 0; local120--) {
					for (local124 = 0; local124 < arg5; local124++) {
						if (local124 <= local120) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			} else if (arg2 == 2) {
				for (local120 = 0; local120 < arg4; local120++) {
					for (local124 = 0; local124 < arg5; local124++) {
						if (local120 <= local124) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			} else if (arg2 == 3) {
				for (local120 = arg4 - 1; local120 >= 0; local120--) {
					for (local124 = 0; local124 < arg5; local124++) {
						if (local120 <= local124) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			}
		} else if (arg9 == 2) {
			if (arg2 == 0) {
				for (local120 = arg4 - 1; local120 >= 0; local120--) {
					for (local124 = 0; local124 < arg5; local124++) {
						if (local120 >> 1 >= local124) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			} else if (arg2 == 1) {
				for (local120 = 0; local120 < arg4; local120++) {
					for (local124 = 0; local124 < arg5; local124++) {
						if (local124 >= local120 << 1) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			} else if (arg2 == 2) {
				for (local120 = 0; local120 < arg4; local120++) {
					for (local124 = arg5 - 1; local124 >= 0; local124--) {
						if (local124 <= local120 >> 1) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			} else if (arg2 == 3) {
				for (local120 = arg4 - 1; local120 >= 0; local120--) {
					for (local124 = arg5 - 1; local124 >= 0; local124--) {
						if (local120 << 1 <= local124) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			}
		} else if (arg9 == 3) {
			if (arg2 == 0) {
				for (local120 = arg4 - 1; local120 >= 0; local120--) {
					for (local124 = arg5 - 1; local124 >= 0; local124--) {
						if (local120 >> 1 >= local124) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			} else if (arg2 == 1) {
				for (local120 = arg4 - 1; local120 >= 0; local120--) {
					for (local124 = 0; local124 < arg5; local124++) {
						if (local124 >= local120 << 1) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			} else if (arg2 == 2) {
				for (local120 = 0; local120 < arg4; local120++) {
					for (local124 = 0; local124 < arg5; local124++) {
						if (local124 <= local120 >> 1) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			} else if (arg2 == 3) {
				for (local120 = 0; local120 < arg4; local120++) {
					for (local124 = arg5 - 1; local124 >= 0; local124--) {
						if (local120 << 1 <= local124) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			}
		} else if (arg9 == 4) {
			if (arg2 == 0) {
				for (local120 = arg4 - 1; local120 >= 0; local120--) {
					for (local124 = 0; local124 < arg5; local124++) {
						if (local120 >> 1 <= local124) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			} else if (arg2 == 1) {
				for (local120 = 0; local120 < arg4; local120++) {
					for (local124 = 0; local124 < arg5; local124++) {
						if (local120 << 1 >= local124) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			} else if (arg2 == 2) {
				for (local120 = 0; local120 < arg4; local120++) {
					for (local124 = arg5 - 1; local124 >= 0; local124--) {
						if (local124 >= local120 >> 1) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			} else if (arg2 == 3) {
				for (local120 = arg4 - 1; local120 >= 0; local120--) {
					for (local124 = arg5 - 1; local124 >= 0; local124--) {
						if (local120 << 1 >= local124) {
							arg0[local113] = arg3;
						} else if (arg7) {
							arg0[local113] = arg6;
						}
						local113++;
					}
					local113 += local107;
				}
			}
		} else if (arg9 != 5) {
			if (arg9 == 6) {
				if (arg2 == 0) {
					for (local120 = 0; local120 < arg4; local120++) {
						for (local124 = 0; local124 < arg5; local124++) {
							if (local124 <= arg5 / 2) {
								arg0[local113] = arg3;
							} else if (arg7) {
								arg0[local113] = arg6;
							}
							local113++;
						}
						local113 += local107;
					}
					return;
				}
				if (arg2 == 1) {
					for (local120 = 0; local120 < arg4; local120++) {
						for (local124 = 0; local124 < arg5; local124++) {
							if (local120 <= arg4 / 2) {
								arg0[local113] = arg3;
							} else if (arg7) {
								arg0[local113] = arg6;
							}
							local113++;
						}
						local113 += local107;
					}
					return;
				}
				if (arg2 == 2) {
					for (local120 = 0; local120 < arg4; local120++) {
						for (local124 = 0; local124 < arg5; local124++) {
							if (arg5 / 2 <= local124) {
								arg0[local113] = arg3;
							} else if (arg7) {
								arg0[local113] = arg6;
							}
							local113++;
						}
						local113 += local107;
					}
					return;
				}
				if (arg2 == 3) {
					for (local120 = 0; local120 < arg4; local120++) {
						for (local124 = 0; local124 < arg5; local124++) {
							if (arg4 / 2 <= local120) {
								arg0[local113] = arg3;
							} else if (arg7) {
								arg0[local113] = arg6;
							}
							local113++;
						}
						local113 += local107;
					}
					return;
				}
			}
			if (arg9 == 7) {
				if (arg2 == 0) {
					for (local120 = 0; local120 < arg4; local120++) {
						for (local124 = 0; local124 < arg5; local124++) {
							if (local120 - arg4 / 2 >= local124) {
								arg0[local113] = arg3;
							} else if (arg7) {
								arg0[local113] = arg6;
							}
							local113++;
						}
						local113 += local107;
					}
					return;
				}
				if (arg2 == 1) {
					for (local120 = arg4 - 1; local120 >= 0; local120--) {
						for (local124 = 0; local124 < arg5; local124++) {
							if (local124 <= local120 - arg4 / 2) {
								arg0[local113] = arg3;
							} else if (arg7) {
								arg0[local113] = arg6;
							}
							local113++;
						}
						local113 += local107;
					}
					return;
				}
				if (arg2 == 2) {
					for (local120 = arg4 - 1; local120 >= 0; local120--) {
						for (local124 = arg5 - 1; local124 >= 0; local124--) {
							if (local124 <= local120 - arg4 / 2) {
								arg0[local113] = arg3;
							} else if (arg7) {
								arg0[local113] = arg6;
							}
							local113++;
						}
						local113 += local107;
					}
					return;
				}
				if (arg2 == 3) {
					for (local120 = 0; local120 < arg4; local120++) {
						for (local124 = arg5 - 1; local124 >= 0; local124--) {
							if (local120 - arg4 / 2 >= local124) {
								arg0[local113] = arg3;
							} else if (arg7) {
								arg0[local113] = arg6;
							}
							local113++;
						}
						local113 += local107;
					}
					return;
				}
			}
			if (arg9 == 8) {
				if (arg2 == 0) {
					for (local120 = 0; local120 < arg4; local120++) {
						for (local124 = 0; local124 < arg5; local124++) {
							if (local120 - arg4 / 2 <= local124) {
								arg0[local113] = arg3;
							} else if (arg7) {
								arg0[local113] = arg6;
							}
							local113++;
						}
						local113 += local107;
					}
					return;
				}
				if (arg2 == 1) {
					for (local120 = arg4 - 1; local120 >= 0; local120--) {
						for (local124 = 0; local124 < arg5; local124++) {
							if (local120 - arg4 / 2 <= local124) {
								arg0[local113] = arg3;
							} else if (arg7) {
								arg0[local113] = arg6;
							}
							local113++;
						}
						local113 += local107;
					}
					return;
				}
				if (arg2 == 2) {
					for (local120 = arg4 - 1; local120 >= 0; local120--) {
						for (local124 = arg5 - 1; local124 >= 0; local124--) {
							if (local124 >= local120 - arg4 / 2) {
								arg0[local113] = arg3;
							} else if (arg7) {
								arg0[local113] = arg6;
							}
							local113++;
						}
						local113 += local107;
					}
					return;
				}
				if (arg2 == 3) {
					for (local120 = 0; local120 < arg4; local120++) {
						for (local124 = arg5 - 1; local124 >= 0; local124--) {
							if (local124 >= local120 - arg4 / 2) {
								arg0[local113] = arg3;
							} else if (arg7) {
								arg0[local113] = arg6;
							}
							local113++;
						}
						local113 += local107;
					}
					return;
				}
			}
		} else if (arg2 == 0) {
			for (local120 = arg4 - 1; local120 >= 0; local120--) {
				for (local124 = arg5 - 1; local124 >= 0; local124--) {
					if (local124 >= local120 >> 1) {
						arg0[local113] = arg3;
					} else if (arg7) {
						arg0[local113] = arg6;
					}
					local113++;
				}
				local113 += local107;
			}
		} else if (arg2 == 1) {
			for (local120 = arg4 - 1; local120 >= 0; local120--) {
				for (local124 = 0; local124 < arg5; local124++) {
					if (local124 <= local120 << 1) {
						arg0[local113] = arg3;
					} else if (arg7) {
						arg0[local113] = arg6;
					}
					local113++;
				}
				local113 += local107;
			}
		} else if (arg2 == 2) {
			for (local120 = 0; local120 < arg4; local120++) {
				for (local124 = 0; local124 < arg5; local124++) {
					if (local124 >= local120 >> 1) {
						arg0[local113] = arg3;
					} else if (arg7) {
						arg0[local113] = arg6;
					}
					local113++;
				}
				local113 += local107;
			}
		} else if (arg2 == 3) {
			for (local120 = 0; local120 < arg4; local120++) {
				for (local124 = arg5 - 1; local124 >= 0; local124--) {
					if (local120 << 1 >= local124) {
						arg0[local113] = arg3;
					} else if (arg7) {
						arg0[local113] = arg6;
					}
					local113++;
				}
				local113 += local107;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!oc;Lclient!oc;Lclient!oc;I)V")
	public static void method1777(@OriginalArg(1) Class65 arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) Class65 arg2) {
		Static61.method1078(-1, arg1, 9, arg0, arg2);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZLclient!oc;)V")
	public static void method1778(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
		Static45.aClass1_Sub14_Sub1_8.method1761(134);
		Static45.aClass1_Sub14_Sub1_8.method1730(arg1.method2475());
		Static45.aClass1_Sub14_Sub1_8.method1698(arg0);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
	public static void method1779() {
		Static147.aClass91_15 = new Class91();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!vf;)V")
	public static void method1780(@OriginalArg(1) Class1_Sub26 arg0) {
		Static204.method3260(200000, arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!wd;B)V")
	public static void method1781(@OriginalArg(0) Class97 arg0) {
		@Pc(12) int local12 = arg0.anInt4341 == 0 ? arg0.anInt4354 : arg0.anInt4341;
		@Pc(21) int local21 = arg0.anInt4368 == 0 ? arg0.anInt4353 : arg0.anInt4368;
		Static49.method848(local12, arg0.anInt4376, local21, Static99.aClass97ArrayArray1[arg0.anInt4376 >> 16]);
		if (arg0.aClass97Array2 != null) {
			Static49.method848(local12, arg0.anInt4376, local21, arg0.aClass97Array2);
		}
		@Pc(56) Class1_Sub20 local56 = (Class1_Sub20) Static200.aClass99_14.method3292((long) arg0.anInt4376);
		if (local56 != null) {
			Static144.method2779(local12, local21, local56.anInt3111);
		}
	}
}
