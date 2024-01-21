import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "D")
	public static double aDouble10;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_874 = Static187.method3089(" GMT");

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_875 = Static187.method3089("null");

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
	public static int anInt1982 = -1;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_876 = Static187.method3089("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_877 = Static187.method3089(")3)3)3");

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZIB)V")
	public static void method1367(@OriginalArg(1) boolean arg0) {
		Static151.aBoolean177 = arg0;
		Static149.anInt3048 = 2;
		Static96.anInt2009 = 22050;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	public static void method1368() {
		while (true) {
			@Pc(10) Class20 local10 = Static164.aClass20_18;
			@Pc(17) Class1_Sub23 local17;
			synchronized (Static164.aClass20_18) {
				local17 = (Class1_Sub23) Static101.aClass20_10.method475();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass3_Sub1_22.method3281(local17.aByteArray45, false, local17.aClass83_1, (int) local17.aLong251);
		}
	}
}
