import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString20;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_64 = new Class157(28, 3);

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
	public static int anInt1783 = -2;

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
	public static int anInt1787 = -1;

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "Lclient!fh;")
	public static Class68 aClass68_12 = null;

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "J")
	public static long aLong62 = 0L;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IZ)Lclient!cj;")
	public static Class2_Sub3 method1820(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub3_Sub1();
		} else if (arg0 == 1) {
			return new Class2_Sub3_Sub15();
		} else if (arg0 == 2) {
			return new Class2_Sub3_Sub29();
		} else if (arg0 == 3) {
			return new Class2_Sub3_Sub28();
		} else if (arg0 == 4) {
			return new Class2_Sub3_Sub21();
		} else if (arg0 == 5) {
			return new Class2_Sub3_Sub30();
		} else if (arg0 == 6) {
			return new Class2_Sub3_Sub34();
		} else if (arg0 == 7) {
			return new Class2_Sub3_Sub31();
		} else if (arg0 == 8) {
			return new Class2_Sub3_Sub3();
		} else if (arg0 == 9) {
			return new Class2_Sub3_Sub11();
		} else if (arg0 == 10) {
			return new Class2_Sub3_Sub18();
		} else if (arg0 == 11) {
			return new Class2_Sub3_Sub6();
		} else if (arg0 == 12) {
			return new Class2_Sub3_Sub4();
		} else if (arg0 == 13) {
			return new Class2_Sub3_Sub22();
		} else if (arg0 == 14) {
			return new Class2_Sub3_Sub33();
		} else if (arg0 == 15) {
			return new Class2_Sub3_Sub25();
		} else if (arg0 == 16) {
			return new Class2_Sub3_Sub5();
		} else if (arg0 == 17) {
			return new Class2_Sub3_Sub37();
		} else if (arg0 == 18) {
			return new Class2_Sub3_Sub12_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub3_Sub24();
		} else if (arg0 == 20) {
			return new Class2_Sub3_Sub35();
		} else if (arg0 == 21) {
			return new Class2_Sub3_Sub16();
		} else if (arg0 == 22) {
			return new Class2_Sub3_Sub17();
		} else if (arg0 == 23) {
			return new Class2_Sub3_Sub19();
		} else if (arg0 == 24) {
			return new Class2_Sub3_Sub8();
		} else if (arg0 == 25) {
			return new Class2_Sub3_Sub39();
		} else if (arg0 == 26) {
			return new Class2_Sub3_Sub9();
		} else if (arg0 == 27) {
			return new Class2_Sub3_Sub27();
		} else if (arg0 == 28) {
			return new Class2_Sub3_Sub20();
		} else if (arg0 == 29) {
			return new Class2_Sub3_Sub7();
		} else if (arg0 == 30) {
			return new Class2_Sub3_Sub32();
		} else if (arg0 == 31) {
			return new Class2_Sub3_Sub23();
		} else if (arg0 == 32) {
			return new Class2_Sub3_Sub14();
		} else if (arg0 == 33) {
			return new Class2_Sub3_Sub2();
		} else if (arg0 == 34) {
			return new Class2_Sub3_Sub10();
		} else if (arg0 == 35) {
			return new Class2_Sub3_Sub13();
		} else if (arg0 == 36) {
			return new Class2_Sub3_Sub26();
		} else if (arg0 == 37) {
			return new Class2_Sub3_Sub36();
		} else if (arg0 == 38) {
			return new Class2_Sub3_Sub38();
		} else if (arg0 == 39) {
			return new Class2_Sub3_Sub12();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZ)I")
	public static int method1821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(30) int local30 = ((arg1 & 0xFF00FF) * local7 & 0xFF00FF00 | (arg1 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		@Pc(35) int local35 = 255 - local7;
		return ((local35 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local35 & 0xFF0000) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)Lclient!gr;")
	public static Class84 method1822(@OriginalArg(0) int arg0) {
		@Pc(5) Class107 local5 = Static300.aClass107_49;
		@Pc(14) Class84 local14;
		synchronized (Static300.aClass107_49) {
			local14 = (Class84) Static300.aClass107_49.method3021((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(36) byte[] local36 = Static294.aClass104_150.method2756(Static31.method425(arg0), Static218.method4153(arg0));
		local14 = new Class84();
		local14.anInt2448 = arg0;
		if (local36 != null) {
			local14.method2271(new Class2_Sub12(local36));
		}
		local14.method2275();
		@Pc(62) Class107 local62 = Static300.aClass107_49;
		synchronized (Static300.aClass107_49) {
			Static300.aClass107_49.method3018((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!je;ILclient!jk;I)V")
	public static void method1823(@OriginalArg(1) Class1_Sub2_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub12_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(15) int local15;
		@Pc(26) int local26;
		@Pc(32) int local32;
		if ((arg3 & 0x2000) != 0) {
			local15 = arg2.method3132();
			@Pc(18) int[] local18 = new int[local15];
			@Pc(21) int[] local21 = new int[local15];
			@Pc(24) int[] local24 = new int[local15];
			for (local26 = 0; local26 < local15; local26++) {
				local32 = arg2.method3116();
				if (local32 == 65535) {
					local32 = -1;
				}
				local18[local26] = local32;
				local21[local26] = arg2.method3132();
				local24[local26] = arg2.method3109();
			}
			Static2.method57(arg0, local24, local18, local21);
		}
		if ((arg3 & 0x200) != 0) {
			arg0.aString73 = arg2.method3113();
			if (arg0.aString73.charAt(0) == '~') {
				arg0.aString73 = arg0.aString73.substring(1);
				Static67.method3711(0, arg0.method2966(), 2, arg0.aString73, arg0.method2975());
			} else if (Static177.aClass1_Sub2_Sub3_Sub1_1 == arg0) {
				Static67.method3711(0, arg0.method2966(), 2, arg0.aString73, arg0.method2975());
			}
			arg0.anInt6958 = 0;
			arg0.anInt6905 = 0;
			arg0.anInt6936 = 150;
		}
		if ((arg3 & 0x400) != 0) {
			local15 = arg2.method3116();
			arg0.anInt6938 = arg2.method3124();
			arg0.anInt6913 = arg2.method3146();
			arg0.anInt6920 = local15 & 0x7FFF;
			arg0.aBoolean616 = (local15 & 0x8000) != 0;
			arg0.anInt6924 = arg0.anInt6920 + Static6.anInt91 + arg0.anInt6938;
		}
		if ((arg3 & 0x8) != 0) {
			arg0.anInt3402 = arg2.method3109();
			if (arg0.anInt6962 == 0) {
				arg0.method5773(arg0.anInt3402);
				arg0.anInt3402 = -1;
			}
		}
		if ((arg3 & 0x4) != 0) {
			local15 = arg2.method3104();
			if (local15 == 65535) {
				local15 = -1;
			}
			arg0.anInt6916 = local15;
		}
		@Pc(230) int local230;
		@Pc(234) int local234;
		@Pc(237) int local237;
		if ((arg3 & 0x20) != 0) {
			local15 = arg2.method3104();
			local230 = arg2.method3132();
			local234 = arg2.method3140();
			local237 = arg2.anInt3606;
			@Pc(245) boolean local245 = (local15 & 0x8000) != 0;
			if (arg0.aString34 != null && arg0.aClass217_1 != null) {
				@Pc(253) boolean local253 = false;
				if (local230 <= 1) {
					if (!local245 && (Static283.aBoolean505 && !Static237.aBoolean443 || Static359.aBoolean608)) {
						local253 = true;
					} else if (Static18.method269(arg0.aString34)) {
						local253 = true;
					}
				}
				if (!local253 && Static137.anInt2913 == 0) {
					Static241.aClass2_Sub12_5.anInt3606 = 0;
					arg2.method3119(Static241.aClass2_Sub12_5.aByteArray30, local234);
					Static241.aClass2_Sub12_5.anInt3606 = 0;
					@Pc(297) int local297 = -1;
					@Pc(316) String local316;
					if (local245) {
						local15 &= 0x7FFF;
						@Pc(307) Class85 local307 = Static178.method5760(Static241.aClass2_Sub12_5);
						local297 = local307.anInt2466;
						local316 = local307.aClass2_Sub9_Sub8_1.method2567(Static241.aClass2_Sub12_5);
					} else {
						local316 = Static313.method5191(Static272.method4036(Static355.method5673(Static241.aClass2_Sub12_5)));
					}
					arg0.aString73 = local316.trim();
					arg0.anInt6958 = local15 >> 8;
					arg0.anInt6905 = local15 & 0xFF;
					arg0.anInt6936 = 150;
					@Pc(359) int local359;
					if (local230 == 1 || local230 == 2) {
						local359 = local245 ? 17 : 1;
					} else {
						local359 = local245 ? 17 : 2;
					}
					if (local230 == 2) {
						Static113.method2231(local316, local359, "<img=1>" + arg0.method2966(), "<img=1>" + arg0.method2975(), local297, null, 0);
					} else if (local230 == 1) {
						Static113.method2231(local316, local359, "<img=0>" + arg0.method2966(), "<img=0>" + arg0.method2975(), local297, null, 0);
					} else {
						Static113.method2231(local316, local359, arg0.method2966(), arg0.method2975(), local297, null, 0);
					}
				}
			}
			arg2.anInt3606 = local234 + local237;
		}
		if ((arg3 & 0x2) != 0) {
			local15 = arg2.method3146();
			@Pc(462) byte[] local462 = new byte[local15];
			@Pc(467) Class2_Sub12 local467 = new Class2_Sub12(local462);
			arg2.method3160(local462, local15);
			Static165.aClass2_Sub12Array1[arg1] = local467;
			arg0.method2969(local467);
		}
		if ((arg3 & 0x10) != 0) {
			local230 = arg2.method3153();
			local234 = arg2.method3146();
			arg0.method5779(local230, Static6.anInt91, local234);
			arg0.anInt6935 = Static6.anInt91 + 300;
			arg0.anInt6923 = arg2.method3146();
		}
		if ((arg3 & 0x100) != 0) {
			local230 = arg2.method3099();
			local234 = arg2.method3148();
			if (local230 == 65535) {
				local230 = -1;
			}
			@Pc(538) boolean local538 = true;
			@Pc(623) Class84 local623;
			if (local230 != -1 && arg0.anInt6902 != -1) {
				@Pc(557) Class177 local557;
				if (arg0.anInt6902 == local230) {
					local557 = Static41.method4707(local230);
					if (local557.aBoolean516 && local557.anInt5808 != -1) {
						@Pc(570) Class84 local570 = method1822(local557.anInt5808);
						@Pc(573) int local573 = local570.anInt2456;
						if (local573 == 0) {
							local538 = false;
						} else if (local573 == 1) {
							local538 = true;
						} else if (local573 == 2) {
							local538 = false;
							arg0.anInt6908 = 0;
						}
					}
				} else {
					local557 = Static41.method4707(local230);
					@Pc(609) Class177 local609 = Static41.method4707(arg0.anInt6902);
					if (local557.anInt5808 != -1 && local609.anInt5808 != -1) {
						local623 = method1822(local557.anInt5808);
						@Pc(628) Class84 local628 = method1822(local609.anInt5808);
						if (local628.anInt2459 > local623.anInt2459) {
							local538 = false;
						}
					}
				}
			}
			if (local538) {
				arg0.anInt6946 = local234 >> 16;
				local26 = Static6.anInt91;
				arg0.anInt6902 = local230;
				arg0.anInt6945 = 0;
				arg0.anInt6948 = local26 + (local234 & 0xFFFF);
				arg0.anInt6898 = 0;
				arg0.anInt6957 = 1;
				if (local26 < arg0.anInt6948) {
					arg0.anInt6898 = -1;
				}
				if (arg0.anInt6902 != -1 && arg0.anInt6948 == local26) {
					local32 = Static41.method4707(arg0.anInt6902).anInt5808;
					if (local32 != -1) {
						local623 = method1822(local32);
						if (local623 != null && local623.anIntArray197 != null) {
							Static41.method4705(Static177.aClass1_Sub2_Sub3_Sub1_1 == arg0, 0, arg0.anInt6888, arg0.anInt6893, local623, arg0.aByte77);
						}
					}
				}
			}
		}
		if ((arg3 & 0x4000) != 0) {
			local7 = arg2.method3157();
		}
		if ((arg3 & 0x1000) != 0) {
			local230 = Static6.anInt91;
			local234 = arg2.method3153();
			local237 = arg2.method3124();
			arg0.method5779(local234, local230, local237);
		}
		if ((arg3 & 0x800) != 0) {
			arg0.anInt6910 = arg2.method3151();
			arg0.anInt6918 = arg2.method3122();
			arg0.anInt6911 = arg2.method3151();
			arg0.lb = arg2.method3145();
			arg0.anInt6956 = arg2.method3104() + Static6.anInt91;
			arg0.anInt6933 = arg2.method3116() + Static6.anInt91;
			arg0.anInt6950 = arg2.method3146();
			if (arg0.anInt3394 == -1) {
				arg0.anInt6918 += arg0.anIntArray534[0];
				arg0.anInt6911 += arg0.anIntArray535[0];
				arg0.anInt6910 += arg0.anIntArray535[0];
				arg0.lb += arg0.anIntArray534[0];
				arg0.anInt6962 = 1;
			} else {
				arg0.anInt6962 = 0;
				arg0.anInt6910 += arg0.anInt3394;
				arg0.anInt6918 += arg0.anInt3399;
				arg0.lb += arg0.anInt3399;
				arg0.anInt6911 += arg0.anInt3394;
			}
			arg0.anInt6963 = 0;
		}
		if ((arg3 & 0x80) != 0) {
			local230 = arg2.method3116();
			if (local230 == 65535) {
				local230 = -1;
			}
			local234 = arg2.method3140();
			Static65.method2534(local234, local230, arg0);
		}
		if ((arg3 & 0x40) != 0) {
			Static28.aByteArray5[arg1] = arg2.method3151();
		}
		if (arg0.anInt3394 == -1) {
			return;
		}
		if (local7 == 127) {
			arg0.method2970(arg0.anInt3399, arg0.anInt3394);
			return;
		}
		@Pc(922) byte local922;
		if (local7 == -1) {
			local922 = Static28.aByteArray5[arg1];
		} else {
			local922 = local7;
		}
		arg0.method2971(local922, arg0.anInt3399, arg0.anInt3394);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)Lclient!ee;")
	public static Class59 method1825(@OriginalArg(1) int arg0) {
		@Pc(5) Class107 local5 = Static196.aClass107_21;
		@Pc(16) Class59 local16;
		synchronized (Static196.aClass107_21) {
			local16 = (Class59) Static196.aClass107_21.method3021((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(32) byte[] local32 = Static282.aClass104_147.method2756(16, arg0);
		local16 = new Class59();
		if (local32 != null) {
			local16.method1485(new Class2_Sub12(local32));
		}
		@Pc(47) Class107 local47 = Static196.aClass107_21;
		synchronized (Static196.aClass107_21) {
			Static196.aClass107_21.method3018((long) arg0, local16);
			return local16;
		}
	}
}
