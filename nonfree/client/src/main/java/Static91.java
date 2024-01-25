import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ct", name = "G", descriptor = "[S")
	public static final short[] aShortArray28 = new short[] { 50, 2, 17, 57, 22, 3, 10, 47 };

	@OriginalMember(owner = "client!ct", name = "K", descriptor = "Lclient!jaa;")
	public static final Class173 aClass173_3 = new Class173();

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(III)V")
	public static void method1899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub3_Sub17 local8 = Static358.method5408(15, 0L);
		local8.method7286();
		local8.anInt8546 = arg0;
		local8.anInt8549 = arg1;
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(B)[Lclient!rw;")
	public static Class310[] method1900() {
		if (Static442.aClass310Array1 == null) {
			@Pc(12) Class310[] local12 = Static187.method5800(Static570.aClass268_5);
			@Pc(16) Class310[] local16 = new Class310[local12.length];
			@Pc(18) int local18 = 0;
			@Pc(23) int local23 = Static172.aClass5_Sub50_14.aClass12_Sub14_1.method3089();
			@Pc(81) int local81;
			@Pc(86) Class310 local86;
			label69: for (@Pc(25) int local25 = 0; local25 < local12.length; local25++) {
				@Pc(30) Class310 local30 = local12[local25];
				if ((local30.anInt8742 <= 0 || local30.anInt8742 >= 24) && local30.anInt8744 >= 800 && local30.anInt8743 >= 600 && (local23 != 2 || local30.anInt8744 <= 800 && local30.anInt8743 <= 600) && (local23 != 1 || local30.anInt8744 <= 1024 && local30.anInt8743 <= 768)) {
					for (local81 = 0; local81 < local18; local81++) {
						local86 = local16[local81];
						if (local30.anInt8744 == local86.anInt8744 && local30.anInt8743 == local86.anInt8743) {
							if (local86.anInt8742 < local30.anInt8742) {
								local16[local81] = local30;
							}
							continue label69;
						}
					}
					local16[local18] = local30;
					local18++;
				}
			}
			Static442.aClass310Array1 = new Class310[local18];
			Static686.method4966(local16, 0, Static442.aClass310Array1, 0, local18);
			@Pc(149) int[] local149 = new int[Static442.aClass310Array1.length];
			for (local81 = 0; local81 < Static442.aClass310Array1.length; local81++) {
				local86 = Static442.aClass310Array1[local81];
				local149[local81] = local86.anInt8744 * local86.anInt8743;
			}
			Static280.method4513(Static442.aClass310Array1, local149);
		}
		return Static442.aClass310Array1;
	}
}
