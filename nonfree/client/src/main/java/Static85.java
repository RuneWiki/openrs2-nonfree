import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static85 {

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "Lclient!ph;")
	public static Class138 aClass138_26;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!bo;")
	public static Class24 aClass24_13 = new Class24();

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Z")
	public static boolean aBoolean121 = true;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean122 = false;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14 = null;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
	public static int anInt1546 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I")
	public static int method1252(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLclient!ph;)V")
	public static void method1253(@OriginalArg(1) Class138 arg0) {
		Static251.aClass138_69 = arg0;
	}
}
