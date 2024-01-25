import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
	public static int anInt2163;

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
	public static int anInt2169;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "[I")
	public static final int[] anIntArray150 = new int[2];

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "Lclient!en;")
	public static final Class100 aClass100_1 = new Class100();

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!rl;I)I")
	public static int method1794(@OriginalArg(0) Class16_Sub1_Sub1_Sub3_Sub2 arg0) {
		@Pc(6) int local6 = arg0.anInt8158;
		@Pc(10) Class291 local10 = arg0.method7007();
		if (arg0.anInt8095 == -1 || arg0.aBoolean588) {
			local6 = arg0.anInt8164;
		} else if (arg0.anInt8095 == local10.anInt7640 || arg0.anInt8095 == local10.anInt7641 || local10.anInt7626 == arg0.anInt8095 || local10.anInt7625 == arg0.anInt8095) {
			local6 = arg0.anInt8143;
		} else if (arg0.anInt8095 == local10.anInt7633 || arg0.anInt8095 == local10.anInt7617 || local10.anInt7610 == arg0.anInt8095 || local10.anInt7635 == arg0.anInt8095) {
			local6 = arg0.anInt8162;
		}
		return local6;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(II)I")
	public static int method1798(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
