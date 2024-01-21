import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "[I")
	public static int[] anIntArray358;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!lc;")
	public static Class31 aClass31_866 = null;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "[I")
	public static int[] anIntArray356 = new int[5];

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "[I")
	public static int[] anIntArray357 = new int[25];

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
	public static int anInt2508 = 0;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
	public static int anInt2509 = 0;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "[Lclient!lc;")
	public static Class31[] aClass31Array14 = new Class31[500];

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Lclient!lc;")
	public static Class31 aClass31_867 = Static56.method1206("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Lclient!lc;")
	public static Class31 aClass31_868 = Static56.method1206("wave:");

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([II)V")
	public static synchronized void method1560(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(2) int local2 = arg1 - 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
		}
		local2 += 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
		}
		if (Static62.aClass2_Sub8_1 != null) {
			Static62.aClass2_Sub8_1.method1670(arg0, 0, local2);
		}
		Static67.method1364(local2);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!kc;I)Z")
	public static boolean method1563(@OriginalArg(1) int arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) byte[] local18 = arg1.method338(arg2, arg0);
		if (local18 == null) {
			return false;
		} else {
			Static5.method114(local18);
			return true;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)V")
	public static synchronized void method1564() {
		if (Static62.aClass2_Sub8_1 != null) {
			Static62.aClass2_Sub8_1.method1671(256);
		}
		Static67.method1364(256);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method1565() {
		for (@Pc(3) int local3 = 0; local3 < Static49.anInt2696; local3++) {
			@Pc(9) int local9 = Static57.anIntArray383[local3];
			@Pc(13) Class2_Sub1_Sub4_Sub6_Sub2 local13 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local9];
			if (local13 != null) {
				Static38.method987(local13.aClass2_Sub1_Sub8_1.anInt1863, local13);
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!je;I)V")
	public static synchronized void method1566(@OriginalArg(0) Class2_Sub8 arg0) {
		Static62.aClass2_Sub8_1 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method1567() {
		anIntArray358 = null;
		aClass31_866 = null;
		anIntArray357 = null;
		aClass31_868 = null;
		anIntArray356 = null;
		aClass31_867 = null;
		aClass31Array14 = null;
	}
}
