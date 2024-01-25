import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!es;")
	public static Class90 aClass90_1;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!ufa;")
	public static Class4 aClass4_9;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
	public static int anInt2687;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!ni;")
	public static Class223 aClass223_36;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString16 = "";

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZII)V")
	public static void method2288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub5_Sub19 local8 = Static348.method5721(arg1, 14);
		local8.method5179();
		local8.anInt6198 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(JZLclient!ha;)V")
	public static void method2289(@OriginalArg(0) long arg0, @OriginalArg(2) Class5 arg1) {
		Static445.anInt8087 = 0;
		Static512.anInt8840 = 0;
		Static100.anInt2853 = Static208.anInt4504;
		Static208.anInt4504 = 0;
		@Pc(21) long local21 = Static582.method8056();
		for (@Pc(26) Class9_Sub5 local26 = (Class9_Sub5) Static470.aClass234_11.method6092(); local26 != null; local26 = (Class9_Sub5) Static470.aClass234_11.method6098()) {
			if (local26.method5227(arg1, arg0)) {
				Static512.anInt8840++;
			}
		}
		if (Static434.aBoolean814 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static470.aClass234_11.method6100() + ", running: " + Static512.anInt8840);
			System.out.println("Emitters: " + Static445.anInt8087 + " Particles: " + Static208.anInt4504 + ". Time taken: " + (Static582.method8056() - local21) + "ms");
		}
	}
}
