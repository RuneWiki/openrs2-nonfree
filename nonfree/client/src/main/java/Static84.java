import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static84 {

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "[I")
	public static final int[] anIntArray110 = new int[4096];

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
	public static void method1335() {
		Static311.aClass4Array4 = new Class4[2000];
		Static471.anIntArrayArrayArray11 = new int[Static36.anInt662][Static129.anInt6336 + 1][Static150.anInt2400 + 1];
		Static218.aClass4Array2 = new Class4[500];
		Static232.aClass4Array3 = new Class4[1000];
		Static541.anInt8998 = 0;
		Static356.anInt6349 = Static407.anInt7012;
		Static289.anInt4704 = Static407.anInt7012;
		Static195.aClass4Array1 = new Class4[500];
		Static278.anInt4554 = 0;
		Static156.anInt2751 = 0;
		Static35.aBoolean58 = false;
		Static510.anInt8556 = 0;
		if (Static480.aClass126_12 instanceof oa) {
			Static592.aBoolean843 = false;
		} else {
			Static592.aBoolean843 = true;
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method1336(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static586.method8215(arg1, -1, -1, arg0);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIII)I")
	public static int method1337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= arg1) {
			return arg0 >= arg2 ? arg2 : arg0;
		} else {
			return arg1;
		}
	}
}
