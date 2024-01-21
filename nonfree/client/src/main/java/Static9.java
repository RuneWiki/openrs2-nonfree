import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "Lclient!jd;")
	public static Class37 aClass37_4;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "Lclient!eb;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!bc", name = "H", descriptor = "Lclient!ee;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public static final int anInt346 = 50;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "[Lclient!rd;")
	public static Class64[] aClass64Array4 = new Class64[anInt346];

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	public static int[] anIntArray50 = new int[anInt346];

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
	public static int[] anIntArray51 = new int[anInt346];

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "Lclient!rd;")
	private static Class64 aClass64_253 = Static69.method1153("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "Lclient!rd;")
	public static Class64 aClass64_252 = aClass64_253;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "[I")
	public static int[] anIntArray52 = new int[anInt346];

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "[I")
	public static int[] anIntArray53 = new int[anInt346];

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "Lclient!rd;")
	private static Class64 aClass64_254 = Static69.method1153("Enter amount:");

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "[I")
	public static int[] anIntArray54 = new int[anInt346];

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
	public static int anInt353 = 0;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "[I")
	public static int[] anIntArray55 = new int[anInt346];

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "Lclient!rd;")
	public static Class64 aClass64_255 = aClass64_254;

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "[I")
	public static int[] anIntArray56 = new int[anInt346];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method229(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 <= 0 || local6 >= 256) {
			local6 = -1;
		}
		return local6;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method230() {
		anIntArray52 = null;
		aClass64_253 = null;
		aClass64_254 = null;
		anIntArray53 = null;
		anIntArray54 = null;
		aClass64Array4 = null;
		aClass64_252 = null;
		anIntArray56 = null;
		aClass37_4 = null;
		anIntArray51 = null;
		anIntArray55 = null;
		anIntArray50 = null;
		aClass64_255 = null;
		aClass2_1 = null;
		aClass21_1 = null;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public static void method231() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}
}
