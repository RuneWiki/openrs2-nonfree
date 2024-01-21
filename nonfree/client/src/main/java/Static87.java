import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Lclient!eh;")
	public static Class28 aClass28_91;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	public static int anInt1883;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "J")
	public static long aLong61;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!ae;")
	public static Class5 aClass5_10;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "[Lclient!gg;")
	public static Class29_Sub1[] aClass29_Sub1Array1;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_596 = Static181.method2795("wave2:");

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_594 = aClass83_596;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_595 = Static181.method2795("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_597 = Static181.method2795("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_598 = Static181.method2795(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "Lclient!qe;")
	public static Class83 aClass83_599 = aClass83_596;

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_600 = Static181.method2795("VOLL");

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_601 = Static181.method2795("Ausw-=hlen");

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)I")
	public static int method1511(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 >>> 31;
		return (local8 + arg1) / arg0 - local8;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Z")
	public static boolean method1515(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ae;)Lclient!ae;")
	public static Class5 method1519(@OriginalArg(1) Class5 arg0) {
		@Pc(9) int local9 = Static82.method1482(Static138.method2242(arg0));
		if (local9 == 0) {
			return null;
		}
		for (@Pc(19) int local19 = 0; local19 < local9; local19++) {
			arg0 = Static74.method1401(arg0.anInt132);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
