import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
	public static int anInt2264;

	@OriginalMember(owner = "client!kb", name = "db", descriptor = "Lclient!ig;")
	public static Class30_Sub1 aClass30_Sub1_8;

	@OriginalMember(owner = "client!kb", name = "hb", descriptor = "I")
	public static int anInt2267;

	@OriginalMember(owner = "client!kb", name = "eb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_841 = Static169.method2903("Members only world");

	@OriginalMember(owner = "client!kb", name = "ib", descriptor = "I")
	public static int anInt2268 = 0;

	@OriginalMember(owner = "client!kb", name = "lb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_842 = aClass23_841;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[BI)Lclient!ed;")
	public static Class23 method1492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(5) Class23 local5 = new Class23();
		local5.anInt1053 = 0;
		local5.aByteArray10 = new byte[arg1];
		for (@Pc(22) int local22 = arg0; local22 < arg1 + arg0; local22++) {
			if (arg2[local22] != 0) {
				local5.aByteArray10[local5.anInt1053++] = arg2[local22];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
	public static void method1493() {
		aClass23_842 = null;
		aClass23_841 = null;
		aClass30_Sub1_8 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ga;ILclient!me;Lclient!ga;Lclient!ga;)Z")
	public static boolean method1494(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Class1_Sub11_Sub2 arg1, @OriginalArg(3) Class30 arg2, @OriginalArg(4) Class30 arg3) {
		Static124.aClass30_48 = arg2;
		Static35.aClass1_Sub11_Sub2_1 = arg1;
		Static118.aClass30_46 = arg0;
		Static112.aClass30_43 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
	public static void method1495() {
		if (Static8.aBoolean17 && anInt2267 != Static100.anInt2570) {
			Static81.method892(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], Static29.anInt888, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], Static46.anInt4332, anInt2267);
		} else if (anInt2267 != Static87.anInt959) {
			Static87.anInt959 = anInt2267;
			Static107.method1848(anInt2267);
		}
	}
}
