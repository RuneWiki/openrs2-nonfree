import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!i;")
	public static Class29 aClass29_69;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "Lclient!va;")
	private static Class61 aClass61_1016 = Static88.method1421(" has logged in)3");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!va;")
	public static Class61 aClass61_1012 = aClass61_1016;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
	public static int anInt2479 = -1;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public static int anInt2480 = -1;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "[I")
	public static int[] anIntArray327 = new int[50];

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	public static int anInt2483 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!va;")
	private static Class61 aClass61_1018 = Static88.method1421("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!va;")
	public static Class61 aClass61_1013 = aClass61_1018;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!va;")
	public static Class61 aClass61_1014 = Static88.method1421("@gr3@");

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "Lclient!va;")
	private static Class61 aClass61_1015 = Static88.method1421("Your account has been disabled)3");

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Z")
	public static volatile boolean aBoolean115 = true;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Lclient!va;")
	public static Class61 aClass61_1017 = aClass61_1015;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!ed;)V")
	public static void method1557(@OriginalArg(1) Class10_Sub1_Sub5_Sub2 arg0) {
		if (arg0.anInt1637 == 0) {
			return;
		}
		@Pc(33) int local33;
		@Pc(40) int local40;
		if (arg0.anInt1657 != -1 && arg0.anInt1657 < 32768) {
			@Pc(25) Class10_Sub1_Sub5_Sub2_Sub1 local25 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[arg0.anInt1657];
			if (local25 != null) {
				local33 = arg0.anInt1654 - local25.anInt1654;
				local40 = arg0.anInt1649 - local25.anInt1649;
				if (local33 != 0 || local40 != 0) {
					arg0.anInt1634 = (int) (Math.atan2((double) local33, (double) local40) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(70) int local70;
		if (arg0.anInt1657 >= 32768) {
			local70 = arg0.anInt1657 - 32768;
			if (local70 == Static83.anInt2226) {
				local70 = 2047;
			}
			@Pc(83) Class10_Sub1_Sub5_Sub2_Sub2 local83 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local70];
			if (local83 != null) {
				local40 = arg0.anInt1654 - local83.anInt1654;
				@Pc(97) int local97 = arg0.anInt1649 - local83.anInt1649;
				if (local40 != 0 || local97 != 0) {
					arg0.anInt1634 = (int) (Math.atan2((double) local40, (double) local97) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1653 != 0 || arg0.anInt1639 != 0) && (arg0.anInt1633 == 0 || arg0.anInt1638 > 0)) {
			local70 = arg0.anInt1654 - (arg0.anInt1653 - Static107.anInt2431 - Static107.anInt2431) * 64;
			local33 = arg0.anInt1649 - (arg0.anInt1639 - Static7.anInt80 - Static7.anInt80) * 64;
			if (local70 != 0 || local33 != 0) {
				arg0.anInt1634 = (int) (Math.atan2((double) local70, (double) local33) * 325.949D) & 0x7FF;
			}
			arg0.anInt1639 = 0;
			arg0.anInt1653 = 0;
		}
		local70 = arg0.anInt1634 - arg0.anInt1646 & 0x7FF;
		if (local70 == 0) {
			return;
		}
		if (local70 < arg0.anInt1637 || 2048 - arg0.anInt1637 < local70) {
			arg0.anInt1646 = arg0.anInt1634;
		} else if (local70 > 1024) {
			arg0.anInt1646 -= arg0.anInt1637;
		} else {
			arg0.anInt1646 += arg0.anInt1637;
		}
		arg0.anInt1646 &= 0x7FF;
		if (arg0.anInt1647 != arg0.anInt1674 || arg0.anInt1646 == arg0.anInt1634) {
			return;
		}
		if (arg0.anInt1645 == -1) {
			arg0.anInt1674 = arg0.anInt1668;
			return;
		}
		arg0.anInt1674 = arg0.anInt1645;
		return;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public static void method1558() {
		Static75.aClass9_7 = new Class9();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!he;ILclient!he;Z)V")
	public static void method1559(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) boolean arg2) {
		Static57.aClass11_40 = arg0;
		Static64.aClass11_45 = arg1;
		Static96.aBoolean113 = arg2;
		Static43.anInt1206 = Static64.aClass11_45.method217(10);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
	public static void method1560() {
		aClass61_1013 = null;
		aClass61_1014 = null;
		aClass61_1018 = null;
		aClass61_1017 = null;
		aClass61_1012 = null;
		aClass61_1016 = null;
		aClass61_1015 = null;
		anIntArray327 = null;
		anIntArrayArray23 = null;
		aClass29_69 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILclient!he;)[Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2[] method1561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2) {
		return Static5.method36(arg1, arg2, arg0) ? Static94.method1492() : null;
	}
}
