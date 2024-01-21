import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!sg;")
	private static Class77 aClass77_947 = Static146.method2172("wave2:");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!sg;")
	public static Class77 aClass77_946 = aClass77_947;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "[I")
	public static int[] anIntArray391 = new int[1000];

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
	public static int anInt2440 = 0;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[1000][];

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!sg;")
	public static Class77 aClass77_948 = aClass77_947;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!sg;")
	public static Class77 aClass77_949 = Static146.method2172("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!pg;ILclient!qd;I)V")
	public static void method1758(@OriginalArg(0) Class64 arg0, @OriginalArg(2) Class43_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub6 local12 = new Class2_Sub6();
		local12.anInt1169 = 1;
		local12.aClass43_Sub1_8 = arg1;
		local12.aLong134 = arg2;
		local12.aClass64_1 = arg0;
		@Pc(27) Class10 local27 = Static2.aClass10_4;
		synchronized (Static2.aClass10_4) {
			Static2.aClass10_4.method448(local12);
		}
		Static8.method129();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method1759(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static2.aBoolean4) {
			try {
				@Pc(23) Class20 local23 = (Class20) Class.forName("Class20_Sub1").getDeclaredConstructor().newInstance();
				local23.method710(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static2.aBoolean4 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1760() {
		anIntArray391 = null;
		aClass77_949 = null;
		aClass77_946 = null;
		aByteArrayArray6 = null;
		aClass77_948 = null;
		aClass77_947 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)I")
	public static int method1761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}
}
