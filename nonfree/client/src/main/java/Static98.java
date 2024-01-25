import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

	@OriginalMember(owner = "client!di", name = "r", descriptor = "Lclient!lg;")
	public static Class208 aClass208_2;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "I")
	public static int anInt4153;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_93 = new Class136(88, 4);

	@OriginalMember(owner = "client!di", name = "C", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_94 = new Class136(14, 6);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IBI)Z")
	public static boolean method3778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method3779(@OriginalArg(0) String arg0) {
		return Static498.aHashtable7.containsKey(arg0);
	}
}
