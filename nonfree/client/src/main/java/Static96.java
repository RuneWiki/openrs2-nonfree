import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!qc", name = "L", descriptor = "[Lclient!he;")
	public static Class4_Sub5[] aClass4_Sub5Array2;

	@OriginalMember(owner = "client!qc", name = "N", descriptor = "Lclient!pf;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "Lclient!c;")
	public static Class12 aClass12_64 = new Class12(50);

	@OriginalMember(owner = "client!qc", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[112];

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
	public static int anInt2340 = 0;

	@OriginalMember(owner = "client!qc", name = "J", descriptor = "[I")
	public static int[] anIntArray268 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1209 = Static28.method504("Benutzername: ");

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1210 = Static28.method504("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!qc", name = "Q", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "[I")
	public static int[] anIntArray269 = new int[] { 0, 0, 3, 8, 0, 0, 7, 0, 14, 6, 0, 0, 0, 6, 0, 0, 12, 0, 0, 4, 4, 0, 5, 0, 6, 0, -2, 2, 0, 0, 1, 0, 2, 4, 0, -2, 0, 6, 4, 0, 0, 0, 0, 0, 2, 0, 0, 0, 4, 0, -2, -2, 0, 0, 6, -1, 0, 0, 0, 0, 0, 10, -2, 0, 0, -2, 0, 0, 0, 4, 3, -2, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0, 5, 0, 0, 0, -1, 0, 0, 15, 0, 0, 0, 0, 0, 0, 2, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 7, 2, 0, 0, 0, 0, -1, -1, 0, 0, 0, -2, 0, 10, 0, 6, 0, 0, 2, 3, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, 5, 6, 11, 0, 7, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 5, 0, -1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 0, 3, 0, 6, 0, 0, 0, 0, 0, 2, 6, 0, 0, 1, 0, 6, 0, 0, 0, 2, -2, 0, 0, 2, 0, 0, 0, 0, 0, 1, -2, 2, 0, 0, 1, 0, 0, 0, 8, 0, 0, 5, 0, 0, 0, 0, 0, 0, 6, -1, 0, 3, 6, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0 };

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
	public static void method1758() {
		aBooleanArray11 = null;
		aClass12_64 = null;
		aLongArray6 = null;
		aClass39_1209 = null;
		aClass55_1 = null;
		aClass39_1210 = null;
		aClass4_Sub5Array2 = null;
		anIntArray269 = null;
		anIntArray268 = null;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
	public static void method1759() {
		for (@Pc(18) Class4_Sub7 local18 = (Class4_Sub7) Static112.aClass61_12.method1628(); local18 != null; local18 = (Class4_Sub7) Static112.aClass61_12.method1629()) {
			if (local18.aClass4_Sub1_Sub4_2 != null) {
				Static85.aClass4_Sub1_Sub2_2.method363(local18.aClass4_Sub1_Sub4_2);
				local18.aClass4_Sub1_Sub4_2 = null;
			}
			if (local18.aClass4_Sub1_Sub4_1 != null) {
				Static85.aClass4_Sub1_Sub2_2.method363(local18.aClass4_Sub1_Sub4_1);
				local18.aClass4_Sub1_Sub4_1 = null;
			}
		}
		Static112.aClass61_12.method1633();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZZ)V")
	public static void method1760(@OriginalArg(1) boolean arg0) {
		Static122.method2094();
		Static10.anInt329++;
		if (Static10.anInt329 < 50 && !arg0) {
			return;
		}
		Static10.anInt329 = 0;
		if (Static46.aBoolean53 || Static49.aClass69_3 == null) {
			return;
		}
		Static114.aClass4_Sub16_Sub1_3.method1499(47);
		try {
			Static49.aClass69_3.method1860(Static114.aClass4_Sub16_Sub1_3.anInt2019, Static114.aClass4_Sub16_Sub1_3.aByteArray22);
			Static114.aClass4_Sub16_Sub1_3.anInt2019 = 0;
		} catch (@Pc(45) IOException local45) {
			Static46.aBoolean53 = true;
		}
	}
}
