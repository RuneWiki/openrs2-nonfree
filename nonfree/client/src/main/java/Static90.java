import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ra", name = "fb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_81;

	@OriginalMember(owner = "client!ra", name = "ib", descriptor = "Lclient!sb;")
	public static Class25 aClass25_153;

	@OriginalMember(owner = "client!ra", name = "cb", descriptor = "[Lclient!ka;")
	public static Class3_Sub1_Sub1_Sub1_Sub1[] aClass3_Sub1_Sub1_Sub1_Sub1Array9 = new Class3_Sub1_Sub1_Sub1_Sub1[32768];

	@OriginalMember(owner = "client!ra", name = "kb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1581 = Static75.method1216("(U2");

	@OriginalMember(owner = "client!ra", name = "lb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1582 = Static75.method1216("auf der Hautpseite)3");

	@OriginalMember(owner = "client!ra", name = "pb", descriptor = "I")
	public static int anInt2816 = 255;

	@OriginalMember(owner = "client!ra", name = "qb", descriptor = "I")
	public static int anInt2817 = -1;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
	public static void method1913() {
		Static13.aClass8_6.method198();
		Static52.aClass8_17.method198();
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
	public static void method1914() {
		aClass25_153 = null;
		aClass64_81 = null;
		aClass3_Sub1_Sub1_Sub1_Sub1Array9 = null;
		aClass4_1581 = null;
		aClass4_1582 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBI)I")
	public static int method1915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static113.method1933(4, arg1 + 91923, arg0 + 45365) + (Static113.method1933(2, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (Static113.method1933(1, arg1, arg0) + -128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	public static void method1916(@OriginalArg(1) int arg0) {
		if (!Static100.method1650(arg0)) {
			return;
		}
		@Pc(14) Class3_Sub1_Sub14[] local14 = Static104.aClass3_Sub1_Sub14ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			@Pc(27) Class3_Sub1_Sub14 local27 = local14[local21];
			if (local27 != null) {
				local27.anInt2122 = 0;
				local27.anInt2088 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)V")
	public static void method1918() {
		if (Static4.anInt204 < 2 && Static98.anInt2368 == 0 && Static101.anInt2512 == 0) {
			return;
		}
		@Pc(56) Class4 local56;
		if (Static98.anInt2368 == 1 && Static4.anInt204 < 2) {
			local56 = Static60.method1012(new Class4[] { Static9.aClass4_163, Static4.aClass4_109, Static48.aClass4_630, Static75.aClass4_998 });
		} else if (Static101.anInt2512 == 1 && Static4.anInt204 < 2) {
			local56 = Static60.method1012(new Class4[] { Static92.aClass4_1188, Static4.aClass4_109, Static34.aClass4_519, Static75.aClass4_998 });
		} else {
			local56 = Static104.aClass4Array20[Static4.anInt204 - 1];
		}
		if (Static4.anInt204 > 2) {
			local56 = Static60.method1012(new Class4[] { local56, Static81.aClass4_1070, Static93.method1632(Static4.anInt204 - 2), Static4.aClass4_103 });
		}
		Static113.aClass3_Sub1_Sub4_Sub4_3.method1855(local56, 4, 16777215, Static60.anInt1489 / 1000);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Lclient!ad;")
	public static Class4 method1919() {
		@Pc(3) Class4 local3 = new Class4();
		local3.aByteArray1 = new byte[100];
		local3.anInt238 = 0;
		return local3;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!gb;)Lclient!ad;")
	public static Class4 method1921(@OriginalArg(1) Class3_Sub4 arg0) {
		return Static65.method1099(arg0);
	}
}
