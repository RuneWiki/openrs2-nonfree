import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
	public static int[] anIntArray195;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	public static int anInt1839;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
	public static int anInt1837 = -1;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public static int anInt1838 = 0;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
	public static int anInt1842 = 0;

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "[I")
	public static int[] anIntArray196 = new int[5];

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
	public static int anInt1844 = 0;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public static void method1423() {
		anIntArray195 = null;
		anIntArray196 = null;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V")
	public static void method1424(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static257.aBooleanArray24[arg0]) {
			return;
		}
		Static222.aClass98_132.method2378(arg0);
		if (Static148.aClass22ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(29) boolean local29 = true;
		for (@Pc(35) int local35 = 0; local35 < Static148.aClass22ArrayArray1[arg0].length; local35++) {
			if (Static148.aClass22ArrayArray1[arg0][local35] != null) {
				if (Static148.aClass22ArrayArray1[arg0][local35].anInt542 == 2) {
					local29 = false;
				} else {
					Static148.aClass22ArrayArray1[arg0][local35] = null;
				}
			}
		}
		if (local29) {
			Static148.aClass22ArrayArray1[arg0] = null;
		}
		Static257.aBooleanArray24[arg0] = false;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)Lclient!ue;")
	public static Class3 method1425() {
		try {
			return (Class3) Class.forName("Class3_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return new Class3_Sub1();
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)J")
	public static long method1426() {
		return Static92.aClass3_1.method2844();
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
	public static void method1427() {
		Static264.aClass33_38.method839();
		Static99.aClass33_15.method839();
	}
}
