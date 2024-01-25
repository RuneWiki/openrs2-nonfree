import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!em", name = "J", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!em", name = "B", descriptor = "[Lclient!wq;")
	public static final Class31_Sub2_Sub1_Sub2[] aClass31_Sub2_Sub1_Sub2Array1 = new Class31_Sub2_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!em", name = "I", descriptor = "Lclient!hp;")
	public static final Class1_Sub5 aClass1_Sub5_2 = new Class1_Sub5(new byte[5000]);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)V")
	public static void method1757(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub2_Sub6 local14 = Static371.method5808(14, arg0);
		local14.method1775();
	}

	@OriginalMember(owner = "client!em", name = "e", descriptor = "(III)V")
	public static void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class80 local7 = client.lb[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass31_Sub3_3 != null) {
			local7.aClass31_Sub3_3 = null;
		}
		if (local7.aClass31_Sub3_2 != null) {
			local7.aClass31_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II[BB)Ljava/lang/String;")
	public static String method1759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(11) char[] local11 = new char[arg1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
			@Pc(25) int local25 = arg2[arg0 + local15] & 0xFF;
			if (local25 != 0) {
				if (local25 >= 128 && local25 < 160) {
					@Pc(44) char local44 = Static289.aCharArray9[local25 - 128];
					if (local44 == '\u0000') {
						local44 = '?';
					}
					local25 = local44;
				}
				local11[local13++] = (char) local25;
			}
		}
		return new String(local11, 0, local13);
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)V")
	public static void method1761() {
		Static70.aClass134_12.method3272();
		Static64.aClass134_11.method3272();
		Static402.aClass134_52.method3272();
		Static333.aClass134_44.method3272();
		Static43.aClass134_4.method3272();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIILclient!ad;)V")
	public static void method1762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub3 arg2) {
		if (arg2 == null || Static55.aClass181_63.aClass1_179 == arg2) {
			return;
		}
		@Pc(13) int local13 = arg2.anInt116;
		@Pc(16) int local16 = arg2.anInt114;
		@Pc(19) int local19 = arg2.anInt117;
		@Pc(23) int local23 = (int) arg2.aLong10;
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		@Pc(30) long local30 = arg2.aLong10;
		@Pc(39) Class31_Sub2_Sub1_Sub1 local39;
		if (local19 == 11) {
			local39 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local23];
			if (local39 != null) {
				Static47.anInt945 = 0;
				Static62.anInt1464 = 2;
				Static158.anInt2982 = arg0;
				Static16.anInt465 = arg1;
				Static193.method2984(Static321.aClass179_65);
				Static92.aClass1_Sub5_Sub1_1.method5390(local23);
				Static92.aClass1_Sub5_Sub1_1.method5381(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static394.method5261(local39.anIntArray657[0], true, local39.method5989(), -2, local39.method5989(), 0, local39.anIntArray658[0], 0);
			}
		}
		if (local19 == 20) {
			Static158.anInt2982 = arg0;
			Static47.anInt945 = 0;
			Static16.anInt465 = arg1;
			Static62.anInt1464 = 2;
			Static193.method2984(Static74.aClass179_16);
			Static92.aClass1_Sub5_Sub1_1.method5390(Static345.anInt5799 + local16);
			Static92.aClass1_Sub5_Sub1_1.method5375(Static165.anInt3049 + local13);
			Static92.aClass1_Sub5_Sub1_1.method5375(local23);
			Static92.aClass1_Sub5_Sub1_1.method5376(Static306.aClass155_1.method3516(82) ? 1 : 0);
			Static134.method2309(local13, local16);
		}
		if (local19 == 1012 || local19 == 1002 || local19 == 1008 || local19 == 1011 || local19 == 1009) {
			Static325.method4644(local13, local19, local23);
		}
		@Pc(186) Class31_Sub2_Sub1_Sub2 local186;
		if (local19 == 1006) {
			Static62.anInt1464 = 2;
			Static47.anInt945 = 0;
			Static16.anInt465 = arg1;
			Static158.anInt2982 = arg0;
			local186 = aClass31_Sub2_Sub1_Sub2Array1[local23];
			if (local186 != null) {
				@Pc(191) Class53 local191 = local186.aClass53_1;
				if (local191.anIntArray131 != null) {
					local191 = local191.method1508(Static394.aClass23_1);
				}
				if (local191 != null) {
					Static193.method2984(Static352.aClass179_72);
					Static92.aClass1_Sub5_Sub1_1.method5393(local191.lb);
				}
			}
		}
		if (local19 == 13) {
			local39 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local23];
			if (local39 != null) {
				Static16.anInt465 = arg1;
				Static158.anInt2982 = arg0;
				Static47.anInt945 = 0;
				Static62.anInt1464 = 2;
				Static193.method2984(Static290.aClass179_58);
				Static92.aClass1_Sub5_Sub1_1.method5359(local23);
				Static92.aClass1_Sub5_Sub1_1.method5381(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static394.method5261(local39.anIntArray657[0], true, local39.method5989(), -2, local39.method5989(), 0, local39.anIntArray658[0], 0);
			}
		}
		if (local19 == 15) {
			Static47.anInt945 = 0;
			Static158.anInt2982 = arg0;
			Static62.anInt1464 = 2;
			Static16.anInt465 = arg1;
			Static193.method2984(Static153.aClass179_36);
			Static92.aClass1_Sub5_Sub1_1.method5390(Static345.anInt5799 + local16);
			Static92.aClass1_Sub5_Sub1_1.method5394(Static306.aClass155_1.method3516(82) ? 1 : 0);
			Static92.aClass1_Sub5_Sub1_1.method5393(local23);
			Static92.aClass1_Sub5_Sub1_1.method5390(Static165.anInt3049 + local13);
			Static134.method2309(local13, local16);
		}
		if (local19 == 12) {
			local186 = aClass31_Sub2_Sub1_Sub2Array1[local23];
			if (local186 != null) {
				Static158.anInt2982 = arg0;
				Static47.anInt945 = 0;
				Static62.anInt1464 = 2;
				Static16.anInt465 = arg1;
				Static193.method2984(Static214.aClass179_64);
				Static92.aClass1_Sub5_Sub1_1.method5375(local23);
				Static92.aClass1_Sub5_Sub1_1.method5376(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static394.method5261(local186.anIntArray657[0], true, local186.method5989(), -2, local186.method5989(), 0, local186.anIntArray658[0], 0);
			}
		}
		if (local19 == 57) {
			Static62.anInt1464 = 2;
			Static158.anInt2982 = arg0;
			Static16.anInt465 = arg1;
			Static47.anInt945 = 0;
			Static193.method2984(Static368.aClass179_77);
			Static92.aClass1_Sub5_Sub1_1.method5390(Static345.anInt5799 + local16);
			Static92.aClass1_Sub5_Sub1_1.method5375(Static165.anInt3049 + local13);
			Static92.aClass1_Sub5_Sub1_1.method5393((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static92.aClass1_Sub5_Sub1_1.method5381(Static306.aClass155_1.method3516(82) ? 1 : 0);
			Static294.method5967(local16, local30, local13);
		}
		if (local19 == 9) {
			local186 = aClass31_Sub2_Sub1_Sub2Array1[local23];
			if (local186 != null) {
				Static16.anInt465 = arg1;
				Static62.anInt1464 = 2;
				Static47.anInt945 = 0;
				Static158.anInt2982 = arg0;
				Static193.method2984(Static185.aClass179_44);
				Static92.aClass1_Sub5_Sub1_1.method5393(local23);
				Static92.aClass1_Sub5_Sub1_1.method5376(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static394.method5261(local186.anIntArray657[0], true, local186.method5989(), -2, local186.method5989(), 0, local186.anIntArray658[0], 0);
			}
		}
		if (local19 == 19) {
			local186 = aClass31_Sub2_Sub1_Sub2Array1[local23];
			if (local186 != null) {
				Static47.anInt945 = 0;
				Static158.anInt2982 = arg0;
				Static16.anInt465 = arg1;
				Static62.anInt1464 = 2;
				Static193.method2984(Static102.aClass179_25);
				Static92.aClass1_Sub5_Sub1_1.method5393(local23);
				Static92.aClass1_Sub5_Sub1_1.method5376(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static394.method5261(local186.anIntArray657[0], true, local186.method5989(), -2, local186.method5989(), 0, local186.anIntArray658[0], 0);
			}
		}
		if (local19 == 4) {
			Static62.anInt1464 = 2;
			Static16.anInt465 = arg1;
			Static47.anInt945 = 0;
			Static158.anInt2982 = arg0;
			Static193.method2984(Static458.aClass179_96);
			Static92.aClass1_Sub5_Sub1_1.method5393(Static345.anInt5799 + local16);
			Static92.aClass1_Sub5_Sub1_1.method5359(local23);
			Static92.aClass1_Sub5_Sub1_1.method5390(Static165.anInt3049 + local13);
			Static92.aClass1_Sub5_Sub1_1.method5396(Static306.aClass155_1.method3516(82) ? 1 : 0);
			Static134.method2309(local13, local16);
		}
		if (local19 == 21) {
			Static47.anInt945 = 0;
			Static16.anInt465 = arg1;
			Static62.anInt1464 = 2;
			Static158.anInt2982 = arg0;
			Static193.method2984(Static94.aClass179_21);
			Static92.aClass1_Sub5_Sub1_1.method5396(Static306.aClass155_1.method3516(82) ? 1 : 0);
			Static92.aClass1_Sub5_Sub1_1.method5359(Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7301);
			Static92.aClass1_Sub5_Sub1_1.method5390(Static135.anInt2708);
			Static92.aClass1_Sub5_Sub1_1.method5359(Static92.anInt1948);
			Static92.aClass1_Sub5_Sub1_1.method5388(Static314.anInt5418);
		}
		if (local19 == 18) {
			Static62.anInt1464 = 2;
			Static158.anInt2982 = arg0;
			Static47.anInt945 = 0;
			Static16.anInt465 = arg1;
			Static193.method2984(Static362.aClass179_75);
			Static92.aClass1_Sub5_Sub1_1.method5388(Static314.anInt5418);
			Static92.aClass1_Sub5_Sub1_1.method5396(Static306.aClass155_1.method3516(82) ? 1 : 0);
			Static92.aClass1_Sub5_Sub1_1.method5375(Static135.anInt2708);
			Static92.aClass1_Sub5_Sub1_1.method5390(Static92.anInt1948);
			Static92.aClass1_Sub5_Sub1_1.method5375(Integer.MAX_VALUE & (int) (local30 >>> 32));
			Static92.aClass1_Sub5_Sub1_1.method5359(Static345.anInt5799 + local16);
			Static92.aClass1_Sub5_Sub1_1.method5390(local13 + Static165.anInt3049);
			Static294.method5967(local16, local30, local13);
		}
		if (local19 == 48) {
			Static158.anInt2982 = arg0;
			Static47.anInt945 = 0;
			Static16.anInt465 = arg1;
			Static62.anInt1464 = 2;
			Static193.method2984(Static49.aClass179_7);
			Static92.aClass1_Sub5_Sub1_1.method5376(Static306.aClass155_1.method3516(82) ? 1 : 0);
			Static92.aClass1_Sub5_Sub1_1.method5375((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static92.aClass1_Sub5_Sub1_1.method5390(Static165.anInt3049 + local13);
			Static92.aClass1_Sub5_Sub1_1.method5393(local16 + Static345.anInt5799);
			Static294.method5967(local16, local30, local13);
		}
		if (local19 == 44) {
			local186 = aClass31_Sub2_Sub1_Sub2Array1[local23];
			if (local186 != null) {
				Static158.anInt2982 = arg0;
				Static47.anInt945 = 0;
				Static62.anInt1464 = 2;
				Static16.anInt465 = arg1;
				Static193.method2984(Static407.aClass179_89);
				Static92.aClass1_Sub5_Sub1_1.method5396(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static92.aClass1_Sub5_Sub1_1.method5359(local23);
				Static394.method5261(local186.anIntArray657[0], true, local186.method5989(), -2, local186.method5989(), 0, local186.anIntArray658[0], 0);
			}
		}
		if (local19 == 5) {
			Static47.anInt945 = 0;
			Static16.anInt465 = arg1;
			Static62.anInt1464 = 1;
			Static158.anInt2982 = arg0;
			Static193.method2984(Static403.aClass179_86);
			Static92.aClass1_Sub5_Sub1_1.method5375(Static135.anInt2708);
			Static92.aClass1_Sub5_Sub1_1.method5390(local13 + Static165.anInt3049);
			Static92.aClass1_Sub5_Sub1_1.method5373(Static314.anInt5418);
			Static92.aClass1_Sub5_Sub1_1.method5393(Static92.anInt1948);
			Static92.aClass1_Sub5_Sub1_1.method5359(Static345.anInt5799 + local16);
			Static394.method5261(local16, true, 1, -4, 1, 0, local13, 0);
		}
		if (local19 == 17) {
			local39 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local23];
			if (local39 != null) {
				Static47.anInt945 = 0;
				Static62.anInt1464 = 2;
				Static16.anInt465 = arg1;
				Static158.anInt2982 = arg0;
				Static193.method2984(Static94.aClass179_21);
				Static92.aClass1_Sub5_Sub1_1.method5396(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static92.aClass1_Sub5_Sub1_1.method5359(local23);
				Static92.aClass1_Sub5_Sub1_1.method5390(Static135.anInt2708);
				Static92.aClass1_Sub5_Sub1_1.method5359(Static92.anInt1948);
				Static92.aClass1_Sub5_Sub1_1.method5388(Static314.anInt5418);
				Static394.method5261(local39.anIntArray657[0], true, local39.method5989(), -2, local39.method5989(), 0, local39.anIntArray658[0], 0);
			}
		}
		if (local19 == 58) {
			Static47.anInt945 = 0;
			Static16.anInt465 = arg1;
			Static62.anInt1464 = 2;
			Static158.anInt2982 = arg0;
			Static193.method2984(Static79.aClass179_18);
			Static92.aClass1_Sub5_Sub1_1.method5359(local13 + Static165.anInt3049);
			Static92.aClass1_Sub5_Sub1_1.method5390(local23);
			Static92.aClass1_Sub5_Sub1_1.method5396(Static306.aClass155_1.method3516(82) ? 1 : 0);
			Static92.aClass1_Sub5_Sub1_1.method5375(Static345.anInt5799 + local16);
			Static134.method2309(local13, local16);
		}
		@Pc(1054) Class251 local1054;
		if (local19 == 3) {
			local1054 = Static201.method3261(local13, local16);
			if (local1054 != null) {
				Static61.method1293();
				@Pc(1061) Class1_Sub17 local1061 = Static57.method1248(local1054);
				Static19.method504(local1054, local1061.anInt2009, local1061.method1731());
				Static139.aString22 = Static287.method4171(local1054);
				if (Static139.aString22 == null) {
					Static139.aString22 = "Null";
				}
				Static289.aString63 = local1054.aString66 + "<col=ffffff>";
			}
			return;
		}
		if (local19 == 10) {
			Static62.anInt1464 = 2;
			Static16.anInt465 = arg1;
			Static158.anInt2982 = arg0;
			Static47.anInt945 = 0;
			Static193.method2984(Static404.aClass179_87);
			Static92.aClass1_Sub5_Sub1_1.method5393(Static135.anInt2708);
			Static92.aClass1_Sub5_Sub1_1.method5390(Static92.anInt1948);
			Static92.aClass1_Sub5_Sub1_1.method5390(local23);
			Static92.aClass1_Sub5_Sub1_1.method5375(local16 + Static345.anInt5799);
			Static92.aClass1_Sub5_Sub1_1.method5375(local13 + Static165.anInt3049);
			Static92.aClass1_Sub5_Sub1_1.method5394(Static306.aClass155_1.method3516(82) ? 1 : 0);
			Static92.aClass1_Sub5_Sub1_1.method5373(Static314.anInt5418);
			Static134.method2309(local13, local16);
		}
		if (local19 == 50) {
			if (Static225.anInt4107 > 0 && Static306.aClass155_1.method3516(82) && Static306.aClass155_1.method3516(81)) {
				Static192.method2982(Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100, local16 + Static345.anInt5799, Static165.anInt3049 - -local13);
			} else {
				Static47.anInt945 = 0;
				Static16.anInt465 = arg1;
				Static158.anInt2982 = arg0;
				Static62.anInt1464 = 1;
				Static193.method2984(Static140.aClass179_32);
				Static92.aClass1_Sub5_Sub1_1.method5359(Static345.anInt5799 + local16);
				Static92.aClass1_Sub5_Sub1_1.method5359(Static165.anInt3049 + local13);
			}
		}
		if (local19 == 2 && Static182.aClass251_6 == null) {
			Static60.method1282(local16, local13);
			Static182.aClass251_6 = Static201.method3261(local13, local16);
			Static408.method5469(Static182.aClass251_6);
		}
		if (local19 == 49) {
			Static62.anInt1464 = 2;
			Static47.anInt945 = 0;
			Static16.anInt465 = arg1;
			Static158.anInt2982 = arg0;
			Static193.method2984(Static217.aClass179_48);
			Static92.aClass1_Sub5_Sub1_1.method5393(Static165.anInt3049 + local13);
			Static92.aClass1_Sub5_Sub1_1.method5390(local16 + Static345.anInt5799);
			Static92.aClass1_Sub5_Sub1_1.method5381(Static306.aClass155_1.method3516(82) ? 1 : 0);
			Static92.aClass1_Sub5_Sub1_1.method5359((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static294.method5967(local16, local30, local13);
		}
		if (local19 == 51) {
			local1054 = Static201.method3261(local13, local16);
			if (local1054 != null) {
				Static192.method2981(local1054);
			}
		}
		if (local19 == 45) {
			Static158.anInt2982 = arg0;
			Static47.anInt945 = 0;
			Static16.anInt465 = arg1;
			Static62.anInt1464 = 2;
			Static193.method2984(Static178.aClass179_42);
			Static92.aClass1_Sub5_Sub1_1.method5390(local23);
			Static92.aClass1_Sub5_Sub1_1.method5381(Static306.aClass155_1.method3516(82) ? 1 : 0);
			Static92.aClass1_Sub5_Sub1_1.method5359(local16 + Static345.anInt5799);
			Static92.aClass1_Sub5_Sub1_1.method5359(local13 + Static165.anInt3049);
			Static134.method2309(local13, local16);
		}
		if (local19 == 22 || local19 == 1007) {
			Static87.method1621(local16, arg2.aString1, local13, local23);
		}
		if (local19 == 46) {
			local39 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local23];
			if (local39 != null) {
				Static16.anInt465 = arg1;
				Static158.anInt2982 = arg0;
				Static62.anInt1464 = 2;
				Static47.anInt945 = 0;
				Static193.method2984(Static37.aClass179_5);
				Static92.aClass1_Sub5_Sub1_1.method5381(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static92.aClass1_Sub5_Sub1_1.method5393(local23);
				Static394.method5261(local39.anIntArray657[0], true, local39.method5989(), -2, local39.method5989(), 0, local39.anIntArray658[0], 0);
			}
		}
		if (local19 == 1004) {
			Static62.anInt1464 = 2;
			Static158.anInt2982 = arg0;
			Static16.anInt465 = arg1;
			Static47.anInt945 = 0;
			Static193.method2984(Static90.aClass179_19);
			Static92.aClass1_Sub5_Sub1_1.method5393(local23);
		}
		if (local19 == 1003) {
			Static47.anInt945 = 0;
			Static16.anInt465 = arg1;
			Static158.anInt2982 = arg0;
			Static62.anInt1464 = 2;
			Static193.method2984(Static145.aClass179_33);
			Static92.aClass1_Sub5_Sub1_1.method5393(local23);
		}
		if (local19 == 25) {
			local186 = aClass31_Sub2_Sub1_Sub2Array1[local23];
			if (local186 != null) {
				Static16.anInt465 = arg1;
				Static62.anInt1464 = 2;
				Static47.anInt945 = 0;
				Static158.anInt2982 = arg0;
				Static193.method2984(Static365.aClass179_76);
				Static92.aClass1_Sub5_Sub1_1.method5375(Static92.anInt1948);
				Static92.aClass1_Sub5_Sub1_1.method5390(Static135.anInt2708);
				Static92.aClass1_Sub5_Sub1_1.method5375(local23);
				Static92.aClass1_Sub5_Sub1_1.method5388(Static314.anInt5418);
				Static92.aClass1_Sub5_Sub1_1.method5396(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static394.method5261(local186.anIntArray657[0], true, local186.method5989(), -2, local186.method5989(), 0, local186.anIntArray658[0], 0);
			}
		}
		if (local19 == 23) {
			local39 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local23];
			if (local39 != null) {
				Static16.anInt465 = arg1;
				Static158.anInt2982 = arg0;
				Static62.anInt1464 = 2;
				Static47.anInt945 = 0;
				Static193.method2984(Static332.aClass179_69);
				Static92.aClass1_Sub5_Sub1_1.method5393(local23);
				Static92.aClass1_Sub5_Sub1_1.method5381(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static394.method5261(local39.anIntArray657[0], true, local39.method5989(), -2, local39.method5989(), 0, local39.anIntArray658[0], 0);
			}
		}
		if (local19 == 47) {
			Static16.anInt465 = arg1;
			Static47.anInt945 = 0;
			Static158.anInt2982 = arg0;
			Static62.anInt1464 = 2;
			Static193.method2984(Static165.aClass179_39);
			Static92.aClass1_Sub5_Sub1_1.method5375(Integer.MAX_VALUE & (int) (local30 >>> 32));
			Static92.aClass1_Sub5_Sub1_1.method5390(Static345.anInt5799 + local16);
			Static92.aClass1_Sub5_Sub1_1.method5381(Static306.aClass155_1.method3516(82) ? 1 : 0);
			Static92.aClass1_Sub5_Sub1_1.method5390(local13 + Static165.anInt3049);
			Static294.method5967(local16, local30, local13);
		}
		if (local19 == 16) {
			local186 = aClass31_Sub2_Sub1_Sub2Array1[local23];
			if (local186 != null) {
				Static47.anInt945 = 0;
				Static62.anInt1464 = 2;
				Static158.anInt2982 = arg0;
				Static16.anInt465 = arg1;
				Static193.method2984(Static161.aClass179_37);
				Static92.aClass1_Sub5_Sub1_1.method5381(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static92.aClass1_Sub5_Sub1_1.method5390(local23);
				Static394.method5261(local186.anIntArray657[0], true, local186.method5989(), -2, local186.method5989(), 0, local186.anIntArray658[0], 0);
			}
		}
		if (local19 == 60) {
			local39 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local23];
			if (local39 != null) {
				Static47.anInt945 = 0;
				Static62.anInt1464 = 2;
				Static16.anInt465 = arg1;
				Static158.anInt2982 = arg0;
				Static193.method2984(Static59.aClass179_8);
				Static92.aClass1_Sub5_Sub1_1.method5376(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static92.aClass1_Sub5_Sub1_1.method5390(local23);
				Static394.method5261(local39.anIntArray657[0], true, local39.method5989(), -2, local39.method5989(), 0, local39.anIntArray658[0], 0);
			}
		}
		if (local19 == 59) {
			local39 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local23];
			if (local39 != null) {
				Static16.anInt465 = arg1;
				Static47.anInt945 = 0;
				Static62.anInt1464 = 2;
				Static158.anInt2982 = arg0;
				Static193.method2984(Static246.aClass179_60);
				Static92.aClass1_Sub5_Sub1_1.method5396(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static92.aClass1_Sub5_Sub1_1.method5359(local23);
				Static394.method5261(local39.anIntArray657[0], true, local39.method5989(), -2, local39.method5989(), 0, local39.anIntArray658[0], 0);
			}
		}
		if (local19 == 30) {
			local39 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local23];
			if (local39 != null) {
				Static62.anInt1464 = 2;
				Static158.anInt2982 = arg0;
				Static16.anInt465 = arg1;
				Static47.anInt945 = 0;
				Static193.method2984(Static306.aClass179_63);
				Static92.aClass1_Sub5_Sub1_1.method5359(local23);
				Static92.aClass1_Sub5_Sub1_1.method5381(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static394.method5261(local39.anIntArray657[0], true, local39.method5989(), -2, local39.method5989(), 0, local39.anIntArray658[0], 0);
			}
		}
		if (local19 == 6) {
			local39 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local23];
			if (local39 != null) {
				Static47.anInt945 = 0;
				Static16.anInt465 = arg1;
				Static62.anInt1464 = 2;
				Static158.anInt2982 = arg0;
				Static193.method2984(Static358.aClass179_74);
				Static92.aClass1_Sub5_Sub1_1.method5394(Static306.aClass155_1.method3516(82) ? 1 : 0);
				Static92.aClass1_Sub5_Sub1_1.method5390(local23);
				Static394.method5261(local39.anIntArray657[0], true, local39.method5989(), -2, local39.method5989(), 0, local39.anIntArray658[0], 0);
			}
		}
		if (local19 == 8) {
			if (Static225.anInt4107 > 0 && Static306.aClass155_1.method3516(82) && Static306.aClass155_1.method3516(81)) {
				Static192.method2982(Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100, Static345.anInt5799 + local16, local13 + Static165.anInt3049);
			} else {
				Static100.method1783(local13, local23, local16);
				if (local23 == 1) {
					Static92.aClass1_Sub5_Sub1_1.method5396(-1);
					Static92.aClass1_Sub5_Sub1_1.method5396(-1);
					Static92.aClass1_Sub5_Sub1_1.method5393((int) Static142.aFloat89);
					Static92.aClass1_Sub5_Sub1_1.method5396(57);
					Static92.aClass1_Sub5_Sub1_1.method5396(Static82.anInt1815);
					Static92.aClass1_Sub5_Sub1_1.method5396(Static119.anInt840);
					Static92.aClass1_Sub5_Sub1_1.method5396(89);
					Static92.aClass1_Sub5_Sub1_1.method5393(Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300);
					Static92.aClass1_Sub5_Sub1_1.method5393(Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298);
					Static92.aClass1_Sub5_Sub1_1.method5396(63);
				} else {
					Static62.anInt1464 = 1;
					Static16.anInt465 = arg1;
					Static158.anInt2982 = arg0;
					Static47.anInt945 = 0;
				}
				Static394.method5261(local16, true, 1, -4, 1, 0, local13, 0);
			}
		}
		if (local19 == 1010) {
			Static16.anInt465 = arg1;
			Static62.anInt1464 = 2;
			Static47.anInt945 = 0;
			Static158.anInt2982 = arg0;
			Static193.method2984(Static37.aClass179_4);
			Static92.aClass1_Sub5_Sub1_1.method5359((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static92.aClass1_Sub5_Sub1_1.method5376(Static306.aClass155_1.method3516(82) ? 1 : 0);
			Static92.aClass1_Sub5_Sub1_1.method5375(local16 + Static345.anInt5799);
			Static92.aClass1_Sub5_Sub1_1.method5393(local13 + Static165.anInt3049);
			Static294.method5967(local16, local30, local13);
		}
		if (Static355.aBoolean412) {
			Static61.method1293();
		}
		if (Static453.aClass251_13 != null && Static440.anInt7079 == 0) {
			Static408.method5469(Static453.aClass251_13);
		}
	}
}
