import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static96 {

	@OriginalMember(owner = "client!da", name = "x", descriptor = "I")
	public static int anInt10761;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "I")
	public static int anInt10775;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Z")
	public static boolean aBoolean732 = true;

	@OriginalMember(owner = "client!da", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString130 = null;

	@OriginalMember(owner = "client!da", name = "r", descriptor = "I")
	public static int anInt10770 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)J")
	public static long method9132(@OriginalArg(1) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}
}
