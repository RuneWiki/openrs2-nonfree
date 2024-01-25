import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "Lclient!h;")
	public static Class90 aClass90_4;

	@OriginalMember(owner = "client!fp", name = "Y", descriptor = "I")
	public static int anInt1755;

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString69 = "Connecting to update server";

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!fp", name = "K", descriptor = "[[I")
	public static final int[][] anIntArrayArray16 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!fp", name = "U", descriptor = "[Lclient!rf;")
	public static final Class1_Sub2_Sub13[] aClass1_Sub2_Sub13Array1 = new Class1_Sub2_Sub13[14];

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method1445(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static166.aString127 + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static79.aString272 + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)I")
	public static int method1447(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
	public static void method1449() {
		Static287.anIntArray559 = Static172.method3078(0.4F);
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
	public static void method1451() {
		if (!Static134.method2266()) {
			return;
		}
		if (Static167.aStringArray28 == null) {
			Static266.method4803();
		}
		Static121.anInt4228 = 0;
		Static221.anIntArray435 = new int[100];
		Static263.aBooleanArray24 = new boolean[100];
		Static89.aBoolean120 = true;
		Static184.anIntArray361 = new int[100];
		Static238.anIntArray454 = new int[100];
		for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
			Static238.anIntArray454[local26] = (int) ((double) Static26.anInt476 * Math.random());
			Static184.anIntArray361[local26] = (int) (Math.random() * 350.0D);
			Static221.anIntArray435[local26] = (int) (Math.random() * 102.0D);
			Static263.aBooleanArray24[local26] = Math.random() < 0.5D;
		}
		try {
			Static112.aClipboard1 = Static71.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(70) Exception local70) {
		}
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)V")
	public static void method1452() {
		Static14.anInt229 = -1;
		Static38.anInt3168 = 0;
		Static307.anInt6146 = -1;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1455(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static309.aStringArray37.length; local7++) {
			if (Static309.aStringArray37[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)V")
	public static void method1456() {
		if (Static205.aClass125_1 != null) {
			Static205.aClass125_1.method5318();
		}
		if (Static310.aClass125_2 != null) {
			Static310.aClass125_2.method5318();
		}
		Static29.method490(Static138.aBoolean522);
		Static205.aClass125_1 = Static312.method5354(22050, Static235.aCanvas6, Static197.aClass215_5, 0);
		Static205.aClass125_1.method5307(Static261.aClass1_Sub31_Sub3_2);
		Static310.aClass125_2 = Static312.method5354(2048, Static235.aCanvas6, Static197.aClass215_5, 1);
		Static310.aClass125_2.method5307(Static142.aClass1_Sub31_Sub2_1);
	}
}
