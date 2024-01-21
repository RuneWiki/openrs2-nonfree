import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!j", name = "T", descriptor = "Lclient!ab;")
	public static Class3 aClass3_14;

	@OriginalMember(owner = "client!j", name = "V", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_11;

	@OriginalMember(owner = "client!j", name = "db", descriptor = "Lclient!ab;")
	public static Class3 aClass3_15;

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_810 = Static187.method3089("");

	@OriginalMember(owner = "client!j", name = "M", descriptor = "Lclient!vd;")
	public static Class92 aClass92_803 = aClass92_810;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "Lclient!vd;")
	public static Class92 aClass92_804 = aClass92_810;

	@OriginalMember(owner = "client!j", name = "R", descriptor = "Lclient!vd;")
	public static Class92 aClass92_805 = aClass92_810;

	@OriginalMember(owner = "client!j", name = "gb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_814 = Static187.method3089("Loading config )2 ");

	@OriginalMember(owner = "client!j", name = "S", descriptor = "Lclient!vd;")
	public static Class92 aClass92_806 = aClass92_814;

	@OriginalMember(owner = "client!j", name = "U", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_807 = Static187.method3089("<col=00ffff>");

	@OriginalMember(owner = "client!j", name = "W", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_808 = Static187.method3089("document)3cookie=(R");

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_809 = Static187.method3089("Nehmen");

	@OriginalMember(owner = "client!j", name = "ab", descriptor = "Lclient!vd;")
	public static Class92 aClass92_811 = aClass92_810;

	@OriginalMember(owner = "client!j", name = "cb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_812 = aClass92_810;

	@OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
	public static int anInt1889 = -1;

	@OriginalMember(owner = "client!j", name = "fb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_813 = aClass92_810;

	@OriginalMember(owner = "client!j", name = "hb", descriptor = "Lclient!lb;")
	public static final Class1_Sub16 aClass1_Sub16_1 = new Class1_Sub16(0, 0);

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
	public static void method1300() {
		@Pc(10) int local10;
		if (Static106.anInt2299 > 0) {
			for (local10 = 0; local10 < 256; local10++) {
				if (Static106.anInt2299 > 768) {
					Static104.anIntArray170[local10] = Static210.method3418(1024 - Static106.anInt2299, Static51.anIntArray91[local10], Static66.anIntArray121[local10]);
				} else if (Static106.anInt2299 <= 256) {
					Static104.anIntArray170[local10] = Static210.method3418(256 - Static106.anInt2299, Static66.anIntArray121[local10], Static51.anIntArray91[local10]);
				} else {
					Static104.anIntArray170[local10] = Static51.anIntArray91[local10];
				}
			}
		} else if (Static53.anInt1311 > 0) {
			for (local10 = 0; local10 < 256; local10++) {
				if (Static53.anInt1311 > 768) {
					Static104.anIntArray170[local10] = Static210.method3418(1024 - Static53.anInt1311, Static152.anIntArray280[local10], Static66.anIntArray121[local10]);
				} else if (Static53.anInt1311 > 256) {
					Static104.anIntArray170[local10] = Static152.anIntArray280[local10];
				} else {
					Static104.anIntArray170[local10] = Static210.method3418(256 - Static53.anInt1311, Static66.anIntArray121[local10], Static152.anIntArray280[local10]);
				}
			}
		} else {
			for (local10 = 0; local10 < 256; local10++) {
				Static104.anIntArray170[local10] = Static66.anIntArray121[local10];
			}
		}
		local10 = 0;
		@Pc(149) int local149 = Static175.aClass1_Sub3_Sub1_Sub1_5.anInt452 * 9;
		@Pc(151) int local151 = 0;
		@Pc(169) int local169;
		@Pc(179) int local179;
		@Pc(186) int local186;
		@Pc(192) int local192;
		@Pc(196) int local196;
		@Pc(201) int local201;
		for (@Pc(153) int local153 = 1; local153 < 255; local153++) {
			local169 = Static66.anIntArray124[local153] * (256 - local153) / 256 + 22;
			if (local169 < 0) {
				local169 = 0;
			}
			local10 += local169;
			for (local179 = local169; local179 < 128; local179++) {
				local186 = Static143.anIntArray252[local10++];
				local192 = Static175.aClass1_Sub3_Sub1_Sub1_5.anIntArray44[local149++];
				if (local186 == 0) {
					Static197.aClass1_Sub3_Sub1_Sub1_7.anIntArray44[local151++] = local192;
				} else {
					local196 = local186;
					local201 = 256 - local186;
					local186 = Static104.anIntArray170[local186];
					Static197.aClass1_Sub3_Sub1_Sub1_7.anIntArray44[local151++] = (local196 * (local186 & 0xFF00) + local201 * (local192 & 0xFF00) & 0xFF0000) + ((local192 & 0xFF00FF) * local201 + local196 * (local186 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			for (local186 = 0; local186 < local169; local186++) {
				Static197.aClass1_Sub3_Sub1_Sub1_7.anIntArray44[local151++] = Static175.aClass1_Sub3_Sub1_Sub1_5.anIntArray44[local149++];
			}
			local149 += Static175.aClass1_Sub3_Sub1_Sub1_5.anInt452 - 128;
		}
		local151 = 0;
		Static197.aClass1_Sub3_Sub1_Sub1_7.method367(0, 9);
		local10 = 0;
		local149 = Static175.aClass1_Sub3_Sub1_Sub1_5.anInt452 * 9 + 128;
		for (local169 = 1; local169 < 255; local169++) {
			local179 = Static66.anIntArray124[local169] * (256 - local169) / 256 + 22;
			if (local179 < 0) {
				local179 = 0;
			}
			for (local186 = 0; local186 < local179; local186++) {
				@Pc(328) int local328 = local151++;
				local149--;
				Static34.aClass1_Sub3_Sub1_Sub1_2.anIntArray44[local328] = Static175.aClass1_Sub3_Sub1_Sub1_5.anIntArray44[local149];
			}
			for (local192 = local179; local192 < 128; local192++) {
				local196 = Static143.anIntArray252[local10++];
				local149--;
				local201 = Static175.aClass1_Sub3_Sub1_Sub1_5.anIntArray44[local149];
				if (local196 == 0) {
					Static34.aClass1_Sub3_Sub1_Sub1_2.anIntArray44[local151++] = local201;
				} else {
					@Pc(358) int local358 = local196;
					@Pc(363) int local363 = 256 - local196;
					local196 = Static104.anIntArray170[local196];
					Static34.aClass1_Sub3_Sub1_Sub1_2.anIntArray44[local151++] = ((local201 & 0xFF00) * local363 + (local196 & 0xFF00) * local358 & 0xFF0000) + ((local196 & 0xFF00FF) * local358 + (local363 * (local201 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local149 += Static175.aClass1_Sub3_Sub1_Sub1_5.anInt452 + 128;
			local10 += local179;
		}
		Static34.aClass1_Sub3_Sub1_Sub1_2.method367(637, 9);
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
	public static void method1302() {
		Static170.aClass35_1.method2689();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static68.aLongArray5[local14] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static102.aLongArray6[local26] = 0L;
		}
		Static144.anInt2883 = 0;
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
	public static void method1303() {
		Static106.aClass47_17.method1276();
	}
}
