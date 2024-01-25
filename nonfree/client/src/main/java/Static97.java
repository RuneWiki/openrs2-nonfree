import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method1921() {
		for (@Pc(1) int local1 = 0; local1 < Static110.anInt2383; local1++) {
			@Pc(6) Class301 local6 = Static301.aClass301Array1[local1];
			if (local6.aByte102 == 3) {
				if (local6.aClass2_Sub11_Sub4_4 == null) {
					local6.anInt7906 = Integer.MIN_VALUE;
				} else {
					Static622.aClass2_Sub11_Sub2_2.method2950(local6.aClass2_Sub11_Sub4_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method1922(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static304.method4767(-1, arg0, arg1, -1);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!nd;IZIIZI)V")
	public static void method1923(@OriginalArg(0) Class238 arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2) {
		Static64.anInt1727 = arg2;
		Static79.aClass2_Sub11_Sub1_1 = null;
		Static40.anInt841 = 2;
		Static246.aBoolean357 = false;
		Static510.aClass238_229 = arg0;
		Static275.anInt5095 = 1;
		Static543.anInt8776 = 0;
		Static309.anInt7821 = arg1;
	}
}
