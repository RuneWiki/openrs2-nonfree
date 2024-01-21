import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Lclient!na;")
	public static Class35 aClass35_3;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
	public static int anInt2325 = 127;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!lc;")
	public static Class31 aClass31_809 = Static56.method1206("Side panel redrawn");

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!lc;")
	public static Class31 aClass31_810 = Static56.method1206(" from your ignore list first");

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!lc;")
	public static Class31 aClass31_811 = Static56.method1206("::fpson");

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
	public static int anInt2335 = 0;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "Lclient!lc;")
	public static Class31 aClass31_812 = Static56.method1206(" million @whi@(X");

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILclient!cc;[B)V")
	public static void method1481(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub1 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) Class2_Sub5 local3 = new Class2_Sub5();
		local3.anInt797 = 0;
		local3.anInt786 = arg0;
		local3.aByteArray9 = arg2;
		local3.aClass11_Sub1_4 = arg1;
		@Pc(26) Class36 local26 = Static77.aClass36_7;
		synchronized (Static77.aClass36_7) {
			Static77.aClass36_7.method1362(local3);
		}
		Static50.method349();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)I")
	public static int method1482() {
		return Static101.anInt2740++;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/Graphics;I)V")
	public static void method1483(@OriginalArg(0) Graphics arg0) {
		Static28.aClass9_11.method863(arg0, 4, 4);
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public static void method1484() {
		aClass31_812 = null;
		aClass31_810 = null;
		aClass35_3 = null;
		aClass31_811 = null;
		aClass31_809 = null;
	}
}
