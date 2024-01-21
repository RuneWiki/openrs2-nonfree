import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "[I")
	public static int[] anIntArray28;

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_84 = Static158.method3034("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_85 = Static158.method3034("(U1");

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "[Lclient!ih;")
	public static final Class38[] aClass38Array1 = new Class38[500];

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_86 = Static158.method3034("::autoshadow off");

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_87 = Static158.method3034("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
	public static int anInt301 = 500;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!ce;ZIZI)V")
	public static void method258(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static40.anInt1296 >= 50 || (arg1.anIntArray82 == null || arg1.anIntArray82.length <= arg2)) {
			return;
		}
		@Pc(27) int local27 = arg1.anIntArray82[arg2];
		if (local27 == 0) {
			return;
		}
		@Pc(42) int local42 = local27 >> 8;
		@Pc(48) int local48 = local27 >> 4 & 0x7;
		@Pc(52) int local52 = local27 & 0xF;
		if (local52 == 0) {
			if (arg3) {
				Static80.method1894(local48, local42, 0);
			}
		} else if (Static148.anInt3846 != 0) {
			Static161.anIntArray443[Static40.anInt1296] = local42;
			Static81.anIntArray268[Static40.anInt1296] = local48;
			Static49.anIntArray144[Static40.anInt1296] = 0;
			Static94.aClass23Array1[Static40.anInt1296] = null;
			@Pc(93) int local93 = (arg4 - 64) / 128;
			@Pc(99) int local99 = (arg0 - 64) / 128;
			Static96.anIntArray355[Static40.anInt1296] = local52 + (local99 << 16) + (local93 << 8);
			Static40.anInt1296++;
		}
	}
}
