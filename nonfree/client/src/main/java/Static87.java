import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!l", name = "cb", descriptor = "Lclient!sh;")
	public static Class78 aClass78_4;

	@OriginalMember(owner = "client!l", name = "lb", descriptor = "[Lclient!qf;")
	public static Class66[] aClass66Array1;

	@OriginalMember(owner = "client!l", name = "mb", descriptor = "J")
	public static long aLong78;

	@OriginalMember(owner = "client!l", name = "bb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_891 = Static146.method2172("Too many connections from your address)3");

	@OriginalMember(owner = "client!l", name = "ib", descriptor = "Lclient!sg;")
	public static Class77 aClass77_892 = aClass77_891;

	@OriginalMember(owner = "client!l", name = "pb", descriptor = "I")
	public static int anInt2290 = 0;

	@OriginalMember(owner = "client!l", name = "qb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_893 = Static146.method2172("<)4col>");

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(III)I")
	public static int method1610(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class2_Sub13 local6 = (Class2_Sub13) Static3.aClass74_1.method2433((long) arg0);
		if (local6 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local6.anIntArray335.length) {
			return local6.anIntArray335[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V")
	public static void method1611() {
		Static71.anIntArray319 = null;
		Static98.anIntArrayArray18 = null;
		Static27.aByteArrayArrayArray2 = null;
		Static27.aByteArrayArrayArray1 = null;
		Static177.anIntArray633 = null;
		Static148.anIntArray535 = null;
		Static101.aByteArrayArrayArray4 = null;
		Static101.anIntArray399 = null;
		Static129.aByteArrayArrayArray5 = null;
		Static1.anIntArray5 = null;
		Static140.anIntArrayArrayArray6 = null;
		Static147.aByteArrayArrayArray7 = null;
	}

	@OriginalMember(owner = "client!l", name = "i", descriptor = "(I)V")
	public static void method1613() {
		aClass66Array1 = null;
		aClass77_893 = null;
		aClass77_891 = null;
		aClass77_892 = null;
		aClass78_4 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	public static void method1614() {
		for (@Pc(14) Class2_Sub25 local14 = (Class2_Sub25) Static63.aClass10_45.method444(); local14 != null; local14 = (Class2_Sub25) Static63.aClass10_45.method451()) {
			if (local14.aClass2_Sub2_Sub5_1 != null) {
				local14.method3007();
			}
		}
	}
}
