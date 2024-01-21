import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_31 = new Class89(64);

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_715 = Static158.method3034("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "Lclient!ob;")
	public static Class60 aClass60_716 = aClass60_715;

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_718 = Static158.method3034("Loading fonts )2 ");

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "Lclient!ob;")
	public static Class60 aClass60_717 = aClass60_718;

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_32 = new Class89(16);

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_719 = Static158.method3034("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!ji", name = "G", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_720 = Static158.method3034("(Y");

	@OriginalMember(owner = "client!ji", name = "H", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_721 = Static158.method3034("Freie Welt");

	@OriginalMember(owner = "client!ji", name = "I", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_722 = Static158.method3034("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!ji", name = "J", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_723 = Static158.method3034("::clientdrop");

	@OriginalMember(owner = "client!ji", name = "K", descriptor = "[I")
	public static final int[] anIntArray284 = new int[2000];

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!ob;Lclient!pe;ILclient!ob;)[Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4[] method2060(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(3) Class60 arg2) {
		@Pc(4) int local4 = arg1.method527(arg2);
		@Pc(10) int local10 = arg1.method514(local4, arg0);
		return Static78.method1883(local4, local10, arg1);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
	public static void method2062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass52_1 = null;
		}
	}
}
