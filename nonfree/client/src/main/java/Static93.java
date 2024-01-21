import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Lclient!ea;")
	private static Class18 aClass18_722 = Static8.method128(" has logged in)3");

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!ea;")
	public static Class18 aClass18_721 = aClass18_722;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Lclient!ea;")
	public static Class18 aClass18_723 = Static8.method128("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "Lclient!ea;")
	public static Class18 aClass18_724 = Static8.method128("T");

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!ea;")
	private static Class18 aClass18_725 = Static8.method128("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "Lclient!ea;")
	public static Class18 aClass18_726 = aClass18_725;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
	public static int anInt2872 = 0;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "[I")
	public static int[] anIntArray260 = new int[100];

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Lclient!ea;")
	private static Class18 aClass18_727 = Static8.method128("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
	public static int anInt2876 = 0;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "Lclient!ea;")
	public static Class18 aClass18_728 = aClass18_727;

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "Lclient!ea;")
	public static Class18 aClass18_729 = Static8.method128("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "[I")
	public static int[] anIntArray261 = new int[] { 3, 40, 7, 32, 15, 47, 36, 49 };

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public static void method2038() {
		aClass18_724 = null;
		anIntArray261 = null;
		aClass18_726 = null;
		aClass18_722 = null;
		aClass18_725 = null;
		anIntArray260 = null;
		aClass18_721 = null;
		aClass18_728 = null;
		aClass18_723 = null;
		aClass18_727 = null;
		aClass18_729 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!dd;IZLclient!ea;Lclient!ea;II)V")
	public static void method2039(@OriginalArg(0) Class16 arg0, @OriginalArg(3) Class18 arg1, @OriginalArg(4) Class18 arg2) {
		@Pc(13) int local13 = arg0.method2246(arg2);
		@Pc(21) int local21 = arg0.method2251(arg1, local13);
		Static11.method200(arg0, local13, 255, local21);
	}
}
