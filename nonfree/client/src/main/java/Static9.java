import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Lclient!cc;")
	public static Class12 aClass12_2;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "Z")
	public static boolean aBoolean24;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public static int anInt184 = 0;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!wd;")
	public static Class82 aClass82_2 = new Class82();

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "J")
	public static long aLong7 = 0L;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_76 = Static60.method1113("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_77 = Static60.method1113("Die Verbindung konnte");

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "[I")
	public static int[] anIntArray16 = new int[128];

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
	public static int anInt190 = 0;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "[I")
	public static int[] anIntArray17 = new int[32];

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
	public static int anInt191 = 1;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)I")
	public static int method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(48) int local48 = Static79.method1428(arg0 - 1, arg1 + -1) + Static79.method1428(arg0 - 1, arg1 + 1) + Static79.method1428(arg0 + 1, arg1 + -1) + Static79.method1428(arg0 + 1, arg1 + 1);
		@Pc(77) int local77 = Static79.method1428(arg0, arg1 - 1) + Static79.method1428(arg0, arg1 + 1) + Static79.method1428(arg0 - 1, arg1) + Static79.method1428(arg0 + 1, arg1);
		@Pc(84) int local84 = Static79.method1428(arg0, arg1);
		return local77 / 8 + local48 / 16 + local84 / 4;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method156() {
		aClass22_77 = null;
		aClass82_2 = null;
		anIntArray17 = null;
		anIntArray16 = null;
		aClass12_2 = null;
		aFrame1 = null;
		aClass22_76 = null;
	}
}
