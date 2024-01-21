import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "Lclient!ff;")
	public static Class3_Sub1_Sub5_Sub2 aClass3_Sub1_Sub5_Sub2_3;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "[Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4[] aClass3_Sub1_Sub5_Sub4Array12;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "[Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3[] aClass3_Sub1_Sub5_Sub3Array8;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Z")
	public static boolean aBoolean83 = false;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Lclient!na;")
	private static Class53 aClass53_1019 = Static109.method1737("This world is full)3");

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!na;")
	public static Class53 aClass53_1020 = aClass53_1019;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!na;")
	private static Class53 aClass53_1023 = Static109.method1737("Click to switch");

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!na;")
	public static Class53 aClass53_1021 = aClass53_1023;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!na;")
	public static Class53 aClass53_1022 = Static109.method1737("weiss:");

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "Lclient!na;")
	public static Class53 aClass53_1024 = Static109.method1737("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
	public static void method1457(@OriginalArg(1) int arg0) {
		Static33.anInt1985 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method1458() {
		aClass53_1019 = null;
		aClass53_1023 = null;
		aClass53_1021 = null;
		aClass53_1022 = null;
		aClass3_Sub1_Sub5_Sub2_3 = null;
		aClass3_Sub1_Sub5_Sub4Array12 = null;
		aClass3_Sub1_Sub5_Sub3Array8 = null;
		aClass53_1024 = null;
		aClass53_1020 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method1459() {
		try {
			if (Static99.aClass28_1 == null) {
				Static99.aClass28_1 = new Class28(Static4.aClass6_1, Static103.method1689(new Class53[] { Static3.aClass53_21, Static35.aClass53_468, Static51.aClass53_622 }).method1280());
			} else {
				@Pc(32) byte[] local32 = Static99.aClass28_1.method779();
				if (local32 != null) {
					@Pc(39) Class3_Sub7 local39 = new Class3_Sub7(local32);
					Static42.anInt1219 = local39.method602();
					Static10.aClass49Array1 = new Class49[Static42.anInt1219];
					for (@Pc(48) int local48 = 0; local48 < Static42.anInt1219; local48++) {
						@Pc(58) Class49 local58 = Static10.aClass49Array1[local48] = new Class49();
						@Pc(62) int local62 = local39.method602();
						local58.anInt1831 = local62 & 0x7FFF;
						local58.aBoolean68 = (local62 & 0x8000) != 0;
						local58.aClass53_826 = local39.method605();
						local58.anInt1834 = local39.method649();
						local58.anInt1835 = local48;
						local58.anInt1828 = Static62.method1106(local58.aClass53_826);
					}
					Static111.method1784(Static10.aClass49Array1.length - 1, Static93.anIntArray300, Static77.anIntArray259, 0, Static10.aClass49Array1);
					Static86.aBoolean79 = true;
					Static99.aClass28_1 = null;
				}
			}
		} catch (@Pc(120) Exception local120) {
			Static99.aClass28_1 = null;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!na;Lclient!na;BLclient!we;)[Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4[] method1460(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(4) int local4 = arg2.method1504(arg0);
		@Pc(10) int local10 = arg2.method1502(arg1, local4);
		return Static59.method1071(local4, arg2, local10);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)Lclient!ce;")
	public static Class3_Sub1_Sub3 method1461(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub3 local10 = (Class3_Sub1_Sub3) Static90.aClass75_60.method1728((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static101.aClass62_23.method1512(13, arg0);
		local10 = new Class3_Sub1_Sub3();
		local10.anInt360 = arg0;
		if (local20 != null) {
			local10.method238(new Class3_Sub7(local20));
		}
		Static90.aClass75_60.method1730(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)J")
	public static synchronized long method1462() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static19.aLong77 > local5) {
			Static106.aLong79 += Static19.aLong77 - local5;
		}
		Static19.aLong77 = local5;
		return local5 + Static106.aLong79;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
	public static void method1463() {
		Static122.anIntArray411 = null;
		Static27.anIntArrayArrayArray1 = null;
		Static124.anIntArray416 = null;
		Static73.anIntArrayArray15 = null;
		Static107.aByteArrayArrayArray18 = null;
		Static85.anIntArray270 = null;
		Static70.aByteArrayArrayArray15 = null;
		Static82.aByteArrayArrayArray6 = null;
		Static108.anIntArray328 = null;
		Static40.aByteArrayArrayArray9 = null;
		Static46.anIntArray415 = null;
		Static104.aByteArrayArrayArray19 = null;
	}
}
