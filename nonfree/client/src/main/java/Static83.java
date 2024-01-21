import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "Lclient!sd;")
	public static Class2 aClass2_15;

	@OriginalMember(owner = "client!pa", name = "I", descriptor = "Lclient!m;")
	public static Class3_Sub6 aClass3_Sub6_6;

	@OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
	public static int anInt2050;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "Lclient!ae;")
	private static Class5 aClass5_935 = Static56.method972("On");

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
	public static int anInt2037 = 0;

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "Lclient!ae;")
	public static Class5 aClass5_936 = aClass5_935;

	@OriginalMember(owner = "client!pa", name = "A", descriptor = "Lclient!ae;")
	public static Class5 aClass5_937 = Static56.method972("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>");

	@OriginalMember(owner = "client!pa", name = "B", descriptor = "Lclient!ae;")
	public static Class5 aClass5_938 = Static56.method972("Privater Chat");

	@OriginalMember(owner = "client!pa", name = "E", descriptor = "Lclient!ae;")
	public static Class5 aClass5_939 = Static56.method972("@or3@");

	@OriginalMember(owner = "client!pa", name = "H", descriptor = "Lclient!ae;")
	private static Class5 aClass5_940 = Static56.method972("flash1:");

	@OriginalMember(owner = "client!pa", name = "K", descriptor = "Lclient!ae;")
	public static Class5 aClass5_941 = Static56.method972("@yel@*V");

	@OriginalMember(owner = "client!pa", name = "L", descriptor = "Lclient!ae;")
	public static Class5 aClass5_942 = Static56.method972("Fertigkeit)2");

	@OriginalMember(owner = "client!pa", name = "N", descriptor = "Lclient!ae;")
	public static Class5 aClass5_943 = aClass5_940;

	@OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
	public static int anInt2051 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIB)I")
	public static int method1323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = 256 - arg1;
		return (arg1 * (arg2 & 0xFF00FF) + (arg0 & 0xFF00FF) * local16 & 0xFF00FF00) + (arg1 * (arg2 & 0xFF00) + local16 * (arg0 & 0xFF00) & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
	public static void method1324() {
		if (Static64.anInt1692 == 2) {
			Static5.method177(Static110.anInt2893 * 2, Static112.anInt2933 + (Static35.anInt1011 - Static52.anInt1378 << 7), (-Static109.anInt2875 + Static4.anInt316 << 7) + Static70.anInt1836);
			if (Static15.anInt519 > -1 && Static3.anInt289 % 20 < 10) {
				Static24.aClass3_Sub1_Sub2_Sub3Array1[0].method1437(Static15.anInt519 - 12, Static91.anInt2350 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[Lclient!ae;BI)Lclient!ae;")
	public static Class5 method1325(@OriginalArg(0) int arg0, @OriginalArg(1) Class5[] arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			if (arg1[arg2 + local7] == null) {
				arg1[arg2 + local7] = Static113.aClass5_1337;
			}
			local5 += arg1[local7 + arg2].anInt311;
		}
		@Pc(45) int local45 = 0;
		@Pc(48) byte[] local48 = new byte[local5];
		@Pc(57) Class5 local57;
		for (@Pc(50) int local50 = 0; local50 < arg0; local50++) {
			local57 = arg1[local50 + arg2];
			Static118.method807(local57.aByteArray1, 0, local48, local45, local57.anInt311);
			local45 += local57.anInt311;
		}
		local57 = new Class5();
		local57.anInt311 = local5;
		local57.aByteArray1 = local48;
		return local57;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)V")
	public static void method1326(@OriginalArg(0) int arg0) {
		if (Static93.aClass25_1 == null) {
			return;
		}
		if (Static78.anInt1964 == 0) {
			if (Static42.anInt1188 < 0) {
				return;
			}
			Static42.anInt1188 = arg0;
			Static93.aClass25_1.method1158(0, arg0);
		} else if (Static44.aByteArray8 != null) {
			Static112.anInt2928 = arg0;
			return;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILclient!bf;)[Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4[] method1327(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2) {
		return Static16.method398(arg0, arg1, arg2) ? Static11.method318() : null;
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
	public static void method1329() {
		Static46.anInt1284 = 0;
		Static61.anInt1652 = 0;
		Static33.anInt927 = -1;
		Static103.aBoolean142 = false;
		Static75.anInt1934 = 0;
		Static108.anInt2843 = -1;
		Static95.aClass3_Sub6_Sub1_3.anInt2416 = 0;
		Static53.anInt1403 = 0;
		Static105.anInt2687 = -1;
		Static5.anInt353 = -1;
		Static75.anInt1919 = 0;
		Static69.anInt1818 = 0;
		Static75.aClass3_Sub6_Sub1_2.anInt2416 = 0;
		for (@Pc(39) int local39 = 0; local39 < Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1.length; local39++) {
			if (Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local39] != null) {
				Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local39].anInt1525 = -1;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1.length; local61++) {
			if (Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local61] != null) {
				Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local61].anInt1525 = -1;
			}
		}
		Static115.method1959();
		Static116.method1971(30);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)I")
	public static int method1330(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class3_Sub13 local6 = (Class3_Sub13) Static15.aClass21_4.method459((long) arg0);
		if (local6 == null) {
			return 0;
		} else if (arg1 >= 0 && local6.anIntArray378.length > arg1) {
			return local6.anIntArray378[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)V")
	public static void method1331() {
		while (true) {
			if (Static75.aClass3_Sub6_Sub1_2.method1638(Static61.anInt1652) >= 11) {
				@Pc(14) int local14 = Static75.aClass3_Sub6_Sub1_2.method1646(11);
				if (local14 != 2047) {
					@Pc(21) boolean local21 = false;
					if (Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local14] == null) {
						local21 = true;
						Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local14] = new Class3_Sub1_Sub1_Sub1_Sub2();
						if (Static100.aClass3_Sub6Array1[local14] != null) {
							Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local14].method1002(Static100.aClass3_Sub6Array1[local14]);
						}
					}
					Static1.anIntArray6[Static38.anInt1056++] = local14;
					@Pc(57) Class3_Sub1_Sub1_Sub1_Sub2 local57 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local14];
					local57.anInt1556 = Static3.anInt289;
					@Pc(65) int local65 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
					if (local65 == 1) {
						Static78.anIntArray224[anInt2051++] = local14;
					}
					@Pc(81) int local81 = Static75.aClass3_Sub6_Sub1_2.method1646(5);
					if (local81 > 15) {
						local81 -= 32;
					}
					@Pc(90) int local90 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
					@Pc(97) int local97 = Static16.anIntArray66[Static75.aClass3_Sub6_Sub1_2.method1646(3)];
					if (local21) {
						local57.anInt1517 = local97;
					}
					@Pc(107) int local107 = Static75.aClass3_Sub6_Sub1_2.method1646(5);
					if (local107 > 15) {
						local107 -= 32;
					}
					local57.method991(Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0] + local81, local90 == 1, local107 + Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0]);
					continue;
				}
			}
			Static75.aClass3_Sub6_Sub1_2.method1641();
			return;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
	public static void method1332() {
		aClass5_939 = null;
		aClass5_935 = null;
		aClass5_938 = null;
		aClass5_936 = null;
		aClass2_15 = null;
		aClass3_Sub6_6 = null;
		aClass5_941 = null;
		aClass5_942 = null;
		aClass5_940 = null;
		aClass5_943 = null;
		aClass5_937 = null;
	}
}
