import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dca", name = "z", descriptor = "I")
	public static int anInt1854;

	@OriginalMember(owner = "client!dca", name = "B", descriptor = "I")
	public static int anInt1855;

	@OriginalMember(owner = "client!dca", name = "y", descriptor = "Lclient!di;")
	public static final Class65 aClass65_2 = new Class65(false);

	@OriginalMember(owner = "client!dca", name = "o", descriptor = "Lclient!di;")
	public static Class65 aClass65_1 = aClass65_2;

	@OriginalMember(owner = "client!dca", name = "A", descriptor = "[I")
	public static int[] anIntArray123 = null;

	@OriginalMember(owner = "client!dca", name = "C", descriptor = "I")
	public static int anInt1856 = 0;

	@OriginalMember(owner = "client!dca", name = "E", descriptor = "Lclient!sca;")
	public static Class302 aClass302_16 = null;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "([SII)[S")
	public static short[] method1531(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static655.method5834(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
