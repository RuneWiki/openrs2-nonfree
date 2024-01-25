import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
	public static int anInt6566;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "J")
	public static long aLong187 = 0L;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
	public static int anInt6565 = 0;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "[I")
	public static final int[] anIntArray609 = new int[5];

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_155 = new Class263(79, 8);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZLjava/lang/String;)V")
	public static void method5018(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		Static355.aClass211_74.anInt6207 = 1;
		@Pc(9) String local9 = arg1.toLowerCase();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static43.aClass57_1.anInt1929; local16++) {
			@Pc(27) Class168 local27 = Static43.aClass57_1.method1414(local16);
			if ((!arg0 || local27.aBoolean308) && local27.anInt4878 == -1 && local27.lb == -1 && local27.anInt4826 == 0 && local27.aString37.toLowerCase().indexOf(local9) != -1) {
				if (local14 >= 250) {
					Static343.anInt6320 = -1;
					Static314.aShortArray100 = null;
					return;
				}
				if (local14 >= local12.length) {
					@Pc(75) short[] local75 = new short[local12.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local14; local77++) {
						local75[local77] = local12[local77];
					}
					local12 = local75;
				}
				local12[local14++] = (short) local16;
			}
		}
		Static230.anInt4555 = 0;
		Static314.aShortArray100 = local12;
		Static343.anInt6320 = local14;
		@Pc(110) String[] local110 = new String[Static343.anInt6320];
		for (@Pc(112) int local112 = 0; local112 < Static343.anInt6320; local112++) {
			local110[local112] = Static43.aClass57_1.method1414(local12[local112]).aString37;
		}
		Static106.method1756(Static314.aShortArray100, local110);
		Static355.aClass211_74.method4764();
		Static355.aClass211_74.anInt6207 = 2;
	}
}
