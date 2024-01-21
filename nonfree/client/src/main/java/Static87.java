import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!pa", name = "hb", descriptor = "I")
	public static int anInt2409;

	@OriginalMember(owner = "client!pa", name = "jb", descriptor = "I")
	public static int anInt2410;

	@OriginalMember(owner = "client!pa", name = "kb", descriptor = "I")
	public static int anInt2411;

	@OriginalMember(owner = "client!pa", name = "mb", descriptor = "Z")
	public static boolean aBoolean122;

	@OriginalMember(owner = "client!pa", name = "rb", descriptor = "Lclient!ga;")
	public static Class29 aClass29_18;

	@OriginalMember(owner = "client!pa", name = "fb", descriptor = "Lclient!mb;")
	public static Class49 aClass49_22 = new Class49(50);

	@OriginalMember(owner = "client!pa", name = "gb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1260 = Static80.method1463("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!pa", name = "lb", descriptor = "I")
	public static int anInt2412 = 0;

	@OriginalMember(owner = "client!pa", name = "nb", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[5];

	@OriginalMember(owner = "client!pa", name = "ob", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1261 = Static80.method1463("p12_full");

	@OriginalMember(owner = "client!pa", name = "pb", descriptor = "I")
	public static int anInt2413 = 0;

	@OriginalMember(owner = "client!pa", name = "qb", descriptor = "I")
	public static int anInt2414 = -1;

	@OriginalMember(owner = "client!pa", name = "tb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1262 = Static80.method1463("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
	public static void method1564() {
		aBooleanArray13 = null;
		aClass29_18 = null;
		aClass63_1262 = null;
		aClass63_1261 = null;
		aClass63_1260 = null;
		aClass49_22 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Lclient!jd;")
	public static Class6_Sub3_Sub11 method1565(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub3_Sub11 local10 = (Class6_Sub3_Sub11) Static51.aClass49_15.method1397((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static59.method1159(arg0, Static115.aClass7_58, Static78.aClass7_45);
		if (local10 != null) {
			Static51.aClass49_15.method1396((long) arg0, local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!rd;ILclient!ge;Lclient!rd;)Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2 method1566(@OriginalArg(0) Class63 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class63 arg2) {
		@Pc(8) int local8 = arg1.method91(arg2);
		@Pc(14) int local14 = arg1.method107(local8, arg0);
		return Static34.method845(local14, local8, arg1);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZZ)V")
	public static void method1567(@OriginalArg(0) boolean arg0) {
		Static44.method959();
		Static56.anInt1710++;
		if (Static56.anInt1710 < 50 && !arg0) {
			return;
		}
		Static56.anInt1710 = 0;
		if (Static73.aBoolean110 || Static100.aClass47_4 == null) {
			return;
		}
		Static23.aClass6_Sub4_Sub1_4.method1347(147);
		try {
			Static100.aClass47_4.method1377(Static23.aClass6_Sub4_Sub1_4.anInt1949, Static23.aClass6_Sub4_Sub1_4.aByteArray27);
			Static23.aClass6_Sub4_Sub1_4.anInt1949 = 0;
		} catch (@Pc(46) IOException local46) {
			Static73.aBoolean110 = true;
		}
	}
}
