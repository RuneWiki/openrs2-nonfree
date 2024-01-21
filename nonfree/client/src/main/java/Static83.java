import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "[I")
	public static int[] anIntArray248;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "Lclient!va;")
	private static Class61 aClass61_890 = Static88.method1421("Public chat");

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "Lclient!va;")
	private static Class61 aClass61_892 = Static88.method1421("Unable to connect)3");

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "Lclient!va;")
	public static Class61 aClass61_891 = aClass61_892;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
	public static int anInt2226 = -1;

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "Lclient!va;")
	public static Class61 aClass61_893 = Static88.method1421("title)3jpg");

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "Lclient!va;")
	public static Class61 aClass61_894 = aClass61_892;

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
	public static int anInt2228 = 0;

	@OriginalMember(owner = "client!ra", name = "P", descriptor = "Lclient!va;")
	private static Class61 aClass61_897 = Static88.method1421("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "Lclient!va;")
	public static Class61 aClass61_895 = aClass61_897;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "Lclient!va;")
	public static Class61 aClass61_896 = aClass61_890;

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
	public static int anInt2229 = 0;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!he;I)V")
	public static void method1293(@OriginalArg(0) Class11 arg0) {
		Static100.aClass11_64 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Component;ILclient!s;)Lclient!fe;")
	public static Class10_Sub5_Sub1 method1294(@OriginalArg(0) Component arg0, @OriginalArg(2) Class55 arg1) {
		Static25.method493(arg1, arg0);
		@Pc(18) Class10_Sub5_Sub1 local18 = new Class10_Sub5_Sub1();
		Static24.method1428(local18);
		return local18;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method1295() {
		aClass61_893 = null;
		aClass61_892 = null;
		aClass61_890 = null;
		aClass61_897 = null;
		anIntArray248 = null;
		aClass61_891 = null;
		aClass61_896 = null;
		aClass61_894 = null;
		aClass61_895 = null;
	}
}
