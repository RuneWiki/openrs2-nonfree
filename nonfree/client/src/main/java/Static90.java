import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "Lclient!oa;")
	public static Class9 aClass9_25;

	@OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
	public static int anInt2413;

	@OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
	public static int anInt2414;

	@OriginalMember(owner = "client!sb", name = "lb", descriptor = "Lclient!kc;")
	public static Class11 aClass11_21;

	@OriginalMember(owner = "client!sb", name = "sb", descriptor = "I")
	public static int anInt2422;

	@OriginalMember(owner = "client!sb", name = "V", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!sb", name = "W", descriptor = "[Lclient!hb;")
	public static Class2_Sub1_Sub4_Sub5[] aClass2_Sub1_Sub4_Sub5Array1 = new Class2_Sub1_Sub4_Sub5[4];

	@OriginalMember(owner = "client!sb", name = "hb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_839 = Static56.method1206("button near the top of that page)3");

	@OriginalMember(owner = "client!sb", name = "jb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_840 = Static56.method1206("Login server offline)3");

	@OriginalMember(owner = "client!sb", name = "kb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_841 = Static56.method1206("To ");

	@OriginalMember(owner = "client!sb", name = "mb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_842 = Static56.method1206("Jun");

	@OriginalMember(owner = "client!sb", name = "tb", descriptor = "I")
	public static int anInt2423 = 1;

	@OriginalMember(owner = "client!sb", name = "vb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_843 = Static56.method1206("Checking for updates )2 ");

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(Z)V")
	public static void method1513() {
		aClass31_840 = null;
		aClass2_Sub1_Sub4_Sub5Array1 = null;
		aClass31_841 = null;
		aClass11_21 = null;
		aClass9_25 = null;
		aClass31_839 = null;
		aClass31_843 = null;
		aClass31_842 = null;
		aLongArray6 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!lc;)V")
	public static void method1521(@OriginalArg(1) Class31 arg0) {
		if (arg0 == null || arg0.method1223() == 0) {
			Static96.anInt2602 = 0;
			return;
		}
		@Pc(16) Class31 local16 = arg0;
		@Pc(19) Class31[] local19 = new Class31[100];
		@Pc(21) int local21 = 0;
		while (true) {
			@Pc(26) int local26 = local16.method1200();
			if (local26 == -1) {
				local16 = local16.method1220();
				if (local16.method1223() > 0) {
					local19[local21++] = local16.method1230();
				}
				Static96.anInt2602 = 0;
				label46: for (local26 = 0; local26 < Static39.anInt1457; local26++) {
					@Pc(93) Class2_Sub1_Sub13 local93 = Static7.method178(local26);
					if (local93.anInt2461 == -1 && local93.aClass31_861 != null) {
						@Pc(105) Class31 local105 = local93.aClass31_861.method1230();
						for (@Pc(107) int local107 = 0; local107 < local21; local107++) {
							if (local105.method1209(local19[local107]) == -1) {
								continue label46;
							}
						}
						Static79.aClass31Array9[Static96.anInt2602] = local105;
						Static51.anIntArray261[Static96.anInt2602] = local26;
						Static96.anInt2602++;
						if (Static79.aClass31Array9.length <= Static96.anInt2602) {
							return;
						}
					}
				}
				return;
			}
			@Pc(38) Class31 local38 = local16.method1213(local26, 0).method1220();
			if (local38.method1223() > 0) {
				local19[local21++] = local38.method1230();
			}
			local16 = local16.method1222(local26 + 1);
		}
	}
}
