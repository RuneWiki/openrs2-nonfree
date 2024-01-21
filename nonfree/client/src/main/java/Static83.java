import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!od", name = "p", descriptor = "I")
	public static int anInt1957;

	@OriginalMember(owner = "client!od", name = "l", descriptor = "Lclient!od;")
	private static Class60 aClass60_816 = Static41.method597(" ");

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Lclient!od;")
	public static Class60 aClass60_814 = aClass60_816;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "Lclient!od;")
	public static Class60 aClass60_815 = Static41.method597("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!od", name = "o", descriptor = "Lclient!od;")
	public static Class60 aClass60_817 = Static41.method597("<col=80ff00>");

	@OriginalMember(owner = "client!od", name = "v", descriptor = "Lclient!od;")
	public static Class60 aClass60_818 = Static41.method597("headicons_pk");

	@OriginalMember(owner = "client!od", name = "F", descriptor = "I")
	public static int anInt1972 = 0;

	@OriginalMember(owner = "client!od", name = "K", descriptor = "Lclient!od;")
	private static Class60 aClass60_820 = Static41.method597("Use");

	@OriginalMember(owner = "client!od", name = "I", descriptor = "Lclient!od;")
	public static Class60 aClass60_819 = aClass60_820;

	@OriginalMember(owner = "client!od", name = "N", descriptor = "Lclient!od;")
	public static Class60 aClass60_821 = Static41.method597("T");

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "Lclient!od;")
	public static Class60 aClass60_822 = Static41.method597("Untersuchen");

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "Lclient!od;")
	public static Class60 aClass60_823 = Static41.method597(":duelreq:");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public static void method1312() {
		Static74.aClass12_13.method284();
		Static91.aClass12_19.method284();
		Static38.aClass12_8.method284();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)Z")
	public static boolean method1326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = arg1 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static30.aClass48_1.method1013(Static77.anInt1866, arg0, arg2, arg1);
		if (local18 == -1) {
			return false;
		}
		@Pc(27) int local27 = local18 & 0x1F;
		@Pc(33) int local33 = local18 >> 6 & 0x3;
		if (local27 == 10 || local27 == 11 || local27 == 22) {
			@Pc(74) Class4_Sub3_Sub3 local74 = Static76.method1244(local11);
			@Pc(85) int local85;
			@Pc(82) int local82;
			if (local33 == 0 || local33 == 2) {
				local85 = local74.anInt760;
				local82 = local74.anInt750;
			} else {
				local82 = local74.anInt760;
				local85 = local74.anInt750;
			}
			@Pc(96) int local96 = local74.anInt758;
			if (local33 != 0) {
				local96 = (local96 << local33 & 0xF) + (local96 >> 4 - local33);
			}
			Static36.method564(arg2, local85, 0, local82, true, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], local96, 0, arg0, 2);
		} else {
			Static36.method564(arg2, 0, local33, 0, true, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, local27 + 1, arg0, 2);
		}
		Static66.anInt1659 = 0;
		Static115.anInt2693 = Static63.anInt1591;
		Static69.anInt1722 = 2;
		Static24.anInt833 = Static122.anInt2791;
		return true;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIZZZ)Lclient!t;")
	public static Class10_Sub1 method1327(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) Class56 local6 = null;
		if (Static44.aClass16_13 != null) {
			local6 = new Class56(arg0, Static44.aClass16_13, Static130.aClass16Array1[arg0], 1000000);
		}
		return new Class10_Sub1(local6, Static101.aClass56_65, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILclient!be;)V")
	public static void method1336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub3_Sub1_Sub2_Sub1 arg2) {
		if (arg2.anInt1408 == arg0 && arg0 != -1) {
			@Pc(11) int local11 = Static7.method63(arg0).anInt1871;
			if (local11 == 1) {
				arg2.anInt1383 = 0;
				arg2.anInt1411 = arg1;
				arg2.anInt1424 = 0;
				arg2.anInt1409 = 0;
			}
			if (local11 == 2) {
				arg2.anInt1383 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt1408 == -1 || Static7.method63(arg0).anInt1867 >= Static7.method63(arg2.anInt1408).anInt1867) {
			arg2.anInt1424 = 0;
			arg2.anInt1383 = 0;
			arg2.anInt1411 = arg1;
			arg2.anInt1396 = arg2.anInt1433;
			arg2.anInt1409 = 0;
			arg2.anInt1408 = arg0;
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V")
	public static void method1347() {
		aClass60_816 = null;
		aClass60_817 = null;
		aClass60_819 = null;
		aClass60_822 = null;
		aClass60_821 = null;
		aClass60_814 = null;
		aClass60_818 = null;
		aClass60_820 = null;
		aClass60_823 = null;
		aClass60_815 = null;
	}
}
