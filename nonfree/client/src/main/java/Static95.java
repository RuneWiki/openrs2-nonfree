import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "Lclient!v;")
	private static Class62 aClass62_1152 = Static45.method753("Please wait)3)3)3");

	@OriginalMember(owner = "client!tb", name = "ab", descriptor = "Lclient!v;")
	public static Class62 aClass62_1153 = aClass62_1152;

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1154 = Static45.method753("runes");

	@OriginalMember(owner = "client!tb", name = "mb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1155 = Static45.method753("Ung\u001c1ltige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!tb", name = "nb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1156 = Static45.method753("leuchten1:");

	@OriginalMember(owner = "client!tb", name = "sb", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!tb", name = "ub", descriptor = "Lclient!v;")
	public static Class62 aClass62_1157 = Static45.method753("Benutzen");

	@OriginalMember(owner = "client!tb", name = "xb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1158 = Static45.method753(" (X");

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!id;")
	public static RuntimeException_Sub1 method1609(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub1 local5;
		if (arg0 instanceof RuntimeException_Sub1) {
			local5 = (RuntimeException_Sub1) arg0;
			local5.aString1 = local5.aString1 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
	public static void method1610() {
		if (Static94.aClass41_4 != null) {
			Static94.aClass41_4.method1025();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ab;B)V")
	public static void method1611(@OriginalArg(0) Class3_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static75.anIntArray229.length; local3++) {
			Static75.anIntArray229[local3] = 0;
		}
		@Pc(40) int local40;
		for (@Pc(30) int local30 = 0; local30 < 5000; local30++) {
			local40 = (int) (Math.random() * 128.0D * (double) 256);
			Static75.anIntArray229[local40] = (int) (Math.random() * 256.0D);
		}
		@Pc(63) int local63;
		@Pc(67) int local67;
		@Pc(75) int local75;
		for (local40 = 0; local40 < 20; local40++) {
			for (local63 = 1; local63 < 255; local63++) {
				for (local67 = 1; local67 < 127; local67++) {
					local75 = local67 + (local63 << 7);
					Static102.anIntArray292[local75] = (Static75.anIntArray229[local75 + 128] + Static75.anIntArray229[local75 - 128] + Static75.anIntArray229[local75 + -1] + Static75.anIntArray229[local75 - -1]) / 4;
				}
			}
			@Pc(118) int[] local118 = Static75.anIntArray229;
			Static75.anIntArray229 = Static102.anIntArray292;
			Static102.anIntArray292 = local118;
		}
		if (arg0 == null) {
			return;
		}
		local63 = 0;
		for (local67 = 0; local67 < arg0.anInt148; local67++) {
			for (local75 = 0; local75 < arg0.anInt152; local75++) {
				if (arg0.aByteArray3[local63++] != 0) {
					@Pc(153) int local153 = arg0.anInt153 + local75 + 16;
					@Pc(161) int local161 = local67 + arg0.anInt150 + 16;
					@Pc(168) int local168 = local153 + (local161 << 7);
					Static75.anIntArray229[local168] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Lclient!bd;I)V")
	public static void method1613(@OriginalArg(0) Class3_Sub1_Sub3_Sub1 arg0) {
		if (arg0.anInt1844 == 0) {
			return;
		}
		@Pc(37) int local37;
		@Pc(43) int local43;
		if (arg0.anInt1867 != -1 && arg0.anInt1867 < 32768) {
			@Pc(28) Class3_Sub1_Sub3_Sub1_Sub2 local28 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[arg0.anInt1867];
			if (local28 != null) {
				local37 = arg0.anInt1882 - local28.anInt1882;
				local43 = arg0.anInt1887 - local28.anInt1887;
				if (local37 != 0 || local43 != 0) {
					arg0.anInt1834 = (int) (Math.atan2((double) local37, (double) local43) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(73) int local73;
		if (arg0.anInt1867 >= 32768) {
			local73 = arg0.anInt1867 - 32768;
			if (Static45.anInt1346 == local73) {
				local73 = 2047;
			}
			@Pc(86) Class3_Sub1_Sub3_Sub1_Sub1 local86 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local73];
			if (local86 != null) {
				local43 = arg0.anInt1882 - local86.anInt1882;
				@Pc(102) int local102 = arg0.anInt1887 - local86.anInt1887;
				if (local43 != 0 || local102 != 0) {
					arg0.anInt1834 = (int) (Math.atan2((double) local43, (double) local102) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1865 != 0 || arg0.anInt1871 != 0) && (arg0.anInt1838 == 0 || arg0.anInt1881 > 0)) {
			local73 = arg0.anInt1882 - (arg0.anInt1865 - Static2.anInt56 - Static2.anInt56) * 64;
			local37 = arg0.anInt1887 - (arg0.anInt1871 - Static41.anInt1196 - Static41.anInt1196) * 64;
			if (local73 != 0 || local37 != 0) {
				arg0.anInt1834 = (int) (Math.atan2((double) local73, (double) local37) * 325.949D) & 0x7FF;
			}
			arg0.anInt1865 = 0;
			arg0.anInt1871 = 0;
		}
		local73 = arg0.anInt1834 - arg0.anInt1849 & 0x7FF;
		if (local73 == 0) {
			return;
		}
		if (arg0.anInt1844 > local73 || local73 > 2048 - arg0.anInt1844) {
			arg0.anInt1849 = arg0.anInt1834;
		} else if (local73 <= 1024) {
			arg0.anInt1849 += arg0.anInt1844;
		} else {
			arg0.anInt1849 -= arg0.anInt1844;
		}
		arg0.anInt1849 &= 0x7FF;
		if (arg0.anInt1854 != arg0.anInt1847 || arg0.anInt1834 == arg0.anInt1849) {
			return;
		}
		if (arg0.anInt1884 == -1) {
			arg0.anInt1854 = arg0.anInt1833;
			return;
		}
		arg0.anInt1854 = arg0.anInt1884;
		return;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
	public static void method1614() {
		Static109.aClass2_1.method1327();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static63.aLongArray30[local14] = 0L;
		}
		for (@Pc(28) int local28 = 0; local28 < 32; local28++) {
			Static58.aLongArray18[local28] = 0L;
		}
		Static6.anInt209 = 0;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)V")
	public static void method1615() {
		if (Static47.aString8.toLowerCase().indexOf("microsoft") != -1) {
			Static3.anIntArray18[186] = 57;
			Static3.anIntArray18[187] = 27;
			Static3.anIntArray18[188] = 71;
			Static3.anIntArray18[189] = 26;
			Static3.anIntArray18[190] = 72;
			Static3.anIntArray18[191] = 73;
			Static3.anIntArray18[192] = 58;
			Static3.anIntArray18[219] = 42;
			Static3.anIntArray18[220] = 74;
			Static3.anIntArray18[221] = 43;
			Static3.anIntArray18[222] = 59;
			Static3.anIntArray18[223] = 28;
			return;
		}
		Static3.anIntArray18[44] = 71;
		Static3.anIntArray18[45] = 26;
		Static3.anIntArray18[46] = 72;
		Static3.anIntArray18[47] = 73;
		Static3.anIntArray18[59] = 57;
		Static3.anIntArray18[61] = 27;
		Static3.anIntArray18[91] = 42;
		Static3.anIntArray18[92] = 74;
		Static3.anIntArray18[93] = 43;
		if (Static47.aMethod1 == null) {
			Static3.anIntArray18[192] = 58;
			Static3.anIntArray18[222] = 59;
		} else {
			Static3.anIntArray18[192] = 28;
			Static3.anIntArray18[222] = 58;
			Static3.anIntArray18[520] = 59;
		}
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(B)V")
	public static void method1616() {
		aClass62_1156 = null;
		aClass62_1152 = null;
		aClass62_1153 = null;
		aClass62_1158 = null;
		aClass62_1155 = null;
		aClass62_1157 = null;
		aClass62_1154 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!mb;Lclient!mb;BLclient!mb;)V")
	public static void method1617(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(3) Class42 arg2) {
		Static71.aClass42_52 = arg2;
		Static53.aClass42_39 = arg1;
		Static40.aClass42_30 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!mb;ZLclient!mb;)V")
	public static void method1619(@OriginalArg(0) Class42 arg0, @OriginalArg(2) Class42 arg1) {
		Static4.aClass42_6 = arg0;
		Static52.aClass42_29 = arg1;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IJ)V")
	public static void method1620(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static20.anInt704; local14++) {
			if (arg0 == Static108.aLongArray35[local14]) {
				Static52.aBoolean64 = true;
				Static20.anInt704--;
				for (@Pc(34) int local34 = local14; local34 < Static20.anInt704; local34++) {
					Static108.aLongArray35[local34] = Static108.aLongArray35[local34 + 1];
				}
				Static63.aClass3_Sub8_Sub1_6.method1824(107);
				Static63.aClass3_Sub8_Sub1_6.method1763(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(B)V")
	public static void method1621() {
		Static61.method1030();
		Static41.method710();
		Static74.method1197();
		Static15.method372();
		Static31.method608();
		Static19.method1853();
		Static38.method673();
		Static29.method582();
		Static31.method611();
		Static75.method1222();
		Static92.method1548();
		Static83.method362();
		((Class15) Static66.anInterface4_1).method465();
		Static17.aClass42_Sub1_63.method1520();
		Static91.aClass42_Sub1_54.method1520();
		Static53.aClass42_Sub1_30.method1520();
		Static19.aClass42_Sub1_62.method1520();
		Static49.aClass42_Sub1_28.method1520();
		Static79.aClass42_Sub1_46.method1520();
		Static22.aClass42_Sub1_17.method1520();
		Static12.aClass42_Sub1_10.method1520();
		Static14.aClass42_Sub1_11.method1520();
		Static59.aClass42_Sub1_35.method1520();
		Static27.aClass42_Sub1_18.method1520();
	}
}
