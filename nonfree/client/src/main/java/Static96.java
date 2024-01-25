import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static96 {

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Lclient!ha;")
	public static Class143 aClass143_3;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_28 = new Class187(26, 16);

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "[I")
	public static final int[] anIntArray91 = new int[14];

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Lclient!wq;")
	public static Class394 aClass394_1 = null;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)V")
	public static void method1621(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		Static154.aString24 = arg2;
		Static159.aString25 = arg0;
		Static455.aBoolean579 = arg1;
		if (!Static455.aBoolean579 && (Static154.aString24.equals("") || Static159.aString25.equals(""))) {
			Static97.method1623(3);
			return;
		}
		Static396.aBoolean496 = false;
		if (Static62.anInt991 != 1) {
			Static216.anInt3460 = 0;
			Static155.anInt2603 = -1;
		}
		Static97.method1623(-3);
		Static462.anInt8060 = 0;
		Static537.anInt10361 = 0;
		Static16.anInt9847 = 1;
	}
}
