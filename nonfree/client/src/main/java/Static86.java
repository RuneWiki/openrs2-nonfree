import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ob", name = "bb", descriptor = "[I")
	public static int[] anIntArray318;

	@OriginalMember(owner = "client!ob", name = "cb", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_41;

	@OriginalMember(owner = "client!ob", name = "lb", descriptor = "[Lclient!wc;")
	public static Class80[] aClass80Array1;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1038 = Static108.method1915("b12_full");

	@OriginalMember(owner = "client!ob", name = "Z", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1039 = Static108.method1915("Angreifen");

	@OriginalMember(owner = "client!ob", name = "ab", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1040 = Static108.method1915("Fallen lassen");

	@OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
	public static int anInt2059 = 127;

	@OriginalMember(owner = "client!ob", name = "eb", descriptor = "[I")
	public static int[] anIntArray319 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ob", name = "fb", descriptor = "I")
	public static int anInt2060 = 0;

	@OriginalMember(owner = "client!ob", name = "gb", descriptor = "Z")
	public static boolean aBoolean172 = false;

	@OriginalMember(owner = "client!ob", name = "hb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1041 = Static108.method1915("null");

	@OriginalMember(owner = "client!ob", name = "ib", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1042 = Static108.method1915("Location");

	@OriginalMember(owner = "client!ob", name = "jb", descriptor = "[I")
	public static int[] anIntArray320 = new int[1000];

	@OriginalMember(owner = "client!ob", name = "kb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1043 = aClass39_1042;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
	public static void method1444() {
		try {
			if (Static37.aClass38_1 == null) {
				Static37.aClass38_1 = new Class38(Static92.aClass79_2, Static30.method601(new Class39[] { Static129.aClass39_1548, Static8.aClass39_142, Static37.aClass39_521 }).method1157());
			} else {
				@Pc(36) byte[] local36 = Static37.aClass38_1.method1145();
				if (local36 != null) {
					@Pc(43) Class1_Sub18 local43 = new Class1_Sub18(local36);
					Static11.anInt499 = local43.method2156();
					aClass80Array1 = new Class80[Static11.anInt499];
					for (@Pc(52) int local52 = 0; local52 < Static11.anInt499; local52++) {
						@Pc(62) Class80 local62 = aClass80Array1[local52] = new Class80();
						@Pc(66) int local66 = local43.method2156();
						local62.anInt3153 = local66 & 0x7FFF;
						local62.aBoolean253 = (local66 & 0x8000) != 0;
						local62.aClass39_1542 = local43.method2139();
						local62.anInt3149 = local43.method2157();
						local62.anInt3154 = local52;
						local62.anInt3157 = Static91.method1486(local62.aClass39_1542);
					}
					Static23.method449(Static101.anIntArray393, Static122.anIntArray466, aClass80Array1.length - 1, 0, aClass80Array1);
					Static32.aBoolean60 = true;
					Static37.aClass38_1 = null;
				}
			}
		} catch (@Pc(126) Exception local126) {
			Static37.aClass38_1 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method1445() {
		aClass80Array1 = null;
		anIntArray319 = null;
		aClass39_1043 = null;
		aClass39_1038 = null;
		aClass39_1039 = null;
		aClass1_Sub1_Sub4_Sub1_41 = null;
		aClass39_1040 = null;
		anIntArray320 = null;
		aClass39_1042 = null;
		anIntArray318 = null;
		aClass39_1041 = null;
		Class1_Sub15.anIntArray317 = null;
	}
}
