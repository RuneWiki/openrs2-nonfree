import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dga", name = "i", descriptor = "I")
	public static int anInt2226;

	@OriginalMember(owner = "client!dga", name = "o", descriptor = "Lclient!uia;")
	public static final Class340 aClass340_1 = new Class340();

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!oea;")
	public static Class121 method2119(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class121 local8;
		try {
			local8 = (Class121) Class.forName("Class121_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class121_Sub2();
		}
		local8.anInt6641 = arg1;
		local8.aString70 = arg0;
		return local8;
	}
}
