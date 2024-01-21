import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
	public static int anInt472;

	@OriginalMember(owner = "client!ah", name = "kb", descriptor = "Lclient!jc;")
	public static Class40 aClass40_5;

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
	public static int anInt467 = 0;

	@OriginalMember(owner = "client!ah", name = "J", descriptor = "Lclient!gg;")
	public static Class28 aClass28_324 = Static107.method1838("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[112];

	@OriginalMember(owner = "client!ah", name = "P", descriptor = "Lclient!gg;")
	public static Class28 aClass28_325 = Static107.method1838("jolt");

	@OriginalMember(owner = "client!ah", name = "V", descriptor = "Lclient!gg;")
	public static Class28 aClass28_326 = Static107.method1838("Art");

	@OriginalMember(owner = "client!ah", name = "eb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_327 = Static107.method1838("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!ah", name = "fb", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ah", name = "gb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_328 = Static107.method1838("To create a new account you need to");

	@OriginalMember(owner = "client!ah", name = "hb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_329 = Static107.method1838("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!ah", name = "jb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_330 = Static107.method1838("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!ah", name = "pb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_331 = aClass28_328;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
	public static void method304() {
		while (true) {
			if (Static151.aClass2_Sub2_Sub1_3.method1716(Static103.anInt2571) >= 11) {
				@Pc(14) int local14 = Static151.aClass2_Sub2_Sub1_3.method1713(11);
				if (local14 != 2047) {
					@Pc(21) boolean local21 = false;
					if (Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local14] == null) {
						local21 = true;
						Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local14] = new Class2_Sub4_Sub1_Sub1_Sub2();
						if (Static83.aClass2_Sub2Array1[local14] != null) {
							Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local14].method1103(Static83.aClass2_Sub2Array1[local14]);
						}
					}
					Static160.anIntArray327[Static35.anInt973++] = local14;
					@Pc(57) Class2_Sub4_Sub1_Sub1_Sub2 local57 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local14];
					local57.anInt1650 = Static156.anInt3491;
					@Pc(65) int local65 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
					if (local65 == 1) {
						Static3.anIntArray228[Static83.anInt2114++] = local14;
					}
					@Pc(83) int local83 = Static151.aClass2_Sub2_Sub1_3.method1713(5);
					@Pc(88) int local88 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
					if (local83 > 15) {
						local83 -= 32;
					}
					@Pc(97) int local97 = Static151.aClass2_Sub2_Sub1_3.method1713(5);
					if (local97 > 15) {
						local97 -= 32;
					}
					@Pc(108) int local108 = Static131.anIntArray277[Static151.aClass2_Sub2_Sub1_3.method1713(3)];
					if (local21) {
						local57.anInt1623 = local57.anInt1603 = local108;
					}
					local57.method1101(Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0] + local83, local88 == 1, local97 + Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0]);
					continue;
				}
			}
			Static151.aClass2_Sub2_Sub1_3.method1717();
			return;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZBLclient!jc;Lclient!gg;Lclient!gg;I)V")
	public static void method307(@OriginalArg(2) Class40 arg0, @OriginalArg(3) Class28 arg1, @OriginalArg(4) Class28 arg2) {
		@Pc(16) int local16 = arg0.method1777(arg1);
		@Pc(22) int local22 = arg0.method1774(arg2, local16);
		Static59.method1060(local22, arg0, local16, 255);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIZ)V")
	public static void method308(@OriginalArg(3) boolean arg0) {
		Static165.anInt3686 = 2;
		Static114.aBoolean125 = arg0;
		Static113.anInt2749 = 22050;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!jc;ZLclient!jc;)V")
	public static void method312(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class40 arg1) {
		Static16.aClass40_7 = arg0;
		Static43.aClass40_13 = arg1;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	public static void method314() {
		aClass28_326 = null;
		aClass28_330 = null;
		aClass40_5 = null;
		aClass28_328 = null;
		aClass28_327 = null;
		aClass28_324 = null;
		aClass28_331 = null;
		aClass28_329 = null;
		aBooleanArray6 = null;
		aClass28_325 = null;
	}
}
