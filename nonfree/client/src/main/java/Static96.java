import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!q", name = "V", descriptor = "Lclient!id;")
	private static Class34 aClass34_1230 = Static9.method266("Please remove ");

	@OriginalMember(owner = "client!q", name = "R", descriptor = "Lclient!id;")
	public static Class34 aClass34_1228 = aClass34_1230;

	@OriginalMember(owner = "client!q", name = "U", descriptor = "Lclient!id;")
	public static Class34 aClass34_1229 = aClass34_1230;

	@OriginalMember(owner = "client!q", name = "bb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1232 = Static9.method266("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!q", name = "cb", descriptor = "Lclient!mc;")
	public static Class48 aClass48_12 = new Class48(4096);

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V")
	public static void method1638() {
		aClass34_1229 = null;
		aClass34_1230 = null;
		aClass48_12 = null;
		aClass34_1228 = null;
		aClass34_1232 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BLclient!ie;)V")
	public static void method1641(@OriginalArg(1) Class35 arg0) {
		Static120.aClass35_31 = arg0;
		Static11.anInt494 = Static120.aClass35_31.method1579(16);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(II)V")
	public static void method1642(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static113.aBooleanArray18[arg0]) {
			return;
		}
		Static37.aClass35_10.method1576(arg0);
		if (Static41.aClass1_Sub9ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static41.aClass1_Sub9ArrayArray1[arg0].length; local27++) {
			if (Static41.aClass1_Sub9ArrayArray1[arg0][local27] != null) {
				if (Static41.aClass1_Sub9ArrayArray1[arg0][local27].anInt1013 == 2) {
					local25 = false;
				} else {
					Static41.aClass1_Sub9ArrayArray1[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static41.aClass1_Sub9ArrayArray1[arg0] = null;
		}
		Static113.aBooleanArray18[arg0] = false;
	}
}
