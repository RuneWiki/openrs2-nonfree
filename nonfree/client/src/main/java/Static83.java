import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!jb", name = "S", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_25 = new Class89(128);

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_661 = Static158.method3034("rot:");

	@OriginalMember(owner = "client!jb", name = "gb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_666 = Static158.method3034("Loaded textures");

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "Lclient!ob;")
	public static Class60 aClass60_662 = aClass60_666;

	@OriginalMember(owner = "client!jb", name = "bb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_663 = Static158.method3034("Existing User");

	@OriginalMember(owner = "client!jb", name = "cb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_664 = Static158.method3034("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!jb", name = "fb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_665 = aClass60_664;

	@OriginalMember(owner = "client!jb", name = "jb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_667 = aClass60_663;

	@OriginalMember(owner = "client!jb", name = "mb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_668 = Static158.method3034("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!jb", name = "nb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_669 = Static158.method3034("Error connecting to server)3");

	@OriginalMember(owner = "client!jb", name = "ob", descriptor = "Lclient!ob;")
	public static Class60 aClass60_670 = aClass60_669;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!pe;)V")
	public static void method1956(@OriginalArg(1) Class13 arg0) {
		Static111.aClass13_25 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
	public static void method1957() {
		Static29.aBoolean35 = false;
		Static8.aBoolean3 = false;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIII)I")
	public static int method1958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}
}
