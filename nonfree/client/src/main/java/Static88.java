import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static88 {

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "Ljava/awt/Image;")
	public static Image anImage7;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "Lclient!hl;")
	public static Class113 aClass113_6;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString38 = null;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	public static int anInt4390 = 0;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_76 = new Class231("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "J")
	public static long aLong214 = 0L;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
	public static void method3520(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1) {
		Static409.method693(arg1.length - 1, arg0, arg1, 0);
	}
}
