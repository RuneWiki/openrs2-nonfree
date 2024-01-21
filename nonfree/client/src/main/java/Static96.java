import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Lclient!qh;")
	public static Class5_Sub2_Sub10_Sub1 aClass5_Sub2_Sub10_Sub1_3;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
	public static int anInt2016;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_750 = Static161.method2452("(U5");

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
	public static int anInt2013 = 0;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_751 = Static161.method2452("Texturen geladen)3");

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
	public static int anInt2017 = 0;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_752 = Static161.method2452("Lade)3)3)3");

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_753 = Static161.method2452("Nehmen");

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Lclient!dc;")
	public static Class20 aClass20_754 = null;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_755 = Static161.method2452("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Z")
	public static boolean method1548(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BJ)V")
	public static void method1549(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}
}
